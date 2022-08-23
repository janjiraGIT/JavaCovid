import java.util.HashMap;
import java.util.Random;

public class HashMapEx {
    public void Run() {
        // Random, Convert
        HashMap<Integer, Double> hashList = new HashMap<>();
        for (int i = 0; i <=10 ; i++) {
            hashList.put(i, Math.random());
            // print one by one
            System.out.println(hashList.get(i));
        }
        // print for the whole list
        System.out.println(hashList);
    }
}
