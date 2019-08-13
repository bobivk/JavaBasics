package helloworld;

import java.util.Arrays;

public class FindMinUnsorted {
	int findMinUnsorted(int[] array, int max) {
		Boolean[] boolArr = new Boolean[max];
		Arrays.fill(boolArr, Boolean.FALSE);
		for(int i = 0; i < array.length; i++) {
			if(array[i] >= 0) {
				boolArr[array[i]] = Boolean.TRUE;
			}
		}
		System.out.println(boolArr.length);
		
		int min = 1;
		for(int i = 1; i < boolArr.length; i++) System.out.println(boolArr[i]);
		if(!(Arrays.asList(boolArr).contains(Boolean.FALSE))) {
			 min = boolArr.length;
		}else {
			for(int i = 1; i < boolArr.length+1; i++) {
				if(boolArr[i] == Boolean.FALSE) {
					min = i;
					break;
				} 
			}
		}
			return min;
		
	}
}
