package Challenges.hackerrank.easy;

import java.util.List;

public class DivisibleSumPairs {

/*Given an array of integers and a positive integer k, determine the number of (i, j) pairs where i < j and ar[i] +
ar[j] is divisible by k.

Example
ar = [1, 2, 3,4,5,6]
k= 5

Three pairs meet the criteria: [1, 4], [2,3], and [4,6].
Function Description

Complete the divisibleSumPairs function in the editor below.

divisibleSumPairs has the following parameter(s):

. int n: the length of array ar

. int ar[n]: an array of integers

. int k: the integer divisor

Returns

- int: the number of pairs
*/

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                try {
                    if ((ar.get(i) + ar.get(j + 1)) % k == 0) {
                        result++;
                    }
                } catch (Exception e) {
                    break;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(divisibleSumPairs(6, 3, List.of(1, 3, 2, 6, 1, 2)));
    }
}

