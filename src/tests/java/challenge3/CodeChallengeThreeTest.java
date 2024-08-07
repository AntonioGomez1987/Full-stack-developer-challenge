package tests.java.challenge3;

import main.java.challenge3.CodeChallengeThree;

public class CodeChallengeThreeTest {

    public static void main(String[] args) {
        int[] coins1 = {5, 7, 1, 1, 2, 3, 22};
        int[] coins2 = {1, 1, 1, 1, 1};
        int[] coins3 = {1, 5, 1, 1, 1, 10, 15, 20, 100};

        System.out.println(CodeChallengeThree.nonConstructibleChange(coins1)); // 20
        System.out.println(CodeChallengeThree.nonConstructibleChange(coins2)); // 6
        System.out.println(CodeChallengeThree.nonConstructibleChange(coins3)); // 55
    }
}
