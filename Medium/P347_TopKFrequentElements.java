package Medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class P347_TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> minHeap= new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            minHeap.add(entry);

            if (minHeap.size() > k) {
                minHeap.poll(); // remove least frequent
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++){
            result[i] = minHeap.poll().getKey();
        }
        return result;
    }
}
