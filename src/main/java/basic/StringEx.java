package basic;

public class StringEx {
    public void Run() {
        String myString = "This is Janjira";
        String newString = myString.toUpperCase();
        if ( myString.equals(newString)) {
            System.out.println("Same");
        } if (myString.equalsIgnoreCase(newString)) {
            System.out.println("Same but uppercase");
        } else {
            System.out.println("Not same");
        }
        System.out.println(myString.concat(newString));
    }
/**
    public int indexOf(String str) {
        if (coder() == str.coder()) {
            return isLatin1() ? StringLatin1.indexOf(value, str.value)
                    : StringUTF16.indexOf(value, str.value);
        }
        if (coder() == LATIN1) {  // str.coder == UTF16
            return -1;
        }
        return StringUTF16.indexOfLatin1(value, str.value);
    }
 **/
}
