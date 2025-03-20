package Challenges.hackerrank.easy;

import java.util.HashMap;
import java.util.List;

public class SockMerchant {
/*
There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each
sock, determine how many pairs of socks with matching colors there are.

Example:

n=7
ar = [1,2,1,2,1,3,2]

There is one pair of color 1 and one of color 2. There are three odd socks left, one of each color. The number of pairs is 2.

Function Description:

sockMerchant has the following parameter(s):

. int n: the number of socks in the pile

. int ar[n]: the colors of each sock

Returns

. int: the number of pairs
*/

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(ar.get(i), map.getOrDefault(ar.get(i), 0) + 1);
        }
        for (Integer integer : map.keySet()) {
            Integer value = map.get(integer);
            if (value % 2 == 0) {
                result+=value/2;
            }
            else {
                result += value - 1 == 0 ? 0 : (value - 1)/2;
            }
        }
        return result;

    }


    public static void main(String[] args) {
        System.out.println(sockMerchant(9, List.of(10, 20, 20, 10, 10, 30, 50, 10, 20)));
    }
}
