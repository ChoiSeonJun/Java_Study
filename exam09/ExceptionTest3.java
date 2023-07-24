package exam09;

class Test2{
	public void a() {
		System.out.println("Test.a");
		//연산작업
		try {
			int num = 0;
			int result = 10/num;	// 예외 발생 ==> 비정상종료됨. ==> 예외처리 정상종료 됨
			System.out.println("결과값:" + result);	
		}catch( ArithmeticException e) {	//다형성 적용. 전부 가능.ArithmeticException, RuntimeException, Exception
			System.out.println("error: 0으로 나누어 발생");
//			System.out.println("error:" + e.getMessage());	// / by zero
//			e.printStackTrace(); // 에외 발생시 개발자가 디버깅용으로 사용함
			
		}
		
	}
}

public class ExceptionTest3 {
	public static void main(String[] args) {
		//정상종료
		System.out.println("1");
		System.out.println("2");
		
		Test2 t =new Test2();
		t.a();
		
		System.out.println("end. 정상종료");
		
		
	}

}
