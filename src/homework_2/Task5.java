package homework_2;

/*
 * Task (ScopeOfLocalVariables):
 * Define three or more code blocks in the "main" method that include each other.
 * Then include any numbers of the different variables using any primitive data types
 * in those code of blocks.
 * Finally, to see and understand mechanism of limited access to local variables,
 * it suggests you to output all the above declared variables via System.out.println()
 * in each code of block.
 * See an example below.
 */
public class Task5 {

    public static void main(String[] args) {
        {
            int intValue = 97;
            // declare more variables of any types here
            double dblValue1 = 3.5;
            {
                double dblValue2 = 35.58;
                {
                    // declare another variable of any type here
                    char chValue = 'e';
                    boolean blnValue = false;

                    // try to output all the earlier declared variables
                    System.out.println("Let's try to use 'intValue' variable.");
                    System.out.println("We can do it: " + intValue);
                    System.out.println("We can do it: " + chValue);
                    System.out.println("We can do it: " + blnValue);
                    System.out.println("We can do it: " + dblValue2 + "  and " + dblValue1);
                    System.out.println("Because we are in the inner block. That's why 'intValue' is accessible");
                    //...

                    {
                        // and declare two or more variable here as well
                        char charValue = 'B';
                        int intValue1 = 2;
                        int intValue2 = 27;

                        //...

                        // try to output all the earlier declared variables
                        System.out.println("intValue: " + intValue);
                        System.out.println("charValue test: " + charValue);
                        System.out.println("intValues test: " + intValue1 + "  and  " + intValue2);
                        //...
                    }
                    // try to output all the earlier declared variables
                    System.out.println("intValue: " + intValue);
                    System.out.println("chValue test: " + chValue);
                    System.out.println("blnValue test: " + blnValue);
                    System.out.println("dblValue test: " + dblValue1);
                    System.out.println("dblValue test: " + dblValue2);

                    // We cannot use it here. Why?
                    // Потому что мы вышли из внутреннего блока кода и переменные стали недоступны
                    // System.out.println("charValue: " + charValue);
                    //  System.out.println("intValue: " + intValue1);
                    // System.out.println("intValue: " + intValue2);
                    //...
                }
            }            {
                // We cannot use it here. Why? Потому что доступ к переменной intValue ограничен другим блоком кода
                // System.out.println("intValue: " + intValue);
            }
        }
    }
}