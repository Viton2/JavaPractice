package Challenges.beecrowd;

import java.util.Scanner;

public class B1037 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        if (n < 0 || n > 100) {
            System.out.println("Fora de intervalo");
        } else if (n <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (n > 25 && n <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (n > 50 && n <= 75) {
            System.out.println("Intervalo (50,75]");
        } else{
            System.out.println("Intervalo (75,100]");
        }
    }
}
