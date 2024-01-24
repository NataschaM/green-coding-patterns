package de.greencoding.patterns;


import de.greencoding.patterns.datastructures.OccurrencesInArray;
import de.greencoding.patterns.datastructures.OccurrencesInMap;

public class Main {

    public static void main(String[] args) {

        OccurrencesInArray.searchOccurrences(30000000, 100);
        OccurrencesInMap.searchOccurrences(30000000, 100);

    }

}
