package demo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Baozhiqi {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("请输入生产日期:");
		String inputDate = scan.nextLine();
		System.out.println("请输入保质期:");
		String baozhiqi = scan.nextLine();
		int baozhiqii=Integer.parseInt(baozhiqi);
		scan.close();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date =sdf.parse(inputDate);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DAY_OF_YEAR, baozhiqii);
		c.set(Calendar.DAY_OF_WEEK,4);
		date=c.getTime();
		inputDate = sdf.format(date);
		System.out.println(inputDate);
		
		
	}

}
