package exam07_3;

public class Dog extends Pet {
	
	String sex;
	
	//오버라이딩은 강제성이 없다.
	
	public void eatDog() {
		System.out.println("Dog.eat");
	}

	
	public void sleepDog() {
		System.out.println("Dog.sleep");
	}

	public Dog() {
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Dog(String name, int age) {
		super(name, age);
	}

	public Dog(String name, int age, String sex) {
		super(name, age);
		this.sex = sex;
	}
	
	@Override
	public String toString() {
		return String.format("Dog 이름: %s, Dog 나이:%d, Dog 성별:%s \n", getName(), getAge(), getSex() );
	}
	

	
	
	
}
