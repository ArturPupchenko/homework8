package ua.com.alevel.nix.homework8.util.test;

import ua.com.alevel.nix.homework8.util.InsertionSort;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InsertionSortTest {

    private final InsertionSort insertionSort = new InsertionSort();

    @Test
    void run() {

        int[] ints = new int[100000];
        int index = 0;
        for (int i = 0; i < ints.length; i++) {
            index = (int) Math.floor(Math.random() * 100000);
            ints[i] = index;
        }

        List<Integer> sortAlgortithmList = new ArrayList<>();

        for (int value : insertionSort.sort(ints)) {
            sortAlgortithmList.add(value);

        }

        List<Integer> collectionsSortlist = new ArrayList<>();

        for (int value : ints) {
            collectionsSortlist.add(value);
        }
        Collections.sort(collectionsSortlist);

        Assert.assertEquals(sortAlgortithmList, collectionsSortlist);
    }
}
