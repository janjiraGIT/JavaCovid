package basic;

import java.util.Arrays;

public class ArrayEx {
    public void Run() {
        int[] numbers = {400, 20, 2, 50, 80, 1001};
        String[] strings = {"One", "Two", "Three", "Zero", "No"};

        Arrays.sort(numbers);
        Arrays.sort(strings);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(strings));
    }
}
