/*
 * @(#)LocaleElements_ca.java	1.4 97/02/24
 *
 * (C) Copyright Taligent, Inc. 1996, 1997 - All Rights Reserved
 * (C) Copyright IBM Corp. 1996, 1997 - All Rights Reserved
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

/**
 *
 * Table of Java supplied standard locale elements
 *
 * automatically generated by java LocaleTool LocaleElements.java
 *
 * Date Created: Wed Aug 21 15:47:57  1996
 *
 *     Locale Elements and Patterns:  last update 10/23/96
 *
 *
 */

// WARNING : the format of this file will change in the future!

package java.text.resources;

public class LocaleElements_ca extends LocaleData {

  public LocaleElements_ca() {
    super.init(table);
  }

  static String table []={
		/* locale id based on iso codes */     "ca_ES",
		/* Windows id */                       "0403",
		/* iso-3 abbrev lang name */           "cat",
		/* iso-3 abbrev country name */        "ESA",
		/* language names */                   "en_Catalan",
		/* country names */                    "en_Spain",
		/* january */                          "Gener",
		/* february */                         "Febrer",
		/* march */                            "Mar\u00e7",
		/* april */                            "Abril",
		/* may */                              "Maig",
		/* june */                             "Juny",
		/* july */                             "Juliol",
		/* august */                           "Agost",
		/* september */                        "Setembre",
		/* october */                          "Octubre",
		/* november */                         "Novembre",
		/* december */                         "Desembre",
		/* month 13 if applicable */           "",
		/* abb january */                      "Gn",
		/* abb february */                     "Fb",
		/* abb march */                        "M\u00e7",
		/* abb april */                        "Ab",
		/* abb may */                          "Mg",
		/* abb june */                         "Jn",
		/* abb july */                         "Jl",
		/* abb august */                       "Ag",
		/* abb september */                    "St",
		/* abb october */                      "Oc",
		/* abb november */                     "Nv",
		/* abb december */                     "Ds",
		/* abb month 13 if applicable */       "",
		/* sunday */                           "Diumenge",
		/* monday */                           "Dilluns",
		/* tuesday */                          "Dimarts",
		/* wednesday */                        "Dimecres",
		/* thursday */                         "Dijous",
		/* friday */                           "Divendres",
		/* saturday */                         "Dissabte",
		/* abb sunday */                       "Dg",
		/* abb monday */                       "Dl",
		/* abb tuesday */                      "Dt",
		/* abb wednesday */                    "Dc",
		/* abb thursday */                     "Dj",
		/* abb friday */                       "Dv",
		/* abb saturday */                     "Ds",
		/* am marker; default is AM */         "AM",
		/* pm marker; default is PM */         "PM",
		/* era strings */                      "BC;AD",
		/* decimal pattern */                  "#,##0.###;#,##0.###",
		/* currency pattern */                 "Pts #,##0;-Pts #,##0",
		/* percent pattern */                  "#,##0%",
		/* decimal separator */                ",",
		/* group (thousands) separator */      ".",
		/* list separator */                   "",
		/* percent sign */                     "%",
		/* native 0 digit */                   "0",
		/* pattern digit */                    "#",
		/* minus sign */                       "-",
		/* exponential */                      "E",
		/* local currency symbol */            "Pts",
		/* intl currency symbol */             "ESP",
		/* monetary decimal separator */       ",",
		/* Full time pattern */                "H:mm:ss z",
		/* Long time pattern */                "H:mm:ss z",
		/* Default time pattern */             "H:mm:ss",
		/* Short time pattern */               "H:mm",
		/* Full date pattern */                "EEEE, d, MMMM yyyy",
		/* Long date pattern */                "d, MMMM yyyy",
		/* Default date pattern */             "d/M/yyyy",
		/* Short date pattern */               "d/M/yy",
		/* Date-Time pattern */		       "{1} {0}",
		/* first day of week */                "1",
		/* min days in first week */           "1",
		/* for CA_ES, accents sorted backwards plus the following: */
      "@"                                           /* sort accents bkwd */
		/* the ch, Ch "ligatures" between c and d.                          */
		/* and the ll "ligatures" between l and m plus the l<dot>l character*/
          + "& C < ch, Ch , cH, CH"                              /*ch*/
          + "& L < ll, Ll , lL, LL < l\u00b7l, L\u00b7L"         /*ll*/
  };
}
