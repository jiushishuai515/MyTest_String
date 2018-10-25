package demo1;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2018);
		c.set(Calendar.MONTH, Calendar.DECEMBER);
		c.set(Calendar.DATE, 30);
		c.set(Calendar.HOUR_OF_DAY, 18);
		c.set(Calendar.MINUTE, 34);
		c.set(Calendar.SECOND, 33);
		Date date = c.getTime();
		System.out.println(date);

	}
}

