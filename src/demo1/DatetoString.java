package demo1;
/**
 * ���ڵ�д��
 * dateת�ַ���
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
		ss=ss.replace("Mon", "��һ").replace("Oct", "ʮ��");
		System.out.println(ss);
		String dateFormat = "yyyy��-MM��-dd�� HH:mm:ss E a";
		SimpleDateFormat sd = new SimpleDateFormat(dateFormat);
		System.out.println(sd.format(d));
		

	}

	public static void dosome(Object obj) {

	}

}
