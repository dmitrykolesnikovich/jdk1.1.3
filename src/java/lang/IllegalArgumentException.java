/*
 * @(#)IllegalArgumentException.java	1.12 97/01/20
 *
 * Copyright (c) 1995, 1996 Sun Microsystems, Inc. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Sun
 * Microsystems, Inc. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Sun.
 *
 * SUN MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE
 * SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE, OR NON-INFRINGEMENT. SUN SHALL NOT BE LIABLE FOR ANY DAMAGES
 * SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING
 * THIS SOFTWARE OR ITS DERIVATIVES.
 *
 * CopyrightVersion 1.1_beta
 *
 */

package java.lang;

/**
 * Thrown to indicate that a method has been passed an illegal or
 * inappropriate argument.
 *
 * @author  unascribed
 * @version 1.12, 01/20/97
 * @see	    java.lang.Thread#setPriority(int)
 *    JDK1.0
 */
public
class IllegalArgumentException extends RuntimeException {
  /**
   * Constructs an <code>IllegalArgumentException</code> with no
   * detail message.
   *
   *    JDK1.0
   */
  public IllegalArgumentException() {
    super();
  }

  /**
   * Constructs an <code>IllegalArgumentException</code> with the
   * specified detail message.
   *
   * @param   s   the detail message.
   *    JDK1.0
   */
  public IllegalArgumentException(String s) {
    super(s);
  }
}
