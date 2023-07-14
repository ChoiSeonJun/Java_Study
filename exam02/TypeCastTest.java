package exam02;

public class TypeCastTest {

	
	public static void main(String[] args) {
		
		//1. 묵시적 형변환
		
		//가. btye > short > int > long > float > double, 	자료형 큰타입 = 작은타입;
		byte b = 10;
		short b2 = b;	// 1byte -> 2byte 변경
		int b3 = b2;	// 2byte -> 4byte 변경
		long b4 = b3;	
		float f = b4;
		double f2 = f;
		double f3 = b;
		
		// 반대경우는 에러, 자료형 작은타입 = 큰타입;
		 float x = 3.14F;
//		 int x2 = x;
		 
		 // 나. char --> int
		 char c = 'A';
		 char c2 = 'a';
		 int n = c;
		 int n2 = c2;
		 System.out.println(n+" "+n2);
		 System.out.println('A' + 1);	// 문자는 연산이 가능하다 65+1
		 
		 //다. int보다 작은 데어터형의 연산은 int로 반환
		  short s = 10;			// int형으로 받아버림
		  short s2 = 10;
//		  short s3 = s + s2;	// short = int 저장이 안됨.
		  int s3 = s + s2;
		  System.out.println(s);
		  
		  float ff = 3.14F;
		  int mm = 10;
		  float ff2 = ff +mm;
		  System.out.println(ff2);
		 
		
	}
}
