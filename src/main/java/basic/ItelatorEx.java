package basic;

import java.util.ArrayList;
import java.util.Iterator;

public class ItelatorEx {
    public void Run() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for ( int i = 0; i <= 20; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
        Iterator<Integer> listOfNumbers = numbers.iterator();
        while (listOfNumbers.hasNext()) {
            Integer i = listOfNumbers.next();
            if (i < 10) {
                listOfNumbers.remove();
            }
        }
        System.out.println(numbers);

    }

}
