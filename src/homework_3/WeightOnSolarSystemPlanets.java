package homework_3;

import java.util.Scanner;

/* DONE
 * Task:
 * Create a program that will ask the user about a solar system planet they want to visit.
 * And calculate the weight according to the user choose that they would have there.
 * The weight might be calculated using the following formula: weight = mass * surface gravity.
 * The "mass", "planet" should be asked from the user using Scanner class.
 * You MUST use only "switch" operator in this task.
 */
public class WeightOnSolarSystemPlanets {
    public static void main(String[] args) {
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

        switch (planet) {
            case "MERCURY" -> System.out.println("Weight: " + SURFACE_GRAVITY_ON_MERCURY * mass);
            case "VENUS" -> System.out.println("Weight: " + SURFACE_GRAVITY_ON_VENUS * mass);
            case "EARTH" -> System.out.println("Weight: " + SURFACE_GRAVITY_ON_EARTH * mass);
            case "MOON" -> System.out.println("Weight: " + SURFACE_GRAVITY_ON_MOON * mass);
            case "MARS" -> System.out.println("Weight: " + SURFACE_GRAVITY_ON_MARS * mass);
            case "JUPITER" -> System.out.println("Weight: " + SURFACE_GRAVITY_ON_JUPITER * mass);
            case "SATURN" -> System.out.println("Weight: " + SURFACE_GRAVITY_ON_SATURN * mass);
            case "URANUS" -> System.out.println("Weight: " + SURFACE_GRAVITY_ON_URANUS * mass);
            case "NEPTUNE" -> System.out.println("Weight: " + SURFACE_GRAVITY_ON_NEPTUNE * mass);
            case "PLUTO" -> System.out.println("Weight: " + SURFACE_GRAVITY_ON_PLUTO * mass);
            default -> System.out.println("Incorrect value");
        }
    }
}

