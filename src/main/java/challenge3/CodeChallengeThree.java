package main.java.challenge3;

import java.util.Arrays;

public class CodeChallengeThree {

    public static int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins); // Ordenar las monedas

        int currentChange = 0;

        for (int coin : coins) {
            if (coin > currentChange + 1) {
                return currentChange + 1;
            }
            currentChange += coin;
        }

        return currentChange + 1;
    }
}
