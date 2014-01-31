/*
 * @(#)SkeletonMismatchException.java	1.2 96/11/18
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
 */

package java.rmi.server;

import java.rmi.RemoteException;

/**
 * This exception is thrown when a call is received that does not
 * match the available skeleton.  It indicates either that the
 * remote method names or signatures in this interface have changed or
 * that the stub class used to make the call and the skeleton
 * receiving the call were not generated by the same version of
 * the stub compiler (RMIC).
 */
public class SkeletonMismatchException extends RemoteException {

  /**
   * Create a new SkeletonMismatchException exception with a descriptive string.  */
  public SkeletonMismatchException(String s) {
    super(s);
  }

}
