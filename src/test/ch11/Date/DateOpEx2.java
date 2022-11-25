package test.ch11.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateOpEx2 {

	public static void main(String[] args) {
		//데이터 포맷 형태 
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");

		LocalDateTime startDateTime = LocalDateTime.of(2021,1,1,0,0); //2021-1-1 0:0:0
		System.out.println("시작일:"+startDateTime.format(dtf));
		
	}
}
