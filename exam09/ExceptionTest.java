package exam09;

class Test{
	public void a() {
		System.out.println("Test.a");
		//연산작업
		int num = 2;
		int result = 10/num;	
		System.out.println("결과값:" + result);
	}
}

public class ExceptionTest {
	public static void main(String[] args) {
		//정상종료
		System.out.println("1");
		System.out.println("2");
		
		Test t =new Test();
		t.a();
		
		System.out.println("end. 정상종료");
		
		
	}

}
