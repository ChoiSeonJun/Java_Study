package exam08_1;

import java.util.Calendar;

public class CalenderTest {
	public static void main(String[] args) {
		
		// 날짜 데이터
		// Calendar 클래스는 추상 클래스이기 때문에 new 불가.
		Calendar cal = Calendar.getInstance();
		 
		System.out.println(cal); // cal.toString() 동일
		
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get((Calendar.MONTH)+1);	// 1월: 0, 12월: 11 로 계산한다. 그래서 MONTH에는 +1 해주어야한다.
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println("년: " + year);
		System.out.println("월: " + month);
		System.out.println("일: " + day);
		System.out.println("시: " + hour);
		System.out.println("분: " + minute);
		System.out.println("초: " + second);
		
		//특정 날짜 설정
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2019, 12, 15);
		
		System.out.println("년:" + cal2.get(Calendar.YEAR));
		System.out.println("월:" + (cal2.get(Calendar.MONTH)));
		System.out.println("일:" + cal2.get(Calendar.DAY_OF_MONTH));
		
		
		
	}

}
