package com.tts;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();
        String name = askName();
        boolean proceed = weProceed();
        if (proceed) {
            int carNum = question1();
            int luckyNum = question2();
            int jerseyNum = question3();
            int modelNum = question4();
            int actorNum = question5();
            int randomNum = question6();
            numGen(carNum, luckyNum, jerseyNum, modelNum, actorNum, randomNum);
        }
    }

    public static String askName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name:  ");     // type a word and hit enter
        String someString = scanner.next();
        System.out.printf("Hello %s\n", someString);
        return someString;
    }

    public static boolean weProceed() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like to continue?(yes, anything else to quit):  ");
        String letContinue = scanner.next();
        if (letContinue.equalsIgnoreCase("yes") || letContinue.equalsIgnoreCase("y")) {
            //string.toLowerCase.equals("Y") or string.equalsIgnoreCase()
            System.out.print("cool lets continue\n");
            return true;
        }
        else {
            System.out.print("you've chosen to quit, exiting now, please return later to complete the survey");
            return false;
        }
    }

    public static int question1() {
        Scanner scanner = new Scanner(System.in);
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("2/6 What is their lucky number?\n");
        String lucky = scanner.next(); // error string index out of range
        int luckyNum = (int)lucky.charAt(0);
        if (lucky.charAt(1) >= 1) {
            luckyNum += 10;
            luckyNum += lucky.charAt(1);
        }
        return luckyNum;
    }
    public static int question3(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("3/6 Do they have a favorite quarterback?  If so what is their jersey number?\n");
        String jersey = scanner.next();
        int jerseyNum = jersey.charAt(0);
        jerseyNum += 10;
        if (jersey.charAt(1) >= 1) {
            jerseyNum += jersey.charAt(1);
        }
        return jerseyNum;
    }
    public static int question4(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("4/6 What is two-digit model year of their car?\n");
        String year = scanner.next();
        int modelNum = 0;
        return modelNum;
    }
    public static int question5(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("5/6 What is the first name of the their favorite actor or actress?\n");
        String actor = scanner.next();
        int actorNum = 0;
        return actorNum;
    }
    public static int question6(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("6/6 Enter a random number between 1 and 50.\n");
        String randomly = scanner.next();
        int randomNum = 0;
        return randomNum;
    }
    public static void numGen(int carNum, int luckyNum, int jerseyNum, int modelNum, int actorNum, int randomNum){
        System.out.printf("your lucky numbers are: %d %d %d %d %d %6\n", carNum, luckyNum, jerseyNum, modelNum, actorNum, randomNum);
    }
}

// input.nextLine();