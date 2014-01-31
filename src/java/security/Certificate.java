/*
 * @(#)Certificate.java	1.14 97/01/29
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

package java.security;

import java.io.*;
import java.util.Date;

/**
 * <p>This is an interface of abstract methods for managing an
 * identity certificate. An identity certificate is a guarantee by a
 * principal that a public key is that of another principal.  (A
 * principal represents an entity such as an individual user or a
 * group.)
 *
 * <p>In particular, this interface is intended to be a common
 * abstraction for constructs that have different formats but
 * important common uses.  For example, different types of
 * certificates, such as X.509 certificates and PGP certificates,
 * share general certificate functionality (the need to encode and
 * decode certificates) and some types of information, such as a
 * public key, the principal whose key it is, and the guarantor
 * guaranteeing that the public key is that of the specified
 * principal. So an implementation of X.509 certificates and an
 * implementation of PGP certificates can both utilize the Certificate
 * interface, even though their formats and additional types and
 * amounts of information stored are different.
 *
 * <p><b>Important</b>: This interface is useful for cataloging and
 * grouping objects sharing certain common uses. It does not have any
 * semantics of its own. In particular, a Certificate object does not
 * make any statement as to the <i>validity</i> of the binding. It is
 * the duty of the application implementing this interface to verify
 * the certificate and satisfy itself of its validity.
 *
 * @version 	1.14 01/29/97
 * @author Benjamin Renaud
 */
public interface Certificate {

  /**
   * Returns the guarantor of the certificate, that is, the principal
   * guaranteeing that the public key associated with this certificate
   * is that of the principal associated with this certificate. For X.509
   * certificates, the guarantor will typically be a Certificate Authority
   *  (such as the United States Postal Service or Verisign, Inc.).
   *
   * @return the guarantor which guaranteed the principal-key
   * binding.
   */
  public abstract Principal getGuarantor();

  /**
   * Returns the principal of the principal-key pair being guaranteed by
   * the guarantor.
   *
   * @return the principal to which this certificate is bound.
   */
  public abstract Principal getPrincipal();

  /**
   * Returns the key of the principal-key pair being guaranteed by
   * the guarantor.
   *
   * @return the public key that this certificate certifies belongs
   * to a particular principal.
   */
  public abstract PublicKey getPublicKey();

  /**
   * Encodes the certificate to an output stream in a format that can
   * be decoded by the <code>decode</code> method.
   *
   * @param stream the output stream to which to encode the
   * certificate.
   *
   * @exception KeyException if the certificate is not
   * properly initialized, or data is missing, etc.
   *
   * @exception IOException if a stream exception occurs while
   * trying to output the encoded certificate to the output stream.
   *
   * @see #decode
   * @see #getFormat
   */
  public abstract void encode(OutputStream stream)
      throws KeyException, IOException;

  /**
   * Decodes a certificate from an input stream. The format should be
   * that returned by <code>getFormat</code> and produced by
   * <code>encode</code>.
   *
   * @param stream the input stream from which to fetch the data
   * being decoded.
   *
   * @exception KeyException if the certificate is not properly initialized,
   * or data is missing, etc.
   *
   * @exception IOException if an exception occurs while trying to input
   * the encoded certificate from the input stream.
   *
   * @see #encode
   * @see #getFormat
   */
  public abstract void decode(InputStream stream)
      throws KeyException, IOException;


  /**
   * Returns the name of the coding format. This is used as a hint to find
   * an appropriate parser. It could be "X.509", "PGP", etc. This is
   * the format produced and understood by the <code>encode</code>
   * and <code>decode</code> methods.
   *
   * @return the name of the coding format.
   */
  public abstract String getFormat();

  /**
   * Returns a string that represents the contents of the certificate.
   *
   * @param detailed whether or not to give detailed information
   * about the certificate.
   */
  public String toString(boolean detailed);
}

