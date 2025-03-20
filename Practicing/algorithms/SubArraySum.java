package Practicing.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArraySum {

    /*
     * Complete the 'subarraySum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static long subarraySum(List<Integer> arr) {
        // Write your code here
        long result = 0;
        List<List<Integer>> subarrays = new ArrayList<>();
        for (int i=0;i < arr.size(); i++){
            for (int j = i; j < arr.size(); j++){
                List<Integer> subarray = arr.subList(i, j+1);
                subarrays.add(subarray);
            }
        }

        for (List<Integer> subarray : subarrays){
            for (int i = 0; i < subarray.size(); i ++){
                result += subarray.get(i);
            }
        }


        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        System.out.println(subarraySum(list));
    }
}
