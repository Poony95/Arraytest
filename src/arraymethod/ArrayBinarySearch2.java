package arraymethod;

import java.util.Arrays;
//binarySearch는 데이터가 정렬된 상태에서 찾을 수 있어요!
public class ArrayBinarySearch2 {

	public static void main(String[] args) {
		int []data = {9,3,1,100,6,2,5};
		Arrays.sort(data);		//정렬
		//{1,2,3,5,6,9,100}
		int idx = Arrays.binarySearch(data, 1);
		int idx2 = Arrays.binarySearch(data, 2);
		
		System.out.println(idx);
		System.out.println(idx2);

	}
}
