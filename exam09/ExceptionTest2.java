package exam09;

class Test1{
	public void a() {
		System.out.println("Test.a");
		//연산작업
		int num = 0;
		int result = 10/num;	// 예외 발생 ==> 비정상종료됨. 10을 0으로 나눌 수 없음.
		System.out.println("결과값:" + result);
	}
}

public class ExceptionTest2 {
	public static void main(String[] args) {
		//정상종료
		System.out.println("1");
		System.out.println("2");
		
		Test1 t =new Test1();
		t.a();
		
		System.out.println("end. 정상종료");
		
		
	}

}
