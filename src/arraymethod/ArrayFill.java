package arraymethod;

import java.util.Arrays;

public class ArrayFill {

	public static void main(String[] args) {
		int []data = new int[10];
		
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]+" ");
		}
		Arrays.fill(data, 100);
		System.out.println();
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]+" ");
		}

	}

}
