import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution3_2 {
    public String frequencySort(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> counts.get(b) - counts.get(a));
        maxHeap.addAll(counts.keySet());

        StringBuilder result = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char current = maxHeap.poll();
            int count = counts.get(current);
            for (int i = 0; i < count; i++) {
                result.append(current);
            }
        }

        return result.toString();
    }
}
