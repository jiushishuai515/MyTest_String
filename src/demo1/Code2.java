 package demo1;

import java.util.Scanner;

public class Code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 验证码匹配
		 */
		String code = "Hwfs";
		System.out.println("请输入验证码:" + code);
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		code = code.toLowerCase();
		input = input.toLowerCase();
		if (code.equals(input)) {
			System.out.println("验证成功");
		} else {
			System.out.println("验证失败");
		}

	}

}
