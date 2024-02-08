package my.day03.c.scanner;

import java.util.Scanner;

public class Main_Scanner_1 {

	public static void main(String[] args) {

		// System.in 은 입력장치(키보드) 를 말한다.
		// System.out 은 출력장치(모니터) 를 말한다.

		Scanner sc = new Scanner(System.in);

		System.out.print("1.문장을 입력하세요 => ");
		String inputStr = sc.nextLine();
		/*
		 * sc.nextLine(); 은 키보드로 부터 입력받은 문장을 읽어들이는 것인데, 엔터(종결신호)까지 모두 읽어들인 후 스캐너
		 * 버퍼(쌓아두는것==sc)에 아무것도 남기지 않는다.
		 */
		System.out.println("입력한 문장 => " + inputStr);

		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		System.out.print("2.정수를 입력하세요 => ");
//		Byte inputNum1 = sc.nextByte();
//		Short inputNum2 = sc.nextShort();
		int inputNum = sc.nextInt();
//		long inputNum4 = sc.nextLong();

		sc.nextLine(); // 스캐너(sc) 버퍼에 남아있는 것을 비우는(제거하는) 효과를 가진다.

		/*
		 * 위의 4개 전부 포함되지만 sc.nextInt(); 를 예로 들어 설명하자면 sc.nextInt(); 는 정수(int)를 읽어들이는 것인데
		 * 종결자가 공백 또는 엔터이다. 종결자(공백 또는 엔터) 앞까지의 입력해준 정수를 읽어온다. sc.nextInt(); 를 사용하면
		 * 스캐너(sc)버퍼에는 종결자(공백 또는 엔터)가 삭제되는 것이 아니라 그대로 남아 있게 된다.
		 * 
		 * 예) 키보드 입력 : 12 34 결과 : 12 그리고 sc 안에는 아직 34가 남아있다.
		 */
		System.out.println("입력한 정수 => " + inputNum);

		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		System.out.print("3.실수를 입력하세요 => ");
//		float inputFlt = sc.nextFloat();
		double inputDbl = sc.nextDouble();
		/*
		 * sc.nextDouble(); 는 정수(double)를 읽어들이는 것인데 종결자가 공백 또는 엔터이다. 종결자(공백 또는 엔터) 앞까지의
		 * 입력해준 실수를 읽어온다. sc.nextDouble(); 를 사용하면 스캐너(sc)버퍼에는 종결자(공백 또는 엔터)가 삭제되는 것이 아니라
		 * 그대로 남아 있게 된다.
		 * 
		 * 예) 키보드 입력 : 12 34 결과 : 12 그리고 sc 안에는 아직 34가 남아있다.
		 */

		sc.nextLine(); // 스캐너(sc) 버퍼에 남아있는 것을 비우는(제거하는) 효과를 가진다.

		System.out.println("입력한 실수 => " + inputDbl);

		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		System.out.print("4.단어를 입력하세요 => ");
		String input_word = sc.next();
		/*
		 * sc.next(); 은 단어를 읽어들이는 것인데 종결자가 공백 또는 엔터이다. 예) 키보드 입력 : 안녕 하세요 결과 : 안녕
		 * 
		 * 키보드 입력 : 안녕하세요 결과 : 안녕하세요
		 */

		sc.nextLine(); // 스캐너(sc) 버퍼에 남아있는 것을 비우는(제거하는) 효과를 가진다.

		System.out.println("입력한 단어 => " + input_word);

		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		System.out.print("4.새로운 문장을 입력하세요 => ");
		String input_str2 = sc.nextLine();

		System.out.println("입력한 문장 => " + input_str2);

		sc.close();
	}

}
