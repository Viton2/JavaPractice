package Practicing.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args){

        String[] strings = new String[5];

        List<String> ls = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<strings.length ;i++){
            System.out.println("Digite um valor:");
            strings[i] = sc.next();
        }

        for (String value : strings) {
            System.out.println(value);
        }

        int[][] m = new int[5][5];



    }
}
