import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sorting {


    public static List<Integer> sortByFrequency(int[] nums) {
        // Passo 1: Contar a frequência de cada número
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Passo 2: Criar uma lista com os números originais
        List<Integer> sortedList = new ArrayList<>();
        for (int num : nums) {
            sortedList.add(num);
        }

        // Passo 3: Ordenar a lista com um Comparator personalizado
        sortedList.sort((a, b) -> {
            int freqA = frequencyMap.get(a);
            int freqB = frequencyMap.get(b);
            if (freqA != freqB) {
                return Integer.compare(freqA, freqB); // Ordena por frequência crescente
            }
            return Integer.compare(a, b); // Se a frequência for igual, ordena pelo valor crescente
        });

        return sortedList;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 5, 4, 3};
        System.out.println(sortByFrequency(nums)); // Esperado: [3, 6, 4, 4, 5, 5]
    }
}

