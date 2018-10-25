package demo1;
/**
 * split的用法  拆分字符串   str.split(String "正则表达式")
 * @author Older_Fisher
 *
 */

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = ",,bo,,ss,jack,tom,marry,,,";
		String [] array = str.split(",");
		// split拆分时   字符串后面切不出空字符串   但是前面和中间都会切出空字符串
		for(int i=0;i<array.length;i++) {			
			System.out.println(array[i]);
		}

	}

}
