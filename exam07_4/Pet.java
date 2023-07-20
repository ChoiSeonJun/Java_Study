package exam07_4;

public abstract class Pet {
	
	String name;
	int age;
	
	//공통적인 메서드
	
	public abstract void eat();
	public abstract void sleep();

	public Pet() {}

	public Pet(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
