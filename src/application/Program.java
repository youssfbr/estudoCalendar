package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-09-04T14:50:07Z"));
		
		System.out.println(d);
		System.out.println(sdf.format(d));
		System.out.println("-------------------------------------------------");
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		/*cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		System.out.println(d);
		System.out.println(sdf.format(d));*/
		
		//Obtendo uma unidade de tempo
		int minutes = cal.get(Calendar.MINUTE);
		System.out.println("Minutes: " + minutes);
	}
}
