package ua.com.alevel.nix.homework8.main;

import org.apache.log4j.Logger;
import ua.com.alevel.nix.homework8.util.*;

import java.util.*;

import static ua.com.alevel.nix.homework8.util.AlgorithmRunner.*;


public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        int[] ints = new int[100000];
        int index = 0;
        for (int i = 0; i < ints.length; i++) {
            index = (int) Math.floor(Math.random() * 100000);
            ints[i] = index;
        }

        List<Integer> list = new ArrayList<>();
        for (int value : ints) {
            list.add(value);
        }

        setNumberOfAttempts(10);

        Map<Long, String> results = new TreeMap<>();
        long start = System.nanoTime();
        Collections.sort(list);
        long collectionsSortTime = System.nanoTime() - start;

        results.put(collectionsSortTime, "Collections.sort");
        results.put(countAverageSortAlgorithmTime(ints, new BubbleSort()), "BubbleSort");
        results.put(countAverageSortAlgorithmTime(ints, new SelectionSort()), "SelectionSort");
        results.put(countAverageSortAlgorithmTime(ints, new InsertionSort()), "InsertionSort");
        results.put(countAverageSortAlgorithmTime(ints, new ShellSort()), "ShellSort");
        results.put(countAverageSortAlgorithmTime(ints, new ShuttleSort()), "ShuttleSort");
        results.put(countAverageSortAlgorithmTime(ints, new MergeSort()), "MergeSort");
        results.put(countAverageSortAlgorithmTime(ints, new QuickSort()), "QuickSort");

        logger.info("Результаты тестов после " + NUMBER_OF_ATTEMPTS + " замеров :");

        for (Map.Entry<Long, String> entry : results.entrySet()) {
            Long key = entry.getKey();
            String value = entry.getValue();
            logger.info(value + " - " + key);
        }

    }
}


