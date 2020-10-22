package lessons;

public class SwitchExample {
    public static void main(String[] args) {
        int case2 = 1;

        switch (case2) {
            case 1:
                System.out.println("We have performed Case1");
                break;
            case 2:
                System.out.println("We have performed Case2");
                break;
            case 3:
                System.out.println("We have performed Case3");
                break;
            default:
                System.out.println("Default Case");
        }
    }
}
