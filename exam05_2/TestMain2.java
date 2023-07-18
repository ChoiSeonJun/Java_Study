package exam05_2;

class Count{
	
	int n;	// 인스턴스변수, Cout 다시 new로 선언시 새로운 n 생성(객체 생성할때마다 매번 생성)
	static int m; // static 변수, 새로 new Count를 선언하여도 이전의 new Count에 누적됨(프로그램실행할때 한번 생성)
	
	public Count() {	
		n++;
		m++;
	}
	public void n_print() {	// 인스턴스 메서드
		System.out.println("n:" + n);	// 인스턴스 변수 접근 가능
		System.out.println("m: " + m);	// static 변수 접근 가능
	}
	
	public static void m_print() {	// static 메서드
//		System.out.println("n:" + n);	//인스턴스변수 접근 불가
//		System.out.println(this); 	// this 사용 불가
		System.out.println("m: " + m);	// static 변수 접근 가능
	}
	
	
	
}// end class



public class TestMain2 {
	public static void main(String[] args) {
		
		//new하기전에 static 접근 가능
		System.out.println(Count.m);	// 0,  static 변수는 클래스명으로 접근 가능
//		System.out.println(Count.n);	
		Count.m_print();// new 하지않고 메서드 사용목적 가능.
		
		// Count 객체생성을 몇번 헀는지
		Count c = new Count();
		c.n_print();
		
		Count c2 = new Count();
		c2.n_print();
		
		
	}

}
