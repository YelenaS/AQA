package homework9.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * DONE
 * Task:
 * Throw an exception of the IncorrectDataFormatException in the catch block
 * to create a new custom exceptional event.
 * <p>
 * Бросить исключение IncorrectDataFormatException в блоке catch
 * для создания новой особой исключительной ситуации.
 */
public class ThrowingCustomException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean isStudent = false;
        try {
            System.out.print("Are you a student? ");
            isStudent = scanner.nextBoolean();
        } catch (InputMismatchException ex) {
            throw new IncorrectDataFormatException("User's input data:" + isStudent.toString() + " is invalid");
        }
    }
}

class IncorrectDataFormatException extends RuntimeException {
    public IncorrectDataFormatException() {
        super();
    }

    public IncorrectDataFormatException(String additionalMessage) {
        super(additionalMessage);
    }
}
