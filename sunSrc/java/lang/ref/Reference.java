package java.lang.ref;

import sun.misc.Cleaner;


public abstract class Reference {

    private Object referent;         /* Treated specially by GC */

    ReferenceQueue queue;

    Reference next;
    transient private Reference discovered;  /* used by VM */



    static private class Lock { };
    private static Lock lock = new Lock();



    private static Reference pending = null;


    private static class ReferenceHandler extends Thread {

        ReferenceHandler(ThreadGroup g, String name) {
            super(g, name);
        }

        public void run() {
            for (;;) {

                Reference r;
                synchronized (lock) {
                    if (pending != null) {
                        r = pending;
                        Reference rn = r.next;
                        pending = (rn == r) ? null : rn;
                        r.next = r;
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException x) { }
                        continue;
                    }
                }

                // Fast path for cleaners
                if (r instanceof Cleaner) {
                    ((Cleaner)r).clean();
                    continue;
                }

                ReferenceQueue q = r.queue;
                if (q != ReferenceQueue.NULL) q.enqueue(r);
            }
        }
    }

    static {
        ThreadGroup tg = Thread.currentThread().getThreadGroup();
        for (ThreadGroup tgn = tg;
             tgn != null;
             tg = tgn, tgn = tg.getParent());
        Thread handler = new ReferenceHandler(tg, "Reference Handler");
        /* If there were a special system-only priority greater than
         * MAX_PRIORITY, it would be used here
         */
        handler.setPriority(Thread.MAX_PRIORITY);
        handler.setDaemon(true);
        handler.start();
    }


    /* -- Referent accessor and setters -- */


    public Object get() {
        return this.referent;
    }


    public void clear() {
        this.referent = null;
    }


    /* -- Queue operations -- */


    public boolean isEnqueued() {
        /* In terms of the internal states, this predicate actually tests
           whether the instance is either Pending or Enqueued */
        synchronized (this) {
            return (this.queue != ReferenceQueue.NULL) && (this.next != null);
        }
    }


    public boolean enqueue() {
        return this.queue.enqueue(this);
    }


    /* -- Constructors -- */

    Reference(Object referent) {
        this(referent, null);
    }

    Reference(Object referent, ReferenceQueue queue) {
        this.referent = referent;
        this.queue = (queue == null) ? ReferenceQueue.NULL : queue;
    }

}
