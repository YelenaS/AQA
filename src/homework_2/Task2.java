package homework_2;
/* DONE
 * Task:
 * In the following program, explain why the value "6" is printed twice in a row.
 * Put the explanation in comments.
 */

public class Task2 {
    public static void main(String[] args) {
        int i = 10;
        i++; // значение 10 увеличили на единицу (в постфиксной форме) и получили 11
        System.out.println(i);    // "11" извлекли значение
        ++i; // снова увеличили на единицу (уже в префиксной форме, но тут это не важно) и получили 12
        System.out.println(i);    // "12" извлекли значение
        System.out.println(++i);  // "13"  тут мы сначала увеличили на единицу значение переменной(получили 13),
        // потом извлекли его
        System.out.println(i++);  // "13"  а тут мы сначала извлекли значение переменной (все те же 13),
        // а после этого увеличили на единицу (получили 14)
        System.out.println(i);    // "14"  извлекли значение
    }
}
