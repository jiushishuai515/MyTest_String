package demo1;
/**
 * String Builder用法
 * @author Older_Fisher
 *
 */

public class Stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append("我真是日了狗");
		System.out.println(sb);
		sb.replace(5,6, "磊");
		System.out.println(sb);
		sb.insert(5, "高");
		System.out.println(sb);
		
	}

}
