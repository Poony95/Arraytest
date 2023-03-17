package arrayCopy;

public class ArrayCopy01 {

	public static void main(String[] args) {
		int []a = {1,2,3,4,5};
		int []b = new int[5];
		b=a;
		a[0] = 100;
		System.out.println("-------------------------");
		System.out.print("a 배열의 요소");
		for( int n : a) { 
			System.out.println(n + " ");
		}
		System.out.println();
		System.out.println("b배열의 요소");
		for(int n: b) {
			System.out.print(n + " ");
		}
		

	}

}
