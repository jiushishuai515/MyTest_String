package demo1;
/**
 * split���÷�  ����ַ���   str.split(String "������ʽ")
 * @author Older_Fisher
 *
 */

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = ",,bo,,ss,jack,tom,marry,,,";
		String [] array = str.split(",");
		// split���ʱ   �ַ��������в������ַ���   ����ǰ����м䶼���г����ַ���
		for(int i=0;i<array.length;i++) {			
			System.out.println(array[i]);
		}

	}

}
