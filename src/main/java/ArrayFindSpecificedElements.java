import java.util.*;
import java.util.stream.Collectors;

public class ArrayFindSpecificedElements implements Excercise{

    private Object ArrayList;

    /**
     * Write a Java program to check if an array of integers
     * contains two specified elements 65 and 77
     */
    @Override
    public void RunIt() {
        List<Integer> numberList = Arrays.asList(23, 40, 45, 100, 65, 77);
        //findElements(numberList,65,77);
        //System.out.println(numberList);

        List<Integer> douplicateNumbers = Arrays.asList(23, 40, 45, 100, 65, 77, 23, 50, 100, 3, 3, 23, 77);
        removeDuplicate(douplicateNumbers);
    }

    private void findElements(List<Integer> list, int i, int j) {
        List<Integer> newList = new ArrayList<Integer>();
        // Loop through all elements
        for (Integer lists: list ) {
            if (( lists.intValue() == i) || ( lists.intValue() == j)) {
                newList.add(lists.intValue());
            }
        }
        System.out.printf("Found the specific elements : " + newList);
    }

    private void removeDuplicate(List<Integer> douplicateNumbersList) {
        List<Integer> newList = douplicateNumbersList.stream().distinct().collect(Collectors.toList());
        System.out.println(newList);

    }
}
