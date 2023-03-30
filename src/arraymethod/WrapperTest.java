package arraymethod;

import java.util.ArrayList;

		/*
		기본자료형을 객체로 만들어주는 클래스들 ==> Wrapper 클래스
		boolean		==> Boolean
		char		==> Character
		byte		==> Byte
		short		==> Short
		int			==> Integer
		long		==> Long
		float		==> Float
		double		==> Double
	 */
	public class WrapperTest {
		public static void main(String[] args) {
//			ArrayList<int> list = new ArrayList<int>();
//			자바의 컬렉션 프레임웤은 기본자료형을 상대 안하고
//			객체를 상대합니다.
			
			ArrayList<Integer> list  = new ArrayList<Integer>();
			list.add(new Integer(100));
			list.add(100);//auto Boxing

	}
}


