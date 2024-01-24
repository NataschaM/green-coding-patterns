package de.greencoding.patterns.datastructures;

public class OccurrencesInArray {

    public static void searchOccurrences(int length, int maxNumber) {
        int[] arr = initArray(length, maxNumber);
        for (int i = 1; i <= maxNumber; i++) {
            System.out.println("The number with array " + i + " occured " + searchOccurrence(arr, i) + " times.");
        }
    }

    private static int searchOccurrence(int[] intArr, int number) {
        int counter = 0;
        for (int j : intArr) {
            if (j == number) {
                counter += 1;
            }
        }
        return counter;
    }

    private static int[] initArray(int length, int maxNumber) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = Randomizer.getRandomNumber(maxNumber);
        }
        return arr;
    }
}
