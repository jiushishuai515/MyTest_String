package demo1;
/**
 * 验证是否是身份证号
 * @author Older_Fisher
 *    \d{15}(\d{2}[0-9xX])?
 */

public class Id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "150402199303080617";
		String regex = "\\d{15}(\\d{2}[0-9xX])?";
		if(id.matches(regex)){
			System.out.println("是身份证号");
		}else{
			System.out.println("不是身份证号");
		}

	}

}
