package exam06_3;

class Parent{
	int age = 20;
	public Parent(){
		System.out.println("부모생성자");
	}
	
	public Parent(int x) {
		System.out.println("부모생성자의 인트형 오버로딩");
	}
	
			
}

class Child extends Parent{
	int age = 10;
	
	public Child() {
		super();
		System.out.println("자식 생성자");
	}
	
	public void info() {
		System.out.println(age);
		System.out.println(super.age);
	}
}


public class TestMain {
	public static void main(String[] args) {
		
		Child c = new Child();
		c.info();
		
	}

}
