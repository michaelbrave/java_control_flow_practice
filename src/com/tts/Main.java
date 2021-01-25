package com.tts;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();
        String name = askName();
        int proceed = weProceed();
        int carNum = question1();

    }
    public static String askName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name:  ");     // type a word and hit enter
        String someString = scanner.next();
        System.out.printf("Hello %s\n", someString);
        return someString;
    }
    pulbic static int weProceed() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like to continue?(yes, no):  ");
        String letContinue = scanner.next();
        if (letContinue == "yes" || letContinue == "y" || letContinue == "Yes") {
        //string.toLowerCase.equals("Y") or string.equalsIgnoreCase()
        System.out.print("cool lets continue\n");
        }
        else {
            System.out.print("you've chosen to quit, exiting now, please return later to complete the survey");
            return 0;
        }
    }
    public static int carquestion1() {
        System.out.print("1/6 Do you have a red car? (yes, no):\n");
        String car = scanner.next();
        int carNum = 0;
        if (car.equals("yes")) {
        carNum = 10;
        }
        else {
        carNum = 7;
        }
        return carNum;
    }
    public static int question2(){
        System.out.print("2/6 What is their lucky number?\n");
        String lucky = scanner.next();
        int luckyNum = lucky.charAt(0);
        if (lucky.charAt(1) >= 1) {
        luckyNum += 10;
        luckyNum += lucky.charAt(1);
        }
    }
    public static int question3(){
        System.out.print("3/6 Do they have a favorite quarterback?  If so what is their jersey number?\n");
        String jersey = scanner.next();
        int jerseyNum = jersey.charAt(0);
        jerseyNum += 10;
        if (jersey.charAt(1) >= 1) {
        jerseyNum += jersey.charAt(1);
        }
}
public static int question4(){
        System.out.print("4/6 What is two-digit model year of their car?\n");
        String year = scanner.next();
        }
public static int question5(){
        System.out.print("5/6 What is the first name of the their favorite actor or actress?\n");
        String actor = scanner.next();
        }
public static int question6(){
        System.out.print("6/6 Enter a random number between 1 and 50.\n");
        String randomly = scanner.next();
        } public static int numGen(){System.out.printf("your lucky numbers are: %d %d %d %d %d %6\n", carNum, luckyNum, jersey, year, actor, randomly);}
}

// input.nextLine();