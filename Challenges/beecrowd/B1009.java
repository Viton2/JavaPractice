package Challenges.beecrowd;

import java.util.Scanner;

public class B1009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        float salario = sc.nextFloat();
        float vendas = sc.nextFloat();

        System.out.printf("TOTAL = R$ %.2f%n", salario + (vendas*0.15));
    }
}
