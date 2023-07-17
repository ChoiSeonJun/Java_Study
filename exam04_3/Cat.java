package exam04_3;

public class Cat {
	
	// 인스턴스 변수
	String name;
	int age;
	String sex;
	
	// 생성자
	public Cat() {}
	public Cat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	// 메서드
	// 이름얻기
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getSex() {
		return sex;
	}
	
	//setter 메서드
	// 나이수정
	public void setAge(int age) {
		this.age = age;
	}
	// 이름 수정
	public void setName(String Name) {
		this.name = Name;
	}
	// 나이 수정
	public void setSex(String age) {
		this.sex = sex;
	}
	

}
