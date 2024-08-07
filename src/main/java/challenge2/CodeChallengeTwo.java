package main.java.challenge2;

import java.util.ArrayList;
import java.util.List;

public class CodeChallengeTwo {

    public static int[] sortedSquaredArray(int[] array, int S) {
        int n = array.length;
        int[] squaredArray = new int[n];
        int[] result;
        int index = 0;

        // Cuadrar cada número
        for (int i = 0; i < n; i++) {
            squaredArray[i] = array[i] * array[i];
        }

        // Filtrar números fuera del rango [0, S*S]
        int maxValue = S * S;
        List<Integer> filteredList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (squaredArray[i] >= 0 && squaredArray[i] <= maxValue) {
                filteredList.add(squaredArray[i]);
            }
        }

        // Convertir la lista filtrada a un array
        result = new int[filteredList.size()];
        for (int i = 0; i < filteredList.size(); i++) {
            result[i] = filteredList.get(i);
        }

        // Ordenar el array sin usar sort()
        bubbleSort(result);

        return result;
    }

    // Implementación de bubble sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}