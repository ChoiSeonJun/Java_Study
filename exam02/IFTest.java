package exam02;

import java.util.Scanner;

public class IFTest {

	public static void main(String[] args) {
		
		// 단일 if문
		
		System.out.println("1");
		if(true)System.out.println("2");
		if(false) {
			System.out.println("2");
		}
		System.out.println("3");
		
		System.out.println("end");
		
		// 키보드 입력 처리 클래스 : Scanner 클래서
		// 객체생성 문법: 클래스명 변수명 = new 클래스명([값]);
		Scanner scan = new Scanner(System.in); // System.in은 키보드를 가리킴 (필수)
		System.out.println("정수 입력하시오");
		int num = scan.nextInt();		// JS의 prompt 역할
		System.out.println("정수 입력하시오");
		int num2 = scan.nextInt();		// JS의 prompt 역할
		//정수를 입력받고 짝수인 경우에만 값을 출력하시오.
		if(num % 2 == 0) {
			System.out.println(num);
		}
		
		System.out.println("end");
		
		
		
	}
}
