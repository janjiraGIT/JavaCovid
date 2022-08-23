import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListScanner {

    /**
     * Input numbers from the keyboard limit 5 times
     * 1. Find the highest number
     * 2. Find the lowest number
     * 3. Calculate the summary of numbers
     * 4. Write Unit test
     */


    public ArrayList<Integer> inputTheNumbers() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5 ; i++) {
            System.out.print("please enter number :");
            int number = input.nextInt();
            list.add(number);
        }
        return list;
    }

    public Integer findTheHighestNumber(ArrayList<Integer> numbers) {
        Integer max = Collections.max(numbers);
        System.out.println("The highest number is :" + max);
        return max;
    }

    public Integer findTheLowestNumber(ArrayList<Integer> numbers) {
        Integer min = Collections.min(numbers);
        System.out.println("The lowest number is :" + min);
        return min;
    }

    public int sumAllNumbers(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println("The summary number is :" + sum);
        return sum;
    }

}
