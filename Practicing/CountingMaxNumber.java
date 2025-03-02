package Practicing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CountingMaxNumber {

    public static int birthdayCakeCandles(List<Integer> candles) {
        candles.sort(Comparator.reverseOrder());
        int max = candles.get(0);
        int count = 0;
        for (Integer n : candles){
            if (n > max){
                max = n;
                count = 1;
            }else if(n == max){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<>();
        candles.add(3);
        candles.add(6);
        candles.add(6);
        candles.add(3);
        candles.add(6);
        candles.add(2);
        System.out.println(birthdayCakeCandles(candles));
    }
}
