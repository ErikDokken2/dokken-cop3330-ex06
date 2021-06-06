package exercises.ex06;
import java.util.Calendar;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erik Dokken
 */
public class ex06 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        ex06 example06 = new ex06();

        String age = example06.inputAge();
        String retireAge = example06.inputRetire();

        int convertStrInt1 = example06.strInt1(age);
        int convertStrInt2 = example06.strInt2(retireAge);

        int yearsLeft = example06.yearsLeft(convertStrInt1, convertStrInt2);
        int currYear = example06.currYear();
        int targetYear = example06.targetYear(currYear, yearsLeft);

        String outputString = example06.outputString(yearsLeft, currYear, targetYear);
        example06.printOutput(outputString);
    }
    private int targetYear(int currYear, int yearsLeft) {
        return currYear + yearsLeft;
    }

    private void printOutput(String outputString) {
        System.out.println(outputString);
    }

    private String outputString(int yearsLeft, int currYear, int targetYear) {
        return "You have " + yearsLeft + " years left until you can retire.\nIt's " +  currYear + ", so you can retire in " + targetYear + ".";
    }

    private int currYear() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year;
    }

    private int yearsLeft(int convertStrInt1, int convertStrInt2) {
        return convertStrInt2 - convertStrInt1;
    }

    private int strInt2(String retireAge) {
        int int2 = Integer.parseInt(retireAge);
        return int2;
    }

    private int strInt1(String age) {
        int int1 = Integer.parseInt(age);
        return int1;
    }

    private String inputRetire() {
        System.out.print("At what age would you like to retire? ");
        String retireAge = in.nextLine();
        return retireAge;
    }

    private String inputAge() {
        System.out.print("What is your current age? ");
        String age = in.nextLine();
        return age;
    }
}
