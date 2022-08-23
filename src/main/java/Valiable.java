public class Valiable {
    public void Run() {
        /**
         * byte
         * short
         * int
         * long
         * float
         * double
         * char
         * boolean
         * String
         */
        int myValue = 10_000; // use _ with a large amount for easy to read.
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinValue);
        System.out.println("Integer Maximum Value = " + myMaxValue);
        System.out.println("Integer My value = " + myValue);
        /*
        try to put the value larger than maximum or put less than minimum. The result will not correct. It calls OVerflow or Underflow
        */
        System.out.println("Busted MIN Value = " + (myMinValue - 1));
        System.out.println("Busted MAX Value = " + (myMaxValue + 1)); // the value will not correct. It calls Underflow

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        long myLongValue = 100L;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        System.out.println("Long My Value =" + myLongValue);

        //Excercise
        byte myByteValue = 123;
        short myShortValue = 1234;
        int myIntValue = 15;
        long myAnswer = 50000L + ((myByteValue+myShortValue+myIntValue)*10);
        System.out.println("Excercise Valiable answer = " + myAnswer );

        //Excercise
        double poundValue = 200;
        double convertKiloValue = poundValue * 0.45359237 ;
        System.out.println("Convert pounds to kilograms = " + convertKiloValue);

        /**
         * char = Store a single character, Unicode character © https://unicode-table.com/
         * boolean = true, false
         */

        char myChar = 'A';
        char myUnicodeChar = '\u00A9';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        /**
         * boolean = true, false
         */
        boolean isCustomerOverTwentyOne = true;

        /**
         * String = a sequecnce of characters
         */
        String myString = "This is a string";
        System.out.println("My string is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("My string is equal to " + myString);



    }
}
