import java.util.Scanner;

public class RepreatedString implements Excercise {
    public long getLetterCount(String string, long strLength) {
        long count = 0;
        for (int i= 0; i <strLength; i++ ) {
            if (string.charAt(i) == 'a') {
                count ++;
            }
        }
        return count;
    }

    @Override
    public void RunIt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter string with a ");
        String string = scanner.next();
        System.out.println("Please enter number ");
        long n = scanner.nextLong();
        long countA = countStringA(string, n);
        System.out.println(countA);
        scanner.close();
    }

    private long countStringA(String string, long n) {
        int strLength = string.length();
        long q = 0, r = 0;
        q = n / strLength;
        r = n % strLength;
        long partialStrlen = (r==0) ? 0 : r;
        long aCount = q * getLetterCount(string, string.length() + getLetterCount(string, partialStrlen));
        return aCount;
    }
}
