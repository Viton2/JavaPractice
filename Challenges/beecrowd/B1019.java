package Challenges.beecrowd;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Scanner;

public class B1019 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int horas = (n / 60) / 60;
        int minutos = (n / 60) % 60;
        int segundos = (n % 60);

        System.out.println(horas + ":" + minutos+ ":" + segundos);
    }
}
