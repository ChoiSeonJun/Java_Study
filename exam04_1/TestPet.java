package exam04_1;

public class TestPet {
	
	public static void main(String[] args) {
		
		// 고양이: 야용이 2 암컷
		Cat c = new Cat("야옹이",2,"암컷");
		
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println(c.sex);
	}

}
