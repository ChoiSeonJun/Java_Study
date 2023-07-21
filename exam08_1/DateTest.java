package exam08_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) throws Exception {
	
		// 날짜 데이터
		Date d = new Date();	//참조변수
		
		System.out.println(d); // d.toString() 동일, 재정의 됨

		// java.text.SimpleDateFormat 클래스와 병행해서 사용한다.
		// 가. Date 타입  ----> String
		// Fri Jul 21 15:30:15 KST 2023 ==> 특정 포맷을 가진 문자열로 변경
		
//		SimpleDateFormat sdf = new SimpleDateFormat("MM"); // YYYY, MM, dd, HH, mm, ss
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd, HH:mm:ss"); // YYYY, MM, dd, HH, mm, ss
		String result = sdf.format(d);
		System.out.println(result);
		
		// 나. String --> Date
		String s = "2023년05월13일";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년MM월dd일");
		Date d2 = sdf2.parse(s);
		System.out.println(d2);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d2);
	}
	

}
