package com.tts;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();
        survey();

    }
    public static void survey() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name:  ");     // type a word and hit enter
        String someString = scanner.next();
        System.out.printf("Hello %s\n", someString);
        System.out.print("Would you like to continue?(yes, no):  ");
        String letContinue = scanner.next();
        if (letContinue == "yes" || letContinue == "y" || letContinue == "Yes") {
            System.out.print("cool lets continue\n");
            System.out.print("1/6 Do you have a red car? (yes, no):\n");
            String car = scanner.next();
            int carNum = 0;
            if (car == "yes") {
                carNum = 10;
            }
            System.out.print("2/6 What is their lucky number?\n");
            String lucky = scanner.next();
            System.out.print("3/6 Do they have a favorite quarterback?  If so what is their jersey number?\n");
            String jersey = scanner.next();
            System.out.print("4/6 What is two-digit model year of their car?\n");
            String year = scanner.next();
            System.out.print("5/6 What is the first name of the their favorite actor or actress?\n");
            String actor = scanner.next();
            System.out.print("6/6 Enter a random number between 1 and 50.\n");
            String randomly = scanner.next();
            System.out.printf("your lucky numbers are: %d %d %d %d %d %6\n", carNum, lucky, jersey, year, actor, randomly);
        }
        else {
            System.out.print("you've chosen to quit, exiting now, please return later to complete the survey");
            return;
        }

    }
}
