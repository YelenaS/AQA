package homework6;

/*
 * Task:
 * Create overloaded methods for summarizing and printing 2 numbers of different types as many as you want.
 * These methods can be static and declared in the class with the "main" method.
 *
 * Задание:
 * Создайте перегруженные методы для суммирования и печати 2 чисел разных типов.
 * Эти методы могут быть статическими и объявляться в классе с "main" методом.
 */
public class MethodOverloading {
    public static void main(String[] args) {
        sumAndPrint(4, 5);
        sumAndPrint(6.7, 4.5);
        sumAndPrint(6.7, 4123123132123L);
        sumAndPrint(6, 4.5);

    }

    public static void sumAndPrint(int firstNumber, int secondNumber) {
        System.out.println("The sum of 2 integer values is " + (firstNumber + secondNumber));
    }

    public static void sumAndPrint(double firstNumber, double secondNumber) {
        System.out.println("The sum of 2 double values is " + (firstNumber + secondNumber));
    }

    public static void sumAndPrint(double firstNumber, long secondNumber) {
        System.out.println("The sum of double and long values is " + (firstNumber + secondNumber));
    }

    public static void sumAndPrint(short firstNumber, double secondNumber) {
        System.out.println("The sum of short and double values is " + (firstNumber + secondNumber));
    }

}
