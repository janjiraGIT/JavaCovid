public class AverageValue implements Excercise{
    /**
     * Write a Java program to calculate the average value of array elements.
     */
    @Override
    public void RunIt() {
        int number[] = {10, 15, 20, 30, 80, 100, 500, 33};
        int sum = 0;
        int average = 0;
        for (int i= 0; i < number.length ; i ++) {
            sum += number[i];
        }
        average = sum/number.length;
        System.out.printf("The average of these number is %d %n", average);
        System.out.printf("The average of these number is %s %n", "yes");
    }
}
