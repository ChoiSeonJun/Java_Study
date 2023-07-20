package cafe;

public class Cafe {
	
	// Cafe has a Coffee 목록
	private Coffee[] coffeeList;	// coffeeList라는 배열 생성
	private int index;	// 0
	
	// 생성자: 인스턴스 변수 초기화
	public Cafe() {
		coffeeList = new Coffee[3];
	}
	
	public int totalPrice() {
		int totalPrice = 0; 
		for(Coffee coffee: coffeeList) {
			totalPrice += coffee.getPrice();
		}
		return totalPrice;
	}
	
	public void setCoffee(Coffee coffee) {
		if(index == coffeeList.length) {
			System.out.println("더 이상 저장할 수 없습니다.");
		}else {	
		coffeeList[index] = coffee;
		index++;
		}
	}
	
	public Coffee [] getCoffeeList() {
		return coffeeList;
	}
	
	

}
