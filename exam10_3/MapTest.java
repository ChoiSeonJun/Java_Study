package exam10_3;

import java.util.HashMap;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		
		
		HashMap<String, String> map2 = new HashMap<>();
		HashMap<String, String> map = new HashMap<>();
		
		map.put("p1", "홍길동");
		map.put("p2", "이순신");
		map.put("p3", "유관순");
		map.put("p3", "강감찬");	// key중복시 덮어쓴다.
		
		// 메서드
		System.out.println(map.size());
		map.replace("p3", "세종");
		
		map.remove("p3");
		map.clear();	//전체 삭제
		
		//출력방법1 - toString
		System.out.println(map);	// {p1=홍길동, p2=이순신, p3=유관순}
		
		
	}

}
