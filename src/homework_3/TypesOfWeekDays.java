package homework_3;
/* DONE
 * Task:
 * Create a program that output the type of a week day according to its number.
 * The number of the week day the user should be able to specify in the input.
 * Use Scanner class to read input stream from the keyboard.
 * Your solution MUST include the usage of the "switch" operator.
 * Try to use "case" branches in the most effective way.
 * Assume for this task that there are only 2 type: working and weekend days.
 */

import java.util.Scanner;

public class TypesOfWeekDays {
    public static void main(String[] args) {
        // your code here
        System.out.println("Type the day number: ");
        Scanner sc = new Scanner(System.in);
        int dayNumber = sc.nextInt();
        switch (dayNumber) {
            case 1, 2, 3, 4, 5 -> System.out.println("Work day");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Incorrect value");
        }
        // OR:
       /*  switch (dayNumber) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Incorrect value");
        }*/
    }
}

