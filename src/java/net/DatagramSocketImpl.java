/*
 * @(#)DatagramSocketImpl.java	1.10 97/01/25
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

package java.net;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InterruptedIOException;

/**
 * Abstract datagram and multicast socket implementation base class.
 * @author Pavani Diwanji
 *   JDK1.1
 */

public abstract class DatagramSocketImpl implements SocketOptions {
  protected int localPort;

  /**
   * The file descriptor object
   *    JDK1.1
   */
  protected FileDescriptor fd;


  /**
   * Creates a datagram socket
   *    JDK1.1
   */
  protected abstract void create() throws SocketException;

  /**
   * Binds a datagram socket to a local port and address.
   *    JDK1.1
   */
  protected abstract void bind(int lport, InetAddress laddr) throws SocketException;

  /**
   * Sends a datagram packet. The packet contains the data and the
   * destination address to send the packet to.
   * @param packet to be sent.
   *    JDK1.1
   */
  protected abstract void send(DatagramPacket p) throws IOException;

  /**
   * Peek at the packet to see who it is from.
   * @param return the address which the packet came from.
   *    JDK1.1
   */
  protected abstract int peek(InetAddress i) throws IOException;

  /**
   * Receive the datagram packet.
   * @param Packet Received.
   *    JDK1.1
   */
  protected abstract void receive(DatagramPacket p) throws IOException;

  /**
   * Set the TTL (time-to-live) option.
   * @param TTL to be set.
   *    JDK1.1
   */
  protected abstract void setTTL(byte ttl) throws IOException;

  /**
   * Retrieve the TTL (time-to-live) option.
   *    JDK1.1
   */
  protected abstract byte getTTL() throws IOException;

  /**
   * Join the multicast group.
   * @param multicast address to join.
   *    JDK1.1
   */
  protected abstract void join(InetAddress inetaddr) throws IOException;

  /**
   * Leave the multicast group.
   * @param multicast address to leave.
   *    JDK1.1
   */
  protected abstract void leave(InetAddress inetaddr) throws IOException;

  /**
   * Close the socket.
   *    JDK1.1
   */
  protected abstract void close();

  /**
   * Get the local port.
   *    JDK1.1
   */
  protected int getLocalPort() {
    return localPort;
  }

  /**
   * Get the datagram socket file descriptor
   *    JDK1.1
   */
  protected FileDescriptor getFileDescriptor() {
    return fd;
  }
}
