package Practicing;

import java.util.Collections;

public class StaircaseDetail {

    public static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            String spaces = String.join("", Collections.nCopies(n - i, " "));
            String hashes = String.join("", Collections.nCopies(i, "#"));
            System.out.println(spaces + hashes);
        }
    }

    public static void main(String[] args) {
        staircase(6);
    }
}
