package demo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class After3Y3M3DWeek3 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("输入一个日期:");
		Scanner scan = new Scanner(System.in);
		String inputDate = scan.nextLine();
		scan.close();
		String simple = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(simple);
		Date date = sdf.parse(inputDate);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.YEAR, 3);
		c.add(Calendar.MONTH, 3);
		c.add(Calendar.DAY_OF_YEAR, 3);
		c.set(Calendar.DAY_OF_WEEK, 4);
		date =c.getTime();
		String outputDate = sdf.format(date);
		System.out.println(outputDate);

	}

}
