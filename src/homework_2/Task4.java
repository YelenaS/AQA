package homework_2;

/* DONE
 * Task (IncorrectVariableDeclaration):
 * Uncomment code and fix compiler issues. Figure out the causes of failures.
 * Hint: IDE usually provides a description of compiler issues.
 */

public class Task4 {
    public static void main(String[] args) {

        // 1.
        int i;
        i = 0;
        // 2.
        char c = 'a';
        System.out.println(c);

        // 3.
        int a = 32;

        // 4.
        float f = 2.1f;

        // 5.
        String s = "This is a string";

        // 6.
        long bigLongValue = 964238764145245237L;
        int bigInt = (int) bigLongValue;

        // 7.
        String isVariableAssignedInRightWay = "true";
    }
}