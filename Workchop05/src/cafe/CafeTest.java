package cafe;

public class CafeTest {
	
	public static void main(String[] args) {
		
		Cafe cafe = new Cafe();
		
		Coffee c1 = new Coffee("Americano", 4000);
		Coffee c2 = new Coffee("Caffelatte", 5000);
		Coffee c3 = new Coffee("Caffelatte", 6000);
		
		cafe.setCoffee(c1);
		cafe.setCoffee(c2);
		cafe.setCoffee(c3);
		
		// 배열
		Coffee coffeeList [] = cafe.getCoffeeList();
		
		for(Coffee coffee: coffeeList) {
			System.out.println(coffee.toString());
		}
		
		System.out.println(String.format("커피가격의 합: %d원", cafe.totalPrice() ));	// 둘 다
		System.out.printf("커피가격의 합: %d원 \n", cafe.totalPrice()); 					// 같은 의미이다.
	}

}
