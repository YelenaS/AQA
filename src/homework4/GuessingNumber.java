package homework4;

import java.util.Random;
import java.util.Scanner;

/* DONE
 * Task:
 * Create a program that will set a random secret number, ask the user to input a guess number,
 * and keep printing the prompt message until the number is revealed.
 * Use do-while loop.
 *
 * Создайте программу, которая будет задавать произвольное секретое число, спрашивать пользователя ввести
 * число для одгадывания, продолжать печатать приглашения для ввода, пока число не будет раскрыто.
 * Используйте do-while цикл.
 */
public class GuessingNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNum = random.nextInt(11);
        System.out.println("I guessed a number to 10: " + secretNum);// чтоб самому знать
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Try to guess my number!");
        do {
            System.out.println("Type a number: ");
            num = scanner.nextInt();
        } while (secretNum != num);
        System.out.println("Well done!");
    }
}
