package de.greencoding.patterns.datastructures;

public class Randomizer {

    public static int getRandomNumber(int max) {
        return  (int) (Math.random() * max) + 1;
    }
}
