import java.util.Scanner;

public class ScannerEx {
    public void Run() {
        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter your name, age, salary :");
        String name = input.nextLine();
        int age = input.nextInt();
        double salary = input.nextDouble();
        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("You earn " + salary);
    }
}
