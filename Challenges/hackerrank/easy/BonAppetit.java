package Challenges.hackerrank.easy;

import java.util.List;

public class BonAppetit {

/*
Two friends Anna and Brian, are deciding how to split the bill at a dinner. Each will only pay for the items they

consume. Brian gets the check and calculates Anna's portion. You must determine if his calculation is correct.

For example, assume the bill has the following prices: bill = [2, 4, 6]. Anna declines to eat item k = bill[2] which
costs 6. If Brian calculates the bill correctly, Anna will pay (2+4)/2 = 3. If he includes the cost of bill[2]. he will
calculate (2+4+6)/2 = 6. In the second case, he should refund 3 to Anna.

Function Description

Complete the bonAppetit function in the editor below. It should print Bon Appétit if the bill is fairly split.
Otherwise, it should print the integer amount of money that Brian owes Anna.

bonAppetit has the following parameter(s):

. bill: an array of integers representing the cost of each item ordered

. k: an integer representing the zero-based index of the item Anna doesn't eat

. b: the amount of money that Anna contributed to the bill
*/

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int priceActual = 0;
        int priceCharged;
        for (Integer integer : bill) {
            priceActual += integer;
        }
        priceCharged = (priceActual - bill.get(k)) / 2;
        System.out.println(priceCharged == b ? "Bon Appetit" : b - priceCharged);
    }

    public static void main(String[] args) {

        bonAppetit(List.of(3, 10, 2, 9), 1, 12);

    }
}
