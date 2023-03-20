package threeDimention;

public class ThreeDimention {
	public static void main(String[] args){
		int [][][]a = new int[2][3][5];
		int n=0;
		for(int i=0; i<2; i++){  //면
			for(int j=0; j<3; j++){//행
				for(int k=0; k<5; k++){//열
					a[i][j][k] = n;
					
				}
			}
			n++;
		}

		for(int i=0; i<2; i++){//면
			for(int j=0; j<3; j++){//행
				for(int k=0; k<5; k++){//열
					System.out.print(a[i][j][k] +"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
