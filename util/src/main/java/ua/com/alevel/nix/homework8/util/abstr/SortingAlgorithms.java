package ua.com.alevel.nix.homework8.util.abstr;

public interface SortingAlgorithms {

    int[] sort(int[] arr);

    static long useAlgorithmAndCountTime(int[] arr, SortingAlgorithms algorithm) {
        long start = System.nanoTime();
        int[] sortedArr = algorithm.sort(arr);
        long time = System.nanoTime() - start;
        return time;
    }
}

