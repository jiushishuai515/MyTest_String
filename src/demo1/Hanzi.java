package demo1;
/**
 * ������к���
 * @author Older_Fisher
 *
 */
public class Hanzi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char c='\u4e00',i=0;c<='\u9fa5';i++,c++) {
			System.out.print(c);
			if(i%50==0) {
				System.out.println();
				
			}
		}

	}

}
