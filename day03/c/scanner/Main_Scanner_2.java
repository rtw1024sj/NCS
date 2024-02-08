package my.day03.c.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main_Scanner_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요 => ");

		try {
			int inputNum = sc.nextInt();
			sc.nextLine();

			System.out.println("입력한 정수 : " + inputNum);
		} catch (InputMismatchException e) { // 만약 int형이 감당할 수 없이 긴 숫자나 글자를 썼을 때를 대비한 것
			System.out.println(">> 경고 : 정수만 입력하세요!! <<");
			// e.printStackTrace(); // 어디가 오류인지 보여준다.
		}

		sc.close();
	}

}
