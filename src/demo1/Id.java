package demo1;
/**
 * ��֤�Ƿ������֤��
 * @author Older_Fisher
 *    \d{15}(\d{2}[0-9xX])?
 */

public class Id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "150402199303080617";
		String regex = "\\d{15}(\\d{2}[0-9xX])?";
		if(id.matches(regex)){
			System.out.println("�����֤��");
		}else{
			System.out.println("�������֤��");
		}

	}

}
