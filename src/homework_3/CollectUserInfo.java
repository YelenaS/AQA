package homework_3;

import java.util.Scanner;

/* DONE
 * Task:
 * Collect user info like their names, age, marriage status, insurance ID, total income in a year, etc.
 * You can use as an example from the ScannerUsageExample class.
 * You must use the most appropriate type for each variable and not just Strings for everything.
 * Do be shy to check other info out in the internet.
 */
public class CollectUserInfo {
    public static void main(String[] args) {
        // your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Type you name: ");
        String name = sc.nextLine();
        System.out.println("Are you married? Select: Y/N  ");
        String status = sc.nextLine();
        System.out.println("Type your mass:  ");
        double mass = sc.nextDouble();
        System.out.println("Type your age:  ");
        int age = sc.nextInt();


        System.out.println("Name:  " + name);
        System.out.println("Mass:  " + mass);
        System.out.println("Age:  " + age);
        if (status.equals("Y")) {
            System.out.println("Status:  Married");
        } else if (status.equals("N")) {
            System.out.println("Status:  Single");
        } else {
            System.out.println("Status: Undefined");
        }
    }
}
