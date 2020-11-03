package lessons;

public class DoWhileExample {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(
                    "This is " +i + "  iteration"
            );
            i++;
        }
        while (i < 10);
    }
}
