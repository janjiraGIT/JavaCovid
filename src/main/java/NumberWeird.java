import java.util.Scanner;

public class NumberWeird implements Excercise {
    /**
     * Task
     *
     * Given an integer n
     *
     * if n is even and range 2-5 print "Not Weird"
     * if n is even and range 6-20 print "Weird"
     * if n is even and greater than 20 print "Not Weird"
     */
    public String findNumberWeird(int n){

        int number = n % 2 ;
        String weird = "Weird";
        String notWeird = "Not Weird";
        String word = "";
        // if n is even and range 2-5 print "Not Weird"
        if (( Integer.valueOf(number).equals(0) ) && ((n >= 2) && (n <=5 )) ) {
            System.out.println(notWeird);
            word = notWeird;
        }
        // if n is even and range 6-20 print "Weird"
        if (( Integer.valueOf(number).equals(0) ) && ((n >= 6) && (n <=20 )) ) {
            System.out.println(weird);
            word = weird;
        }
        // if n is even and greater than 20 print "Not Weird"
        if (( Integer.valueOf(number).equals(0) ) && ((n >20 )) ) {
            System.out.println(notWeird);
            word = notWeird;
        }
        //if n is odd print "Weird"
        if (!Integer.valueOf(number).equals(0)) {
            System.out.println(weird);
            word = weird;
        }
        return word;
    }

    @Override
    public void RunIt() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        findNumberWeird(n);
    }
}
