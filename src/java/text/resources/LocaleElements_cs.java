/*
 * @(#)LocaleElements_cs.java	1.5 97/02/28
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

public class LocaleElements_cs extends LocaleData {

  public LocaleElements_cs() {
    super.init(table);
  }

  static String table []={
		/* locale id based on iso codes */        "cs_CZ",
		/* Windows id */                          "0405",
		/* iso: 3 character lang name */          "cse",
		/* iso: 3 character country name */       "CZE",
		/* language names */                      "en_Czech; cs_\u01DE\u0161tina",
		/* country names */                       "en_Czech Republic; cs_\u010Cesk\u00E1_republika",
		/* january */                             "Leden",
		/* february */                            "\u00danor",
		/* march */                               "B\u0159ezen",
		/* april */                               "Duben",
		/* may */                                 "Kv\u011bten",
		/* june */                                "\u010cerven",
		/* july */                                "\u010cervenec",
		/* august */                              "Srpen",
		/* september */                           "Z\u00e1\u0159\u00ed",
		/* october */                             "\u0158\u00edjen",
		/* november */                            "Listopad",
		/* december */                            "Prosinec",
		/* month 13 if applicable */              "",
		/* abb january */                         "I",
		/* abb february */                        "II",
		/* abb march */                           "III",
		/* abb april */                           "IV",
		/* abb may */                             "V",
		/* abb june */                            "VI",
		/* abb july */                            "VII",
		/* abb august */                          "VIII",
		/* abb september */                       "IX",
		/* abb october */                         "X",
		/* abb november */                        "XI",
		/* abb december */                        "XII",
		/* abb month 13 if applicable */          "",
		/* sunday */                              "Ned\u011ble",
		/* monday */                              "Pond\u011bl\u00ed",
		/* tuesday */                             "\u00dater\u00fd",
		/* wednesday */                           "St\u0159eda",
		/* thursday */                            "\u010Ctvrtek",
		/* friday */                              "P\u00e1tek",
		/* saturday */                            "Sobota",
		/* abb sunday */                          "Ne",
		/* abb monday */                          "Po",
		/* abb tuesday */                         "\u00dat",
		/* abb wednesday */                       "St",
		/* abb thursday */                        "\u010ct",
		/* abb friday */                          "P\u00e1",
		/* abb saturday */                        "So",
		/* am marker; default is AM */            "AM",
		/* pm marker; default is PM */            "PM",
		/* era strings */                         "p\u0159.Kr.;po Kr.",
		/* decimal pattern */                     "#,##0.###;-#,##0.###",
		/* currency pattern */                    "K\u010D #,##0.##;-#,##0.## K\u010D",
		/* percent pattern */                     "#,##0%",
		/* decimal separator */                   ",",
		/* group (thousands) separator */         ".",
		/* list separator  */                     "",
		/* percent sign */                        "%",
		/* native 0 digit */                      "0",
		/* pattern digit */                       "#",
		/* minus sign */                          "-",
		/* exponential */                         "E",
		/* local currency symbol */               "K\u010D",
		/* intl currency symbol */                "CZK",
		/* monetary decimal separator */          ",",
		/* Full time pattern */                   "H:mm:ss z",
		/* Long time pattern */                   "H:mm:ss z",
		/* Default time pattern */                "H:mm:ss",
		/* Short time pattern */                  "H:mm",
		/* Full date pattern */                   "EEEE, yyyy, MMMM d",
		/* Long date pattern */                   "yyyy, MMMM d ",
		/* Default date pattern */                "yyyy-M-d",
		/* Short date pattern */                  "yy-M-d",
		/* Date-Time pattern */		       "{1} {0}",
		/* First day of week */                   "1",
		/* Min days in first week*/               "1",
		/* for CS_CZ, default sorting except for the following: */
		/* add d<stroke> between d and e. */
		/* add ch "ligature" between h and i */
		/* add l<stroke> between l and m. */
		/* add z<abovedot> after z.       */
      "& D < \u0111, \u0110"                       /* d<stroke> */
          +"& H < ch, Ch, cH, CH"                      /* ch ligature */
          +"& L < \u0142, \u0141"                       /* l<stroke> */
          +"& Z < \u017c, \u017b"                            /* z<abovedot> */
  };
}
