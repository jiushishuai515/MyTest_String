package demo1;
/**
 * String Builder�÷�
 * @author Older_Fisher
 *
 */

public class Stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("���������˹�");
		System.out.println(sb);
		sb.replace(5,6, "��");
		System.out.println(sb);
		sb.insert(5, "��");
		System.out.println(sb);
		
	}

}
