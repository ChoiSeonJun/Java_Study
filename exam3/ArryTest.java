package exam3;

public class ArryTest {
	
	public static void main(String[] args) {
		
		// 1. 1차원 배열 - new 이용
		
		// 가. 배열 선언
		
		int n[]; // n: int 타입의 배열 변수, 배열크기선언 불가
		n = new int[2]; // 배열 크기 생성
		
		//int n2[] = new int[4] ; // 배열크기 바로 선언 가능
		
		String n2[]= {"abc"};; // n2: 변수, 참조형 변수, 로컬변수, String타입의 배열 변수
		
		
		System.out.println(n[0]);
		System.out.println(n[1]);
		//System.out.println(n[2]);		// 예외 발생
		
		
	}

}
