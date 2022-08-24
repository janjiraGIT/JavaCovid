import java.util.Scanner;

public class InOutPrintF implements  Excercise {
    /**
     * Task
     *
     * Given 3 lines input with String and Integer
     * Input
     * java 2000
     * react 057
     * python 20
     *
     * Output
     * ============================
     * java             2000
     * react            057
     * python           20
     * ============================
     *
     */

    @Override
    public void RunIt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===========================");

        for (int i = 0; i < 3; i++) {
            String str = sc.next();
            int number = sc.nextInt();
            /**
             * printf
             * printf(%s%d,a,b) is use printf print string value of a and integer value of b
             * printf(%s%d,a,b\n) \n is new line
             * printf(%-15s%03d,a,b\n) %-15s is 15 tab , %03d is 3 digits of integer and add 0 if input is less than 3
             */
            System.out.printf("%-15s%03d\n", str, number);
        }
        System.out.println("===========================");
    }
}
