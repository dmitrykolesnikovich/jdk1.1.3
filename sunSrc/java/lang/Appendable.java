package java.lang;

import java.io.IOException;

public interface Appendable {


    Appendable append(String csq) throws IOException;

    /**
     * Appends a subsequence of the specified character sequence to this
     * <tt>Appendable</tt>.
     *
     * <p> An invocation of this method of the form <tt>out.append(csq, start,
     * end)</tt> when <tt>csq</tt> is not <tt>null</tt>, behaves in
     * exactly the same way as the invocation
     *
     * <pre>
     *     out.append(csq.subSequence(start, end)) </pre>
     *
     * @param  csq
     *         The character sequence from which a subsequence will be
     *         appended.  If <tt>csq</tt> is <tt>null</tt>, then characters
     *         will be appended as if <tt>csq</tt> contained the four
     *         characters <tt>"null"</tt>.
     *
     * @param  start
     *         The index of the first character in the subsequence
     *
     * @param  end
     *         The index of the character following the last character in the
     *         subsequence
     *
     * @return  A reference to this <tt>Appendable</tt>
     *
     * @throws  IndexOutOfBoundsException
     *          If <tt>start</tt> or <tt>end</tt> are negative, <tt>start</tt>
     *          is greater than <tt>end</tt>, or <tt>end</tt> is greater than
     *          <tt>csq.length()</tt>
     *
     * @throws  java.io.IOException
     *          If an I/O error occurs
     */
    Appendable append(String csq, int start, int end) throws IOException;

    /**
     * Appends the specified character to this <tt>Appendable</tt>.
     *
     * @param  c
     *         The character to append
     *
     * @return  A reference to this <tt>Appendable</tt>
     *
     * @throws  java.io.IOException
     *          If an I/O error occurs
     */
    Appendable append(char c) throws IOException;
}
