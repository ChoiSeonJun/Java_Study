package exam3;

public class ArryTest7 {
	
	public static void main(String[] args) {
		
		// 1. 2차원 배열 출력 - 비정방형
		
		int n[][] = new int[2][];
		
		n[0] = new int[1];			// n[0][0]			:n[0]의 길이 
		n[1] = new int[2];			// n[1][0],n[1][1] 	:n[1]의 길이
		
		
		System.out.println("행길이: "+ n.length);
		System.out.println("1행 열길이: "+ n[0].length);
		System.out.println("2행 열길이: "+ n[1].length);
		
		// 초기화
		n[0][0]=1;
		n[1][0]=2;
		n[1][1]=3;
		
		//일반 반복문
		for(int i = 0; i < n.length; i++) {	//행
			for(int j=0; j<n[i].length; j++) {	// 열
				System.out.println(">>" + n[i][j]);
			}
		}
		
		// foreach
				for(int x[] : n) {		//2차원배열을 가져오기위해서는 1차원 배열의 값에서 돌려야한다. 중요!!!!!!!
					for(int x2 : x) {
						System.out.println("$$" + x2);
					}
					
				}
		
		
	}

}
