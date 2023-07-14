package exam3;

import java.util.Arrays;

public class ArryTest10 {
	
	
			// 기본형 인자
			public static void pdt(int n) {
				System.out.println("pdt:" + n);
				n = 20;
			}
			
			// 참조형 인자
			public static void rdt(int x[]) {
				System.out.println("rdt:" + Arrays.toString(x));
				x[0] = 100;
				
			}
	
	public static void main(String[] args) {
			
			// 기본형 데이터
			int n = 10;
			System.out.println("호출전 n값:" + n);
			pdt(n);
			System.out.println("호출 후 n값:" + n);		// pdt()에서 변경되었다해도 이곳의 n과는 다르기에 변함없다.
			
			// 참조형 데이터
			int n2[] = {10,20,30};
			System.out.println("호출전 2n값:" + Arrays.toString(n2));	// 배열 전부 출력 ==> Arrays.toString(n2)
			rdt(n2);
			System.out.println("호출후 2n값:" + Arrays.toString(n2));	// 변경됨
			
		
	}

}
