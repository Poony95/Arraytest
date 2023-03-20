// 4지 선다형 문항의 답안 10개를 입력받아 
// 답이 옳은지 판별하여 맞으면 'O', 틀리면 'X'로 출력하고 
// 정답수와 틀린답수를 각각 구하여 출력

// << 실행 예 >>
// 1번 답을 입력==>1
// 2번 답을 입력==>2
// ...
// 10번 답을 입력 ==>1
/*
	*** 시험결과 ***
	1	2	3					10
	O	O	X					X
	정답수 : ___
	틀린답수 : ___

*/

package studentTest;

import java.util.Scanner;
class  StudentTest{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int []dap = {1,2,3,4,1,2,3,4,1,2};
		int []user = new int[10];
		
		for(int i=0; i<user.length; i++){
			System.out.print((i+1)+"번 답을 입력==>");
			user[i] = sc.nextInt();
		}
		
		int cnt =0 ;
		System.out.println("*** 시험 결과 ***");
		for(int i=1; i<=10; i++){
			System.out.print(i+"\t");
		}
		System.out.println();
		for(int i=0; i<dap.length; i++){
			if(dap[i] == user[i]){
				System.out.print("O\t");
				cnt++;
			}else{
				System.out.print("X\t");
			}
		}
		System.out.println();
		System.out.println("----------------------");
		System.out.println("정답수:"+cnt);
		System.out.println("틀린답수:"+(10-cnt));

	}
}