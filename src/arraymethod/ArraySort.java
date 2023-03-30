package arraymethod;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int []data = {9,1,10,7,8,6};
		
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]+ " ");
		}
		System.out.println();
		
		Arrays.sort(data);		// sort 는 정렬.
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]+ " ");
		}
	}

}
