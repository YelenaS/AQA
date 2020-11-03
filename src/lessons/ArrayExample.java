package lessons;

public class ArrayExample {
    public static void main(String[] args) {
        int[][] a = new int[3][5]; //3 ряда 5 колонок
        a[0] = new int[5];
        a[1] = new int[3];
        a[2] = new int[5];

       // System.out.println(a[1][2]);

//the next example одномерный массив
        int[] c = {3,5,5,5,};

//the next example двумерный массив
        int[][] b = {
                new int[]{1, 2, 4}, //this is the row 0
                new int[]{2, 5, 6, 6} // this is the row 1
        };
        System.out.println(b[1][2]); //output element 2 from row 1/ This element is 6
    }
}