package Challenges.hackerrank.easy;

import java.util.ArrayList;
import java.util.List;

public class TheBirthdayBar {

/*
Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.

Lily decides to share a contiguous segment of the bar selected such that:

. The length of the segment matches Ron's birth month, and,
. The sum of the integers on the squares is equal to his birthday.

Determine how many ways she can divide the chocolate.

Example
s=[2,2,1,3,2]
d=4

m=2

Lily wants to find segments summing to Ron's birthday. d. = 4 with a length equalling his birth month, m = 2. In
this case, there are two segments meeting her criteria: [2, 2] and [1,3].

Function Description

Complete the birthday function in the editor below.

birthday has the following parameter(s):
. int s[n]: the numbers on each of the squares of chocolate

. int d: Ron's birthday

. int m: Ron's birth month

Returns

. int: the number of ways the bar can be divided
*/

    public static int birthday(List<Integer> s, int d, int m) {
        int amountOfSegments = 0;
        for (int i = 0; i < s.size(); i++) {
            int temp = 0;
            for (int j = 0; j < m; j++) {
                try {
                    temp += s.get(i + j);
                } catch (Exception e) {
                    break;
                }
                if (j == m - 1) {
                    if (temp == d) {
                        amountOfSegments++;
                    }
                }
            }
        }
        return amountOfSegments;
    }

    public static void main(String[] args) {
        System.out.println(birthday(List.of(4), 4, 1));
    }
}
