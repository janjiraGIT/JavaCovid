package basic;

import java.util.HashMap;

public class CountSameWord {
    public void Run() {
        String words = "This is a big world this is not a big thing but world is not a toy";
        String[] sprit_word = words.split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < sprit_word.length ; i++) {
            if (map.containsKey(sprit_word[i])){
                int count = map.get(sprit_word[i]);
                map.put(sprit_word[i], count+1);
            } else {
                map.put(sprit_word[i], 1);
            }
        }
        System.out.println(map);
    }
}
