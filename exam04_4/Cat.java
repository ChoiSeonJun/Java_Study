package exam04_4;

public class Cat {
	
	String name;
	int age;
	String sex;
	
	public Cat() {
	}

	public Cat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	///////////////////////////////////////////////////////////
	// 필요하면 메서드 추가 한다.
	// 이름과 나이 한꺼번에 수정하는 메서드
	public void setNameAge(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// 나이와 성별 한꺼번에 수정하는 메서드
	public void setAgeSex(int age, String sex) {
		this.age = age;
		this.sex = sex;	
	}
	// 이름, 나이, 성별 한꺼번에 수정하는 메서드
	public void setNameAge(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;	
	}
	
	// getter+setter 기능 모두 포함하는 메서드
	public String getCat(String name, int age, String sex) {
		
		return name+" "+age+" "+sex;	// 리턴값은 반드시 String, Int 등 하나만 가능
	}
	
	// 두개의 정수 (10,20)를 한꺼번에 반환하는 방법
	public int [] getInt() {
		return new int[] {10,20};
	}
	
	//리턴타입은 void인데 return 키워드 사용하는 경우
	public void xxx() {
		System.out.println("xxx1");
		if(true)return; //중간에 xxx 메서드를 중지하고 반환된다.
		System.out.println("xxx2");
		System.out.println("xxx3");
	}
	
	// 자동형변환: byte>short>int>long>float>double
	public void yyy(double n) { // int,long,float,double 모두 가능
		xxx(); // 자신이 자신안의 다른 메서드 호출 가능
		
	}
	
	
	
	
}



















