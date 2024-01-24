package de.greencoding.patterns.datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class OccurrencesInMap {

    public static void searchOccurrences(int length, int maxNumber) {
        Map<Integer, Integer> map = initMap(length, maxNumber);
        for (int i = 1; i <= maxNumber; i++) {
            System.out.println("The number with map " + i + " occured " + map.get(i) + " times.");
        }
    }

    private static Map<Integer, Integer> initMap(int length, int maxNumber) {
        Map<Integer, Integer> map = new HashMap<>();
        IntStream.range(0, length).forEach(index -> {
            int randomNumber = Randomizer.getRandomNumber(maxNumber);
            int counter = 0;
            if (map.containsKey(randomNumber)) {
                counter = map.get(randomNumber);
            }
            map.put(randomNumber, counter + 1);
        });

        return map;
    }
}
