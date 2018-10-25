package demo1;

import java.util.Random;
import java.util.Scanner;

public class Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 生成随机验证码
		 */
		Random random = new Random();
		String code = "";
		random.nextInt();
		for (int i = 0; i < 5; i++) {
			switch (random.nextInt(3)) {
			case 0:
				code += (char) (random.nextInt(26) + 'a');
				break;
			case 1:
				code += random.nextInt(10);
				break;
			case 2:
				code += (char) (random.nextInt(26) + 'A');
				break;
			}
		}
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
