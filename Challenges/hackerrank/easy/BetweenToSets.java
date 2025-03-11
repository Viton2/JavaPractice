package Challenges.hackerrank.easy;

import java.util.List;

public class BetweenToSets {

/*
There will be two arrays of integers. Determine all integers that satisfy the following two conditions:

1. The elements of the first array are all factors of the integer being considered
2. The integer being considered is a factor of all elements of the second array

These numbers are referred to as being between the two arrays. Determine how many such numbers exist.

Example
a = [2,6]
b = [24, 36]

There are two numbers between the arrays: 6 and 12.
6%2 = 0. 6%6 = 0, 24%6 = 0 and 36%6 = 0 for the first value.

12%2 = 0. 12%6 = 0 and 24%12 = 0, 36%12 = 0 for the second value. Return 2.

Function Description

Complete the getTotalX function in the editor below. It should return the number of integers that are betwen the sets.

getTotalX has the following parameter(s):
. int a[n]: an array of integers

. int b[m]: an array of integers

Returns
. int: the number of integers that are between the sets
*/

    // Função para calcular o MMC de dois números
    public static int calcularMMC(int a, int b) {
        return (a * b) / calcularMDC(a, b);
    }

    // Função para calcular o MDC de dois números (usando o Algoritmo de Euclides)
    public static int calcularMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Função para encontrar quantos números estão entre os dois conjuntos
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Calcula o MMC de todos os elementos de a
        int lcmA = a.get(0);
        for (int num : a) {
            lcmA = calcularMMC(lcmA, num);
        }

        // Calcula o MDC de todos os elementos de b
        int gcdB = b.get(0);
        for (int num : b) {
            gcdB = calcularMDC(gcdB, num);
        }

        // Contar os múltiplos de lcmA que também são divisores de gcdB
        int count = 0;
        for (int i = lcmA; i <= gcdB; i += lcmA) {
            if (gcdB % i == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(getTotalX(List.of(6, 2), List.of(24, 36)));
    }
}
