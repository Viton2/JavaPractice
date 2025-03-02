import java.util.Arrays;
import java.util.Comparator;

public class CustomComparator {

    public static void main(String[] args) {
        Integer[] arr = {5, 3, 8, 1, 4};

        // Usando Comparator para ordenar em ordem decrescente
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a; // Subtrai b de a para ordem decrescente
            }
        });

        // Usando expressão lambda para ordenar em ordem decrescente
        Arrays.sort(arr, (a, b) -> b - a); // Ordem decrescente

        Arrays.sort(arr, Comparator.comparingInt(Math::abs)); // Ordena com base no valor absoluto

        Arrays.sort(arr, (a, b) -> {
            if (a < 0 && b >= 0) return -1;
            if (a >= 0 && b < 0) return 1;
            return a - b; // Para números negativos, segue ordem crescente
        });


        System.out.println(Arrays.toString(arr));  // [8, 5, 4, 3, 1]
    }
}
