package exam07_4;

public class TestPet {

	public static void main(String[] args) {
		
		// 
		Cat c1 = new Cat("야옹이", 2);
		Dog d1 = new Dog("망치", 1, "수컷");
		Bird b1 = new Bird("까치", 1, "블랙");
		
		c1.eat();
		c1.sleep();
		
		d1.eat();
		d1.sleep();
		
		b1.eat();
		b1.sleep();
		
		// 추상클래스는 객체생성 불가
//		Pet p = new Pet();
		
		// 다형성( new는 불가능하지만 변수의 데이터타입으로 사용 가능) [부모가 자식을 낳은 관계]
		Pet p = new Cat();

			
			
			
			
	}

}
