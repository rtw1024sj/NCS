package my.day03.c.scanner;

import java.util.Scanner;

public class Main_Scanner_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str_no = ""; // 멤버 변수를 사용하지 않고 try 안에서 지역변수를 사용할 경우 catch 에서 인식을 못한다.

		try {
			System.out.print("1.첫번째 정수 입력 : ");
			str_no = sc.nextLine(); // 키보드 입력된 값을 str_no에 넣고
			int first_no = Integer.parseInt(str_no); // 키보드 입력된 값을 str_no 값을 int 로 형변환시켜 first_no 에 저장시킨다.

			System.out.print("2.두번째 정수 입력 : ");
			str_no = sc.nextLine(); // 키보드 입력된 값을 str_no에 넣고 (첫번째 정수 입력에서 입력된 값을 두번째 정수 입력에서 입력된 값으로 초기화)
			int second_no = Integer.parseInt(str_no); // 키보드 입력된 값을 str_no 값을 int 로 형변환시켜 second_no 에 저장시킨다.

			System.out.println(">> " + first_no + " + " + second_no + " = " + (first_no + second_no));
			// first_no 에 저장된 값과 second_no 에 저장된 값을 더한 값을 출력한다.
		} catch (NumberFormatException e) { // parseInt 에 마우스를 올려놓으면 나오는 글에서 보면 throws NumberFormatException 라고 나온다.
			System.out.println("[경고] >> " + str_no + "는 정수가 아닙니다. 정수만 입력하세요!! <<");
			// 키보드에 입력된 값이 str_no 에 저장되기 때문에 첫번째 혹은 두번째 정수에서 int 범위를 벗어나는 값이나 문자를 사용시 위의
			// 메시지가 출력된다.
		}

		sc.close();

	}

}
