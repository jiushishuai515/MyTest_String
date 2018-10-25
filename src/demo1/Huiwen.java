package demo1;

public class Huiwen {

	/**
	 * 判断是不是回文
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="老于老";
		System.out.println(str.length());
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
				System.out.println("不是回文");
				return;
			}
		}
		System.out.println("是回文");

	}

}
