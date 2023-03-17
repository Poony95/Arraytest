package arrayEqual;

public class ArrayEqual02 {

	public static void main(String[] args) {
		int []a = {10,20,30,40,50};
		int []b = {10,20,30,40,50,60,70,80};						//두 배열의 크기가 다른 경우 

		boolean flag = true;
		if (a.length != b.length) {
			flag = false;
		} else {
			for(int i=0; i<a.length; i++) {
				if(a[i] != b[i]) {
					flag = false; break;
				}
			}
		}
		if(flag == true) {
			System.out.print("같아요");
		}else
			System.out.print("달라요");
	}

}

