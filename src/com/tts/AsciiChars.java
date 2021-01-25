package com.tts;

public class AsciiChars {
    public static void main(String[] args) {
        printNumbers();
        printLowerCase();
        printUpperCase();
    }
    public static void printNumbers() {
        for (int i=(int)'0'; i<=(int)'9'; i++) {
            System.out.printf("%c is %d\n", (char)i, i);
        }
    }
    public static void printLowerCase() {
        for (int i=(int)'a'; i<=(int)'z'; i++) {
            System.out.printf("%c is %d\n", (char)i, i);
        }
    }
    public static void printUpperCase() {
        for (int i=(int)'A'; i<=(int)'Z'; i++) {
            System.out.printf("%c is %d\n", (char)i, i);
        }
    }
}
