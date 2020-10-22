package lessons;

public class NestedExample {
    public static void main(String[] args) {
        boolean isBlok = true;
        boolean isNestedBlok = true;

        if (isBlok) {
            System.out.println("We are in the upper IF");
            if (isNestedBlok) {
                System.out.println("We are in the nested IF ");
            } else {
            }
        } else {
        }
        System.out.println("WE have gone away from IF block");
    }
}
