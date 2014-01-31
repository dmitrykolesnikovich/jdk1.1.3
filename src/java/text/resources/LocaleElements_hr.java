/*
 * @(#)LocaleElements_hr.java	1.5 97/03/03
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

public class LocaleElements_hr extends LocaleData {

  public LocaleElements_hr() {
    super.init(table);
  }

  static String table []={
		/* locale id based on iso codes */     "hr_HR",
		/* Windows id */                       "041a",
		/* iso-3 abbrev lang name */           "hro",
		/* iso-3 abbrev country name */        "HRO",
		/* language names */                   "en_Croatian",
		/* country names */                    "en_Croatia",
		/* january */                          "Sije\u010danj",
		/* february */                         "Velja\u010da",
		/* march */                            "O\u017eujak",
		/* april */                            "Travanj",
		/* may */                              "Svibanj",
		/* june */                             "Lipanj",
		/* july */                             "Srpanj",
		/* august */                           "Kolovoz",
		/* september */                        "Rujan",
		/* october */                          "Listopad",
		/* november */                         "Studeni",
		/* december */                         "Prosinac",
		/* month 13 if applicable */           "",
		/* abb january */                      "Sij",
		/* abb february */                     "Vel",
		/* abb march */                        "O\u017eu",
		/* abb april */                        "Tra",
		/* abb may */                          "Svi",
		/* abb june */                         "Lip",
		/* abb july */                         "Srp",
		/* abb august */                       "Kol",
		/* abb september */                    "Ruj",
		/* abb october */                      "Lis",
		/* abb november */                     "Stu",
		/* abb december */                     "Pro",
		/* abb month 13 if applicable */       "",
		/* sunday */                           "Nedjelja",
		/* monday */                           "Ponedeljak",
		/* tuesday */                          "Utorak",
		/* wednesday */                        "Srijeda",
		/* thursday */                         "\u010cetvrtak",
		/* friday */                           "Petak",
		/* saturday */                         "Subota",
		/* abb sunday */                       "Ned",
		/* abb monday */                       "Pon",
		/* abb tuesday */                      "Uto",
		/* abb wednesday */                    "Sri",
		/* abb thursday */                     "\u010cet",
		/* abb friday */                       "Pet",
		/* abb saturday */                     "Sub",
		/* am marker; default is AM */         "AM",
		/* pm marker; default is PM */         "PM",
		/* era strings */                      "BC;AD",
		/* decimal pattern */                  "#,##0.###;-#,##0.###",
		/* currency pattern */                 "Din #,##0.##;-Din #,##0.##",
		/* percent pattern */                  "#,##0%",
		/* decimal separator */                ",",
		/* group (thousands) separator */      ".",
		/* list separator */                   "",
		/* percent sign */                     "%",
		/* native 0 digit */                   "0",
		/* pattern digit */                    "#",
		/* minus sign */                       "-",
		/* exponential */                      "E",
		/* local currency symbol */            "Din",
		/* intl currency symbol */             "HRD",
		/* monetary decimal separator */       ",",
		/* Full time pattern */                "H:mm:ss z",
		/* Long time pattern */                "H:mm:ss z",
		/* Default time pattern */             "H:mm:ss",
		/* Short time pattern */               "H:mm",
		/* Full date pattern */                "EEEE, yyyy, MMMM d",
		/* Long date pattern */                "yyyy, MMMM d",
		/* Default date pattern */             "yyyy.M.d",
		/* Short date pattern */               "yy.M.d",
		/* Date-Time pattern*/                 "{1} {0}",
		/* first day of week */                "1",
		/* min days in first week */           "1",
		/* for HR_HR, default sorting except for the following: */

		/* add dz "ligature" between d and d<stroke>. */
		/* add d<stroke> between d and e. */
		/* add lj "ligature" between l and l<stroke>. */
		/* add l<stroke> between l and m. */
		/* add nj "ligature" between n and o. */
		/* add z<abovedot> after z.       */
      "& D < dz, Dz, dZ, DZ < \u0111, \u0110"      /* dz + d<stk> */
          +"& L < lj, Lj, lJ, LJ < \u0142, \u0141"     /* lj + l<stk> */
          +"& N < nj, Nj, nJ, NJ"                      /* nj ligature */
          +"& Z < \u017c, \u017b"                      /* z<abovedot> */
  };
}