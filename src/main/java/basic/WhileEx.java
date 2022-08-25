package basic;

public class WhileEx {
    public void Run(int i) {
        while (i <= 50) {
            System.out.println("Count " + i);
            i++;
            if (i == 50) {
                System.out.println("Finish!!");
            }
        }
    }
}
