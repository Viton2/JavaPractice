package Challenges.hackerrank.easy;

import java.util.ArrayList;
import java.util.List;

public class BreakingBestAndWorstRecord {

    /**/

    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> result = new ArrayList<>();
        Integer lowestScore = 0;
        Integer highestScore = 0;
        Integer highestRecord = 0;
        Integer lowestRecord = 0;
        for (int i=0; i<scores.size(); i++) {
            Integer score = scores.get(i);
            if (i==0){
                lowestScore+=score;
                highestScore+=score;
            }
            else if (score < lowestScore){
                lowestRecord++;
                lowestScore = score;
            }
            else if (score > highestScore){
                highestRecord++;
                highestScore = score;
            }
        }

        result.add(highestRecord);
        result.add(lowestRecord);

        return result;

    }

    public static void main(String[] args) {
        System.out.println(breakingRecords(List.of(10, 5, 20, 20, 4, 5, 2, 25, 1)));
    }
}
