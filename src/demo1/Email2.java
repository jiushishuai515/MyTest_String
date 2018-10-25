package demo1;
/**
 * 验证是否是邮箱
 * @author Older_Fisher
 *
 */

public class Email2 {

	public static void main(String[] args) {
		/**
		 * 字符串索引
		 */
		// TODO Auto-generated method stub
		String mail = "674201962@qq.com";
		System.out.println("lenth:"+mail.length());
		int index = mail.indexOf("@");
		int indexm = mail.indexOf("m");
		System.out.println("m的位置是"+indexm);
		if (index > 0 && index < mail.length() - 1) {
			System.out.println("是邮箱");
		}else {
			System.out.println("不是邮箱");
		}

	}

}
