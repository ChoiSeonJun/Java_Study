package exam04;


// Cat과 같은 amin 없는 재사용 클래스 관리 목적
public class TestPet {

	public static void main(String[] args) {
		
		// 객체 생성
		// 클래스명 변수명 = new 클래스명();
		
		Cat c = new Cat();
		
		//멤버 접근
		c.name = "야옹이";
		c.age = 2;
		c.sex = "암컷";
		
		// 고양이: 망치 1 수컷
		Cat c2 = new Cat();
		c.name = "망치";
		c.age = 1;
		c.sex = "수컷";
		
	}
	
}
