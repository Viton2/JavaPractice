package Challenges.hackerrank.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {

/*
Given an array of bird sightings where every element represents a bird type id, determine the id of the most
frequently sighted type. If more than 1 type has been spotted that maximum amount, return the smallest of their ids.

Example

arr = [1, 1, 2, 2, 3]

There are two each of types 1 and 2, and one sighting of type 3. Pick the lower of the two types seen twice: type 1

Function Description

Complete the migratoryBirds function in the editor below.

migratoryBirds has the following parameter(s):

. int arr[n]: the types of birds sighted

Returns

. int: the lowest type id of the most frequently sighted birds
*/

    public static int migratoryBirds(List<Integer> arr) {
        int mostFrequentId = Integer.MAX_VALUE;
        int highestFrequency = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer integer : arr) {
            map.put(integer, map.getOrDefault(integer, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int id = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > highestFrequency || (frequency == highestFrequency && id < mostFrequentId)) {
                highestFrequency = frequency;
                mostFrequentId = id;
            }
        }
        return mostFrequentId;
    }


    public static void main(String[] args) {
        System.out.println(migratoryBirds(List.of(1 ,4 ,4, 4, 5, 3)));
    }
}
