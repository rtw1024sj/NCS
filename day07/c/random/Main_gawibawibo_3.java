package my.day07.c.random;

import java.util.Random;
import java.util.Scanner;

/*
============= 메뉴 ==============
1.가위 2.바위 3.보 4.게임종료
================================
>> 선택하세요 => 5엔터
[경고] 메뉴에 존재하지 않는 번호입니다!!

>> 선택하세요 => 똘똘이엔터
[경고] 정수로만 입력하세요!!

>> 선택하세요 => 2
>> 사용자님이 이겼습니다!!^^   이긴경우
>> 사용자님이 졌습니다ㅜㅜ     진경우
>> 비겼습니다~~             비긴경우

============= 메뉴 ==============
1.가위 2.바위 3.보 4.게임종료
================================
>> 선택하세요 => 4

>> 프로그램 종료 <<
*/

public class Main_gawibawibo_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		int choice_num = 0;
//		int certification_key = 0;

		do {
			System.out.println("============= 메뉴 ==============\n" + "1.가위 2.바위 3.보 4.게임종료\n"
					+ "================================\n");

			System.out.print(">> 선택하세요 => ");
			try {
				choice_num = Integer.parseInt(sc.nextLine()); // 5
																// 똘똘이
																// 1 ~ 4

				if (!(1 <= choice_num && choice_num <= 4)) {
					System.out.println("[경고] 메뉴에 존재하지 않는 번호입니다!!");
					continue;
				}

				if (choice_num != 4) {
					// 사용자가 1 또는 2 또는 3 을 낸 경우

					/*
					 * PC 도 1 또는 2 또는 3 중에 하나를 랜덤하게 내야 한다. // 처음 얼마부터 마지막 얼마까지 랜덤한 정수 // ==>
					 * rndom.nextInt(마지막 수 - 처음 수 + 1) + 처음 수;
					 */

				}

				int pc_num = rnd.nextInt(3 - 1 + 1) + 1;
//				certification_key += pc_num;

				/*
				 * if (choice_num == 1) { // 랜덤한 숫자 1 부터 3 까지 발생시킨다. if (certification_key == 1)
				 * { System.out.println(">> 비겼습니다~~"); } else if (certification_key == 2) {
				 * System.out.println(">> 사용자님이 졌습니다ㅜㅜ"); } else {
				 * System.out.println(">> 사용자님이 이겼습니다!!^^"); }
				 * 
				 * }
				 * 
				 * if (choice_num == 2) { // 랜덤한 숫자 1 부터 3 까지 발생시킨다. if (certification_key == 1)
				 * { System.out.println(">> 사용자님이 이겼습니다!!^^"); } else if (certification_key ==
				 * 2) { System.out.println(">> 비겼습니다~~"); } else {
				 * System.out.println(">> 사용자님이 졌습니다ㅜㅜ"); }
				 * 
				 * }
				 * 
				 * if (choice_num == 3) { // 랜덤한 숫자 1 부터 3 까지 발생시킨다. if (certification_key == 1)
				 * { System.out.println(">> 사용자님이 졌습니다ㅜㅜ"); } else if (certification_key == 2) {
				 * System.out.println(">> 사용자님이 이겼습니다!!^^"); } else {
				 * System.out.println(">> 비겼습니다~~"); }
				 * 
				 * }
				 */

				String msg = "";

				// 사용자가 이긴 경우
				if ((choice_num == 1 && pc_num == 3) || 
					(choice_num == 2 && pc_num == 1) || 
					(choice_num == 3 && pc_num == 2)) {
					msg = ">> 사용자님이 이겼습니다!!^^";
				}

				// 사용자가 진 경우
				else if ((choice_num == 1 && pc_num == 2) || 
						(choice_num == 2 && pc_num == 3)  ||
						(choice_num == 3 && pc_num == 1)) {
					msg = ">> 사용자님이 졌습니다ㅜㅜ";
				}

				// 사용자와 PC가 비긴 경우
				else {
					msg = ">> 비겼습니다~~";
					continue;
				}

				System.out.println(msg);

			} catch (NumberFormatException e) {
				System.out.println("[경고] 정수로만 입력하세요!!");
			}

		} while (!(choice_num == 4));
		// end of do~while --------------------------------

		sc.close();
		System.out.println(">> 프로그램 종료 <<");

	} // end of main() ---------------

}
