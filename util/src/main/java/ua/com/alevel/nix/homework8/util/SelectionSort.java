package ua.com.alevel.nix.homework8.util;

import ua.com.alevel.nix.homework8.util.abstr.SortingAlgorithms;

public class SelectionSort implements SortingAlgorithms {

	@Override
	public int[] sort(int[] arr) {
		for (int left = 0; left < arr.length; left++) {
			int minInd = left;
			for (int i = left; i < arr.length; i++) {
				if (arr[i] < arr[minInd]) {
					minInd = i;
				}
			}
			int temp = arr[left];
			arr[left] = arr[minInd];
			arr[minInd] = temp;
		}
		return arr;
	}


}
