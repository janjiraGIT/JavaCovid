package basic;

import java.util.HashSet;

public class HashSetEx {
    public void Run(){
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Monday");
        hashSet.add("Tuesday");
        hashSet.add("Wednesday");
        hashSet.add("Thursday");
        hashSet.add("Friday");
        hashSet.add("Satauday");
        hashSet.add("Sunday");
        hashSet.add("Sunday2");

        for ( String set: hashSet) {
            System.out.println(set);
        }
        int count = 0;

        for( int i = 0; i <= hashSet.size(); i++ ) {
            if (hashSet.equals("Sunday")) {
                count ++;
            }
        }
        System.out.println("We fond Sunday " + count );

    }
}
