package demo1;
/**
 * ��֤�Ƿ�������
 * @author Older_Fisher
 *
 */

public class Email2 {

	public static void main(String[] args) {
		/**
		 * �ַ�������
		 */
		// TODO Auto-generated method stub
		String mail = "674201962@qq.com";
		System.out.println("lenth:"+mail.length());
		int index = mail.indexOf("@");
		int indexm = mail.indexOf("m");
		System.out.println("m��λ����"+indexm);
		if (index > 0 && index < mail.length() - 1) {
			System.out.println("������");
		}else {
			System.out.println("��������");
		}

	}

}
