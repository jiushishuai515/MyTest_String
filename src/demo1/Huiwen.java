package demo1;

public class Huiwen {

	/**
	 * �ж��ǲ��ǻ���
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="������";
		System.out.println(str.length());
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
				System.out.println("���ǻ���");
				return;
			}
		}
		System.out.println("�ǻ���");

	}

}
