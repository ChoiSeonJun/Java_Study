package exam3;

import java.util.Arrays;

public class ArryTest4 {
	
	public static void main(String[] args) {
		
		// 1. 1차원 배열 출력
		
		// 
		int n[] = new int[] {10,20,30,40};
		
		int n2[] = new int[4] ; // 배열크기 선언 가능
		
		// 1) 개별적으로 idx 이용
		System.out.println(n[0]);
		System.out.println(n[1]);
		
		// 2) 일반 for문
		for(int i=0; i < n.length; i++) {
			System.out.println(">>"+ n[i]);
		}

		// 3)foreach문
		 /* 		for(변수:배열명){		//JS의 forof, 배열의 처음부터 끝까지 돌면서 배열의 값을 넣는다.
		 * 		
		 * 		}
		 * 
		 */
		for(int k : n) {	// 배열n의 값을 돌면서 k에 저장한다.
			System.out.println("$$" + k);
		}
		
		// 4) 배열 ==? 한번에 문자열로 출력(java.util.Arrays 클래스 이용)
		System.out.println(Arrays.toString(n));	//[10, 20, 30, 40]


		
		
	}

}
