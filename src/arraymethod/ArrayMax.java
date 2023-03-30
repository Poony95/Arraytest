package arraymethod;

import java.util.Arrays;

public class ArrayMax {

	public static void main(String[] args) {
		int []data = {9,1,100,3,5,7};
		String str = Arrays.toString(data);	// 배열 값 전체불러오기 toString
		System.out.println(str);
		Arrays.sort(data);					//정렬 후
		int max = data[data.length-1];		//길이의 -1 마지막 숫자 max값찾기
		System.out.println("최대값:"+max);

	}

}
