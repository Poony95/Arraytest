package arrayEqual;

public class ArrayEqual01{
	public static void main(String[] args) {
		int []a = {10,20,30,40,50};
		int []b = {10,20,30,40,50};
		
		//배열은 참조 자료형입니다.
		//a가 가리키는 메모리와 b가 가리키는 메모리가 
		//서로 같은가 판별합니다.
		//a,b를 서로 다른 메모리를 참조하고 있어요
		if(a == b){
			System.out.println("같아요");
		}else{
			System.out.println("달라요");
		}
	}
}
