package demo1;
/**
 * ������ʽ   ��ʾ�����ַ
 * @author Older_Fisher
 *�����ַ�ı�ʾ     [a-z0-9A-Z]+@[a-z0-9A-Z]+(\.[a-zA-Z]+)+
 */

public class Email {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="[a-z0-9A-Z]+@[a-z0-9A-Z]+(\\.[a-zA-Z]+)+";
		String mail="674201962@qq.com";
		Boolean match = mail.matches(str);
		if(match) {
			System.out.println("������");
		}else {
			System.out.println("��������");
		}
	}

}
