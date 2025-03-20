package Practicing.algorithms;

import java.util.Comparator;
import java.util.List;

public class MiniMaxSum {

    public static void miniMaxSum1(List<Integer> arr) {
        long minSum = 0;
        long maxSum = 0;
        arr.sort(Comparator.naturalOrder());
        for (int i = 0; i < arr.size(); i++){
            if (i == 0){
                minSum += arr.get(i);
            }
            else if (i == arr.size()-1){
                maxSum += arr.get(i);
            }else{
                minSum += arr.get(i);
                maxSum += arr.get(i);
            }
        }

        System.out.println(minSum + " " + maxSum);

    }

    public static void miniMaxSum2(List<Integer> arr) {
        arr.sort(Comparator.naturalOrder()); // Ordena a lista

        long minSum = arr.subList(0, 4).stream().mapToLong(Integer::longValue).sum();
        long maxSum = arr.subList(1, 5).stream().mapToLong(Integer::longValue).sum();

        System.out.println(minSum + " " + maxSum);
    }
}
