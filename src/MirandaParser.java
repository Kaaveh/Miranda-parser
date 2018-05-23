/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Copyright (C) 1998-2014  Gerwin Klein <lsf@jflex.de>                    *
 * All rights reserved.                                                    *
 *                                                                         *
 * License: BSD                                                            *
 *                                                                         *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */


import java.io.*;
import java.util.Scanner;


/**
 * Simple test driver for the java parser. Just runs it on some
 * input files, gives no useful output.
 */
public class MirandaParser {

  public static void main(String argv[]) {

      try {
    	  Yylex s = new Yylex(new UnicodeEscapes(new FileReader("/home/kaaveh/Projects/Java/IDEA/Miranda parser/src/print.m")));
        Parser p = new Parser(s);
        p.parse();
        
        System.out.println("No errors.");
      }
      catch (Exception e) {
        e.printStackTrace(System.out);
        System.exit(1);
      }
  }
}