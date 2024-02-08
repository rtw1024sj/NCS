package my.day04.d.calcurator;

import java.util.Scanner;

public class Main_calcurator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String input_str = "";

		try {
			System.out.print("▣ 첫번째 정수 입력 => ");
			input_str = sc.nextLine();
			int num1 = Integer.parseInt(input_str); // 문자열을 정수로 형변환 시킨다.

			// 10
			// 3000000000
			// 똘똘이

			System.out.print("▣ 두번째 정수 입력 => ");
			input_str = sc.nextLine();
			int num2 = Integer.parseInt(input_str); // 문자열을 정수로 형변환 시킨다.
													// 4
													// 5000000000
													// 헤헤헤

			System.out.print("▣ 사칙연산을 선택하세요(+ - * /) : "); // + - * /
															// 히히히히
															// #
															// 7

			String operator = sc.nextLine();

			String result = "";
			double calc_result = 0;
			if ("+".equals(operator)) {
				calc_result = num1 + num2;

			} else if ("-".equals(operator)) {
				calc_result = num1 - num2;
			} else if ("*".equals(operator)) {
				calc_result = num1 * num2;
			} else if ("/".equals(operator)) {
				calc_result = (double) num1 / num2;
			} else {
				// 사칙연산 선택시 + - * / 를 제외한 다른 것을 입력한 경우
				System.out.print("[경고] 사칙연산 선택은 + - * / 만 입력하세요!!");
				sc.close();
				return; // 종료
			}

			// 인데 result 에 나머지가 없을 경우 calc_result 를 int 형으로 출력
			if ("/".equals(operator)) {
				if(num1 % num1 == 0) {
					result = num1 + operator + num2 + "=" + (int) calc_result;	
				} else {	// 나머지가 있을 경우 double 로 출력
				result = num1 + operator + num2 + "=" + calc_result;
				}
			} else {	// + - * 일 경우 calc_result 를 int 형으로 출력
				result = num1 + operator + num2 + "=" + (int) calc_result;
			}
			// 10 + 4 = 14
			// 10 - 4 = 6
			// 10 * 4 = 40
			// 10 / 4 = 2.5

			System.out.println(result);
			// 10 + 4 = 14
			// 10 - 4 = 6
			// 10 * 4 = 40
			// 10 / 4 = 2.5

		} catch (NumberFormatException e) {
			System.out.println(">>>" + input_str + " 는 올바른 데이터가 아닙니다. 올바른 정수를 입력해주세요!!!<<<\n");
		} catch (ArithmeticException e) {	// 0 으로 나눴을 경우 에러가 뜨기 때문에 ArithmeticException 로 예외처리
			System.out.println(">>> 0 으로 나눌 수 없습니다.");
		}

		sc.close();
	} // end of static

}
