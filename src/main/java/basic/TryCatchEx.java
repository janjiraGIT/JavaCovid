package basic;

public class TryCatchEx {
    public void Run() {
        int number[] = {1,2,3,4,5,6,7};
        try {
            int nr = number[10]; // Should throws to exception since no position 10
            System.out.println(nr);
        }catch (Exception e) {
            System.err.println("Something went wrong : " + e.getMessage());
        } 
    }

    public void checkAge(int age) {
        if ( age < 18)  {
            throw new ArithmeticException("Unfortunately, Not allow to buy alcohol");
        } else {
            System.out.println("Welcome to System bologet");
        }
    }
}
