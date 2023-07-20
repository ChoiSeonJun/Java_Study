package exam07_1;

public class TestPet {
	
	public static void main(String[] args) {
		
		Cat c = new Cat("야옹이", 2);
		
		
		// 안보이는 toString이라는 값에 저장됨. --> Cat에 toString 메서드를 만들어서 리턴값을 넣어주자
		System.out.println(c);	// exam07_1.Cat@15db9742 (주소값), 패키지명.클래스명@16진수
		System.out.println(c.toString());	//exam07_1.Cat@15db9742 (주소값)
		
		
		
		
	}

}
