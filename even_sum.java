import java.util.ArrayList;
import java.util.List;

public class even_sum {

    public static Integer evenSum(int[] values){
        int sum = 0;
        for (int i : values) {
            if (i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6};
        System.out.println(evenSum(list));
    }
}
