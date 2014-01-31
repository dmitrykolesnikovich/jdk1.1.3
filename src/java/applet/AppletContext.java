/*
 * @(#)AppletContext.java	1.14 96/11/23
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

package java.applet;

import java.awt.Image;
import java.awt.Graphics;
import java.awt.image.ColorModel;
import java.net.URL;
import java.util.Enumeration;

/**
 * This interface corresponds to an applet's environment: the
 * document containing the applet and the other applets in the same
 * document.
 * <p>
 * The methods in this interface can be used by an applet to obtain
 * information about its environment.
 *
 * @author 	Arthur van Hoff
 * @version     1.19, 01/30/97
 *        JDK1.0
 */
public interface AppletContext {
  /**
   * Creates an audio clip.
   *
   * @param   url   an absolute URL giving the location of the audio clip.
   * @return  the audio clip at the specified URL.
   *    JDK1.0
   */
  AudioClip getAudioClip(URL url);

  /**
   * Returns an <code>Image</code> object that can then be painted on
   * the screen. The <code>url</code> argument<code> </code>that is
   * passed as an argument must specify an absolute URL.
   * <p>
   * This method always returns immediately, whether or not the image
   * exists. When the applet attempts to draw the image on the screen,
   * the data will be loaded. The graphics primitives that draw the
   * image will incrementally paint on the screen.
   *
   * @param   url   an absolute URL giving the location of the image.
   * @return  the image at the specified URL.
   * @see     java.awt.Image
   *    JDK1.0
   */
  Image getImage(URL url);

  /**
   * Finds and returns the applet in the document represented by this
   * applet context with the given name. The name can be set in the
   * HTML tag by setting the <code>name</code> attribute.
   *
   * @param   name   an applet name.
   * @return  the applet with the given name, or <code>null</code> if
   *          not found.
   *    JDK1.0
   */
  Applet getApplet(String name);

  /**
   * Finds all the applets in the document represented by this applet
   * context.
   *
   * @return  an enumeration of all applets in the document represented by
   *          this applet context.
   *    JDK1.0
   */
  Enumeration getApplets();

  /**
   * Replaces the Web page currently being viewed with the given URL.
   * This method may be ignored by applet contexts that are not
   * browsers.
   *
   * @param   url   an absolute URL giving the location of the document.
   *    JDK1.0
   */
  void showDocument(URL url);

  /**
   * Requests that the browser or applet viewer show the Web page
   * indicated by the <code>url</code> argument. The
   * <code>target</code> argument indicates where to display the frame.
   * The target argument is interpreted as follows:
   * <p>
   * <center><table border="3">
   * <tr><td><code>"_self"</code>  <td>show in the current frame</tr>
   * <tr><td><code>"_parent"</code><td>show in the parent frame</tr>
   * <tr><td><code>"_top"</code>   <td>show in the topmost frame</tr>
   * <tr><td><code>"_blank"</code> <td>show in a new unnamed
   *                                   top-level window</tr>
   * <tr><td>name<td>show in a new top-level window named <i>name</i></tr>
   * </table> </center>
   * <p>
   * An applet viewer or browser is free to ignore <code>showDocument</code>.
   *
   * @param   url   an absolute URL giving the location of the document.
   * @param   target   a <code>String</code> indicating where to display
   *                   the page.
   *    JDK1.0
   */
  public void showDocument(URL url, String target);

  /**
   * Requests that the argument string be displayed in the
   * "status window". Many browsers and applet viewers
   * provide such a window, where the application can inform users of
   * its current state.
   *
   * @param   status   a string to display in the status window.
   *    JDK1.0
   */
  void showStatus(String status);
}
