package tests.java.challenge2;

import main.java.challenge2.CodeChallengeTwo;

public class CodeChallengeTwoTest {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 8, 9};
        int[] array2 = {-2, -1};
        int[] array3 = {-4, -5, 0, 5, 4};
        int[] array4 = {-10, 10};

        int S = 4;

        int[] result1 = CodeChallengeTwo.sortedSquaredArray(array1, S);
        int[] result2 = CodeChallengeTwo.sortedSquaredArray(array2, S);
        int[] result3 = CodeChallengeTwo.sortedSquaredArray(array3, S);
        int[] result4 = CodeChallengeTwo.sortedSquaredArray(array4, S);

        CodeChallengeTwo.printArray(result1);
        CodeChallengeTwo.printArray(result2);
        CodeChallengeTwo.printArray(result3);
        CodeChallengeTwo.printArray(result4);
    }
}
