package exam3;

public class ArryTest6 {
	
	public static void main(String[] args) {
		
		// 1. 2차원 배열
		
		// 가. 배열 선언
		int n[][];
		
		// 나. 배열 생성
		n = new int[3][2];
		
		System.out.println("행의길이: "+n.length);
		System.out.println("1행의 열길이: "+n[0].length);
		
		// 0으로 자동 초기화
		System.out.println(n[0][0]);
		System.out.println(n[0][1]);
		
		for(int i = 0; i < n.length; i++) {
			for(int j=0; j<n[i].length; j++) {
				System.out.println(">>" + n[i][j]);
			}
		}
		// 명시적 초기화
		n[0][0]=1;
		n[0][1]=2;
		n[1][0]=3;
		n[1][1]=4;
		n[2][0]=5;
		n[2][1]=6;
		
		// foreach
		for(int x[] : n) {		//2차원배열을 가져오기위해서는 1차원 배열의 값에서 돌려야한다. 중요!!!!!!!
			for(int x2 : x) {
				System.out.println("$$" + x2);
			}
			
		}
		
		
	}

}
