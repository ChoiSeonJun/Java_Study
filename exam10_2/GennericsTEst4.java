package exam10_2;

import java.util.ArrayList;
import java.util.List;

// <? extends E>

class Person{}
class Man extends Person{}
class Woman extends Person{}




public class GennericsTEst4 {
	public static void main(String[] args) {

		//Man만 저장
		List<Man> list = new ArrayList<Man>();
		list.add(new Man());
		list.add(new Man());
		printData(list);
		
		//Woman만 저장
		List<Woman> list2 = new ArrayList<Woman>();
		list2.add(new Woman());
		list2.add(new Woman());
		printData(list2);
		
		//String만 저장
		
		List<String> list3 = new ArrayList<String>();
		list3.add("홍길동");
		list3.add("홍길동");		
//		printData(list3);
//		printData2(list3);
		
		//Person만 저장
				List<Person> list4 = new ArrayList<Person>();
				list4.add(new Person());
				list4.add(new Person());
				printData(list4);
//				printData2(list4);
	}
	// person 및 자식만 저장
	public static void printData(List<? extends Person> xxx) {
		
	}
	
	// Man 및 부모만 저장
	public static void printData2(List<? extends Man> xxx) {
			
	}

}
