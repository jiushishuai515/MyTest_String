 package demo1;

import java.util.Scanner;

public class Code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * ��֤��ƥ��
		 */
		String code = "Hwfs";
		System.out.println("��������֤��:" + code);
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		code = code.toLowerCase();
		input = input.toLowerCase();
		if (code.equals(input)) {
			System.out.println("��֤�ɹ�");
		} else {
			System.out.println("��֤ʧ��");
		}

	}

}
