package demo1;

public class Url {
	/**
	 * ��ȡ����
	 * @param args
	 */
	public static void main(String[] args) {
		String www= "www.laoyu.com";
		int dian1 = www.indexOf(".");
		int dian2 = www.lastIndexOf(".");
		System.out.println("��һ�����λ����:"+dian1);
		System.out.println("�ڶ������λ����:"+dian2);
		String ok = www.substring(dian1+1, dian2);
		System.out.println("������:"+ok);
		ok.trim();
	}

}
