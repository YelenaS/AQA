package lessons;

public class TernaryOperatorExample {
    public static void main(String[] args) {
        String ternaryResult = (5 < 9) ? "true" : "false";
        System.out.println(ternaryResult);
        //лучше преобразовать в if else т.к. это более читабельно
    }
}
