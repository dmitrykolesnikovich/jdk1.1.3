/*
 * Copyright (c) 2003, 2004, Oracle and/or its affiliates. All rights reserved.
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

package java.lang;


import java.io.IOException;

/**
 * A mutable sequence of characters.  This class provides an API compatible
 * with <code>StringBuffer</code>, but with no guarantee of synchronization.
 * This class is designed for use as a drop-in replacement for
 * <code>StringBuffer</code> in places where the string buffer was being
 * used by a single thread (as is generally the case).   Where possible,
 * it is recommended that this class be used in preference to
 * <code>StringBuffer</code> as it will be faster under most implementations.
 *
 * <p>The principal operations on a <code>StringBuilder</code> are the
 * <code>append</code> and <code>insert</code> methods, which are
 * overloaded so as to accept data of any type. Each effectively
 * converts a given datum to a string and then appends or inserts the
 * characters of that string to the string builder. The
 * <code>append</code> method always adds these characters at the end
 * of the builder; the <code>insert</code> method adds the characters at
 * a specified point.
 * <p>
 * For example, if <code>z</code> refers to a string builder object
 * whose current contents are "<code>start</code>", then
 * the method call <code>z.append("le")</code> would cause the string
 * builder to contain "<code>startle</code>", whereas
 * <code>z.insert(4, "le")</code> would alter the string builder to
 * contain "<code>starlet</code>".
 * <p>
 * In general, if sb refers to an instance of a <code>StringBuilder</code>,
 * then <code>sb.append(x)</code> has the same effect as
 * <code>sb.insert(sb.length(),&nbsp;x)</code>.
 *
 * Every string builder has a capacity. As long as the length of the
 * character sequence contained in the string builder does not exceed
 * the capacity, it is not necessary to allocate a new internal
 * buffer. If the internal buffer overflows, it is automatically made larger.
 *
 * <p>Instances of <code>StringBuilder</code> are not safe for
 * use by multiple threads. If such synchronization is required then it is
 * recommended that {@link StringBuffer} be used.
 *
 * @author      Michael McCloskey
 * @see         StringBuffer
 * @see         String
 *        1.5
 */
public final class StringBuilder
    extends AbstractStringBuilder
    implements java.io.Serializable
{

    /** use serialVersionUID for interoperability */
    static final long serialVersionUID = 4383685877147921099L;

    /**
     * Constructs a string builder with no characters in it and an
     * initial capacity of 16 characters.
     */
    public StringBuilder() {
        super(16);
    }

    /**
     * Constructs a string builder with no characters in it and an
     * initial capacity specified by the <code>capacity</code> argument.
     *
     * @param      capacity  the initial capacity.
     * @throws     NegativeArraySizeException  if the <code>capacity</code>
     *               argument is less than <code>0</code>.
     */
    public StringBuilder(int capacity) {
        super(capacity);
    }

    /**
     * Constructs a string builder initialized to the contents of the
     * specified string. The initial capacity of the string builder is
     * <code>16</code> plus the length of the string argument.
     *
     * @param   str   the initial contents of the buffer.
     * @throws    NullPointerException if <code>str</code> is <code>null</code>
     */
    public StringBuilder(String str) {
        super(str.length() + 16);
        append(str);
    }

    /**
     * @see     String#valueOf(Object)
     * @see     #append(String)
     */
    public Appendable append(Object obj) {
        return append(String.valueOf(obj));
    }

    public Appendable append(String str) {
        super.append(str);
        return this;
    }

  // Appends the specified string builder to this sequence.
    private Appendable append(StringBuilder sb) {
        if (sb == null)
            return append("null");
        int len = sb.length();
        int newcount = count + len;
        if (newcount > value.length)
            expandCapacity(newcount);
        sb.getChars(0, len, value, count);
        count = newcount;
        return this;
    }

    /**
     * Appends the specified <tt>StringBuffer</tt> to this sequence.
     * <p>
     * The characters of the <tt>StringBuffer</tt> argument are appended,
     * in order, to this sequence, increasing the
     * length of this sequence by the length of the argument.
     * If <tt>sb</tt> is <tt>null</tt>, then the four characters
     * <tt>"null"</tt> are appended to this sequence.
     * <p>
     * Let <i>n</i> be the length of this character sequence just prior to
     * execution of the <tt>append</tt> method. Then the character at index
     * <i>k</i> in the new character sequence is equal to the character at
     * index <i>k</i> in the old character sequence, if <i>k</i> is less than
     * <i>n</i>; otherwise, it is equal to the character at index <i>k-n</i>
     * in the argument <code>sb</code>.
     *
     * @param   sb   the <tt>StringBuffer</tt> to append.
     * @return  a reference to this object.
     */
    public Appendable append(StringBuffer sb) {
        super.append(sb);
        return this;
    }

    public AbstractStringBuilder append(char str[]) {
        super.append(str);
        return this;
    }

    public AbstractStringBuilder append(char str[], int offset, int len) {
        super.append(str, offset, len);
        return this;
    }

    /**
     * @see     String#valueOf(boolean)
     * @see     #append(String)
     */
    public AbstractStringBuilder append(boolean b) {
        super.append(b);
        return this;
    }

    public Appendable append(char c) {
        super.append(c);
        return this;
    }


    /**
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     */
    public AbstractStringBuilder delete(int start, int end) {
        super.delete(start, end);
        return this;
    }

    /**
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     */
    public AbstractStringBuilder deleteCharAt(int index) {
        super.deleteCharAt(index);
        return this;
    }

    /**
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     */
    public AbstractStringBuilder replace(int start, int end, String str) {
        super.replace(start, end, str);
        return this;
    }

    /**
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     */
    public AbstractStringBuilder insert(int index, char str[], int offset,
                                int len)
    {
        super.insert(index, str, offset, len);
        return this;
    }

    /**
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     * @see        String#valueOf(Object)
     * @see        #insert(int, String)
     * @see        #length()
     */
    public AbstractStringBuilder insert(int offset, Object obj) {
        return insert(offset, String.valueOf(obj));
    }

    /**
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     * @see        #length()
     */
    public AbstractStringBuilder insert(int offset, String str) {
        super.insert(offset, str);
        return this;
    }

    /**
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     */
    public AbstractStringBuilder insert(int offset, char str[]) {
        super.insert(offset, str);
        return this;
    }


    /**
     * @throws IndexOutOfBoundsException {@inheritDoc}
     */
    public AbstractStringBuilder insert(int dstOffset, String s,
                                int start, int end)
    {
        super.insert(dstOffset, s, start, end);
        return this;
    }

    /**
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     * @see        String#valueOf(boolean)
     * @see        #insert(int, String)
     * @see        #length()
     */
    public AbstractStringBuilder insert(int offset, boolean b) {
        super.insert(offset, b);
        return this;
    }

    /**
     * @throws IndexOutOfBoundsException {@inheritDoc}
     * @see        #length()
     */
    public AbstractStringBuilder insert(int offset, char c) {
        super.insert(offset, c);
        return this;
    }

    /**
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     * @see        String#valueOf(int)
     * @see        #insert(int, String)
     * @see        #length()
     */
    public AbstractStringBuilder insert(int offset, int i) {
        return insert(offset, String.valueOf(i));
    }

    /**
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     * @see        String#valueOf(long)
     * @see        #insert(int, String)
     * @see        #length()
     */
    public AbstractStringBuilder insert(int offset, long l) {
        return insert(offset, String.valueOf(l));
    }

    /**
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     * @see        String#valueOf(float)
     * @see        #insert(int, String)
     * @see        #length()
     */
    public AbstractStringBuilder insert(int offset, float f) {
        return insert(offset, String.valueOf(f));
    }

    /**
     * @throws StringIndexOutOfBoundsException {@inheritDoc}
     * @see        String#valueOf(double)
     * @see        #insert(int, String)
     * @see        #length()
     */
    public AbstractStringBuilder insert(int offset, double d) {
        return insert(offset, String.valueOf(d));
    }

    public String toString() {
        // Create a copy, don't share the array
        return new String(value, 0, count);
    }

    /**
     * Save the state of the <tt>StringBuilder</tt> instance to a stream
     * (that is, serialize it).
     *
     * @serialData the number of characters currently stored in the string
     *             builder (<tt>int</tt>), followed by the characters in the
     *             string builder (<tt>char[]</tt>).   The length of the
     *             <tt>char</tt> array may be greater than the number of
     *             characters currently stored in the string builder, in which
     *             case extra characters are ignored.
     */
    private void writeObject(java.io.ObjectOutputStream s)
        throws java.io.IOException {
        s.defaultWriteObject();
        s.writeInt(count);
        s.writeObject(value);
    }

    /**
     * readObject is called to restore the state of the StringBuffer from
     * a stream.
     */
    private void readObject(java.io.ObjectInputStream s)
        throws java.io.IOException, ClassNotFoundException {
        s.defaultReadObject();
        count = s.readInt();
        value = (char[]) s.readObject();
    }

}
