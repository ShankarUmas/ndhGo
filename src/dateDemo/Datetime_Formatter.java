package dateDemo;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datetime_Formatter {

	public static void main(String[] args) {
		LocalDateTime dtime = LocalDateTime.now();
   System.out.println("Before formatting: "+dtime);
   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-mm-yyyy  HH:MM:SS");
   String format = dtime.format(dtf);
   DayOfWeek ghh = dtime.getDayOfWeek();
   System.out.println(ghh);
   System.out.println("after formatting: "+format);
	}

}
