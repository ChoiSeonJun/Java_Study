package exam07;

public class TestPet2 {
	public static void main(String[] args) {
		
		Pet [] pets = {new Cat("야옹이1", 2),
			       new Dog("망치1", 1, "수컷"),
			       new Dog("망치2", 2, "암컷"),
			       new Cat("야옹이2", 1),
			       new Bird("까치", 1, "블랙"),
			       new Cat("야옹이3", 4) };
		
		//이름과 나이만 출력
		for(Pet p:pets) {
			System.out.printf("이름: %s,나이:%d \n", p.getName(), p.getAge());
		}
		
		// 고양이만 출력 ==> 배열에서 꺼냈을때 누군지 식별하는 방법 필요(변수 instanceof 타입 연산자)
		for(Pet p:pets) {
			if(p instanceof Cat) {
				System.out.printf("Cat이름: %s, Cat나이: %d \n", p.getName(), p.getAge());
			}
		}
		
		// 강아지의 이름, 나이, 성별 출력
		for(Pet p:pets) {
			if(p instanceof Dog) {
				System.out.printf("Dog이름: %s, Dog나이: %d, Dog성별: %s \n", p.getName(), p.getAge(), ((Dog) p).getSex());
				//((Dog)p).getSex() --> 부모에 업 ㅅ고 자식에만 추가된 멤버 접근은 반드시 부모타입을 자식으로 형변환 해야 한다.
				
				//Pet타입 --> Dog타입으로 바꾸어줘도 된다.
				Dog d = (Dog)p;
				System.out.printf("Dog이름: %s, Dog나이: %d, Dog성별: %s \n", d.getName(), d.getAge(), d.getSex());
				
			}
		}
		
		
		
	}

}
