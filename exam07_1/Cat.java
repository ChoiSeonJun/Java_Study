package exam07_1;

public class Cat extends Pet {
	
	public void run() { 
		System.out.println("Cat.run");
	}

	
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}


	//오버라이딩
	@Override
	public void eat() {
		System.out.println("Cat.eat");
	}

	@Override
	public void sleep() {
		System.out.println("Cat.sleep");
	}


	public Cat() {}


	public Cat(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
