package main.java.challenge1;

import java.util.ArrayList;
import java.util.List;
public class CodeChallengeOne {

    public static List<Integer> processNumbers(List<Integer> scenery, int s) {
        List<Integer> result = new ArrayList<>();

        // Eliminar el número s
        for (int num : scenery) {
            String n = num + "";
            if (!n.contains(s + "")) {
                result.add(num);
            }
        }

        // Convertir la lista a un array de enteros
        int[] numbersArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            numbersArray[i] = result.get(i);
        }

        // Ordenar el array usando el algoritmo de burbuja
        bubbleSort(numbersArray);

        // Convertir el array de enteros a una lista de enteros
        List<Integer> sortedList = new ArrayList<>();
        for (int num : numbersArray) {
            sortedList.add(num);
        }

        return sortedList;

    }

    private static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }


}
