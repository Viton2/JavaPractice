package Challenges.beecrowd;

import java.util.Scanner;

public class B1048 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salary = sc.nextFloat();
         if (salary > 0 && salary <= 400) {
             System.out.printf("Novo salario: %.2f\n", salary*1.15);
             System.out.printf("Reajuste ganho: %.2f\n", salary*0.15);
             System.out.println("Em percentual: 15 %");
         } else if (salary > 400 && salary <= 800) {
             System.out.printf("Novo salario: %.2f\n", salary*1.12);
             System.out.printf("Reajuste ganho: %.2f\n", salary*0.12);
             System.out.println("Em percentual: 12 %");
         } else if (salary > 800 && salary <= 1200) {
             System.out.printf("Novo salario: %.2f\n", salary*1.10);
             System.out.printf("Reajuste ganho: %.2f\n", salary*0.10);
             System.out.println("Em percentual: 10 %");
         } else if (salary > 1200 && salary <= 2000) {
             System.out.printf("Novo salario: %.2f\n", salary*1.07);
             System.out.printf("Reajuste ganho: %.2f\n", salary*0.07);
             System.out.println("Em percentual: 7 %");
         } else if (salary > 2000) {
             System.out.printf("Novo salario: %.2f\n", salary*1.04);
             System.out.printf("Reajuste ganho: %.2f\n", salary*0.04);
             System.out.println("Em percentual: 4 %");
         }
    }
}
