package homework9.exceptions;

/** DONE
 * Task:
 * Handle a runtime exception to finish the program correctly.
 * Use the "try-catch" block.
 * <p>
 * Задача:
 * Обработка исключения времени выполнения для правильного завершения программы.
 * Используйте блок "try-catch".
 */
public class HandlingArithmeticException {
    public static void main(String[] args) {
        final int dividend;
        final int divisor;
        final int quotient;

        try {
            dividend = 6;
            divisor = 0;
            quotient = dividend / divisor;
            System.out.println("Quotient of " + dividend + " / " + divisor + " = " + quotient);
        } catch (RuntimeException exception) {
            System.out.println("Деление на ноль");
        }
    }
}
