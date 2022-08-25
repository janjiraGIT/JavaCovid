package basic;

public class OperatorsEx {
    public void Run() {
        int result = 1;
        result++; // 1+1 = 2
        System.out.println(result);

        result--; // 2-1 = 1
        System.out.println("2-1 = " + result);

        result += 2; // 1+2 = 3
        System.out.println("1+2 = " + result);

        result *= 10; // 3*10 = 30
        System.out.println("3*10 = " + result);

        result /= 3; // 30/3 = 10
        System.out.println("30/3 = " + result);

        result -= 2; // 10 -2 = 8
        System.out.println("10 - 2 = " + result);

        result = result % 2 ; // 8 % 2 = 0

        System.out.println("8 % 2 = " + result );

    }
}
