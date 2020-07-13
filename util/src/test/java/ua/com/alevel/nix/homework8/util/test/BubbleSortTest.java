package ua.com.alevel.nix.homework8.util.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import ua.com.alevel.nix.homework8.util.BubbleSort;
import java.util.*;


public class BubbleSortTest {

    private final BubbleSort bubbleSort = new BubbleSort();

    @Test
    void run() {

        int[] ints = new int[100000];
        int index = 0;
        for (int i = 0; i < ints.length; i++) {
            index = (int) Math.floor(Math.random() * 100000);
            ints[i] = index;
        }

        List<Integer> sortAlgortithmList = new ArrayList<>();

        for (int value : bubbleSort.sort(ints)) {
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
