package demo1;
/**
 * 日期的写法
 * date转字符串
 * 
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatetoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();
//		long time = d.getTime();
//		System.out.println(time);
		System.out.println(d);
		String ss= d.toString();
		ss=ss.replace("Mon", "周一").replace("Oct", "十月");
		System.out.println(ss);
		String dateFormat = "yyyy年-MM月-dd日 HH:mm:ss E a";
		SimpleDateFormat sd = new SimpleDateFormat(dateFormat);
		System.out.println(sd.format(d));
		

	}

	public static void dosome(Object obj) {

	}

}
