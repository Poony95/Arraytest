// 1씩 증가하는 값을 배열에 저장합시다.
package matrixTest;

public class MatrixTest2 {

	public static void main(String[] args) {

		int n=1;
		int [][]a = new int[5][5];
		for(int i=0; i<5; i++){
			for(int j=0;j<4;j++){
				a[i][j]=n++;
				a[i][4] += a[i][j];
			}
		}

		
		for(int i=0; i<5; i++){
			for(int j=0; j<5;j++){
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
