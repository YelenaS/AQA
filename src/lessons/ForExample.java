package lessons;

public class ForExample {
    public static void main(String[] args) {

      /*  for (int i = 0; i < 10; i++) {
            System.out.println("This is " + i + "  iteration");
        }*/

        /*for (int i = 0, j=10; i < 5 && j>6; i++, j--) {
            System.out.println("This is " + i + "  iteration");
            System.out.println("This is " + j + "  iteration");
        }*/

        int[] array = {1, 2, 3, 4, 5};
       /* for (int i = 0; i < array.length; i++) {
            System.out.println("This is " + array[i] + " iteration");
        }*/ //это выражение можно упростить

        for (int value : array) {
            System.out.println("This is " + value + "  iteration " + "for/each example");
        }
    }
}