package steam;

import basic.Excercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class DifferenceValueArrayMinMaxStream implements Excercise {
    /**
     * Write a Java program to get the difference between the largest and smallest values in an array of integers. The length of the array must be 1 and above.
     */
    @Override
    public void RunIt() {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100);
            //Arrays.asList(randomNumber);
            numbers.add(randomNumber);
            System.out.println(numbers.get(i));
        }
        Integer min = numbers.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Smallest value :" + min);

        Integer max = numbers.stream().max(Comparator.comparing(Integer::intValue)).get();
        System.out.println("Largest value :" + max);

        Integer diff = max - min;
        System.out.printf("The difference between %d and %d is " + max + min + diff);

    }
}
