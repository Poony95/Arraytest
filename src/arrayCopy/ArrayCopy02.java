package arrayCopy;

public class ArrayCopy02 {

	public static void main(String[] args) {
		int []a = {1,2,3,4,5};
		int []b = new int[5];
		// b=a; 이 코드는 진짜 복사가 되지 않음.  
		for(int i=0; i<a.length; i++) {
			b[i] = a[i];						// 이렇게 배열 코드로 짜야 다른 배열 원소의 수가 바뀌었을 때 
		}										// 힙 메모리에 따로 저장되어있어 값이 바뀌지 않음.
		
		System.out.println("-------------------------");
		System.out.println("a 배열의 요소");
		for( int n : a) { 
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println("b배열의 요소");
		for(int n: b) {
			System.out.print(n + " ");
		}
		System.out.println();
			a[0] = 100;
			System.out.println("-------------------------");
			System.out.println("a 배열의 요소");
			for( int n : a) { 
				System.out.print(n + " ");
			}
			System.out.println();
			System.out.println("b배열의 요소");
			for(int n: b) {
				System.out.print(n + " ");
			}
	}
}
