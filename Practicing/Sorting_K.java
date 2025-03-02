package Practicing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class Sorting_K {

    public static List<Integer> sortingK(int[] values, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : values) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparing(map::get));

        for (int num : map.keySet()) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll(); // Remove o menor (menos frequente)
            }
        }

        return new ArrayList<>(pq);
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(sortingK(nums, 2));
    }
}
