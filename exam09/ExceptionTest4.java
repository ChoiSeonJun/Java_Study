package exam09;

class Test4{
	public void b() throws ArithmeticException{
		System.out.println("Test.a");
		//연산작업
	
		// ArithmeticException 발생 가능한 코드
		int num = 0;
		int result= 10/num;  
		System.out.println("결과값:" + result);	
	}
	public void a() {
		b();
	}
}

public class ExceptionTest4 {
	public static void main(String[] args) {
		//정상종료
		System.out.println("1");
		System.out.println("2");
		Test4 t = new Test4();
		
		try {
			t.a();
		}catch(ArithmeticException e) {
			System.out.println("error: 0으로 나노어 발생");
		}

		System.out.println("end. 정상종료");
		
		
	}

}
