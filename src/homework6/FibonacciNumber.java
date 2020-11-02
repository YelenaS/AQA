package homework6;

/*DONE
 * Task:
 * Create a method that calculates fibonacci number using recursion.
 * The base formula is F(n) = F(n - 1) + F(n - 2).
 *
 */
public class FibonacciNumber {

    public static void main(String[] args) {
        int number = 0;
        while (true) {
            System.out.println(fibonacci(number));
            number++;
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        }
        int f = fibonacci(n - 1) + fibonacci(n - 2);
        return f;
    }
}

