package arraymethod;

import java.util.Arrays;

public class ArrayFill2 {

	public static void main(String[] args) {
		boolean []data = new boolean[10];
		
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
		//0 1 2 3 4 5 6 7 8 9       10/2
		
		Arrays.fill(data, data.length/2, data.length, true );
		
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]+" ");
		}		

	}

}
