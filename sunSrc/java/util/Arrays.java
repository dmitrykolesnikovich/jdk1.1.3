package java.util;

import java.lang.reflect.*;

public class Arrays {
    // Suppresses default constructor, ensuring non-instantiability.
    private Arrays() {
    }

    // Sorting

    /**
     * Sorts the specified array of longs into ascending numerical order.
     * The sorting algorithm is a tuned quicksort, adapted from Jon
     * L. Bentley and M. Douglas McIlroy's "Engineering a Sort Function",
     * Software-Practice and Experience, Vol. 23(11) P. 1249-1265 (November
     * 1993).  This algorithm offers n*log(n) performance on many data sets
     * that cause other quicksorts to degrade to quadratic performance.
     *
     * @param a the array to be sorted
     */
    public static void sort(long[] a) {
        sort1(a, 0, a.length);
    }

    /**
     * Sorts the specified range of the specified array of longs into
     * ascending numerical order.  The range to be sorted extends from index
     * <tt>fromIndex</tt>, inclusive, to index <tt>toIndex</tt>, exclusive.
     * (If <tt>fromIndex==toIndex</tt>, the range to be sorted is empty.)
     *
     * <p>The sorting algorithm is a tuned quicksort, adapted from Jon
     * L. Bentley and M. Douglas McIlroy's "Engineering a Sort Function",
     * Software-Practice and Experience, Vol. 23(11) P. 1249-1265 (November
     * 1993).  This algorithm offers n*log(n) performance on many data sets
     * that cause other quicksorts to degrade to quadratic performance.
     *
     * @param a the array to be sorted
     * @param fromIndex the index of the first element (inclusive) to be
     *        sorted
     * @param toIndex the index of the last element (exclusive) to be sorted
     * @throws IllegalArgumentException if <tt>fromIndex &gt; toIndex</tt>
     * @throws ArrayIndexOutOfBoundsException if <tt>fromIndex &lt; 0</tt> or
     * <tt>toIndex &gt; a.length</tt>
     */
    public static void sort(long[] a, int fromIndex, int toIndex) {
        rangeCheck(a.length, fromIndex, toIndex);
        sort1(a, fromIndex, toIndex-fromIndex);
    }

    /**
     * Sorts the specified array of ints into ascending numerical order.
     * The sorting algorithm is a tuned quicksort, adapted from Jon
     * L. Bentley and M. Douglas McIlroy's "Engineering a Sort Function",
     * Software-Practice and Experience, Vol. 23(11) P. 1249-1265 (November
     * 1993).  This algorithm offers n*log(n) performance on many data sets
     * that cause other quicksorts to degrade to quadratic performance.
     *
     * @param a the array to be sorted
     */
    public static void sort(int[] a) {
        sort1(a, 0, a.length);
    }

    /**
     * Sorts the specified range of the specified array of ints into
     * ascending numerical order.  The range to be sorted extends from index
     * <tt>fromIndex</tt>, inclusive, to index <tt>toIndex</tt>, exclusive.
     * (If <tt>fromIndex==toIndex</tt>, the range to be sorted is empty.)<p>
     *
     * The sorting algorithm is a tuned quicksort, adapted from Jon
     * L. Bentley and M. Douglas McIlroy's "Engineering a Sort Function",
     * Software-Practice and Experience, Vol. 23(11) P. 1249-1265 (November
     * 1993).  This algorithm offers n*log(n) performance on many data sets
     * that cause other quicksorts to degrade to quadratic performance.
     *
     * @param a the array to be sorted
     * @param fromIndex the index of the first element (inclusive) to be
     *        sorted
     * @param toIndex the index of the last element (exclusive) to be sorted
     * @throws IllegalArgumentException if <tt>fromIndex &gt; toIndex</tt>
     * @throws ArrayIndexOutOfBoundsException if <tt>fromIndex &lt; 0</tt> or
     *         <tt>toIndex &gt; a.length</tt>
     */
    public static void sort(int[] a, int fromIndex, int toIndex) {
        rangeCheck(a.length, fromIndex, toIndex);
        sort1(a, fromIndex, toIndex-fromIndex);
    }

    /**
     * Sorts the specified array of shorts into ascending numerical order.
     * The sorting algorithm is a tuned quicksort, adapted from Jon
     * L. Bentley and M. Douglas McIlroy's "Engineering a Sort Function",
     * Software-Practice and Experience, Vol. 23(11) P. 1249-1265 (November
     * 1993).  This algorithm offers n*log(n) performance on many data sets
     * that cause other quicksorts to degrade to quadratic performance.
     *
     * @param a the array to be sorted
     */
    public static void sort(short[] a) {
        sort1(a, 0, a.length);
    }

    /**
     * Sorts the specified range of the specified array of shorts into
     * ascending numerical order.  The range to be sorted extends from index
     * <tt>fromIndex</tt>, inclusive, to index <tt>toIndex</tt>, exclusive.
     * (If <tt>fromIndex==toIndex</tt>, the range to be sorted is empty.)<p>
     *
     * The sorting algorithm is a tuned quicksort, adapted from Jon
     * L. Bentley and M. Douglas McIlroy's "Engineering a Sort Function",
     * Software-Practice and Experience, Vol. 23(11) P. 1249-1265 (November
     * 1993).  This algorithm offers n*log(n) performance on many data sets
     * that cause other quicksorts to degrade to quadratic performance.
     *
     * @param a the array to be sorted
     * @param fromIndex the index of the first element (inclusive) to be
     *        sorted
     * @param toIndex the index of the last element (exclusive) to be sorted
     * @throws IllegalArgumentException if <tt>fromIndex &gt; toIndex</tt>
     * @throws ArrayIndexOutOfBoundsException if <tt>fromIndex &lt; 0</tt> or
     *         <tt>toIndex &gt; a.length</tt>
     */
    public static void sort(short[] a, int fromIndex, int toIndex) {
        rangeCheck(a.length, fromIndex, toIndex);
        sort1(a, fromIndex, toIndex-fromIndex);
    }

    /**
     * Sorts the specified array of chars into ascending numerical order.
     * The sorting algorithm is a tuned quicksort, adapted from Jon
     * L. Bentley and M. Douglas McIlroy's "Engineering a Sort Function",
     * Software-Practice and Experience, Vol. 23(11) P. 1249-1265 (November
     * 1993).  This algorithm offers n*log(n) performance on many data sets
     * that cause other quicksorts to degrade to quadratic performance.
     *
     * @param a the array to be sorted
     */
    public static void sort(char[] a) {
        sort1(a, 0, a.length);
    }

    /**
     * Sorts the specified range of the specified array of chars into
     * ascending numerical order.  The range to be sorted extends from index
     * <tt>fromIndex</tt>, inclusive, to index <tt>toIndex</tt>, exclusive.
     * (If <tt>fromIndex==toIndex</tt>, the range to be sorted is empty.)<p>
     *
     * The sorting algorithm is a tuned quicksort, adapted from Jon
     * L. Bentley and M. Douglas McIlroy's "Engineering a Sort Function",
     * Software-Practice and Experience, Vol. 23(11) P. 1249-1265 (November
     * 1993).  This algorithm offers n*log(n) performance on many data sets
     * that cause other quicksorts to degrade to quadratic performance.
     *
     * @param a the array to be sorted
     * @param fromIndex the index of the first element (inclusive) to be
     *        sorted
     * @param toIndex the index of the last element (exclusive) to be sorted
     * @throws IllegalArgumentException if <tt>fromIndex &gt; toIndex</tt>
     * @throws ArrayIndexOutOfBoundsException if <tt>fromIndex &lt; 0</tt> or
     *         <tt>toIndex &gt; a.length</tt>
     */
    public static void sort(char[] a, int fromIndex, int toIndex) {
        rangeCheck(a.length, fromIndex, toIndex);
        sort1(a, fromIndex, toIndex-fromIndex);
    }

    /**
     * Sorts the specified array of bytes into ascending numerical order.
     * The sorting algorithm is a tuned quicksort, adapted from Jon
     * L. Bentley and M. Douglas McIlroy's "Engineering a Sort Function",
     * Software-Practice and Experience, Vol. 23(11) P. 1249-1265 (November
     * 1993).  This algorithm offers n*log(n) performance on many data sets
     * that cause other quicksorts to degrade to quadratic performance.
     *
     * @param a the array to be sorted
     */
    public static void sort(byte[] a) {
        sort1(a, 0, a.length);
    }

    /**
     * Sorts the specified range of the specified array of bytes into
     * ascending numerical order.  The range to be sorted extends from index
     * <tt>fromIndex</tt>, inclusive, to index <tt>toIndex</tt>, exclusive.
     * (If <tt>fromIndex==toIndex</tt>, the range to be sorted is empty.)<p>
     *
     * The sorting algorithm is a tuned quicksort, adapted from Jon
     * L. Bentley and M. Douglas McIlroy's "Engineering a Sort Function",
     * Software-Practice and Experience, Vol. 23(11) P. 1249-1265 (November
     * 1993).  This algorithm offers n*log(n) performance on many data sets
     * that cause other quicksorts to degrade to quadratic performance.
     *
     * @param a the array to be sorted
     * @param fromIndex the index of the first element (inclusive) to be
     *        sorted
     * @param toIndex the index of the last element (exclusive) to be sorted
     * @throws IllegalArgumentException if <tt>fromIndex &gt; toIndex</tt>
     * @throws ArrayIndexOutOfBoundsException if <tt>fromIndex &lt; 0</tt> or
     *         <tt>toIndex &gt; a.length</tt>
     */
    public static void sort(byte[] a, int fromIndex, int toIndex) {
        rangeCheck(a.length, fromIndex, toIndex);
        sort1(a, fromIndex, toIndex-fromIndex);
    }

    public static void sort(double[] a) {
        sort2(a, 0, a.length);
    }

    public static void sort(double[] a, int fromIndex, int toIndex) {
        rangeCheck(a.length, fromIndex, toIndex);
        sort2(a, fromIndex, toIndex);
    }
    
    public static void sort(float[] a) {
        sort2(a, 0, a.length);
    }

    public static void sort(float[] a, int fromIndex, int toIndex) {
        rangeCheck(a.length, fromIndex, toIndex);
        sort2(a, fromIndex, toIndex);
    }

    private static void sort2(double a[], int fromIndex, int toIndex) {
        final long NEG_ZERO_BITS = Double.doubleToLongBits(-0.0d);
        /*
         * The sort is done in three phases to avoid the expense of using
         * NaN and -0.0 aware comparisons during the main sort.
         */

        /*
         * Preprocessing phase:  Move any NaN's to end of array, count the
         * number of -0.0's, and turn them into 0.0's.
         */
        int numNegZeros = 0;
        int i = fromIndex, n = toIndex;
        while(i < n) {
            if (a[i] != a[i]) {
                swap(a, i, --n);
            } else {
                if (a[i]==0 && Double.doubleToLongBits(a[i])==NEG_ZERO_BITS) {
                    a[i] = 0.0d;
                    numNegZeros++;
                }
                i++;
            }
        }

        // Main sort phase: quicksort everything but the NaN's
        sort1(a, fromIndex, n-fromIndex);

        // Postprocessing phase: change 0.0's to -0.0's as required
        if (numNegZeros != 0) {
            int j = binarySearch0(a, fromIndex, n, 0.0d); // posn of ANY zero
            do {
                j--;
            } while (j>=fromIndex && a[j]==0.0d);

            // j is now one less than the index of the FIRST zero
            for (int k=0; k<numNegZeros; k++)
                a[++j] = -0.0d;
        }
    }


    private static void sort2(float a[], int fromIndex, int toIndex) {
        final int NEG_ZERO_BITS = Float.floatToIntBits(-0.0f);
        /*
         * The sort is done in three phases to avoid the expense of using
         * NaN and -0.0 aware comparisons during the main sort.
         */

        /*
         * Preprocessing phase:  Move any NaN's to end of array, count the
         * number of -0.0's, and turn them into 0.0's.
         */
        int numNegZeros = 0;
        int i = fromIndex, n = toIndex;
        while(i < n) {
            if (a[i] != a[i]) {
                swap(a, i, --n);
            } else {
                if (a[i]==0 && Float.floatToIntBits(a[i])==NEG_ZERO_BITS) {
                    a[i] = 0.0f;
                    numNegZeros++;
                }
                i++;
            }
        }

        // Main sort phase: quicksort everything but the NaN's
        sort1(a, fromIndex, n-fromIndex);

        // Postprocessing phase: change 0.0's to -0.0's as required
        if (numNegZeros != 0) {
            int j = binarySearch0(a, fromIndex, n, 0.0f); // posn of ANY zero
            do {
                j--;
            } while (j>=fromIndex && a[j]==0.0f);

            // j is now one less than the index of the FIRST zero
            for (int k=0; k<numNegZeros; k++)
                a[++j] = -0.0f;
        }
    }


    /*
     * The code for each of the seven primitive types is largely identical.
     * C'est la vie.
     */

    /**
     * Sorts the specified sub-array of longs into ascending order.
     */
    private static void sort1(long x[], int off, int len) {
        // Insertion sort on smallest arrays
        if (len < 7) {
            for (int i=off; i<len+off; i++)
                for (int j=i; j>off && x[j-1]>x[j]; j--)
                    swap(x, j, j-1);
            return;
        }

        // Choose a partition element, v
        int m = off + (len >> 1);       // Small arrays, middle element
        if (len > 7) {
            int l = off;
            int n = off + len - 1;
            if (len > 40) {        // Big arrays, pseudomedian of 9
                int s = len/8;
                l = med3(x, l,     l+s, l+2*s);
                m = med3(x, m-s,   m,   m+s);
                n = med3(x, n-2*s, n-s, n);
            }
            m = med3(x, l, m, n); // Mid-size, med of 3
        }
        long v = x[m];

        // Establish Invariant: v* (<v)* (>v)* v*
        int a = off, b = a, c = off + len - 1, d = c;
        while(true) {
            while (b <= c && x[b] <= v) {
                if (x[b] == v)
                    swap(x, a++, b);
                b++;
            }
            while (c >= b && x[c] >= v) {
                if (x[c] == v)
                    swap(x, c, d--);
                c--;
            }
            if (b > c)
                break;
            swap(x, b++, c--);
        }

        // Swap partition elements back to middle
        int s, n = off + len;
        s = Math.min(a-off, b-a  );  vecswap(x, off, b-s, s);
        s = Math.min(d-c,   n-d-1);  vecswap(x, b,   n-s, s);

        // Recursively sort non-partition-elements
        if ((s = b-a) > 1)
            sort1(x, off, s);
        if ((s = d-c) > 1)
            sort1(x, n-s, s);
    }

    /**
     * Swaps x[a] with x[b].
     */
    private static void swap(long x[], int a, int b) {
        long t = x[a];
        x[a] = x[b];
        x[b] = t;
    }

    /**
     * Swaps x[a .. (a+n-1)] with x[b .. (b+n-1)].
     */
    private static void vecswap(long x[], int a, int b, int n) {
        for (int i=0; i<n; i++, a++, b++)
            swap(x, a, b);
    }

    /**
     * Returns the index of the median of the three indexed longs.
     */
    private static int med3(long x[], int a, int b, int c) {
        return (x[a] < x[b] ?
                (x[b] < x[c] ? b : x[a] < x[c] ? c : a) :
                (x[b] > x[c] ? b : x[a] > x[c] ? c : a));
    }

    /**
     * Sorts the specified sub-array of integers into ascending order.
     */
    private static void sort1(int x[], int off, int len) {
        // Insertion sort on smallest arrays
        if (len < 7) {
            for (int i=off; i<len+off; i++)
                for (int j=i; j>off && x[j-1]>x[j]; j--)
                    swap(x, j, j-1);
            return;
        }

        // Choose a partition element, v
        int m = off + (len >> 1);       // Small arrays, middle element
        if (len > 7) {
            int l = off;
            int n = off + len - 1;
            if (len > 40) {        // Big arrays, pseudomedian of 9
                int s = len/8;
                l = med3(x, l,     l+s, l+2*s);
                m = med3(x, m-s,   m,   m+s);
                n = med3(x, n-2*s, n-s, n);
            }
            m = med3(x, l, m, n); // Mid-size, med of 3
        }
        int v = x[m];

        // Establish Invariant: v* (<v)* (>v)* v*
        int a = off, b = a, c = off + len - 1, d = c;
        while(true) {
            while (b <= c && x[b] <= v) {
                if (x[b] == v)
                    swap(x, a++, b);
                b++;
            }
            while (c >= b && x[c] >= v) {
                if (x[c] == v)
                    swap(x, c, d--);
                c--;
            }
            if (b > c)
                break;
            swap(x, b++, c--);
        }

        // Swap partition elements back to middle
        int s, n = off + len;
        s = Math.min(a-off, b-a  );  vecswap(x, off, b-s, s);
        s = Math.min(d-c,   n-d-1);  vecswap(x, b,   n-s, s);

        // Recursively sort non-partition-elements
        if ((s = b-a) > 1)
            sort1(x, off, s);
        if ((s = d-c) > 1)
            sort1(x, n-s, s);
    }

    /**
     * Swaps x[a] with x[b].
     */
    private static void swap(int x[], int a, int b) {
        int t = x[a];
        x[a] = x[b];
        x[b] = t;
    }

    /**
     * Swaps x[a .. (a+n-1)] with x[b .. (b+n-1)].
     */
    private static void vecswap(int x[], int a, int b, int n) {
        for (int i=0; i<n; i++, a++, b++)
            swap(x, a, b);
    }

    /**
     * Returns the index of the median of the three indexed integers.
     */
    private static int med3(int x[], int a, int b, int c) {
        return (x[a] < x[b] ?
                (x[b] < x[c] ? b : x[a] < x[c] ? c : a) :
                (x[b] > x[c] ? b : x[a] > x[c] ? c : a));
    }

    /**
     * Sorts the specified sub-array of shorts into ascending order.
     */
    private static void sort1(short x[], int off, int len) {
        // Insertion sort on smallest arrays
        if (len < 7) {
            for (int i=off; i<len+off; i++)
                for (int j=i; j>off && x[j-1]>x[j]; j--)
                    swap(x, j, j-1);
            return;
        }

        // Choose a partition element, v
        int m = off + (len >> 1);       // Small arrays, middle element
        if (len > 7) {
            int l = off;
            int n = off + len - 1;
            if (len > 40) {        // Big arrays, pseudomedian of 9
                int s = len/8;
                l = med3(x, l,     l+s, l+2*s);
                m = med3(x, m-s,   m,   m+s);
                n = med3(x, n-2*s, n-s, n);
            }
            m = med3(x, l, m, n); // Mid-size, med of 3
        }
        short v = x[m];

        // Establish Invariant: v* (<v)* (>v)* v*
        int a = off, b = a, c = off + len - 1, d = c;
        while(true) {
            while (b <= c && x[b] <= v) {
                if (x[b] == v)
                    swap(x, a++, b);
                b++;
            }
            while (c >= b && x[c] >= v) {
                if (x[c] == v)
                    swap(x, c, d--);
                c--;
            }
            if (b > c)
                break;
            swap(x, b++, c--);
        }

        // Swap partition elements back to middle
        int s, n = off + len;
        s = Math.min(a-off, b-a  );  vecswap(x, off, b-s, s);
        s = Math.min(d-c,   n-d-1);  vecswap(x, b,   n-s, s);

        // Recursively sort non-partition-elements
        if ((s = b-a) > 1)
            sort1(x, off, s);
        if ((s = d-c) > 1)
            sort1(x, n-s, s);
    }

    /**
     * Swaps x[a] with x[b].
     */
    private static void swap(short x[], int a, int b) {
        short t = x[a];
        x[a] = x[b];
        x[b] = t;
    }

    /**
     * Swaps x[a .. (a+n-1)] with x[b .. (b+n-1)].
     */
    private static void vecswap(short x[], int a, int b, int n) {
        for (int i=0; i<n; i++, a++, b++)
            swap(x, a, b);
    }

    /**
     * Returns the index of the median of the three indexed shorts.
     */
    private static int med3(short x[], int a, int b, int c) {
        return (x[a] < x[b] ?
                (x[b] < x[c] ? b : x[a] < x[c] ? c : a) :
                (x[b] > x[c] ? b : x[a] > x[c] ? c : a));
    }


    /**
     * Sorts the specified sub-array of chars into ascending order.
     */
    private static void sort1(char x[], int off, int len) {
        // Insertion sort on smallest arrays
        if (len < 7) {
            for (int i=off; i<len+off; i++)
                for (int j=i; j>off && x[j-1]>x[j]; j--)
                    swap(x, j, j-1);
            return;
        }

        // Choose a partition element, v
        int m = off + (len >> 1);       // Small arrays, middle element
        if (len > 7) {
            int l = off;
            int n = off + len - 1;
            if (len > 40) {        // Big arrays, pseudomedian of 9
                int s = len/8;
                l = med3(x, l,     l+s, l+2*s);
                m = med3(x, m-s,   m,   m+s);
                n = med3(x, n-2*s, n-s, n);
            }
            m = med3(x, l, m, n); // Mid-size, med of 3
        }
        char v = x[m];

        // Establish Invariant: v* (<v)* (>v)* v*
        int a = off, b = a, c = off + len - 1, d = c;
        while(true) {
            while (b <= c && x[b] <= v) {
                if (x[b] == v)
                    swap(x, a++, b);
                b++;
            }
            while (c >= b && x[c] >= v) {
                if (x[c] == v)
                    swap(x, c, d--);
                c--;
            }
            if (b > c)
                break;
            swap(x, b++, c--);
        }

        // Swap partition elements back to middle
        int s, n = off + len;
        s = Math.min(a-off, b-a  );  vecswap(x, off, b-s, s);
        s = Math.min(d-c,   n-d-1);  vecswap(x, b,   n-s, s);

        // Recursively sort non-partition-elements
        if ((s = b-a) > 1)
            sort1(x, off, s);
        if ((s = d-c) > 1)
            sort1(x, n-s, s);
    }

    /**
     * Swaps x[a] with x[b].
     */
    private static void swap(char x[], int a, int b) {
        char t = x[a];
        x[a] = x[b];
        x[b] = t;
    }

    /**
     * Swaps x[a .. (a+n-1)] with x[b .. (b+n-1)].
     */
    private static void vecswap(char x[], int a, int b, int n) {
        for (int i=0; i<n; i++, a++, b++)
            swap(x, a, b);
    }

    /**
     * Returns the index of the median of the three indexed chars.
     */
    private static int med3(char x[], int a, int b, int c) {
        return (x[a] < x[b] ?
                (x[b] < x[c] ? b : x[a] < x[c] ? c : a) :
                (x[b] > x[c] ? b : x[a] > x[c] ? c : a));
    }


    /**
     * Sorts the specified sub-array of bytes into ascending order.
     */
    private static void sort1(byte x[], int off, int len) {
        // Insertion sort on smallest arrays
        if (len < 7) {
            for (int i=off; i<len+off; i++)
                for (int j=i; j>off && x[j-1]>x[j]; j--)
                    swap(x, j, j-1);
            return;
        }

        // Choose a partition element, v
        int m = off + (len >> 1);       // Small arrays, middle element
        if (len > 7) {
            int l = off;
            int n = off + len - 1;
            if (len > 40) {        // Big arrays, pseudomedian of 9
                int s = len/8;
                l = med3(x, l,     l+s, l+2*s);
                m = med3(x, m-s,   m,   m+s);
                n = med3(x, n-2*s, n-s, n);
            }
            m = med3(x, l, m, n); // Mid-size, med of 3
        }
        byte v = x[m];

        // Establish Invariant: v* (<v)* (>v)* v*
        int a = off, b = a, c = off + len - 1, d = c;
        while(true) {
            while (b <= c && x[b] <= v) {
                if (x[b] == v)
                    swap(x, a++, b);
                b++;
            }
            while (c >= b && x[c] >= v) {
                if (x[c] == v)
                    swap(x, c, d--);
                c--;
            }
            if (b > c)
                break;
            swap(x, b++, c--);
        }

        // Swap partition elements back to middle
        int s, n = off + len;
        s = Math.min(a-off, b-a  );  vecswap(x, off, b-s, s);
        s = Math.min(d-c,   n-d-1);  vecswap(x, b,   n-s, s);

        // Recursively sort non-partition-elements
        if ((s = b-a) > 1)
            sort1(x, off, s);
        if ((s = d-c) > 1)
            sort1(x, n-s, s);
    }

    /**
     * Swaps x[a] with x[b].
     */
    private static void swap(byte x[], int a, int b) {
        byte t = x[a];
        x[a] = x[b];
        x[b] = t;
    }

    /**
     * Swaps x[a .. (a+n-1)] with x[b .. (b+n-1)].
     */
    private static void vecswap(byte x[], int a, int b, int n) {
        for (int i=0; i<n; i++, a++, b++)
            swap(x, a, b);
    }

    /**
     * Returns the index of the median of the three indexed bytes.
     */
    private static int med3(byte x[], int a, int b, int c) {
        return (x[a] < x[b] ?
                (x[b] < x[c] ? b : x[a] < x[c] ? c : a) :
                (x[b] > x[c] ? b : x[a] > x[c] ? c : a));
    }


    /**
     * Sorts the specified sub-array of doubles into ascending order.
     */
    private static void sort1(double x[], int off, int len) {
        // Insertion sort on smallest arrays
        if (len < 7) {
            for (int i=off; i<len+off; i++)
                for (int j=i; j>off && x[j-1]>x[j]; j--)
                    swap(x, j, j-1);
            return;
        }

        // Choose a partition element, v
        int m = off + (len >> 1);       // Small arrays, middle element
        if (len > 7) {
            int l = off;
            int n = off + len - 1;
            if (len > 40) {        // Big arrays, pseudomedian of 9
                int s = len/8;
                l = med3(x, l,     l+s, l+2*s);
                m = med3(x, m-s,   m,   m+s);
                n = med3(x, n-2*s, n-s, n);
            }
            m = med3(x, l, m, n); // Mid-size, med of 3
        }
        double v = x[m];

        // Establish Invariant: v* (<v)* (>v)* v*
        int a = off, b = a, c = off + len - 1, d = c;
        while(true) {
            while (b <= c && x[b] <= v) {
                if (x[b] == v)
                    swap(x, a++, b);
                b++;
            }
            while (c >= b && x[c] >= v) {
                if (x[c] == v)
                    swap(x, c, d--);
                c--;
            }
            if (b > c)
                break;
            swap(x, b++, c--);
        }

        // Swap partition elements back to middle
        int s, n = off + len;
        s = Math.min(a-off, b-a  );  vecswap(x, off, b-s, s);
        s = Math.min(d-c,   n-d-1);  vecswap(x, b,   n-s, s);

        // Recursively sort non-partition-elements
        if ((s = b-a) > 1)
            sort1(x, off, s);
        if ((s = d-c) > 1)
            sort1(x, n-s, s);
    }

    /**
     * Swaps x[a] with x[b].
     */
    private static void swap(double x[], int a, int b) {
        double t = x[a];
        x[a] = x[b];
        x[b] = t;
    }

    /**
     * Swaps x[a .. (a+n-1)] with x[b .. (b+n-1)].
     */
    private static void vecswap(double x[], int a, int b, int n) {
        for (int i=0; i<n; i++, a++, b++)
            swap(x, a, b);
    }

    /**
     * Returns the index of the median of the three indexed doubles.
     */
    private static int med3(double x[], int a, int b, int c) {
        return (x[a] < x[b] ?
                (x[b] < x[c] ? b : x[a] < x[c] ? c : a) :
                (x[b] > x[c] ? b : x[a] > x[c] ? c : a));
    }


    /**
     * Sorts the specified sub-array of floats into ascending order.
     */
    private static void sort1(float x[], int off, int len) {
        // Insertion sort on smallest arrays
        if (len < 7) {
            for (int i=off; i<len+off; i++)
                for (int j=i; j>off && x[j-1]>x[j]; j--)
                    swap(x, j, j-1);
            return;
        }

        // Choose a partition element, v
        int m = off + (len >> 1);       // Small arrays, middle element
        if (len > 7) {
            int l = off;
            int n = off + len - 1;
            if (len > 40) {        // Big arrays, pseudomedian of 9
                int s = len/8;
                l = med3(x, l,     l+s, l+2*s);
                m = med3(x, m-s,   m,   m+s);
                n = med3(x, n-2*s, n-s, n);
            }
            m = med3(x, l, m, n); // Mid-size, med of 3
        }
        float v = x[m];

        // Establish Invariant: v* (<v)* (>v)* v*
        int a = off, b = a, c = off + len - 1, d = c;
        while(true) {
            while (b <= c && x[b] <= v) {
                if (x[b] == v)
                    swap(x, a++, b);
                b++;
            }
            while (c >= b && x[c] >= v) {
                if (x[c] == v)
                    swap(x, c, d--);
                c--;
            }
            if (b > c)
                break;
            swap(x, b++, c--);
        }

        // Swap partition elements back to middle
        int s, n = off + len;
        s = Math.min(a-off, b-a  );  vecswap(x, off, b-s, s);
        s = Math.min(d-c,   n-d-1);  vecswap(x, b,   n-s, s);

        // Recursively sort non-partition-elements
        if ((s = b-a) > 1)
            sort1(x, off, s);
        if ((s = d-c) > 1)
            sort1(x, n-s, s);
    }

    /**
     * Swaps x[a] with x[b].
     */
    private static void swap(float x[], int a, int b) {
        float t = x[a];
        x[a] = x[b];
        x[b] = t;
    }

    /**
     * Swaps x[a .. (a+n-1)] with x[b .. (b+n-1)].
     */
    private static void vecswap(float x[], int a, int b, int n) {
        for (int i=0; i<n; i++, a++, b++)
            swap(x, a, b);
    }

    /**
     * Returns the index of the median of the three indexed floats.
     */
    private static int med3(float x[], int a, int b, int c) {
        return (x[a] < x[b] ?
                (x[b] < x[c] ? b : x[a] < x[c] ? c : a) :
                (x[b] > x[c] ? b : x[a] > x[c] ? c : a));
    }


    public static void sort(Object[] a) {
        Object[] aux = (Object[])a.clone();
        mergeSort(aux, a, 0, a.length, 0);
    }

    public static void sort(Object[] a, int fromIndex, int toIndex) {
        rangeCheck(a.length, fromIndex, toIndex);
        Object[] aux = copyOfRange(a, fromIndex, toIndex);
        mergeSort(aux, a, fromIndex, toIndex, -fromIndex);
    }

    /**
     * Tuning parameter: list size at or below which insertion sort will be
     * used in preference to mergesort or quicksort.
     */
    private static final int INSERTIONSORT_THRESHOLD = 7;

    /**
     * Src is the source array that starts at index 0
     * Dest is the (possibly larger) array destination with a possible offset
     * low is the index in dest to start sorting
     * high is the end index in dest to end sorting
     * off is the offset to generate corresponding low, high in src
     */
    private static void mergeSort(Object[] src,
                                  Object[] dest,
                                  int low,
                                  int high,
                                  int off) {
        int length = high - low;

        // Insertion sort on smallest arrays
        if (length < INSERTIONSORT_THRESHOLD) {
            for (int i=low; i<high; i++)
                for (int j=i; j>low &&
                         ((Comparable) dest[j-1]).compareTo(dest[j])>0; j--)
                    swap(dest, j, j-1);
            return;
        }

        // Recursively sort halves of dest into src
        int destLow  = low;
        int destHigh = high;
        low  += off;
        high += off;
        int mid = (low + high) >>> 1;
        mergeSort(dest, src, low, mid, -off);
        mergeSort(dest, src, mid, high, -off);

        // If list is already sorted, just copy from src to dest.  This is an
        // optimization that results in faster sorts for nearly ordered lists.
        if (((Comparable)src[mid-1]).compareTo(src[mid]) <= 0) {
            System.arraycopy(src, low, dest, destLow, length);
            return;
        }

        // Merge sorted halves (now in src) into dest
        for(int i = destLow, p = low, q = mid; i < destHigh; i++) {
            if (q >= high || p < mid && ((Comparable)src[p]).compareTo(src[q])<=0)
                dest[i] = src[p++];
            else
                dest[i] = src[q++];
        }
    }

    /**
     * Swaps x[a] with x[b].
     */
    private static void swap(Object[] x, int a, int b) {
        Object t = x[a];
        x[a] = x[b];
        x[b] = t;
    }

    /**
     * Sorts the specified array of objects according to the order induced by
     * the specified comparator.  All elements in the array must be
     * <i>mutually comparable</i> by the specified comparator (that is,
     * <tt>c.compare(e1, e2)</tt> must not throw a <tt>ClassCastException</tt>
     * for any elements <tt>e1</tt> and <tt>e2</tt> in the array).<p>
     *
     * This sort is guaranteed to be <i>stable</i>:  equal elements will
     * not be reordered as a result of the sort.<p>
     *
     * The sorting algorithm is a modified mergesort (in which the merge is
     * omitted if the highest element in the low sublist is less than the
     * lowest element in the high sublist).  This algorithm offers guaranteed
     * n*log(n) performance.
     *
     * @param a the array to be sorted
     * @param c the comparator to determine the order of the array.  A
     *        <tt>null</tt> value indicates that the elements'
     *        {@linkplain Comparable natural ordering} should be used.
     * @throws  ClassCastException if the array contains elements that are
     *          not <i>mutually comparable</i> using the specified comparator.
     */
    public static void sort(Object[] a, Comparator c) {
        Object[] aux = (Object[])a.clone();
        if (c==null)
            mergeSort(aux, a, 0, a.length, 0);
        else
            mergeSort(aux, a, 0, a.length, 0, c);
    }

    public static  void sort(Object[] a, int fromIndex, int toIndex,
                                Comparator c) {
        rangeCheck(a.length, fromIndex, toIndex);
        Object[] aux = (Object[])copyOfRange(a, fromIndex, toIndex);
        if (c==null)
            mergeSort(aux, a, fromIndex, toIndex, -fromIndex);
        else
            mergeSort(aux, a, fromIndex, toIndex, -fromIndex, c);
    }

    /**
     * Src is the source array that starts at index 0
     * Dest is the (possibly larger) array destination with a possible offset
     * low is the index in dest to start sorting
     * high is the end index in dest to end sorting
     * off is the offset into src corresponding to low in dest
     */
    private static void mergeSort(Object[] src,
                                  Object[] dest,
                                  int low, int high, int off,
                                  Comparator c) {
        int length = high - low;

        // Insertion sort on smallest arrays
        if (length < INSERTIONSORT_THRESHOLD) {
            for (int i=low; i<high; i++)
                for (int j=i; j>low && c.compare(dest[j-1], dest[j])>0; j--)
                    swap(dest, j, j-1);
            return;
        }

        // Recursively sort halves of dest into src
        int destLow  = low;
        int destHigh = high;
        low  += off;
        high += off;
        int mid = (low + high) >>> 1;
        mergeSort(dest, src, low, mid, -off, c);
        mergeSort(dest, src, mid, high, -off, c);

        // If list is already sorted, just copy from src to dest.  This is an
        // optimization that results in faster sorts for nearly ordered lists.
        if (c.compare(src[mid-1], src[mid]) <= 0) {
           System.arraycopy(src, low, dest, destLow, length);
           return;
        }

        // Merge sorted halves (now in src) into dest
        for(int i = destLow, p = low, q = mid; i < destHigh; i++) {
            if (q >= high || p < mid && c.compare(src[p], src[q]) <= 0)
                dest[i] = src[p++];
            else
                dest[i] = src[q++];
        }
    }

    /**
     * Check that fromIndex and toIndex are in range, and throw an
     * appropriate exception if they aren't.
     */
    private static void rangeCheck(int arrayLen, int fromIndex, int toIndex) {
        if (fromIndex > toIndex)
            throw new IllegalArgumentException("fromIndex(" + fromIndex +
                       ") > toIndex(" + toIndex+")");
        if (fromIndex < 0)
            throw new ArrayIndexOutOfBoundsException(fromIndex);
        if (toIndex > arrayLen)
            throw new ArrayIndexOutOfBoundsException(toIndex);
    }

    // Searching

    /**
     * Searches the specified array of longs for the specified value using the
     * binary search algorithm.  The array must be sorted (as
     * by the {@link #sort(long[])} method) prior to making this call.  If it
     * is not sorted, the results are undefined.  If the array contains
     * multiple elements with the specified value, there is no guarantee which
     * one will be found.
     *
     * @param a the array to be searched
     * @param key the value to be searched for
     * @return index of the search key, if it is contained in the array;
     *         otherwise, <tt>(-(<i>insertion point</i>) - 1)</tt>.  The
     *         <i>insertion point</i> is defined as the point at which the
     *         key would be inserted into the array: the index of the first
     *         element greater than the key, or <tt>a.length</tt> if all
     *         elements in the array are less than the specified key.  Note
     *         that this guarantees that the return value will be &gt;= 0 if
     *         and only if the key is found.
     */
    public static int binarySearch(long[] a, long key) {
        return binarySearch0(a, 0, a.length, key);
    }

    /**
     * Searches a range of
     * the specified array of longs for the specified value using the
     * binary search algorithm.
     * The range must be sorted (as
     * by the {@link #sort(long[], int, int)} method)
     * prior to making this call.  If it
     * is not sorted, the results are undefined.  If the range contains
     * multiple elements with the specified value, there is no guarantee which
     * one will be found.
     *
     * @param a the array to be searched
     * @param fromIndex the index of the first element (inclusive) to be
     *          searched
     * @param toIndex the index of the last element (exclusive) to be searched
     * @param key the value to be searched for
     * @return index of the search key, if it is contained in the array
     *         within the specified range;
     *         otherwise, <tt>(-(<i>insertion point</i>) - 1)</tt>.  The
     *         <i>insertion point</i> is defined as the point at which the
     *         key would be inserted into the array: the index of the first
     *         element in the range greater than the key,
     *         or <tt>toIndex</tt> if all
     *         elements in the range are less than the specified key.  Note
     *         that this guarantees that the return value will be &gt;= 0 if
     *         and only if the key is found.
     * @throws IllegalArgumentException
     *         if {@code fromIndex > toIndex}
     * @throws ArrayIndexOutOfBoundsException
     *         if {@code fromIndex < 0 or toIndex > a.length}
     *  1.6
     */
    public static int binarySearch(long[] a, int fromIndex, int toIndex,
                                   long key) {
        rangeCheck(a.length, fromIndex, toIndex);
        return binarySearch0(a, fromIndex, toIndex, key);
    }

    // Like public version, but without range checks.
    private static int binarySearch0(long[] a, int fromIndex, int toIndex,
                                     long key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            long midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }

    /**
     * Searches the specified array of ints for the specified value using the
     * binary search algorithm.  The array must be sorted (as
     * by the {@link #sort(int[])} method) prior to making this call.  If it
     * is not sorted, the results are undefined.  If the array contains
     * multiple elements with the specified value, there is no guarantee which
     * one will be found.
     *
     * @param a the array to be searched
     * @param key the value to be searched for
     * @return index of the search key, if it is contained in the array;
     *         otherwise, <tt>(-(<i>insertion point</i>) - 1)</tt>.  The
     *         <i>insertion point</i> is defined as the point at which the
     *         key would be inserted into the array: the index of the first
     *         element greater than the key, or <tt>a.length</tt> if all
     *         elements in the array are less than the specified key.  Note
     *         that this guarantees that the return value will be &gt;= 0 if
     *         and only if the key is found.
     */
    public static int binarySearch(int[] a, int key) {
        return binarySearch0(a, 0, a.length, key);
    }

    /**
     * Searches a range of
     * the specified array of ints for the specified value using the
     * binary search algorithm.
     * The range must be sorted (as
     * by the {@link #sort(int[], int, int)} method)
     * prior to making this call.  If it
     * is not sorted, the results are undefined.  If the range contains
     * multiple elements with the specified value, there is no guarantee which
     * one will be found.
     *
     * @param a the array to be searched
     * @param fromIndex the index of the first element (inclusive) to be
     *          searched
     * @param toIndex the index of the last element (exclusive) to be searched
     * @param key the value to be searched for
     * @return index of the search key, if it is contained in the array
     *         within the specified range;
     *         otherwise, <tt>(-(<i>insertion point</i>) - 1)</tt>.  The
     *         <i>insertion point</i> is defined as the point at which the
     *         key would be inserted into the array: the index of the first
     *         element in the range greater than the key,
     *         or <tt>toIndex</tt> if all
     *         elements in the range are less than the specified key.  Note
     *         that this guarantees that the return value will be &gt;= 0 if
     *         and only if the key is found.
     * @throws IllegalArgumentException
     *         if {@code fromIndex > toIndex}
     * @throws ArrayIndexOutOfBoundsException
     *         if {@code fromIndex < 0 or toIndex > a.length}
     *  1.6
     */
    public static int binarySearch(int[] a, int fromIndex, int toIndex,
                                   int key) {
        rangeCheck(a.length, fromIndex, toIndex);
        return binarySearch0(a, fromIndex, toIndex, key);
    }

    // Like public version, but without range checks.
    private static int binarySearch0(int[] a, int fromIndex, int toIndex,
                                     int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }

    /**
     * Searches the specified array of shorts for the specified value using
     * the binary search algorithm.  The array must be sorted
     * (as by the {@link #sort(short[])} method) prior to making this call.  If
     * it is not sorted, the results are undefined.  If the array contains
     * multiple elements with the specified value, there is no guarantee which
     * one will be found.
     *
     * @param a the array to be searched
     * @param key the value to be searched for
     * @return index of the search key, if it is contained in the array;
     *         otherwise, <tt>(-(<i>insertion point</i>) - 1)</tt>.  The
     *         <i>insertion point</i> is defined as the point at which the
     *         key would be inserted into the array: the index of the first
     *         element greater than the key, or <tt>a.length</tt> if all
     *         elements in the array are less than the specified key.  Note
     *         that this guarantees that the return value will be &gt;= 0 if
     *         and only if the key is found.
     */
    public static int binarySearch(short[] a, short key) {
        return binarySearch0(a, 0, a.length, key);
    }

    /**
     * Searches a range of
     * the specified array of shorts for the specified value using
     * the binary search algorithm.
     * The range must be sorted
     * (as by the {@link #sort(short[], int, int)} method)
     * prior to making this call.  If
     * it is not sorted, the results are undefined.  If the range contains
     * multiple elements with the specified value, there is no guarantee which
     * one will be found.
     *
     * @param a the array to be searched
     * @param fromIndex the index of the first element (inclusive) to be
     *          searched
     * @param toIndex the index of the last element (exclusive) to be searched
     * @param key the value to be searched for
     * @return index of the search key, if it is contained in the array
     *         within the specified range;
     *         otherwise, <tt>(-(<i>insertion point</i>) - 1)</tt>.  The
     *         <i>insertion point</i> is defined as the point at which the
     *         key would be inserted into the array: the index of the first
     *         element in the range greater than the key,
     *         or <tt>toIndex</tt> if all
     *         elements in the range are less than the specified key.  Note
     *         that this guarantees that the return value will be &gt;= 0 if
     *         and only if the key is found.
     * @throws IllegalArgumentException
     *         if {@code fromIndex > toIndex}
     * @throws ArrayIndexOutOfBoundsException
     *         if {@code fromIndex < 0 or toIndex > a.length}
     *  1.6
     */
    public static int binarySearch(short[] a, int fromIndex, int toIndex,
                                   short key) {
        rangeCheck(a.length, fromIndex, toIndex);
        return binarySearch0(a, fromIndex, toIndex, key);
    }

    // Like public version, but without range checks.
    private static int binarySearch0(short[] a, int fromIndex, int toIndex,
                                     short key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            short midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }

    /**
     * Searches the specified array of chars for the specified value using the
     * binary search algorithm.  The array must be sorted (as
     * by the {@link #sort(char[])} method) prior to making this call.  If it
     * is not sorted, the results are undefined.  If the array contains
     * multiple elements with the specified value, there is no guarantee which
     * one will be found.
     *
     * @param a the array to be searched
     * @param key the value to be searched for
     * @return index of the search key, if it is contained in the array;
     *         otherwise, <tt>(-(<i>insertion point</i>) - 1)</tt>.  The
     *         <i>insertion point</i> is defined as the point at which the
     *         key would be inserted into the array: the index of the first
     *         element greater than the key, or <tt>a.length</tt> if all
     *         elements in the array are less than the specified key.  Note
     *         that this guarantees that the return value will be &gt;= 0 if
     *         and only if the key is found.
     */
    public static int binarySearch(char[] a, char key) {
        return binarySearch0(a, 0, a.length, key);
    }

    /**
     * Searches a range of
     * the specified array of chars for the specified value using the
     * binary search algorithm.
     * The range must be sorted (as
     * by the {@link #sort(char[], int, int)} method)
     * prior to making this call.  If it
     * is not sorted, the results are undefined.  If the range contains
     * multiple elements with the specified value, there is no guarantee which
     * one will be found.
     *
     * @param a the array to be searched
     * @param fromIndex the index of the first element (inclusive) to be
     *          searched
     * @param toIndex the index of the last element (exclusive) to be searched
     * @param key the value to be searched for
     * @return index of the search key, if it is contained in the array
     *         within the specified range;
     *         otherwise, <tt>(-(<i>insertion point</i>) - 1)</tt>.  The
     *         <i>insertion point</i> is defined as the point at which the
     *         key would be inserted into the array: the index of the first
     *         element in the range greater than the key,
     *         or <tt>toIndex</tt> if all
     *         elements in the range are less than the specified key.  Note
     *         that this guarantees that the return value will be &gt;= 0 if
     *         and only if the key is found.
     * @throws IllegalArgumentException
     *         if {@code fromIndex > toIndex}
     * @throws ArrayIndexOutOfBoundsException
     *         if {@code fromIndex < 0 or toIndex > a.length}
     *  1.6
     */
    public static int binarySearch(char[] a, int fromIndex, int toIndex,
                                   char key) {
        rangeCheck(a.length, fromIndex, toIndex);
        return binarySearch0(a, fromIndex, toIndex, key);
    }

    // Like public version, but without range checks.
    private static int binarySearch0(char[] a, int fromIndex, int toIndex,
                                     char key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            char midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }

    /**
     * Searches the specified array of bytes for the specified value using the
     * binary search algorithm.  The array must be sorted (as
     * by the {@link #sort(byte[])} method) prior to making this call.  If it
     * is not sorted, the results are undefined.  If the array contains
     * multiple elements with the specified value, there is no guarantee which
     * one will be found.
     *
     * @param a the array to be searched
     * @param key the value to be searched for
     * @return index of the search key, if it is contained in the array;
     *         otherwise, <tt>(-(<i>insertion point</i>) - 1)</tt>.  The
     *         <i>insertion point</i> is defined as the point at which the
     *         key would be inserted into the array: the index of the first
     *         element greater than the key, or <tt>a.length</tt> if all
     *         elements in the array are less than the specified key.  Note
     *         that this guarantees that the return value will be &gt;= 0 if
     *         and only if the key is found.
     */
    public static int binarySearch(byte[] a, byte key) {
        return binarySearch0(a, 0, a.length, key);
    }

    /**
     * Searches a range of
     * the specified array of bytes for the specified value using the
     * binary search algorithm.
     * The range must be sorted (as
     * by the {@link #sort(byte[], int, int)} method)
     * prior to making this call.  If it
     * is not sorted, the results are undefined.  If the range contains
     * multiple elements with the specified value, there is no guarantee which
     * one will be found.
     *
     * @param a the array to be searched
     * @param fromIndex the index of the first element (inclusive) to be
     *          searched
     * @param toIndex the index of the last element (exclusive) to be searched
     * @param key the value to be searched for
     * @return index of the search key, if it is contained in the array
     *         within the specified range;
     *         otherwise, <tt>(-(<i>insertion point</i>) - 1)</tt>.  The
     *         <i>insertion point</i> is defined as the point at which the
     *         key would be inserted into the array: the index of the first
     *         element in the range greater than the key,
     *         or <tt>toIndex</tt> if all
     *         elements in the range are less than the specified key.  Note
     *         that this guarantees that the return value will be &gt;= 0 if
     *         and only if the key is found.
     * @throws IllegalArgumentException
     *         if {@code fromIndex > toIndex}
     * @throws ArrayIndexOutOfBoundsException
     *         if {@code fromIndex < 0 or toIndex > a.length}
     *  1.6
     */
    public static int binarySearch(byte[] a, int fromIndex, int toIndex,
                                   byte key) {
        rangeCheck(a.length, fromIndex, toIndex);
        return binarySearch0(a, fromIndex, toIndex, key);
    }

    // Like public version, but without range checks.
    private static int binarySearch0(byte[] a, int fromIndex, int toIndex,
                                     byte key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            byte midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }

    /**
     * Searches the specified array of doubles for the specified value using
     * the binary search algorithm.  The array must be sorted
     * (as by the {@link #sort(double[])} method) prior to making this call.
     * If it is not sorted, the results are undefined.  If the array contains
     * multiple elements with the specified value, there is no guarantee which
     * one will be found.  This method considers all NaN values to be
     * equivalent and equal.
     *
     * @param a the array to be searched
     * @param key the value to be searched for
     * @return index of the search key, if it is contained in the array;
     *         otherwise, <tt>(-(<i>insertion point</i>) - 1)</tt>.  The
     *         <i>insertion point</i> is defined as the point at which the
     *         key would be inserted into the array: the index of the first
     *         element greater than the key, or <tt>a.length</tt> if all
     *         elements in the array are less than the specified key.  Note
     *         that this guarantees that the return value will be &gt;= 0 if
     *         and only if the key is found.
     */
    public static int binarySearch(double[] a, double key) {
        return binarySearch0(a, 0, a.length, key);
    }

    /**
     * Searches a range of
     * the specified array of doubles for the specified value using
     * the binary search algorithm.
     * The range must be sorted
     * (as by the {@link #sort(double[], int, int)} method)
     * prior to making this call.
     * If it is not sorted, the results are undefined.  If the range contains
     * multiple elements with the specified value, there is no guarantee which
     * one will be found.  This method considers all NaN values to be
     * equivalent and equal.
     *
     * @param a the array to be searched
     * @param fromIndex the index of the first element (inclusive) to be
     *          searched
     * @param toIndex the index of the last element (exclusive) to be searched
     * @param key the value to be searched for
     * @return index of the search key, if it is contained in the array
     *         within the specified range;
     *         otherwise, <tt>(-(<i>insertion point</i>) - 1)</tt>.  The
     *         <i>insertion point</i> is defined as the point at which the
     *         key would be inserted into the array: the index of the first
     *         element in the range greater than the key,
     *         or <tt>toIndex</tt> if all
     *         elements in the range are less than the specified key.  Note
     *         that this guarantees that the return value will be &gt;= 0 if
     *         and only if the key is found.
     * @throws IllegalArgumentException
     *         if {@code fromIndex > toIndex}
     * @throws ArrayIndexOutOfBoundsException
     *         if {@code fromIndex < 0 or toIndex > a.length}
     *  1.6
     */
    public static int binarySearch(double[] a, int fromIndex, int toIndex,
                                   double key) {
        rangeCheck(a.length, fromIndex, toIndex);
        return binarySearch0(a, fromIndex, toIndex, key);
    }

    // Like public version, but without range checks.
    private static int binarySearch0(double[] a, int fromIndex, int toIndex,
                                     double key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            double midVal = a[mid];

            if (midVal < key)
                low = mid + 1;  // Neither val is NaN, thisVal is smaller
            else if (midVal > key)
                high = mid - 1; // Neither val is NaN, thisVal is larger
            else {
                long midBits = Double.doubleToLongBits(midVal);
                long keyBits = Double.doubleToLongBits(key);
                if (midBits == keyBits)     // Values are equal
                    return mid;             // Key found
                else if (midBits < keyBits) // (-0.0, 0.0) or (!NaN, NaN)
                    low = mid + 1;
                else                        // (0.0, -0.0) or (NaN, !NaN)
                    high = mid - 1;
            }
        }
        return -(low + 1);  // key not found.
    }

    /**
     * Searches the specified array of floats for the specified value using
     * the binary search algorithm.  The array must be sorted
     * (as by the {@link #sort(float[])} method) prior to making this call.  If
     * it is not sorted, the results are undefined.  If the array contains
     * multiple elements with the specified value, there is no guarantee which
     * one will be found.  This method considers all NaN values to be
     * equivalent and equal.
     *
     * @param a the array to be searched
     * @param key the value to be searched for
     * @return index of the search key, if it is contained in the array;
     *         otherwise, <tt>(-(<i>insertion point</i>) - 1)</tt>.  The
     *         <i>insertion point</i> is defined as the point at which the
     *         key would be inserted into the array: the index of the first
     *         element greater than the key, or <tt>a.length</tt> if all
     *         elements in the array are less than the specified key.  Note
     *         that this guarantees that the return value will be &gt;= 0 if
     *         and only if the key is found.
     */
    public static int binarySearch(float[] a, float key) {
        return binarySearch0(a, 0, a.length, key);
    }

    /**
     * Searches a range of
     * the specified array of floats for the specified value using
     * the binary search algorithm.
     * The range must be sorted
     * (as by the {@link #sort(float[], int, int)} method)
     * prior to making this call.  If
     * it is not sorted, the results are undefined.  If the range contains
     * multiple elements with the specified value, there is no guarantee which
     * one will be found.  This method considers all NaN values to be
     * equivalent and equal.
     *
     * @param a the array to be searched
     * @param fromIndex the index of the first element (inclusive) to be
     *          searched
     * @param toIndex the index of the last element (exclusive) to be searched
     * @param key the value to be searched for
     * @return index of the search key, if it is contained in the array
     *         within the specified range;
     *         otherwise, <tt>(-(<i>insertion point</i>) - 1)</tt>.  The
     *         <i>insertion point</i> is defined as the point at which the
     *         key would be inserted into the array: the index of the first
     *         element in the range greater than the key,
     *         or <tt>toIndex</tt> if all
     *         elements in the range are less than the specified key.  Note
     *         that this guarantees that the return value will be &gt;= 0 if
     *         and only if the key is found.
     * @throws IllegalArgumentException
     *         if {@code fromIndex > toIndex}
     * @throws ArrayIndexOutOfBoundsException
     *         if {@code fromIndex < 0 or toIndex > a.length}
     *  1.6
     */
    public static int binarySearch(float[] a, int fromIndex, int toIndex,
                                   float key) {
        rangeCheck(a.length, fromIndex, toIndex);
        return binarySearch0(a, fromIndex, toIndex, key);
    }

    // Like public version, but without range checks.
    private static int binarySearch0(float[] a, int fromIndex, int toIndex,
                                     float key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            float midVal = a[mid];

            if (midVal < key)
                low = mid + 1;  // Neither val is NaN, thisVal is smaller
            else if (midVal > key)
                high = mid - 1; // Neither val is NaN, thisVal is larger
            else {
                int midBits = Float.floatToIntBits(midVal);
                int keyBits = Float.floatToIntBits(key);
                if (midBits == keyBits)     // Values are equal
                    return mid;             // Key found
                else if (midBits < keyBits) // (-0.0, 0.0) or (!NaN, NaN)
                    low = mid + 1;
                else                        // (0.0, -0.0) or (NaN, !NaN)
                    high = mid - 1;
            }
        }
        return -(low + 1);  // key not found.
    }


    /**
     * Searches the specified array for the specified object using the binary
     * search algorithm.  The array must be sorted into ascending order
     * according to the
     * {@linkplain Comparable natural ordering}
     * of its elements (as by the
     * {@link #sort(Object[])} method) prior to making this call.
     * If it is not sorted, the results are undefined.
     * (If the array contains elements that are not mutually comparable (for
     * example, strings and integers), it <i>cannot</i> be sorted according
     * to the natural ordering of its elements, hence results are undefined.)
     * If the array contains multiple
     * elements equal to the specified object, there is no guarantee which
     * one will be found.
     *
     * @param a the array to be searched
     * @param key the value to be searched for
     * @return index of the search key, if it is contained in the array;
     *         otherwise, <tt>(-(<i>insertion point</i>) - 1)</tt>.  The
     *         <i>insertion point</i> is defined as the point at which the
     *         key would be inserted into the array: the index of the first
     *         element greater than the key, or <tt>a.length</tt> if all
     *         elements in the array are less than the specified key.  Note
     *         that this guarantees that the return value will be &gt;= 0 if
     *         and only if the key is found.
     * @throws ClassCastException if the search key is not comparable to the
     *         elements of the array.
     */
    public static int binarySearch(Object[] a, Object key) {
        return binarySearch0(a, 0, a.length, key);
    }

    /**
     * Searches a range of
     * the specified array for the specified object using the binary
     * search algorithm.
     * The range must be sorted into ascending order
     * according to the
     * {@linkplain Comparable natural ordering}
     * of its elements (as by the
     * {@link #sort(Object[], int, int)} method) prior to making this
     * call.  If it is not sorted, the results are undefined.
     * (If the range contains elements that are not mutually comparable (for
     * example, strings and integers), it <i>cannot</i> be sorted according
     * to the natural ordering of its elements, hence results are undefined.)
     * If the range contains multiple
     * elements equal to the specified object, there is no guarantee which
     * one will be found.
     *
     * @param a the array to be searched
     * @param fromIndex the index of the first element (inclusive) to be
     *          searched
     * @param toIndex the index of the last element (exclusive) to be searched
     * @param key the value to be searched for
     * @return index of the search key, if it is contained in the array
     *         within the specified range;
     *         otherwise, <tt>(-(<i>insertion point</i>) - 1)</tt>.  The
     *         <i>insertion point</i> is defined as the point at which the
     *         key would be inserted into the array: the index of the first
     *         element in the range greater than the key,
     *         or <tt>toIndex</tt> if all
     *         elements in the range are less than the specified key.  Note
     *         that this guarantees that the return value will be &gt;= 0 if
     *         and only if the key is found.
     * @throws ClassCastException if the search key is not comparable to the
     *         elements of the array within the specified range.
     * @throws IllegalArgumentException
     *         if {@code fromIndex > toIndex}
     * @throws ArrayIndexOutOfBoundsException
     *         if {@code fromIndex < 0 or toIndex > a.length}
     *  1.6
     */
    public static int binarySearch(Object[] a, int fromIndex, int toIndex,
                                   Object key) {
        rangeCheck(a.length, fromIndex, toIndex);
        return binarySearch0(a, fromIndex, toIndex, key);
    }

    // Like public version, but without range checks.
    private static int binarySearch0(Object[] a, int fromIndex, int toIndex,
                                     Object key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            Comparable midVal = (Comparable)a[mid];
            int cmp = midVal.compareTo(key);

            if (cmp < 0)
                low = mid + 1;
            else if (cmp > 0)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }

    /**
     * Searches the specified array for the specified object using the binary
     * search algorithm.  The array must be sorted into ascending order
     * according to the specified comparator (as by the
     * {@link #sort(Object[], Comparator) sort(Object[], Comparator)}
     * method) prior to making this call.  If it is
     * not sorted, the results are undefined.
     * If the array contains multiple
     * elements equal to the specified object, there is no guarantee which one
     * will be found.
     *
     * @param a the array to be searched
     * @param key the value to be searched for
     * @param c the comparator by which the array is ordered.  A
     *        <tt>null</tt> value indicates that the elements'
     *        {@linkplain Comparable natural ordering} should be used.
     * @return index of the search key, if it is contained in the array;
     *         otherwise, <tt>(-(<i>insertion point</i>) - 1)</tt>.  The
     *         <i>insertion point</i> is defined as the point at which the
     *         key would be inserted into the array: the index of the first
     *         element greater than the key, or <tt>a.length</tt> if all
     *         elements in the array are less than the specified key.  Note
     *         that this guarantees that the return value will be &gt;= 0 if
     *         and only if the key is found.
     * @throws ClassCastException if the array contains elements that are not
     *         <i>mutually comparable</i> using the specified comparator,
     *         or the search key is not comparable to the
     *         elements of the array using this comparator.
     */
    public static  int binarySearch(Object[] a, Object key, Comparator c) {
        return binarySearch0(a, 0, a.length, key, c);
    }

    /**
     * Searches a range of
     * the specified array for the specified object using the binary
     * search algorithm.
     * The range must be sorted into ascending order
     * according to the specified comparator (as by the
     * {@link #sort(Object[], int, int, Comparator)
     * sort(Object[], int, int, Comparator)}
     * method) prior to making this call.
     * If it is not sorted, the results are undefined.
     * If the range contains multiple elements equal to the specified object,
     * there is no guarantee which one will be found.
     *
     * @param a the array to be searched
     * @param fromIndex the index of the first element (inclusive) to be
     *          searched
     * @param toIndex the index of the last element (exclusive) to be searched
     * @param key the value to be searched for
     * @param c the comparator by which the array is ordered.  A
     *        <tt>null</tt> value indicates that the elements'
     *        {@linkplain Comparable natural ordering} should be used.
     * @return index of the search key, if it is contained in the array
     *         within the specified range;
     *         otherwise, <tt>(-(<i>insertion point</i>) - 1)</tt>.  The
     *         <i>insertion point</i> is defined as the point at which the
     *         key would be inserted into the array: the index of the first
     *         element in the range greater than the key,
     *         or <tt>toIndex</tt> if all
     *         elements in the range are less than the specified key.  Note
     *         that this guarantees that the return value will be &gt;= 0 if
     *         and only if the key is found.
     * @throws ClassCastException if the range contains elements that are not
     *         <i>mutually comparable</i> using the specified comparator,
     *         or the search key is not comparable to the
     *         elements in the range using this comparator.
     * @throws IllegalArgumentException
     *         if {@code fromIndex > toIndex}
     * @throws ArrayIndexOutOfBoundsException
     *         if {@code fromIndex < 0 or toIndex > a.length}
     *  1.6
     */
    public static  int binarySearch(Object[] a, int fromIndex, int toIndex,
                                    Object key, Comparator c) {
        rangeCheck(a.length, fromIndex, toIndex);
        return binarySearch0(a, fromIndex, toIndex, key, c);
    }

    // Like public version, but without range checks.
    private static  int binarySearch0(Object[] a, int fromIndex, int toIndex,
                                         Object key, Comparator c) {
        if (c == null) {
            return binarySearch0(a, fromIndex, toIndex, key);
        }
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            Object midVal = a[mid];
            int cmp = c.compare(midVal, key);

            if (cmp < 0)
                low = mid + 1;
            else if (cmp > 0)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }


    // Equality Testing

    /**
     * Returns <tt>true</tt> if the two specified arrays of longs are
     * <i>equal</i> to one another.  Two arrays are considered equal if both
     * arrays contain the same number of elements, and all corresponding pairs
     * of elements in the two arrays are equal.  In other words, two arrays
     * are equal if they contain the same elements in the same order.  Also,
     * two array references are considered equal if both are <tt>null</tt>.<p>
     *
     * @param a one array to be tested for equality
     * @param a2 the other array to be tested for equality
     * @return <tt>true</tt> if the two arrays are equal
     */
    public static boolean equals(long[] a, long[] a2) {
        if (a==a2)
            return true;
        if (a==null || a2==null)
            return false;

        int length = a.length;
        if (a2.length != length)
            return false;

        for (int i=0; i<length; i++)
            if (a[i] != a2[i])
                return false;

        return true;
    }

    /**
     * Returns <tt>true</tt> if the two specified arrays of ints are
     * <i>equal</i> to one another.  Two arrays are considered equal if both
     * arrays contain the same number of elements, and all corresponding pairs
     * of elements in the two arrays are equal.  In other words, two arrays
     * are equal if they contain the same elements in the same order.  Also,
     * two array references are considered equal if both are <tt>null</tt>.<p>
     *
     * @param a one array to be tested for equality
     * @param a2 the other array to be tested for equality
     * @return <tt>true</tt> if the two arrays are equal
     */
    public static boolean equals(int[] a, int[] a2) {
        if (a==a2)
            return true;
        if (a==null || a2==null)
            return false;

        int length = a.length;
        if (a2.length != length)
            return false;

        for (int i=0; i<length; i++)
            if (a[i] != a2[i])
                return false;

        return true;
    }

    /**
     * Returns <tt>true</tt> if the two specified arrays of shorts are
     * <i>equal</i> to one another.  Two arrays are considered equal if both
     * arrays contain the same number of elements, and all corresponding pairs
     * of elements in the two arrays are equal.  In other words, two arrays
     * are equal if they contain the same elements in the same order.  Also,
     * two array references are considered equal if both are <tt>null</tt>.<p>
     *
     * @param a one array to be tested for equality
     * @param a2 the other array to be tested for equality
     * @return <tt>true</tt> if the two arrays are equal
     */
    public static boolean equals(short[] a, short a2[]) {
        if (a==a2)
            return true;
        if (a==null || a2==null)
            return false;

        int length = a.length;
        if (a2.length != length)
            return false;

        for (int i=0; i<length; i++)
            if (a[i] != a2[i])
                return false;

        return true;
    }

    /**
     * Returns <tt>true</tt> if the two specified arrays of chars are
     * <i>equal</i> to one another.  Two arrays are considered equal if both
     * arrays contain the same number of elements, and all corresponding pairs
     * of elements in the two arrays are equal.  In other words, two arrays
     * are equal if they contain the same elements in the same order.  Also,
     * two array references are considered equal if both are <tt>null</tt>.<p>
     *
     * @param a one array to be tested for equality
     * @param a2 the other array to be tested for equality
     * @return <tt>true</tt> if the two arrays are equal
     */
    public static boolean equals(char[] a, char[] a2) {
        if (a==a2)
            return true;
        if (a==null || a2==null)
            return false;

        int length = a.length;
        if (a2.length != length)
            return false;

        for (int i=0; i<length; i++)
            if (a[i] != a2[i])
                return false;

        return true;
    }

    /**
     * Returns <tt>true</tt> if the two specified arrays of bytes are
     * <i>equal</i> to one another.  Two arrays are considered equal if both
     * arrays contain the same number of elements, and all corresponding pairs
     * of elements in the two arrays are equal.  In other words, two arrays
     * are equal if they contain the same elements in the same order.  Also,
     * two array references are considered equal if both are <tt>null</tt>.<p>
     *
     * @param a one array to be tested for equality
     * @param a2 the other array to be tested for equality
     * @return <tt>true</tt> if the two arrays are equal
     */
    public static boolean equals(byte[] a, byte[] a2) {
        if (a==a2)
            return true;
        if (a==null || a2==null)
            return false;

        int length = a.length;
        if (a2.length != length)
            return false;

        for (int i=0; i<length; i++)
            if (a[i] != a2[i])
                return false;

        return true;
    }

    /**
     * Returns <tt>true</tt> if the two specified arrays of booleans are
     * <i>equal</i> to one another.  Two arrays are considered equal if both
     * arrays contain the same number of elements, and all corresponding pairs
     * of elements in the two arrays are equal.  In other words, two arrays
     * are equal if they contain the same elements in the same order.  Also,
     * two array references are considered equal if both are <tt>null</tt>.<p>
     *
     * @param a one array to be tested for equality
     * @param a2 the other array to be tested for equality
     * @return <tt>true</tt> if the two arrays are equal
     */
    public static boolean equals(boolean[] a, boolean[] a2) {
        if (a==a2)
            return true;
        if (a==null || a2==null)
            return false;

        int length = a.length;
        if (a2.length != length)
            return false;

        for (int i=0; i<length; i++)
            if (a[i] != a2[i])
                return false;

        return true;
    }

    /**
     * Returns <tt>true</tt> if the two specified arrays of doubles are
     * <i>equal</i> to one another.  Two arrays are considered equal if both
     * arrays contain the same number of elements, and all corresponding pairs
     * of elements in the two arrays are equal.  In other words, two arrays
     * are equal if they contain the same elements in the same order.  Also,
     * two array references are considered equal if both are <tt>null</tt>.<p>
     *
     * Two doubles <tt>d1</tt> and <tt>d2</tt> are considered equal if:
     * <pre>    <tt>new Double(d1).equals(new Double(d2))</tt></pre>
     * (Unlike the <tt>==</tt> operator, this method considers
     * <tt>NaN</tt> equals to itself, and 0.0d unequal to -0.0d.)
     *
     * @param a one array to be tested for equality
     * @param a2 the other array to be tested for equality
     * @return <tt>true</tt> if the two arrays are equal
     * @see Double#equals(Object)
     */
    public static boolean equals(double[] a, double[] a2) {
        if (a==a2)
            return true;
        if (a==null || a2==null)
            return false;

        int length = a.length;
        if (a2.length != length)
            return false;

        for (int i=0; i<length; i++)
            if (Double.doubleToLongBits(a[i])!=Double.doubleToLongBits(a2[i]))
                return false;

        return true;
    }

    /**
     * Returns <tt>true</tt> if the two specified arrays of floats are
     * <i>equal</i> to one another.  Two arrays are considered equal if both
     * arrays contain the same number of elements, and all corresponding pairs
     * of elements in the two arrays are equal.  In other words, two arrays
     * are equal if they contain the same elements in the same order.  Also,
     * two array references are considered equal if both are <tt>null</tt>.<p>
     *
     * Two floats <tt>f1</tt> and <tt>f2</tt> are considered equal if:
     * <pre>    <tt>new Float(f1).equals(new Float(f2))</tt></pre>
     * (Unlike the <tt>==</tt> operator, this method considers
     * <tt>NaN</tt> equals to itself, and 0.0f unequal to -0.0f.)
     *
     * @param a one array to be tested for equality
     * @param a2 the other array to be tested for equality
     * @return <tt>true</tt> if the two arrays are equal
     * @see Float#equals(Object)
     */
    public static boolean equals(float[] a, float[] a2) {
        if (a==a2)
            return true;
        if (a==null || a2==null)
            return false;

        int length = a.length;
        if (a2.length != length)
            return false;

        for (int i=0; i<length; i++)
            if (Float.floatToIntBits(a[i])!=Float.floatToIntBits(a2[i]))
                return false;

        return true;
    }


    /**
     * Returns <tt>true</tt> if the two specified arrays of Objects are
     * <i>equal</i> to one another.  The two arrays are considered equal if
     * both arrays contain the same number of elements, and all corresponding
     * pairs of elements in the two arrays are equal.  Two objects <tt>e1</tt>
     * and <tt>e2</tt> are considered <i>equal</i> if <tt>(e1==null ? e2==null
     * : e1.equals(e2))</tt>.  In other words, the two arrays are equal if
     * they contain the same elements in the same order.  Also, two array
     * references are considered equal if both are <tt>null</tt>.<p>
     *
     * @param a one array to be tested for equality
     * @param a2 the other array to be tested for equality
     * @return <tt>true</tt> if the two arrays are equal
     */
    public static boolean equals(Object[] a, Object[] a2) {
        if (a==a2)
            return true;
        if (a==null || a2==null)
            return false;

        int length = a.length;
        if (a2.length != length)
            return false;

        for (int i=0; i<length; i++) {
            Object o1 = a[i];
            Object o2 = a2[i];
            if (!(o1==null ? o2==null : o1.equals(o2)))
                return false;
        }

        return true;
    }


    // Filling

    /**
     * Assigns the specified long value to each element of the specified array
     * of longs.
     *
     * @param a the array to be filled
     * @param val the value to be stored in all elements of the array
     */
    public static void fill(long[] a, long val) {
        for (int i = 0, len = a.length; i < len; i++)
            a[i] = val;
    }

    /**
     * Assigns the specified long value to each element of the specified
     * range of the specified array of longs.  The range to be filled
     * extends from index <tt>fromIndex</tt>, inclusive, to index
     * <tt>toIndex</tt>, exclusive.  (If <tt>fromIndex==toIndex</tt>, the
     * range to be filled is empty.)
     *
     * @param a the array to be filled
     * @param fromIndex the index of the first element (inclusive) to be
     *        filled with the specified value
     * @param toIndex the index of the last element (exclusive) to be
     *        filled with the specified value
     * @param val the value to be stored in all elements of the array
     * @throws IllegalArgumentException if <tt>fromIndex &gt; toIndex</tt>
     * @throws ArrayIndexOutOfBoundsException if <tt>fromIndex &lt; 0</tt> or
     *         <tt>toIndex &gt; a.length</tt>
     */
    public static void fill(long[] a, int fromIndex, int toIndex, long val) {
        rangeCheck(a.length, fromIndex, toIndex);
        for (int i = fromIndex; i < toIndex; i++)
            a[i] = val;
    }

    /**
     * Assigns the specified int value to each element of the specified array
     * of ints.
     *
     * @param a the array to be filled
     * @param val the value to be stored in all elements of the array
     */
    public static void fill(int[] a, int val) {
        for (int i = 0, len = a.length; i < len; i++)
            a[i] = val;
    }

    /**
     * Assigns the specified int value to each element of the specified
     * range of the specified array of ints.  The range to be filled
     * extends from index <tt>fromIndex</tt>, inclusive, to index
     * <tt>toIndex</tt>, exclusive.  (If <tt>fromIndex==toIndex</tt>, the
     * range to be filled is empty.)
     *
     * @param a the array to be filled
     * @param fromIndex the index of the first element (inclusive) to be
     *        filled with the specified value
     * @param toIndex the index of the last element (exclusive) to be
     *        filled with the specified value
     * @param val the value to be stored in all elements of the array
     * @throws IllegalArgumentException if <tt>fromIndex &gt; toIndex</tt>
     * @throws ArrayIndexOutOfBoundsException if <tt>fromIndex &lt; 0</tt> or
     *         <tt>toIndex &gt; a.length</tt>
     */
    public static void fill(int[] a, int fromIndex, int toIndex, int val) {
        rangeCheck(a.length, fromIndex, toIndex);
        for (int i = fromIndex; i < toIndex; i++)
            a[i] = val;
    }

    /**
     * Assigns the specified short value to each element of the specified array
     * of shorts.
     *
     * @param a the array to be filled
     * @param val the value to be stored in all elements of the array
     */
    public static void fill(short[] a, short val) {
        for (int i = 0, len = a.length; i < len; i++)
            a[i] = val;
    }

    /**
     * Assigns the specified short value to each element of the specified
     * range of the specified array of shorts.  The range to be filled
     * extends from index <tt>fromIndex</tt>, inclusive, to index
     * <tt>toIndex</tt>, exclusive.  (If <tt>fromIndex==toIndex</tt>, the
     * range to be filled is empty.)
     *
     * @param a the array to be filled
     * @param fromIndex the index of the first element (inclusive) to be
     *        filled with the specified value
     * @param toIndex the index of the last element (exclusive) to be
     *        filled with the specified value
     * @param val the value to be stored in all elements of the array
     * @throws IllegalArgumentException if <tt>fromIndex &gt; toIndex</tt>
     * @throws ArrayIndexOutOfBoundsException if <tt>fromIndex &lt; 0</tt> or
     *         <tt>toIndex &gt; a.length</tt>
     */
    public static void fill(short[] a, int fromIndex, int toIndex, short val) {
        rangeCheck(a.length, fromIndex, toIndex);
        for (int i = fromIndex; i < toIndex; i++)
            a[i] = val;
    }

    /**
     * Assigns the specified char value to each element of the specified array
     * of chars.
     *
     * @param a the array to be filled
     * @param val the value to be stored in all elements of the array
     */
    public static void fill(char[] a, char val) {
        for (int i = 0, len = a.length; i < len; i++)
            a[i] = val;
    }

    /**
     * Assigns the specified char value to each element of the specified
     * range of the specified array of chars.  The range to be filled
     * extends from index <tt>fromIndex</tt>, inclusive, to index
     * <tt>toIndex</tt>, exclusive.  (If <tt>fromIndex==toIndex</tt>, the
     * range to be filled is empty.)
     *
     * @param a the array to be filled
     * @param fromIndex the index of the first element (inclusive) to be
     *        filled with the specified value
     * @param toIndex the index of the last element (exclusive) to be
     *        filled with the specified value
     * @param val the value to be stored in all elements of the array
     * @throws IllegalArgumentException if <tt>fromIndex &gt; toIndex</tt>
     * @throws ArrayIndexOutOfBoundsException if <tt>fromIndex &lt; 0</tt> or
     *         <tt>toIndex &gt; a.length</tt>
     */
    public static void fill(char[] a, int fromIndex, int toIndex, char val) {
        rangeCheck(a.length, fromIndex, toIndex);
        for (int i = fromIndex; i < toIndex; i++)
            a[i] = val;
    }

    /**
     * Assigns the specified byte value to each element of the specified array
     * of bytes.
     *
     * @param a the array to be filled
     * @param val the value to be stored in all elements of the array
     */
    public static void fill(byte[] a, byte val) {
        for (int i = 0, len = a.length; i < len; i++)
            a[i] = val;
    }

    /**
     * Assigns the specified byte value to each element of the specified
     * range of the specified array of bytes.  The range to be filled
     * extends from index <tt>fromIndex</tt>, inclusive, to index
     * <tt>toIndex</tt>, exclusive.  (If <tt>fromIndex==toIndex</tt>, the
     * range to be filled is empty.)
     *
     * @param a the array to be filled
     * @param fromIndex the index of the first element (inclusive) to be
     *        filled with the specified value
     * @param toIndex the index of the last element (exclusive) to be
     *        filled with the specified value
     * @param val the value to be stored in all elements of the array
     * @throws IllegalArgumentException if <tt>fromIndex &gt; toIndex</tt>
     * @throws ArrayIndexOutOfBoundsException if <tt>fromIndex &lt; 0</tt> or
     *         <tt>toIndex &gt; a.length</tt>
     */
    public static void fill(byte[] a, int fromIndex, int toIndex, byte val) {
        rangeCheck(a.length, fromIndex, toIndex);
        for (int i = fromIndex; i < toIndex; i++)
            a[i] = val;
    }

    /**
     * Assigns the specified boolean value to each element of the specified
     * array of booleans.
     *
     * @param a the array to be filled
     * @param val the value to be stored in all elements of the array
     */
    public static void fill(boolean[] a, boolean val) {
        for (int i = 0, len = a.length; i < len; i++)
            a[i] = val;
    }

    /**
     * Assigns the specified boolean value to each element of the specified
     * range of the specified array of booleans.  The range to be filled
     * extends from index <tt>fromIndex</tt>, inclusive, to index
     * <tt>toIndex</tt>, exclusive.  (If <tt>fromIndex==toIndex</tt>, the
     * range to be filled is empty.)
     *
     * @param a the array to be filled
     * @param fromIndex the index of the first element (inclusive) to be
     *        filled with the specified value
     * @param toIndex the index of the last element (exclusive) to be
     *        filled with the specified value
     * @param val the value to be stored in all elements of the array
     * @throws IllegalArgumentException if <tt>fromIndex &gt; toIndex</tt>
     * @throws ArrayIndexOutOfBoundsException if <tt>fromIndex &lt; 0</tt> or
     *         <tt>toIndex &gt; a.length</tt>
     */
    public static void fill(boolean[] a, int fromIndex, int toIndex,
                            boolean val) {
        rangeCheck(a.length, fromIndex, toIndex);
        for (int i = fromIndex; i < toIndex; i++)
            a[i] = val;
    }

    /**
     * Assigns the specified double value to each element of the specified
     * array of doubles.
     *
     * @param a the array to be filled
     * @param val the value to be stored in all elements of the array
     */
    public static void fill(double[] a, double val) {
        for (int i = 0, len = a.length; i < len; i++)
            a[i] = val;
    }

    /**
     * Assigns the specified double value to each element of the specified
     * range of the specified array of doubles.  The range to be filled
     * extends from index <tt>fromIndex</tt>, inclusive, to index
     * <tt>toIndex</tt>, exclusive.  (If <tt>fromIndex==toIndex</tt>, the
     * range to be filled is empty.)
     *
     * @param a the array to be filled
     * @param fromIndex the index of the first element (inclusive) to be
     *        filled with the specified value
     * @param toIndex the index of the last element (exclusive) to be
     *        filled with the specified value
     * @param val the value to be stored in all elements of the array
     * @throws IllegalArgumentException if <tt>fromIndex &gt; toIndex</tt>
     * @throws ArrayIndexOutOfBoundsException if <tt>fromIndex &lt; 0</tt> or
     *         <tt>toIndex &gt; a.length</tt>
     */
    public static void fill(double[] a, int fromIndex, int toIndex,double val){
        rangeCheck(a.length, fromIndex, toIndex);
        for (int i = fromIndex; i < toIndex; i++)
            a[i] = val;
    }

    /**
     * Assigns the specified float value to each element of the specified array
     * of floats.
     *
     * @param a the array to be filled
     * @param val the value to be stored in all elements of the array
     */
    public static void fill(float[] a, float val) {
        for (int i = 0, len = a.length; i < len; i++)
            a[i] = val;
    }

    /**
     * Assigns the specified float value to each element of the specified
     * range of the specified array of floats.  The range to be filled
     * extends from index <tt>fromIndex</tt>, inclusive, to index
     * <tt>toIndex</tt>, exclusive.  (If <tt>fromIndex==toIndex</tt>, the
     * range to be filled is empty.)
     *
     * @param a the array to be filled
     * @param fromIndex the index of the first element (inclusive) to be
     *        filled with the specified value
     * @param toIndex the index of the last element (exclusive) to be
     *        filled with the specified value
     * @param val the value to be stored in all elements of the array
     * @throws IllegalArgumentException if <tt>fromIndex &gt; toIndex</tt>
     * @throws ArrayIndexOutOfBoundsException if <tt>fromIndex &lt; 0</tt> or
     *         <tt>toIndex &gt; a.length</tt>
     */
    public static void fill(float[] a, int fromIndex, int toIndex, float val) {
        rangeCheck(a.length, fromIndex, toIndex);
        for (int i = fromIndex; i < toIndex; i++)
            a[i] = val;
    }

    /**
     * Assigns the specified Object reference to each element of the specified
     * array of Objects.
     *
     * @param a the array to be filled
     * @param val the value to be stored in all elements of the array
     * @throws ArrayStoreException if the specified value is not of a
     *         runtime type that can be stored in the specified array
     */
    public static void fill(Object[] a, Object val) {
        for (int i = 0, len = a.length; i < len; i++)
            a[i] = val;
    }

    /**
     * Assigns the specified Object reference to each element of the specified
     * range of the specified array of Objects.  The range to be filled
     * extends from index <tt>fromIndex</tt>, inclusive, to index
     * <tt>toIndex</tt>, exclusive.  (If <tt>fromIndex==toIndex</tt>, the
     * range to be filled is empty.)
     *
     * @param a the array to be filled
     * @param fromIndex the index of the first element (inclusive) to be
     *        filled with the specified value
     * @param toIndex the index of the last element (exclusive) to be
     *        filled with the specified value
     * @param val the value to be stored in all elements of the array
     * @throws IllegalArgumentException if <tt>fromIndex &gt; toIndex</tt>
     * @throws ArrayIndexOutOfBoundsException if <tt>fromIndex &lt; 0</tt> or
     *         <tt>toIndex &gt; a.length</tt>
     * @throws ArrayStoreException if the specified value is not of a
     *         runtime type that can be stored in the specified array
     */
    public static void fill(Object[] a, int fromIndex, int toIndex, Object val) {
        rangeCheck(a.length, fromIndex, toIndex);
        for (int i = fromIndex; i < toIndex; i++)
            a[i] = val;
    }


    // Cloning
    /**
     * Copies the specified array, truncating or padding with nulls (if necessary)
     * so the copy has the specified length.  For all indices that are
     * valid in both the original array and the copy, the two arrays will
     * contain identical values.  For any indices that are valid in the
     * copy but not the original, the copy will contain <tt>null</tt>.
     * Such indices will exist if and only if the specified length
     * is greater than that of the original array.
     * The resulting array is of exactly the same class as the original array.
     *
     * @param original the array to be copied
     * @param newLength the length of the copy to be returned
     * @return a copy of the original array, truncated or padded with nulls
     *     to obtain the specified length
     * @throws NegativeArraySizeException if <tt>newLength</tt> is negative
     * @throws NullPointerException if <tt>original</tt> is null
     *  1.6
     */
    public static  Object[] copyOf(Object[] original, int newLength) {
        return (Object[]) copyOf(original, newLength, original.getClass());
    }

    /**
     * Copies the specified array, truncating or padding with nulls (if necessary)
     * so the copy has the specified length.  For all indices that are
     * valid in both the original array and the copy, the two arrays will
     * contain identical values.  For any indices that are valid in the
     * copy but not the original, the copy will contain <tt>null</tt>.
     * Such indices will exist if and only if the specified length
     * is greater than that of the original array.
     * The resulting array is of the class <tt>newType</tt>.
     *
     * @param original the array to be copied
     * @param newLength the length of the copy to be returned
     * @param newType the class of the copy to be returned
     * @return a copy of the original array, truncated or padded with nulls
     *     to obtain the specified length
     * @throws NegativeArraySizeException if <tt>newLength</tt> is negative
     * @throws NullPointerException if <tt>original</tt> is null
     * @throws ArrayStoreException if an element copied from
     *     <tt>original</tt> is not of a runtime type that can be stored in
     *     an array of class <tt>newType</tt>
     *  1.6
     */
    public static Object[] copyOf(Object[] original, int newLength, Class newType) {
        Object[] copy = ((Object)newType == (Object)Object[].class)
            ? (Object[]) new Object[newLength]
            : (Object[]) Array.newInstance(newType.getComponentType(), newLength);
        System.arraycopy(original, 0, copy, 0,
                         Math.min(original.length, newLength));
        return copy;
    }

    /**
     * Copies the specified array, truncating or padding with zeros (if necessary)
     * so the copy has the specified length.  For all indices that are
     * valid in both the original array and the copy, the two arrays will
     * contain identical values.  For any indices that are valid in the
     * copy but not the original, the copy will contain <tt>(byte)0</tt>.
     * Such indices will exist if and only if the specified length
     * is greater than that of the original array.
     *
     * @param original the array to be copied
     * @param newLength the length of the copy to be returned
     * @return a copy of the original array, truncated or padded with zeros
     *     to obtain the specified length
     * @throws NegativeArraySizeException if <tt>newLength</tt> is negative
     * @throws NullPointerException if <tt>original</tt> is null
     *  1.6
     */
    public static byte[] copyOf(byte[] original, int newLength) {
        byte[] copy = new byte[newLength];
        System.arraycopy(original, 0, copy, 0,
                         Math.min(original.length, newLength));
        return copy;
    }

    /**
     * Copies the specified array, truncating or padding with zeros (if necessary)
     * so the copy has the specified length.  For all indices that are
     * valid in both the original array and the copy, the two arrays will
     * contain identical values.  For any indices that are valid in the
     * copy but not the original, the copy will contain <tt>(short)0</tt>.
     * Such indices will exist if and only if the specified length
     * is greater than that of the original array.
     *
     * @param original the array to be copied
     * @param newLength the length of the copy to be returned
     * @return a copy of the original array, truncated or padded with zeros
     *     to obtain the specified length
     * @throws NegativeArraySizeException if <tt>newLength</tt> is negative
     * @throws NullPointerException if <tt>original</tt> is null
     *  1.6
     */
    public static short[] copyOf(short[] original, int newLength) {
        short[] copy = new short[newLength];
        System.arraycopy(original, 0, copy, 0,
                         Math.min(original.length, newLength));
        return copy;
    }

    /**
     * Copies the specified array, truncating or padding with zeros (if necessary)
     * so the copy has the specified length.  For all indices that are
     * valid in both the original array and the copy, the two arrays will
     * contain identical values.  For any indices that are valid in the
     * copy but not the original, the copy will contain <tt>0</tt>.
     * Such indices will exist if and only if the specified length
     * is greater than that of the original array.
     *
     * @param original the array to be copied
     * @param newLength the length of the copy to be returned
     * @return a copy of the original array, truncated or padded with zeros
     *     to obtain the specified length
     * @throws NegativeArraySizeException if <tt>newLength</tt> is negative
     * @throws NullPointerException if <tt>original</tt> is null
     *  1.6
     */
    public static int[] copyOf(int[] original, int newLength) {
        int[] copy = new int[newLength];
        System.arraycopy(original, 0, copy, 0,
                         Math.min(original.length, newLength));
        return copy;
    }

    /**
     * Copies the specified array, truncating or padding with zeros (if necessary)
     * so the copy has the specified length.  For all indices that are
     * valid in both the original array and the copy, the two arrays will
     * contain identical values.  For any indices that are valid in the
     * copy but not the original, the copy will contain <tt>0L</tt>.
     * Such indices will exist if and only if the specified length
     * is greater than that of the original array.
     *
     * @param original the array to be copied
     * @param newLength the length of the copy to be returned
     * @return a copy of the original array, truncated or padded with zeros
     *     to obtain the specified length
     * @throws NegativeArraySizeException if <tt>newLength</tt> is negative
     * @throws NullPointerException if <tt>original</tt> is null
     *  1.6
     */
    public static long[] copyOf(long[] original, int newLength) {
        long[] copy = new long[newLength];
        System.arraycopy(original, 0, copy, 0,
                         Math.min(original.length, newLength));
        return copy;
    }

    /**
     * Copies the specified array, truncating or padding with null characters (if necessary)
     * so the copy has the specified length.  For all indices that are valid
     * in both the original array and the copy, the two arrays will contain
     * identical values.  For any indices that are valid in the copy but not
     * the original, the copy will contain <tt>'\\u000'</tt>.  Such indices
     * will exist if and only if the specified length is greater than that of
     * the original array.
     *
     * @param original the array to be copied
     * @param newLength the length of the copy to be returned
     * @return a copy of the original array, truncated or padded with null characters
     *     to obtain the specified length
     * @throws NegativeArraySizeException if <tt>newLength</tt> is negative
     * @throws NullPointerException if <tt>original</tt> is null
     *  1.6
     */
    public static char[] copyOf(char[] original, int newLength) {
        char[] copy = new char[newLength];
        System.arraycopy(original, 0, copy, 0,
                         Math.min(original.length, newLength));
        return copy;
    }

    /**
     * Copies the specified array, truncating or padding with zeros (if necessary)
     * so the copy has the specified length.  For all indices that are
     * valid in both the original array and the copy, the two arrays will
     * contain identical values.  For any indices that are valid in the
     * copy but not the original, the copy will contain <tt>0f</tt>.
     * Such indices will exist if and only if the specified length
     * is greater than that of the original array.
     *
     * @param original the array to be copied
     * @param newLength the length of the copy to be returned
     * @return a copy of the original array, truncated or padded with zeros
     *     to obtain the specified length
     * @throws NegativeArraySizeException if <tt>newLength</tt> is negative
     * @throws NullPointerException if <tt>original</tt> is null
     *  1.6
     */
    public static float[] copyOf(float[] original, int newLength) {
        float[] copy = new float[newLength];
        System.arraycopy(original, 0, copy, 0,
                         Math.min(original.length, newLength));
        return copy;
    }

    /**
     * Copies the specified array, truncating or padding with zeros (if necessary)
     * so the copy has the specified length.  For all indices that are
     * valid in both the original array and the copy, the two arrays will
     * contain identical values.  For any indices that are valid in the
     * copy but not the original, the copy will contain <tt>0d</tt>.
     * Such indices will exist if and only if the specified length
     * is greater than that of the original array.
     *
     * @param original the array to be copied
     * @param newLength the length of the copy to be returned
     * @return a copy of the original array, truncated or padded with zeros
     *     to obtain the specified length
     * @throws NegativeArraySizeException if <tt>newLength</tt> is negative
     * @throws NullPointerException if <tt>original</tt> is null
     *  1.6
     */
    public static double[] copyOf(double[] original, int newLength) {
        double[] copy = new double[newLength];
        System.arraycopy(original, 0, copy, 0,
                         Math.min(original.length, newLength));
        return copy;
    }

    /**
     * Copies the specified array, truncating or padding with <tt>false</tt> (if necessary)
     * so the copy has the specified length.  For all indices that are
     * valid in both the original array and the copy, the two arrays will
     * contain identical values.  For any indices that are valid in the
     * copy but not the original, the copy will contain <tt>false</tt>.
     * Such indices will exist if and only if the specified length
     * is greater than that of the original array.
     *
     * @param original the array to be copied
     * @param newLength the length of the copy to be returned
     * @return a copy of the original array, truncated or padded with false elements
     *     to obtain the specified length
     * @throws NegativeArraySizeException if <tt>newLength</tt> is negative
     * @throws NullPointerException if <tt>original</tt> is null
     *  1.6
     */
    public static boolean[] copyOf(boolean[] original, int newLength) {
        boolean[] copy = new boolean[newLength];
        System.arraycopy(original, 0, copy, 0,
                         Math.min(original.length, newLength));
        return copy;
    }

    /**
     * Copies the specified range of the specified array into a new array.
     * The initial index of the range (<tt>from</tt>) must lie between zero
     * and <tt>original.length</tt>, inclusive.  The value at
     * <tt>original[from]</tt> is placed into the initial element of the copy
     * (unless <tt>from == original.length</tt> or <tt>from == to</tt>).
     * Values from subsequent elements in the original array are placed into
     * subsequent elements in the copy.  The final index of the range
     * (<tt>to</tt>), which must be greater than or equal to <tt>from</tt>,
     * may be greater than <tt>original.length</tt>, in which case
     * <tt>null</tt> is placed in all elements of the copy whose index is
     * greater than or equal to <tt>original.length - from</tt>.  The length
     * of the returned array will be <tt>to - from</tt>.
     * <p>
     * The resulting array is of exactly the same class as the original array.
     *
     * @param original the array from which a range is to be copied
     * @param from the initial index of the range to be copied, inclusive
     * @param to the final index of the range to be copied, exclusive.
     *     (This index may lie outside the array.)
     * @return a new array containing the specified range from the original array,
     *     truncated or padded with nulls to obtain the required length
     * @throws ArrayIndexOutOfBoundsException if {@code from < 0}
     *     or {@code from > original.length}
     * @throws IllegalArgumentException if <tt>from &gt; to</tt>
     * @throws NullPointerException if <tt>original</tt> is null
     *  1.6
     */
    public static  Object[] copyOfRange(Object[] original, int from, int to) {
        return copyOfRange(original, from, to, original.getClass());
    }

    /**
     * Copies the specified range of the specified array into a new array.
     * The initial index of the range (<tt>from</tt>) must lie between zero
     * and <tt>original.length</tt>, inclusive.  The value at
     * <tt>original[from]</tt> is placed into the initial element of the copy
     * (unless <tt>from == original.length</tt> or <tt>from == to</tt>).
     * Values from subsequent elements in the original array are placed into
     * subsequent elements in the copy.  The final index of the range
     * (<tt>to</tt>), which must be greater than or equal to <tt>from</tt>,
     * may be greater than <tt>original.length</tt>, in which case
     * <tt>null</tt> is placed in all elements of the copy whose index is
     * greater than or equal to <tt>original.length - from</tt>.  The length
     * of the returned array will be <tt>to - from</tt>.
     * The resulting array is of the class <tt>newType</tt>.
     *
     * @param original the array from which a range is to be copied
     * @param from the initial index of the range to be copied, inclusive
     * @param to the final index of the range to be copied, exclusive.
     *     (This index may lie outside the array.)
     * @param newType the class of the copy to be returned
     * @return a new array containing the specified range from the original array,
     *     truncated or padded with nulls to obtain the required length
     * @throws ArrayIndexOutOfBoundsException if {@code from < 0}
     *     or {@code from > original.length}
     * @throws IllegalArgumentException if <tt>from &gt; to</tt>
     * @throws NullPointerException if <tt>original</tt> is null
     * @throws ArrayStoreException if an element copied from
     *     <tt>original</tt> is not of a runtime type that can be stored in
     *     an array of class <tt>newType</tt>.
     *  1.6
     */
    public static Object[] copyOfRange(Object[] original, int from, int to, Class newType) {
        int newLength = to - from;
        if (newLength < 0)
            throw new IllegalArgumentException(from + " > " + to);
        Object[] copy = ((Object)newType == (Object)Object[].class)
            ? (Object[]) new Object[newLength]
            : (Object[]) Array.newInstance(newType.getComponentType(), newLength);
        System.arraycopy(original, from, copy, 0,
                         Math.min(original.length - from, newLength));
        return copy;
    }

    /**
     * Copies the specified range of the specified array into a new array.
     * The initial index of the range (<tt>from</tt>) must lie between zero
     * and <tt>original.length</tt>, inclusive.  The value at
     * <tt>original[from]</tt> is placed into the initial element of the copy
     * (unless <tt>from == original.length</tt> or <tt>from == to</tt>).
     * Values from subsequent elements in the original array are placed into
     * subsequent elements in the copy.  The final index of the range
     * (<tt>to</tt>), which must be greater than or equal to <tt>from</tt>,
     * may be greater than <tt>original.length</tt>, in which case
     * <tt>(byte)0</tt> is placed in all elements of the copy whose index is
     * greater than or equal to <tt>original.length - from</tt>.  The length
     * of the returned array will be <tt>to - from</tt>.
     *
     * @param original the array from which a range is to be copied
     * @param from the initial index of the range to be copied, inclusive
     * @param to the final index of the range to be copied, exclusive.
     *     (This index may lie outside the array.)
     * @return a new array containing the specified range from the original array,
     *     truncated or padded with zeros to obtain the required length
     * @throws ArrayIndexOutOfBoundsException if {@code from < 0}
     *     or {@code from > original.length}
     * @throws IllegalArgumentException if <tt>from &gt; to</tt>
     * @throws NullPointerException if <tt>original</tt> is null
     *  1.6
     */
    public static byte[] copyOfRange(byte[] original, int from, int to) {
        int newLength = to - from;
        if (newLength < 0)
            throw new IllegalArgumentException(from + " > " + to);
        byte[] copy = new byte[newLength];
        System.arraycopy(original, from, copy, 0,
                         Math.min(original.length - from, newLength));
        return copy;
    }

    /**
     * Copies the specified range of the specified array into a new array.
     * The initial index of the range (<tt>from</tt>) must lie between zero
     * and <tt>original.length</tt>, inclusive.  The value at
     * <tt>original[from]</tt> is placed into the initial element of the copy
     * (unless <tt>from == original.length</tt> or <tt>from == to</tt>).
     * Values from subsequent elements in the original array are placed into
     * subsequent elements in the copy.  The final index of the range
     * (<tt>to</tt>), which must be greater than or equal to <tt>from</tt>,
     * may be greater than <tt>original.length</tt>, in which case
     * <tt>(short)0</tt> is placed in all elements of the copy whose index is
     * greater than or equal to <tt>original.length - from</tt>.  The length
     * of the returned array will be <tt>to - from</tt>.
     *
     * @param original the array from which a range is to be copied
     * @param from the initial index of the range to be copied, inclusive
     * @param to the final index of the range to be copied, exclusive.
     *     (This index may lie outside the array.)
     * @return a new array containing the specified range from the original array,
     *     truncated or padded with zeros to obtain the required length
     * @throws ArrayIndexOutOfBoundsException if {@code from < 0}
     *     or {@code from > original.length}
     * @throws IllegalArgumentException if <tt>from &gt; to</tt>
     * @throws NullPointerException if <tt>original</tt> is null
     *  1.6
     */
    public static short[] copyOfRange(short[] original, int from, int to) {
        int newLength = to - from;
        if (newLength < 0)
            throw new IllegalArgumentException(from + " > " + to);
        short[] copy = new short[newLength];
        System.arraycopy(original, from, copy, 0,
                         Math.min(original.length - from, newLength));
        return copy;
    }

    /**
     * Copies the specified range of the specified array into a new array.
     * The initial index of the range (<tt>from</tt>) must lie between zero
     * and <tt>original.length</tt>, inclusive.  The value at
     * <tt>original[from]</tt> is placed into the initial element of the copy
     * (unless <tt>from == original.length</tt> or <tt>from == to</tt>).
     * Values from subsequent elements in the original array are placed into
     * subsequent elements in the copy.  The final index of the range
     * (<tt>to</tt>), which must be greater than or equal to <tt>from</tt>,
     * may be greater than <tt>original.length</tt>, in which case
     * <tt>0</tt> is placed in all elements of the copy whose index is
     * greater than or equal to <tt>original.length - from</tt>.  The length
     * of the returned array will be <tt>to - from</tt>.
     *
     * @param original the array from which a range is to be copied
     * @param from the initial index of the range to be copied, inclusive
     * @param to the final index of the range to be copied, exclusive.
     *     (This index may lie outside the array.)
     * @return a new array containing the specified range from the original array,
     *     truncated or padded with zeros to obtain the required length
     * @throws ArrayIndexOutOfBoundsException if {@code from < 0}
     *     or {@code from > original.length}
     * @throws IllegalArgumentException if <tt>from &gt; to</tt>
     * @throws NullPointerException if <tt>original</tt> is null
     *  1.6
     */
    public static int[] copyOfRange(int[] original, int from, int to) {
        int newLength = to - from;
        if (newLength < 0)
            throw new IllegalArgumentException(from + " > " + to);
        int[] copy = new int[newLength];
        System.arraycopy(original, from, copy, 0,
                         Math.min(original.length - from, newLength));
        return copy;
    }

    /**
     * Copies the specified range of the specified array into a new array.
     * The initial index of the range (<tt>from</tt>) must lie between zero
     * and <tt>original.length</tt>, inclusive.  The value at
     * <tt>original[from]</tt> is placed into the initial element of the copy
     * (unless <tt>from == original.length</tt> or <tt>from == to</tt>).
     * Values from subsequent elements in the original array are placed into
     * subsequent elements in the copy.  The final index of the range
     * (<tt>to</tt>), which must be greater than or equal to <tt>from</tt>,
     * may be greater than <tt>original.length</tt>, in which case
     * <tt>0L</tt> is placed in all elements of the copy whose index is
     * greater than or equal to <tt>original.length - from</tt>.  The length
     * of the returned array will be <tt>to - from</tt>.
     *
     * @param original the array from which a range is to be copied
     * @param from the initial index of the range to be copied, inclusive
     * @param to the final index of the range to be copied, exclusive.
     *     (This index may lie outside the array.)
     * @return a new array containing the specified range from the original array,
     *     truncated or padded with zeros to obtain the required length
     * @throws ArrayIndexOutOfBoundsException if {@code from < 0}
     *     or {@code from > original.length}
     * @throws IllegalArgumentException if <tt>from &gt; to</tt>
     * @throws NullPointerException if <tt>original</tt> is null
     *  1.6
     */
    public static long[] copyOfRange(long[] original, int from, int to) {
        int newLength = to - from;
        if (newLength < 0)
            throw new IllegalArgumentException(from + " > " + to);
        long[] copy = new long[newLength];
        System.arraycopy(original, from, copy, 0,
                         Math.min(original.length - from, newLength));
        return copy;
    }

    /**
     * Copies the specified range of the specified array into a new array.
     * The initial index of the range (<tt>from</tt>) must lie between zero
     * and <tt>original.length</tt>, inclusive.  The value at
     * <tt>original[from]</tt> is placed into the initial element of the copy
     * (unless <tt>from == original.length</tt> or <tt>from == to</tt>).
     * Values from subsequent elements in the original array are placed into
     * subsequent elements in the copy.  The final index of the range
     * (<tt>to</tt>), which must be greater than or equal to <tt>from</tt>,
     * may be greater than <tt>original.length</tt>, in which case
     * <tt>'\\u000'</tt> is placed in all elements of the copy whose index is
     * greater than or equal to <tt>original.length - from</tt>.  The length
     * of the returned array will be <tt>to - from</tt>.
     *
     * @param original the array from which a range is to be copied
     * @param from the initial index of the range to be copied, inclusive
     * @param to the final index of the range to be copied, exclusive.
     *     (This index may lie outside the array.)
     * @return a new array containing the specified range from the original array,
     *     truncated or padded with null characters to obtain the required length
     * @throws ArrayIndexOutOfBoundsException if {@code from < 0}
     *     or {@code from > original.length}
     * @throws IllegalArgumentException if <tt>from &gt; to</tt>
     * @throws NullPointerException if <tt>original</tt> is null
     *  1.6
     */
    public static char[] copyOfRange(char[] original, int from, int to) {
        int newLength = to - from;
        if (newLength < 0)
            throw new IllegalArgumentException(from + " > " + to);
        char[] copy = new char[newLength];
        System.arraycopy(original, from, copy, 0,
                         Math.min(original.length - from, newLength));
        return copy;
    }

    /**
     * Copies the specified range of the specified array into a new array.
     * The initial index of the range (<tt>from</tt>) must lie between zero
     * and <tt>original.length</tt>, inclusive.  The value at
     * <tt>original[from]</tt> is placed into the initial element of the copy
     * (unless <tt>from == original.length</tt> or <tt>from == to</tt>).
     * Values from subsequent elements in the original array are placed into
     * subsequent elements in the copy.  The final index of the range
     * (<tt>to</tt>), which must be greater than or equal to <tt>from</tt>,
     * may be greater than <tt>original.length</tt>, in which case
     * <tt>0f</tt> is placed in all elements of the copy whose index is
     * greater than or equal to <tt>original.length - from</tt>.  The length
     * of the returned array will be <tt>to - from</tt>.
     *
     * @param original the array from which a range is to be copied
     * @param from the initial index of the range to be copied, inclusive
     * @param to the final index of the range to be copied, exclusive.
     *     (This index may lie outside the array.)
     * @return a new array containing the specified range from the original array,
     *     truncated or padded with zeros to obtain the required length
     * @throws ArrayIndexOutOfBoundsException if {@code from < 0}
     *     or {@code from > original.length}
     * @throws IllegalArgumentException if <tt>from &gt; to</tt>
     * @throws NullPointerException if <tt>original</tt> is null
     *  1.6
     */
    public static float[] copyOfRange(float[] original, int from, int to) {
        int newLength = to - from;
        if (newLength < 0)
            throw new IllegalArgumentException(from + " > " + to);
        float[] copy = new float[newLength];
        System.arraycopy(original, from, copy, 0,
                         Math.min(original.length - from, newLength));
        return copy;
    }

    /**
     * Copies the specified range of the specified array into a new array.
     * The initial index of the range (<tt>from</tt>) must lie between zero
     * and <tt>original.length</tt>, inclusive.  The value at
     * <tt>original[from]</tt> is placed into the initial element of the copy
     * (unless <tt>from == original.length</tt> or <tt>from == to</tt>).
     * Values from subsequent elements in the original array are placed into
     * subsequent elements in the copy.  The final index of the range
     * (<tt>to</tt>), which must be greater than or equal to <tt>from</tt>,
     * may be greater than <tt>original.length</tt>, in which case
     * <tt>0d</tt> is placed in all elements of the copy whose index is
     * greater than or equal to <tt>original.length - from</tt>.  The length
     * of the returned array will be <tt>to - from</tt>.
     *
     * @param original the array from which a range is to be copied
     * @param from the initial index of the range to be copied, inclusive
     * @param to the final index of the range to be copied, exclusive.
     *     (This index may lie outside the array.)
     * @return a new array containing the specified range from the original array,
     *     truncated or padded with zeros to obtain the required length
     * @throws ArrayIndexOutOfBoundsException if {@code from < 0}
     *     or {@code from > original.length}
     * @throws IllegalArgumentException if <tt>from &gt; to</tt>
     * @throws NullPointerException if <tt>original</tt> is null
     *  1.6
     */
    public static double[] copyOfRange(double[] original, int from, int to) {
        int newLength = to - from;
        if (newLength < 0)
            throw new IllegalArgumentException(from + " > " + to);
        double[] copy = new double[newLength];
        System.arraycopy(original, from, copy, 0,
                         Math.min(original.length - from, newLength));
        return copy;
    }

    /**
     * Copies the specified range of the specified array into a new array.
     * The initial index of the range (<tt>from</tt>) must lie between zero
     * and <tt>original.length</tt>, inclusive.  The value at
     * <tt>original[from]</tt> is placed into the initial element of the copy
     * (unless <tt>from == original.length</tt> or <tt>from == to</tt>).
     * Values from subsequent elements in the original array are placed into
     * subsequent elements in the copy.  The final index of the range
     * (<tt>to</tt>), which must be greater than or equal to <tt>from</tt>,
     * may be greater than <tt>original.length</tt>, in which case
     * <tt>false</tt> is placed in all elements of the copy whose index is
     * greater than or equal to <tt>original.length - from</tt>.  The length
     * of the returned array will be <tt>to - from</tt>.
     *
     * @param original the array from which a range is to be copied
     * @param from the initial index of the range to be copied, inclusive
     * @param to the final index of the range to be copied, exclusive.
     *     (This index may lie outside the array.)
     * @return a new array containing the specified range from the original array,
     *     truncated or padded with false elements to obtain the required length
     * @throws ArrayIndexOutOfBoundsException if {@code from < 0}
     *     or {@code from > original.length}
     * @throws IllegalArgumentException if <tt>from &gt; to</tt>
     * @throws NullPointerException if <tt>original</tt> is null
     *  1.6
     */
    public static boolean[] copyOfRange(boolean[] original, int from, int to) {
        int newLength = to - from;
        if (newLength < 0)
            throw new IllegalArgumentException(from + " > " + to);
        boolean[] copy = new boolean[newLength];
        System.arraycopy(original, from, copy, 0,
                         Math.min(original.length - from, newLength));
        return copy;
    }




    /**
     * Returns a string representation of the contents of the specified array.
     * The string representation consists of a list of the array's elements,
     * enclosed in square brackets (<tt>"[]"</tt>).  Adjacent elements are
     * separated by the characters <tt>", "</tt> (a comma followed by a
     * space).  Elements are converted to strings as by
     * <tt>String.valueOf(long)</tt>.  Returns <tt>"null"</tt> if <tt>a</tt>
     * is <tt>null</tt>.
     *
     * @param a the array whose string representation to return
     * @return a string representation of <tt>a</tt>
     *
     */
    public static String toString(long[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(a[i]+"");
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }

    /**
     * Returns a string representation of the contents of the specified array.
     * The string representation consists of a list of the array's elements,
     * enclosed in square brackets (<tt>"[]"</tt>).  Adjacent elements are
     * separated by the characters <tt>", "</tt> (a comma followed by a
     * space).  Elements are converted to strings as by
     * <tt>String.valueOf(int)</tt>.  Returns <tt>"null"</tt> if <tt>a</tt> is
     * <tt>null</tt>.
     *
     * @param a the array whose string representation to return
     * @return a string representation of <tt>a</tt>
     *
     */
    public static String toString(int[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(a[i]+"");
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }

    /**
     * Returns a string representation of the contents of the specified array.
     * The string representation consists of a list of the array's elements,
     * enclosed in square brackets (<tt>"[]"</tt>).  Adjacent elements are
     * separated by the characters <tt>", "</tt> (a comma followed by a
     * space).  Elements are converted to strings as by
     * <tt>String.valueOf(short)</tt>.  Returns <tt>"null"</tt> if <tt>a</tt>
     * is <tt>null</tt>.
     *
     * @param a the array whose string representation to return
     * @return a string representation of <tt>a</tt>
     *
     */
    public static String toString(short[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(a[i]+"");
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }

    /**
     * Returns a string representation of the contents of the specified array.
     * The string representation consists of a list of the array's elements,
     * enclosed in square brackets (<tt>"[]"</tt>).  Adjacent elements are
     * separated by the characters <tt>", "</tt> (a comma followed by a
     * space).  Elements are converted to strings as by
     * <tt>String.valueOf(char)</tt>.  Returns <tt>"null"</tt> if <tt>a</tt>
     * is <tt>null</tt>.
     *
     * @param a the array whose string representation to return
     * @return a string representation of <tt>a</tt>
     *
     */
    public static String toString(char[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(a[i]);
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }

    /**
     * Returns a string representation of the contents of the specified array.
     * The string representation consists of a list of the array's elements,
     * enclosed in square brackets (<tt>"[]"</tt>).  Adjacent elements
     * are separated by the characters <tt>", "</tt> (a comma followed
     * by a space).  Elements are converted to strings as by
     * <tt>String.valueOf(byte)</tt>.  Returns <tt>"null"</tt> if
     * <tt>a</tt> is <tt>null</tt>.
     *
     * @param a the array whose string representation to return
     * @return a string representation of <tt>a</tt>
     *
     */
    public static String toString(byte[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(a[i]+"");
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }

    /**
     * Returns a string representation of the contents of the specified array.
     * The string representation consists of a list of the array's elements,
     * enclosed in square brackets (<tt>"[]"</tt>).  Adjacent elements are
     * separated by the characters <tt>", "</tt> (a comma followed by a
     * space).  Elements are converted to strings as by
     * <tt>String.valueOf(boolean)</tt>.  Returns <tt>"null"</tt> if
     * <tt>a</tt> is <tt>null</tt>.
     *
     * @param a the array whose string representation to return
     * @return a string representation of <tt>a</tt>
     *
     */
    public static String toString(boolean[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(a[i]);
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }

    /**
     * Returns a string representation of the contents of the specified array.
     * The string representation consists of a list of the array's elements,
     * enclosed in square brackets (<tt>"[]"</tt>).  Adjacent elements are
     * separated by the characters <tt>", "</tt> (a comma followed by a
     * space).  Elements are converted to strings as by
     * <tt>String.valueOf(float)</tt>.  Returns <tt>"null"</tt> if <tt>a</tt>
     * is <tt>null</tt>.
     *
     * @param a the array whose string representation to return
     * @return a string representation of <tt>a</tt>
     *
     */
    public static String toString(float[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(a[i]+"");
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }

    /**
     * Returns a string representation of the contents of the specified array.
     * The string representation consists of a list of the array's elements,
     * enclosed in square brackets (<tt>"[]"</tt>).  Adjacent elements are
     * separated by the characters <tt>", "</tt> (a comma followed by a
     * space).  Elements are converted to strings as by
     * <tt>String.valueOf(double)</tt>.  Returns <tt>"null"</tt> if <tt>a</tt>
     * is <tt>null</tt>.
     *
     * @param a the array whose string representation to return
     * @return a string representation of <tt>a</tt>
     *
     */
    public static String toString(double[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(a[i]+"");
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }

    /**
     * Returns a string representation of the contents of the specified array.
     * If the array contains other arrays as elements, they are converted to
     * strings by the {@link Object#toString} method inherited from
     * <tt>Object</tt>, which describes their <i>identities</i> rather than
     * their contents.
     *
     * <p>The value returned by this method is equal to the value that would
     * be returned by <tt>Arrays.asList(a).toString()</tt>, unless <tt>a</tt>
     * is <tt>null</tt>, in which case <tt>"null"</tt> is returned.
     *
     * @param a the array whose string representation to return
     * @return a string representation of <tt>a</tt>
     * @see #deepToString(Object[])
     *
     */
    public static String toString(Object[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(String.valueOf(a[i]));
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }

    private static void deepToString(Object[] a, StringBuilder buf, Set dejaVu) {
        if (a == null) {
            buf.append("null");
            return;
        }
        int iMax = a.length - 1;
        if (iMax == -1) {
            buf.append("[]");
            return;
        }

        dejaVu.add(a);
        buf.append('[');
        for (int i = 0; ; i++) {

            Object element = a[i];
            if (element == null) {
                buf.append("null");
            } else {
                Class eClass = element.getClass();

                if (eClass.isArray()) {
                    if (eClass == byte[].class)
                        buf.append(toString((byte[]) element));
                    else if (eClass == short[].class)
                        buf.append(toString((short[]) element));
                    else if (eClass == int[].class)
                        buf.append(toString((int[]) element));
                    else if (eClass == long[].class)
                        buf.append(toString((long[]) element));
                    else if (eClass == char[].class)
                        buf.append(toString((char[]) element));
                    else if (eClass == float[].class)
                        buf.append(toString((float[]) element));
                    else if (eClass == double[].class)
                        buf.append(toString((double[]) element));
                    else if (eClass == boolean[].class)
                        buf.append(toString((boolean[]) element));
                    else { // element is an array of object references
                        if (dejaVu.contains(element))
                            buf.append("[...]");
                        else
                            deepToString((Object[])element, buf, dejaVu);
                    }
                } else {  // element is non-null and not an array
                    buf.append(element.toString());
                }
            }
            if (i == iMax)
                break;
            buf.append(", ");
        }
        buf.append(']');
        dejaVu.remove(a);
    }
}
