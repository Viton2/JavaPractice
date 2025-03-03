package Challenges.beecrowd;

import java.util.Scanner;

public class D1020 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idadeEmDias = sc.nextInt();

        int anos = idadeEmDias / 365;
        int meses = (idadeEmDias % 365) / 30;
        int dias = (idadeEmDias % 365) % 30;

        System.out.println(anos + " ano(s)\n" + meses + " mes(es)\n" + dias + " dia(s)");
    }
}

// 1 ano(s)
//1 mes(es)
//5 dia(s)
