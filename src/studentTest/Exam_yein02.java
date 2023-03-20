package studentTest;

import java.util.Scanner;
public class Exam_yein02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String []Q = {"예인이가 가장 좋아하는 음식은?","예인이가 지금 가장 좋아하는 색은?", "예인이가 가장 좋아하는 것은?"};
		String []ex = {"1.치킨 2.피자 3.곱창 4.파스타", "1.빨강 2.주황 3.노랑 4.보라", "1.강아지 2.고양이 3.원숭이 4.토끼"};
		String []dap = {"4","3","4"};
		String []user = new String[3];
		
		for(int i=0; i<Q.length; i++) {
			System.out.println((i+1)+"번 "+Q[i]);
			System.out.println(ex[i]);
			user[i] = sc.next();
		}
		for(int i=0; i<3; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int cnt=0;
		for(int i=0; i<Q.length; i++) {
			if(user[i].equals(dap[i])) {
				System.out.print("o ");
				cnt++;
			}else {
				System.out.print("x ");
			}
		}
		System.out.println();
		System.out.println("**결과확인**");
		System.out.println("정답 개수 : " + cnt);
		System.out.println("정답 개수 : " + (3-cnt));
		if(cnt > 1) {
			System.out.println("합격입니다~");
		}else {
			System.out.println("불합격입니다!!!");
		}
	}	

}
