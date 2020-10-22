package homework_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* DONE
 * Task:
 * Create a program that will ask the user about a solar system planet they want to visit.
 * And calculate the weight according to the user choose that they would have there.
 * The weight might be calculated using the following formula: weight = mass * surface gravity.
 * The "mass", "planet" should be asked from the user using Scanner class.
 * You MUST use only the different flavors of the "if" operator in this task.
 */
public class WeightOnSolarSystemPlan {
    public static void main(String[] args) throws FileNotFoundException {
        final double SURFACE_GRAVITY_ON_MERCURY = 0.155;
        final double SURFACE_GRAVITY_ON_VENUS = 0.8975;
        final double SURFACE_GRAVITY_ON_EARTH = 1.000;
        final double SURFACE_GRAVITY_ON_MOON = 0.1660;
        final double SURFACE_GRAVITY_ON_MARS = 0.3507;
        final double SURFACE_GRAVITY_ON_JUPITER = 2.5374;
        final double SURFACE_GRAVITY_ON_SATURN = 1.0677;
        final double SURFACE_GRAVITY_ON_URANUS = 0.8947;
        final double SURFACE_GRAVITY_ON_NEPTUNE = 1.1794;
        final double SURFACE_GRAVITY_ON_PLUTO = 0.0899;


// your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the Planet: ");
        String planet = sc.nextLine();
        System.out.println("Type your mass:  ");
        double mass = sc.nextDouble();

        if (planet.equals("MERCURY")) {
            System.out.println("Weight: " + SURFACE_GRAVITY_ON_MERCURY * mass);
        } else if (planet.equals("VENUS")) {
            System.out.println("Weight: " + SURFACE_GRAVITY_ON_VENUS * mass);
        } else if (planet.equals("EARTH")) {
            System.out.println("Weight: " + SURFACE_GRAVITY_ON_EARTH * mass);
        } else if (planet.equals("MOON")) {
            System.out.println("Weight: " + SURFACE_GRAVITY_ON_MOON * mass);
        } else if (planet.equals("MARS")) {
            System.out.println("Weight: " + SURFACE_GRAVITY_ON_MARS * mass);
        } else if (planet.equals("JUPITER")) {
            System.out.println("Weight: " + SURFACE_GRAVITY_ON_JUPITER * mass);
        } else if (planet.equals("SATURN")) {
            System.out.println("Weight: " + SURFACE_GRAVITY_ON_SATURN * mass);
        } else if (planet.equals("URANUS")) {
            System.out.println("Weight: " + SURFACE_GRAVITY_ON_URANUS * mass);
        } else if (planet.equals("NEPTUNE")) {
            System.out.println("Weight: " + SURFACE_GRAVITY_ON_NEPTUNE * mass);
        } else if (planet.equals("PLUTO")) {
            System.out.println("Weight: " + SURFACE_GRAVITY_ON_PLUTO * mass);
        } else {
            System.out.println("Incorrect value");
        }
    }
}
