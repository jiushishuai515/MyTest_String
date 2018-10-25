package demo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 字符串转date
 * @author Older_Fisher
 *
 */

public class StringtoDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String date = "yyyy-MM-dd";
		System.out.println("请输入生日:");
		Scanner scan = new Scanner(System.in);	
		String inputBirth = scan.nextLine();
		date.equals(inputBirth);
		scan.close();
		SimpleDateFormat sdf = new SimpleDateFormat(date);
		System.out.println("你已经活了 "+(new Date().getTime()-sdf.parse(inputBirth).getTime())/24/60/60/1000+"天");	

	}

}
