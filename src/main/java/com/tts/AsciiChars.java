package com.tts;


public class AsciiChars {

        public static void printNumbers()
        {       System.out.println(" \n Valid number inputs:" );
                for(int i=48;i<=57;i++) {
                        System.out.print((char)i);
                }

        }



        public static void printLowerCase()
        {
                System.out.println(" \n Valid lowercase inputs:");
                for(int i=97;i<=122;i++){
                        System.out.print((char)i);
                }
        }



        public static void printUpperCase()
        {
                System.out.println("\n Valid uppercase inputs:");
                for(int i=65;i<=90;i++){
                        System.out.print((char)i);
                }
        }
}

