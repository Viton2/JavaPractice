package Challenges.beecrowd;

import java.util.Scanner;

public class B1060 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        for (int i=0; i<6; i++) {
            float n = sc.nextFloat();
            if (n > 0){
                result++;
            };
        }
        System.out.println(result + " valores positivos");
    }
}
