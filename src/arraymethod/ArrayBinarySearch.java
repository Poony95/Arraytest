package arraymethod;

import java.util.Arrays;

public class ArrayBinarySearch {

	public static void main(String[] args) {
		int []data = {10,20,30,40,50,60,70,80,90,100};
		int idx = Arrays.binarySearch(data, 30);
		int idx2 = Arrays.binarySearch(data, 900);//없으면 음수값으로 표기
		System.out.println(idx);
		System.out.println(idx2);

	}
// binarySearch는 반으로 계속 쪼개면서 찾아줌.
}
