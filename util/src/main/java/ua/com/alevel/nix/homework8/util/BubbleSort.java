package ua.com.alevel.nix.homework8.util;

import ua.com.alevel.nix.homework8.util.abstr.SortingAlgorithms;

public class BubbleSort implements SortingAlgorithms {

	@Override
	public int[] sort(int[] arr) {
			for(int j = 0; j < arr.length; j++) {
				for(int i = 0; i < arr.length-1; i++) {
						if(arr[i] > arr[i+1]) { 
							int temp = arr[i];
							arr[i] = arr[i+1];
							arr[i+1] = temp;
					}
				}
			}
		return arr;
	}

}
