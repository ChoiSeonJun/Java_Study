package exam10_3;

import java.util.HashMap;
import java.util.Set;

public class MapTest2 {
	public static void main(String[] args) {
		
		
		HashMap<String, String> map2 = new HashMap<>();
		HashMap<String, String> map = new HashMap<>();
		
		map.put("p1", "홍길동");
		map.put("p2", "이순신");
		map.put("p3", "유관순");
		map.put("p3", "강감찬");	// key중복시 덮어쓴다.
		
		//출력방법1 - toString
		System.out.println(map);	// {p1=홍길동, p2=이순신, p3=유관순}
		
		//출력방법 2 =get(key)
		System.out.println(map.get("p1"));
		System.out.println(map.get("p2"));
		System.out.println(map.get("x"));	//key가 없으면 null 반환
		
		// 출력방법 3 - keySet() ==> key값을 반환
		Set<String> keys = map.keySet();
		System.out.println(keys);
		for (String key : keys) {
			System.out.println(key + "\t" + map.get(key));
		}
	}

}
