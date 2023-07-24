package exam10;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
	public static void main(String[] args) {
		// set 계열: 순서가 없고 중복 불가한 자료구조
		
		HashSet set = new HashSet();
		
		set.add("홍길동");
		set.add(20);	// 자동으로 auto boxing
		set.add(3.14);	// 자동으로 auto boxing
		set.add('A');	// 자동으로 auto boxing
		set.add(true);	// 자동으로 auto boxing
		
		set.add("홍길동");
		set.add(20);	// 자동으로 auto boxing
		set.add(3.14);	// 자동으로 auto boxing
		set.add('A');	// 자동으로 auto boxing
		set.add(true);	// 자동으로 auto boxing
		
		//출력방법1 - toString이용
		System.out.println(set);	// 같은값은 중복해서 저장이 안된다
		
		//출력방법 - foreach문이용
		for (Object obj : set) {	// 다형성
			System.out.println(">>" + obj);
		}
		
		//출력방법3 - Iterator문 이용 ==> 컬렉션에 저장된 데이터를 반복적으로 가져오는 방법
		Iterator ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println("###" + ite.next());
		}
		
	}

}
