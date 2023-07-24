package exam10;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest3 {
	public static void main(String[] args) {
		// set 계열: 순서가 없고 중복 불가한 자료구조
		
		HashSet<String> set2 = new HashSet<String>();
		HashSet<String> set = new HashSet<>();
		
		// 가정: 이름만 저장할 것이다.
		set.add("홍길동1");
		set.add("홍길동2");
		set.add("홍길동3");
		
		//출력방법 1 = toString()
		System.out.println(set);
				
//		set.add(10);
				
		//출력방법 2 = foreach문 이용
		for (String obj : set) {  // 다형성
//			String str = (String)obj;	// <>를 쓰면 형변환이 불필요
			System.out.println(">>" + obj.concat(" 님"));
		}
		
		//출력방법 3 = Iterator 이용 ==>
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			String str = ite.next(); // 형변환이 필요없다.
			System.out.println("%%" + str);
		}
		/*
		 * 	제네릭스<>를 쓰면
		 * 	1) 잘못된 데이터를 저장한 것을 컴파일시점에 알 수 있다.
		 * 	2) 형변환이 필요없다.
		 *
		 * */
		
		
	}

}
