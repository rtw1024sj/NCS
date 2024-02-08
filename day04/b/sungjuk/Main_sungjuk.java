package my.day04.b.sungjuk;

import java.util.Scanner;

public class Main_sungjuk {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Sungjuk sj = new Sungjuk(); // Sungjuk 클래스를 sj

		System.out.print("1. 학번 : ");
		sj.hakbun = sc.nextLine(); // 091234

		System.out.print("2. 성명 : ");
		sj.name = sc.nextLine(); // 이순신

		String input_str = "";
		int status = 0;	// 점수를 입력해주는 상태 : 1
						// 나이를 입력해주는 상태 : 2
				
		try {
			status = 1;
			System.out.print("3. 국어 : ");

			// === *** 유효성 검사하기(올바른 데이터인지 틀린 데이터인지 확인하는 검사) *** === //
			input_str = sc.nextLine();
			byte kor = Byte.parseByte(input_str); // 90
														// 101
														// 2343242
														// "똘똘이"
			if (!sj.check_jumsu(kor)) {
				sc.close();
				return;
			} else {
				sj.kor = kor;
			}

			status = 1;
			System.out.print("4. 영어 : ");

			// === *** 유효성 검사하기(올바른 데이터인지 틀린 데이터인지 확인하는 검사) *** === //
			input_str = sc.nextLine();
			byte eng = Byte.parseByte(input_str); // 100
														// -20
														// 2343242
														// "호호하하하"
			if (!sj.check_jumsu(eng)) {
				sc.close();
				return;
			} else {
				sj.eng = eng;
			}

			status = 1;
			System.out.print("5. 수학 : ");

			// === *** 유효성 검사하기(올바른 데이터인지 틀린 데이터인지 확인하는 검사) *** === //
			input_str = sc.nextLine();
			byte math = Byte.parseByte(input_str); // 100
														// -20
														// 2343242
														// "호호하하하"
			if (!sj.check_jumsu(math)) {
				sc.close();
				return;
			} else {
				sj.math = math;
			}
		
			status = 2;
			System.out.print("6. 나이 : ");

			// === *** 유효성 검사하기(올바른 데이터인지 틀린 데이터인지 확인하는 검사) *** === //
			input_str = sc.nextLine();	//25
										//70
										//50000
										// "홍대클럽"
			short age = Short.parseShort(input_str);
			
			if (!sj.check_age(age)) {
				sc.close();
				return;
			} else {
				sj.age = age;
			}
			

			System.out.println("=============================================");
			// 성적 출력하기
			sj.sungjuk_print();
			
			
		} catch (NumberFormatException e) {
			
		//	e.printStackTrace();
		//	System.out.println(e.getMessage());
			
			
			/*
			System.out.println(">> 입력하신 " + input_str + " 는 올바른 데이터가 아닙니다. <<\n"
					+ " [점수에 대한 경고] 점수는 0 ~ 100 까지의 정수만 입력하세요!!");
			*/
			
			/*
			 * //점수를 입력해주는 상태이라면
			if (sj.check_jumsu(kor) || sj.check_jumsu(eng) || sj.check_jumsu(math)) {
			System.out.println(">> 입력하신 " + input_str + " 는 올바른 데이터가 아닙니다. <<\n"
							+ " [점수에 대한 경고] 점수는 0 ~ 100 까지의 정수만 입력하세요!!");
			} 
			//나이를 입력해주는 상태이라면
			else {
			System.out.println(">> 입력하신 " + input_str + " 는 올바른 데이터가 아닙니다. <<\n"
					+ " [나이에 대한 경고] 점수는 20 ~ 50 까지의 정수만 입력하세요!!");
			}
			*/
			// check_jumsu(byte) 와 check_age(short) 는 내가 정한 점수와 연령값을 넘었을 때를 대비한 메소드이다.
			
			System.out.print(">> 입력하신 " + input_str + " 는 올바른 데이터가 아닙니다. <<\n");
			
			//점수를 입력해주는 상태이라면
			if (status == 1) {
				System.out.println("[점수에 대한 경고] 점수는 0 ~ 100 까지의 정수만 입력하세요!!");

			//나이를 입력해주는 상태이라면
			} else {
				System.out.println("[나이에 대한 경고] 점수는 20 ~ 50 까지의 정수만 입력하세요!!");				
			}
			
		}
		sc.close();
	}
}
