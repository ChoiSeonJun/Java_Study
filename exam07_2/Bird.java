package exam07_2;

public class Bird extends Pet {
	
	String color;
	
	public void fly() {
		System.out.println("Bird.fly");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}

	@Override
	public void sleep() {
		super.sleep();
	}

	public Bird() {
	}

	public Bird(String name, int age) {
		super(name, age);
	}

	public Bird(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return String.format("Bird 이름: %s, Bird 나이:%d, Bird 색상:%s \n", getName(), getAge(), getColor());
	}

}
