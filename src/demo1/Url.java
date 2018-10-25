package demo1;

public class Url {
	/**
	 * 提取域名
	 * @param args
	 */
	public static void main(String[] args) {
		String www= "www.laoyu.com";
		int dian1 = www.indexOf(".");
		int dian2 = www.lastIndexOf(".");
		System.out.println("第一个点的位置是:"+dian1);
		System.out.println("第二个点的位置是:"+dian2);
		String ok = www.substring(dian1+1, dian2);
		System.out.println("域名是:"+ok);
		ok.trim();
	}

}
