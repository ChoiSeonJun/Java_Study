package exam09;

class Parent{
	public void a() throws RuntimeException{}
	public void b() throws RuntimeException{}
}

class Child extends Parent{
	
	// 재정의는 같거나 축소 및 같은 계열하는 형태로 사용
	public void a() {}
	public void b() throws ArithmeticException {}
//	public void c() throws IOException {} // 런타임종류가 아닌 예외라서 오류가남
}

public class ExceptionTest7 {
	public static void main(String[] args) {
		
		
		
	}

}
