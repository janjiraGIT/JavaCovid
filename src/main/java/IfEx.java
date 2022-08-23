public class IfEx {
    public void Run() {
        boolean isCorrect = true;
        if (isCorrect == false) {
            System.out.println("This is false");
        } else {
            System.out.println("This is true");
        }
    }

    public void Run2() {
        int number1 = 50;
        int number2 = 100;
        if ((number1 >= number2) || (number1 != number2 )) {
            System.out.println("This is a lucky number");
        } else {
            System.out.println("This is unlucky number");
        }
    }
}
