package demo1;
/**
 * 正则表达式   表示邮箱地址
 * @author Older_Fisher
 *邮箱地址的表示     [a-z0-9A-Z]+@[a-z0-9A-Z]+(\.[a-zA-Z]+)+
 */

public class Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="[a-z0-9A-Z]+@[a-z0-9A-Z]+(\\.[a-zA-Z]+)+";
		String mail="674201962@qq.com";
		Boolean match = mail.matches(str);
		if(match) {
			System.out.println("是邮箱");
		}else {
			System.out.println("不是邮箱");
		}
	}

}
