package matrixTest;
//자바의 배열은 행마다 열의 크기를 다를 수 있어요. 이런 경우도 배열의 요소를 초기화 할 수 있어요.
public class MatrixTest3 {

	public static void main(String[] args) {

		int [][]a = {{1,2},
					{3,4,5},
					{6,7,8,9},
					{10,11,12,13}};
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
