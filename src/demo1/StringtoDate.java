package demo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * �ַ���תdate
 * @author Older_Fisher
 *
 */

public class StringtoDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String date = "yyyy-MM-dd";
		System.out.println("����������:");
		Scanner scan = new Scanner(System.in);	
		String inputBirth = scan.nextLine();
		date.equals(inputBirth);
		scan.close();
		SimpleDateFormat sdf = new SimpleDateFormat(date);
		System.out.println("���Ѿ����� "+(new Date().getTime()-sdf.parse(inputBirth).getTime())/24/60/60/1000+"��");	

	}

}
