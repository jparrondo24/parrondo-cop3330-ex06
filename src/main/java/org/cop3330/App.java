package org.cop3330;

import java.util.Calendar;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your current age? ");
        int age = in.nextInt();
        System.out.print("At what age would you like to retire? ");
        int retirementAge = in.nextInt();

        if (age >= retirementAge) {
            System.out.println("You can retire!");
        } else {
            int yearsLeft = retirementAge - age;
            int year = Calendar.getInstance().get(Calendar.YEAR);

            System.out.printf("You have %d year%sleft until you can retire.\n",
                              yearsLeft,
                              yearsLeft == 1 ? " " : "s "
            );
            System.out.printf("It's %d, so you can retire in %d.\n", year, year + yearsLeft);
        }
    }
}
