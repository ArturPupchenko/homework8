package ua.com.alevel.nix.homework8.util;

import ua.com.alevel.nix.homework8.util.abstr.SortingAlgorithms;

public class AlgorithmRunner {

    public static int NUMBER_OF_ATTEMPTS;

    public static void setNumberOfAttempts(int numberOfAttempts) {
        NUMBER_OF_ATTEMPTS = numberOfAttempts;
    }

    public static long countAverageSortAlgorithmTime(int [] arr, SortingAlgorithms algorithm) {

        long averageTime, totalTime=0;
        for (int i = 0; i < NUMBER_OF_ATTEMPTS; i++) {
            totalTime += SortingAlgorithms.useAlgorithmAndCountTime(arr.clone(), algorithm);
        }
        averageTime = totalTime/NUMBER_OF_ATTEMPTS;
        return averageTime;
    }
}
