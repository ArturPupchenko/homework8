package ua.com.alevel.nix.homework8.util;

import ua.com.alevel.nix.homework8.util.abstr.SortingAlgorithms;

public class ShellSort implements SortingAlgorithms {

	@Override
	public int[] sort(int[] arr) {
		
		int gap = arr.length / 2;
		while (gap >= 1) {
		    for (int right = 0; right < arr.length; right++) {
		       for (int c = right - gap; c >= 0; c -= gap) {
		           if (arr[c] > arr[c + gap]) {
						int temp = arr[c];
						arr[c] = arr[c+gap];
						arr[c+gap] = temp;
		           }
		        }
		    }
		    gap = gap / 2;
		}
		return arr;
	}

}
