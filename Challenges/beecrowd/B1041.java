package Challenges.beecrowd;

import java.util.Scanner;

public class B1041 {

    public static void main(String[] args) {
        Scanner scX = new Scanner(System.in);
        float x = scX.nextFloat();
        float y = scX.nextFloat();

        if (x == 0.0 && y == 0.0){
            System.out.println("Origem");
        } else if (x == 0.0) {
            System.out.println("Eixo Y");
        } else if (y == 0.0) {
            System.out.println("Eixo X");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        }
        else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        }
        else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        }
        else {
            System.out.println("Q4");
        }
    }
}
