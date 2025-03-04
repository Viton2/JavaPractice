package Challenges.beecrowd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B1042 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        List<Integer> test = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            int n = sc.nextInt();
            test.add(n);
        }
        List<Integer> sorted = test.stream().sorted().toList();
        System.out.println(sorted.get(0));
        System.out.println(sorted.get(1));
        System.out.println(sorted.get(2)+"\n");
        System.out.println(test.get(0));
        System.out.println(test.get(1));
        System.out.println(test.get(2));
    }
}
