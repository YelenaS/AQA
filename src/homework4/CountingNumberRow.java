package homework4;


import java.util.Scanner;

/* DONE
 * Task:
 * Write a program that gets an integer from the user.
 * Then print from 0 to that number.
 * In this task use "for loop" to complete it.
 * For example:
 * Your number: 6
 * Counting number row: 0, 1, 2, 3, 4, 5, 6
 *
 * Напишите программу, которая получает целое число от пользователя.
 * Потом печатать от 0 до этого числа.
 * В этом задании используйте "for loop", чтобы выполнить его.
 */
public class CountingNumberRow {
    public static void main(String[] args) {
        // your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = scanner.nextInt();
        for (int i = 0; i < number + 1; i++)
            System.out.println(i);
    }
}
