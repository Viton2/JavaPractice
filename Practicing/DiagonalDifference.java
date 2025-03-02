package Practicing;

import java.util.List;

public class DiagonalDifference {

    public static int absoluteDifference(Integer a, Integer b){
        return Math.abs(a - b);
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int arraySize = arr.size();
        int firstDiagonal = 0;
        int secondDiagonal = 0;

        for (int i = 0; i < arraySize; i++) {
            firstDiagonal += arr.get(i).get(i);             // Diagonal principal (índices iguais)
            secondDiagonal += arr.get(i).get(arraySize - 1 - i); // Diagonal secundária (índices invertidos)
        }

        return absoluteDifference(firstDiagonal, secondDiagonal);
    }

    public static void main(String[] args) {

    }
}
