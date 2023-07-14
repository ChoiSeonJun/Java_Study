package exam02;

public class TypeCastTest2 {

	
	public static void main(String[] args) {
		
		//1. 묵시적 형변환
		
		//가. btye > short > int > long > float > double, 	자료형 큰타입 = 작은타입
		// 반대경우는 에러, 자료형 작은타입 = 큰타입;
		// 나. char --> int
		//다. int보다 작은 데어터형의 연산은 int로 반환
		
		//2. 명시적 형변환: (데이터타입) <= 형변환 연산자, 작은타입=(작은타입)큰타입;
		int n = 10;
		short n2 = (short)n;

	}
}
