package exam06;

public class TestPet {

	public static void main(String[] args) {
		
		Cat c1 = new Cat("야옹이", 2);

		Dog d1 = new Dog("망치", 1, "암컷");
		
		Bird b1 = new Bird("까치", 2, "블랙");
		
		System.out.printf("Cat 이름: %s, Cat 나이: %d \n", c1.getName(), c1.getAge());
		System.out.printf("Dog 이름: %s, Dog 나이: %d \n", d1.getName(), d1.getAge(), d1.getSex());
		System.out.printf("Bird 이름: %s, Bird 나이: %d \n", b1.getName(), b1.getAge(), b1.getColor());
		
	}
}
