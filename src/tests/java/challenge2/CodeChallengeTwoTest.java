package tests.java.challenge2;

import main.java.challenge2.CodeChallengeTwo;

public class CodeChallengeTwoTest {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 5, 6, 8, 9};
        int[] array2 = {-2, -1};
        int[] array3 = {-6, -5, 0, 5, 6};
        int[] array4 = {-10, 10};

        int S = 6;

        int[] result1 = CodeChallengeTwo.sortedSquaredArray(array1, S);
        int[] result2 = CodeChallengeTwo.sortedSquaredArray(array2, S);
        int[] result3 = CodeChallengeTwo.sortedSquaredArray(array3, S);
        int[] result4 = CodeChallengeTwo.sortedSquaredArray(array4, S);

        CodeChallengeTwo.printArray(result1); // [1, 4, 9, 25, 36, 64]
        CodeChallengeTwo.printArray(result2); // [1, 4]
        CodeChallengeTwo.printArray(result3); // [0, 25, 25, 36, 36]
        CodeChallengeTwo.printArray(result4); // []
    }
}
