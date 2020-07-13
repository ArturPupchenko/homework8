package ua.com.alevel.nix.homework8.util;

import ua.com.alevel.nix.homework8.util.abstr.SortingAlgorithms;

public class InsertionSort implements SortingAlgorithms {

    @Override
    public int[] sort(int[] arr) {
        for (int left = 0; left < arr.length; left++) {
            int value = arr[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < arr[i]) {
                    arr[i + 1] = arr[i];
                } else {
                    break;
                }
            }
            arr[i + 1] = value;
        }
        return arr;
    }

}
