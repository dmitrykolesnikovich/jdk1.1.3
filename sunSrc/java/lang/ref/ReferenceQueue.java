package java.lang.ref;

public class ReferenceQueue {

    /**
     * Constructs a new reference-object queue.
     */
    public ReferenceQueue() { }

    private static class Null extends ReferenceQueue {
        boolean enqueue(Reference r) {
            return false;
        }
    }

    static ReferenceQueue NULL = new Null();
    static ReferenceQueue ENQUEUED = new Null();

    static private class Lock { };
    private Lock lock = new Lock();
    private Reference head = null;
    private long queueLength = 0;

    boolean enqueue(Reference r) { /* Called only by Reference class */
        synchronized (r) {
            if (r.queue == ENQUEUED) return false;
            synchronized (lock) {
                r.queue = ENQUEUED;
                r.next = (head == null) ? r : head;
                head = r;
                queueLength++;
                if (r instanceof FinalReference) {
                    sun.misc.VM.addFinalRefCount(1);
                }
                lock.notifyAll();
                return true;
            }
        }
    }

    private Reference reallyPoll() {       /* Must hold lock */
        if (head != null) {
            Reference r = head;
            head = (r.next == r) ? null : r.next;
            r.queue = NULL;
            r.next = r;
            queueLength--;
            if (r instanceof FinalReference) {
                sun.misc.VM.addFinalRefCount(-1);
            }
            return r;
        }
        return null;
    }

    public Reference poll() {
        synchronized (lock) {
            return reallyPoll();
        }
    }


    public Reference remove(long timeout)
        throws IllegalArgumentException, InterruptedException
    {
        if (timeout < 0) {
            throw new IllegalArgumentException("Negative timeout value");
        }
        synchronized (lock) {
            Reference r = reallyPoll();
            if (r != null) return r;
            for (;;) {
                lock.wait(timeout);
                r = reallyPoll();
                if (r != null) return r;
                if (timeout != 0) return null;
            }
        }
    }


    public Reference remove() throws InterruptedException {
        return remove(0);
    }

}
