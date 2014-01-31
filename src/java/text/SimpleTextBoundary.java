/*
 * @(#)SimpleTextBoundary.java	1.11 97/01/27
 *
 * (C) Copyright Taligent, Inc. 1996 - All Rights Reserved
 * (C) Copyright IBM Corp. 1996 - All Rights Reserved
 *
 * Portions copyright (c) 1996 Sun Microsystems, Inc. All Rights Reserved.
 *
 *   The original version of this source code and documentation is copyrighted
 * and owned by Taligent, Inc., a wholly-owned subsidiary of IBM. These
 * materials are provided under terms of a License Agreement between Taligent
 * and Sun. This technology is protected by multiple US and International
 * patents. This notice and attribution to Taligent may not be removed.
 *   Taligent is a registered trademark of Taligent, Inc.
 *
 * Permission to use, copy, modify, and distribute this software
 * and its documentation for NON-COMMERCIAL purposes and without
 * fee is hereby granted provided that this copyright notice
 * appears in all copies. Please refer to the file "copyright.html"
 * for further important copyright and licensing information.
 *
 * SUN MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF
 * THE SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED
 * TO THE IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE, OR NON-INFRINGEMENT. SUN SHALL NOT BE LIABLE FOR
 * ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
 *
 */

package java.text;


/**
 * SimpleTextBoundary is an implementation of the BreakIterator
 * protocol.  SimpleTextBoundary uses a state machine to compute breaks.
 * There are currently several subclasses of SimpleTextBoundary that
 * compute breaks for sentences, words, lines, and characters.  They are
 * accessable through static functions of SimpleTextBoundary.
 * @see BreakIterator
 */

final class SimpleTextBoundary extends BreakIterator
{

  private int pos;
  private CharacterIterator text;
  private TextBoundaryData data;

  /**
   * Create a SimpleTextBoundary using the specified tables. Currently,
   * the table format is private.
   * @param data data used for boundary determination
   */
  protected SimpleTextBoundary(TextBoundaryData data)
  {
    this.data = data;
    text = new StringCharacterIterator("");
    pos = text.getBeginIndex();
  }

  /**
   * Compares the equality of two SimpleTextBoundary objects.
   * @param obj the SimpleTextBoundary object to be compared with.
   * @return true if the given obj is the same as this
   * SimpleTextBoundary object; false otherwise.
   */
  public boolean equals(Object obj)
  {
    if (this == obj)
      return true;
    if (!(obj instanceof SimpleTextBoundary))
      return false;

    SimpleTextBoundary that = (SimpleTextBoundary) obj;

    // The data classes are final and sharable. Only the
    // class type needs to be compared.
    if (this.data.getClass() != that.data.getClass())
      return false;
    if (this.hashCode() != that.hashCode())
      return false;
    if (pos != that.pos)
      return false;
    if (!text.equals(that.text))
      return false;
    return true;
  }

  /**
   * Compute a hashcode for this enumeration
   * @return A hash code
   */
  public int hashCode()
  {
    return getClass().hashCode() ^ text.hashCode();
  }

  /**
   * Overrides Cloneable
   */
  public Object clone()
  {
    try {
      SimpleTextBoundary other = (SimpleTextBoundary) super.clone();
      other.text = (CharacterIterator) text.clone();
      // The data classes are final and sharable.
      // They don't need to be cloned.
      return other;
    } catch (InternalError e) {
      throw new InternalError();
    }
  }

  /**
   * Get the text being scanned by the enumeration
   * @return the text being scanned by the enumeration
   */
  public CharacterIterator getText()
  {
    return text;
  }

  /**
   * Set a new text string for enumeration.  The position of the
   * enumerator is reset to first().
   * @param newText new text to scan.
   */
  public void setText(String newText)
  {
    text = new StringCharacterIterator(newText);
    pos = text.getBeginIndex();
  }

  /**
   * Set a new text to scan.  The position is reset to first().
   * @param newText new text to scan.
   */
  public void setText(CharacterIterator newText)
  {
    text = newText;
    pos = text.getBeginIndex();
  }

  /**
   * Return the first boundary. The iterator's current position is set
   * to the first boundary.
   */
  public int first()
  {
    pos = text.getBeginIndex();
    return pos;
  }

  /**
   * Return the last boundary. The iterator's current position is set
   * to the last boundary.
   */
  public int last()
  {
    pos = text.getEndIndex();
    return pos;
  }

  /**
   * Return the nth boundary from the current boundary
   * @param index which boundary to return.  A value of 0
   * does nothing.
   * @return the nth boundary from the current position.
   */
  public int next(int increment)
  {
    int result = current();
    if (increment < 0) {
      for (int i = increment; (i < 0) && (result != DONE); ++i) {
        result = previous();
      }
    }
    else {
      for(int i = increment; (i > 0) && (result != DONE); --i) {
        result = next();
      }
    }
    return result;
  }

  /**
   * Return the boundary preceding the last boundary
   */
  public int previous()
  {
    if (pos > text.getBeginIndex()) {
      int startBoundary = pos;
      pos = previousSafePosition(pos-1);
      int prev = pos;
      int next = next();
      while (next < startBoundary && next != DONE) {
        prev = next;
        next = next();
      }
      pos = prev;
      return pos;
    }
    else {
      return DONE;
    }
  }

  /**
   * Return the next text boundary
   * @return the character offset of the text boundary or DONE if all
   * boundaries have been returned.
   */
  public int next()
  {
    int result = pos;
    if (pos < text.getEndIndex()) {
      pos = nextPosition(pos);
      result = pos;
    }
    else {
      result = DONE;
    }
    return result;
  }

  /**
   * Return the first boundary after the specified offset
   * @param offset the offset to start
   * @return int the first boundary after offset
   */
  public int following(int offset)
  {
    if (offset < text.getBeginIndex() || offset >= text.getEndIndex())
      throw new IllegalArgumentException(
          "nextBoundaryAt offset out of bounds");
    pos = previousSafePosition(offset);
    int result;
    do {
      result = next();
    } while (result <= offset && result != DONE);
    return result;
  }

  /**
   * Return the boundary last returned by previous or next
   * @return int the boundary last returned by previous or next
   */
  public int current()
  {
    return pos;
  }

  //.................................................
  //utility functions.  These functions don't change the current position.
  private int previousSafePosition(int offset)
  {
    int result = text.getBeginIndex();
    int state = data.backward().initialState();

    for (char c = text.setIndex(offset);
         c != CharacterIterator.DONE && !data.backward().isEndState(state);
         c = text.previous()) {

      state = data.backward().get(state, mappedChar(c));
      if (data.backward().isMarkState(state)) {
        result = text.getIndex();
      }
    }
    return result;
  }

  private int nextPosition(int offset)
  {
    int getEndIndex = text.getEndIndex();
    int state = data.forward().initialState();

    for (char c = text.setIndex(offset);
         c != CharacterIterator.DONE && !data.forward().isEndState(state);
         c = text.next()) {

      state = data.forward().get(state, mappedChar(c));
      if (data.forward().isMarkState(state)) {
        getEndIndex = text.getIndex();
      }
    }
    if (data.forward().isEndState(state)) {
      return getEndIndex;
    }
    else if (text.current() != CharacterIterator.DONE) {
      return getEndIndex;
    }
    else {
      return text.getEndIndex();
    }
  }

  protected int mappedChar(char c)
  {
    return data.map().mappedChar(c);
  }

}