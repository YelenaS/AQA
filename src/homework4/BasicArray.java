package homework4;

import java.util.Random;

/* DONE
 * Task:
 * Create a program that will print a table 100 x 100 size of random numbers.
 * Use a two dimensions array to store numbers and the "for loop" to output them.
 *
 * Создайте программу, которая будет печатать таблицу 100 x 100 размера произвольный чисел.
 * Используйте 2-х мерный массив чтобы хранить числа и "for loop" для их вывода.
 */
public class BasicArray {
    public static void main(String[] args) {
        // ...
        Random rand = new Random(System.currentTimeMillis());
        int[][] table = new int[100][100];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = rand.nextInt(10);//только однозначные числа. так аккуратнее таблица выглядит
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}

