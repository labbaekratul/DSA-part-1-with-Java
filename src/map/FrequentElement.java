package src.map;

import java.util.HashMap;
import java.util.Map;

public class FrequentElement {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 1, 4, 1, 4, 4, 5, 5, 4, 4, 1, 1, 1, 1};
        Map<Integer, Integer> map = new HashMap<>();
        int maxFreq = -1;
        int ansKey = 0;
        for (int j : arr) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }

        System.out.println(map.entrySet());

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                ansKey = entry.getKey();
            }
        }

        System.out.printf("The key is %d and the max frequency is %d%n", ansKey, maxFreq);

    }


}
