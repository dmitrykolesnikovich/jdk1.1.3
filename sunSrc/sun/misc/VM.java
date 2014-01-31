/*
 * Copyright (c) 1996, 2005, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package sun.misc;

import java.util.Properties;

public class VM {

    /* The following methods used to be native methods that instruct
     * the VM to selectively suspend certain threads in low-memory
     * situations. They are inherently dangerous and not implementable
     * on native threads. We removed them in JDK 1.2. The skeletons
     * remain so that existing applications that use these methods
     * will still work.
     */
    private static boolean suspended = false;

    /**  */
    
    public static boolean threadsSuspended() {
        return suspended;
    }

    public static boolean allowThreadSuspension(ThreadGroup g, boolean b) {
        return g.allowThreadSuspension(b);
    }

    /**  */
    
    public static boolean suspendThreads() {
        suspended = true;
        return true;
    }

    // Causes any suspended threadgroups to be resumed.
    /**  */
    
    public static void unsuspendThreads() {
        suspended = false;
    }

    // Causes threadgroups no longer marked suspendable to be resumed.
    /**  */
    
    public static void unsuspendSomeThreads() {
    }

    /* Deprecated fields and methods -- Memory advice not supported in 1.2 */

    /**  */
    
    public static final int STATE_GREEN = 1;

    /**  */
    
    public static final int STATE_YELLOW = 2;

    /**  */
    
    public static final int STATE_RED = 3;

    /**  */
    
    public static final int getState() {
        return STATE_GREEN;
    }

    /**  */
    
    public static void asChange(int as_old, int as_new) { }

    /**  */
    
    public static void asChange_otherthread(int as_old, int as_new) { }

    /*
     * Not supported in 1.2 because these will have to be exported as
     * JVM functions, and we are not sure we want do that. Leaving
     * here so it can be easily resurrected -- just remove the //
     * comments.
     */

    /**
     * Resume Java profiling.  All profiling data is added to any
     * earlier profiling, unless <code>resetJavaProfiler</code> is
     * called in between.  If profiling was not started from the
     * command line, <code>resumeJavaProfiler</code> will start it.
     * <p>
     *
     * NOTE: Profiling must be enabled from the command line for a
     * java.prof report to be automatically generated on exit; if not,
     * writeJavaProfilerReport must be invoked to write a report.
     *
     * @see     resetJavaProfiler
     * @see     writeJavaProfilerReport
     */

    // public native static void resumeJavaProfiler();

    /**
     * Suspend Java profiling.
     */
    // public native static void suspendJavaProfiler();

    /**
     * Initialize Java profiling.  Any accumulated profiling
     * information is discarded.
     */
    // public native static void resetJavaProfiler();

    /**
     * Write the current profiling contents to the file "java.prof".
     * If the file already exists, it will be overwritten.
     */
    // public native static void writeJavaProfilerReport();


    private static volatile boolean booted = false;

    // Invoked by by System.initializeSystemClass just before returning.
    // Subsystems that are invoked during initialization can check this
    // property in order to avoid doing things that should wait until the
    // application class loader has been set up.
    //
    public static void booted() {
        booted = true;
    }

    public static boolean isBooted() {
        return booted;
    }

    // A user-settable upper limit on the maximum amount of allocatable direct
    // buffer memory.  This value may be changed during VM initialization if
    // "java" is launched with "-XX:MaxDirectMemorySize=<size>".
    //
    // The initial value of this field is arbitrary; during JRE initialization
    // it will be reset to the value specified on the command line, if any,
    // otherwise to Runtime.getRuntime.maxDirectMemory().
    //
    private static long directMemory = 64 * 1024 * 1024;

    // If this method is invoked during VM initialization, it initializes the
    // maximum amount of allocatable direct buffer memory (in bytes) from the
    // system property sun.nio.MaxDirectMemorySize.  The system property will
    // be removed when it is accessed.
    //
    // If this method is invoked after the VM is booted, it returns the
    // maximum amount of allocatable direct buffer memory.
    //
    public static long maxDirectMemory() {
        if (booted)
            return directMemory;

        Properties p = System.getProperties();
        String s = (String)p.remove("sun.nio.MaxDirectMemorySize");
        System.setProperties(p);

        if (s != null) {
            if (s.equals("-1")) {
                // -XX:MaxDirectMemorySize not given, take default
                directMemory = /*Runtime.getRuntime().maxMemory()*/512;
            } else {
                long l = Long.parseLong(s);
                if (l > -1)
                    directMemory = l;
            }
        }

        return directMemory;
    }

    // A user-settable boolean to determine whether ClassLoader.loadClass should
    // accept array syntax.  This value may be changed during VM initialization
    // via the system property "sun.lang.ClassLoader.allowArraySyntax".
    //
    // The default for 1.5 is "true", array syntax is allowed.  In 1.6, the
    // default will be "false".  The presence of this system property to
    // control array syntax allows applications the ability to preview this new
    // behaviour.
    //
    private static boolean defaultAllowArraySyntax = false;
    private static boolean allowArraySyntax = defaultAllowArraySyntax;

    // If this method is invoked during VM initialization, it initializes the
    // allowArraySyntax boolean based on the value of the system property
    // "sun.lang.ClassLoader.allowArraySyntax".  If the system property is not
    // provided, the default for 1.5 is "true".  In 1.6, the default will be
    // "false".  If the system property is provided, then the value of
    // allowArraySyntax will be equal to "true" if Boolean.parseBoolean()
    // returns "true".   Otherwise, the field will be set to "false".
    //
    // If this method is invoked after the VM is booted, it returns the
    // allowArraySyntax boolean set during initialization.
    //
    public static boolean allowArraySyntax() {
        if (!booted) {
            String s
                = System.getProperty("sun.lang.ClassLoader.allowArraySyntax");
            allowArraySyntax = (s == null
                                ? defaultAllowArraySyntax
                                : Boolean.valueOf(s).booleanValue());
        }
        return allowArraySyntax;
    }

    /* Current count of objects pending for finalization */
    private static volatile int finalRefCount = 0;

    /* Peak count of objects pending for finalization */
    private static volatile int peakFinalRefCount = 0;

    /*
     * Gets the number of objects pending for finalization.
     *
     * @return the number of objects pending for finalization.
     */
    public static int getFinalRefCount() {
        return finalRefCount;
    }

    /*
     * Gets the peak number of objects pending for finalization.
     *
     * @return the peak number of objects pending for finalization.
     */
    public static int getPeakFinalRefCount() {
        return peakFinalRefCount;
    }

    /*
     * Add <tt>n</tt> to the objects pending for finalization count.
     *
     * @param n an integer value to be added to the objects pending
     * for finalization count
     */
    public static void addFinalRefCount(int n) {
        // The caller must hold lock to synchronize the update.

        finalRefCount += n;
        if (finalRefCount > peakFinalRefCount) {
            peakFinalRefCount = finalRefCount;
        }
    }






    // Fill in vmThreadStateValues with int arrays, each of which contains
    // the threadStatus values mapping to the Thread.State enum constant.
    // Fill in vmThreadStateNames with String arrays, each of which contains
    // the name of each threadStatus value of the format:
    //    <Thread.State.name()>[.<Substate name>]
    // e.g. WAITING.OBJECT_WAIT
    //
    private native static void getThreadStateValues(int[][] vmThreadStateValues,
                                                    String[][] vmThreadStateNames);

    static {
        initialize();
    }
    private native static void initialize();
}
