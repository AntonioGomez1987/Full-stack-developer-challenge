package tests.java.challenge1;

import java.util.ArrayList;
import java.util.List;

import static main.java.challenge1.CodeChallengeOne.processNumbers;

public class CodeChallengeOneTest {

    public static void main(String[] args) {

        List<Integer> scenery = new ArrayList<>();
        scenery.add(3);
        scenery.add(2);
        scenery.add(1);
        scenery.add(4);
        int s = 4;
        List<Integer> result = processNumbers(scenery, s);

        List<Integer> scenery2 = new ArrayList<>();
        scenery2.add(62);
        scenery2.add(22);
        scenery2.add(13);
        scenery2.add(44);
        int s2 = 4;
        List<Integer> result2 = processNumbers(scenery2, s2);

        List<Integer> scenery3 = new ArrayList<>();
        scenery3.add(40);
        scenery3.add(4);
        scenery3.add(5);
        scenery3.add(6);
        scenery3.add(3);
        scenery3.add(2);
        scenery3.add(7);
        scenery3.add(7);
        scenery3.add(29);
        scenery3.add(1);

        int s3 = 4;
        List<Integer> result3 = processNumbers(scenery3, s3);

        // Imprimir el resultado
        for (int num : result) {
            System.out.print(num + " ");
        }

        System.out.println("\n");

        for (int num : result2) {
            System.out.print(num + " ");
        }

        System.out.println("\n");

        for (int num : result3) {
            System.out.print(num + " ");
        }
    }
}
