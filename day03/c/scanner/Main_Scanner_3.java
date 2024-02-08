package my.day03.c.scanner;

import java.util.Scanner;

public class Main_Scanner_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세요 => ");

		String inputStr = sc.nextLine();

		try {
			// 문자열(String)을 int 타입으로 형변환 시켜주는 메소드가 있다.
//		byte n = (byte)(Byte.parseByte(inputStr) + 10);	//	계산식일 때 int 로 자동적으로 바뀌기 때문에 byte 로 형변환을 하기 위해 ( ) 를 넣었다.
//		short n = (short)(Short.parseShort(inputStr) + 10);	//	계산식일 때 int 로 자동적으로 바뀌기 때문에 short 로 형변환을 하기 위해 ( ) 를 넣었다.		
//		long n = Long.parseLong(inputStr) + 10;	
			int n = Integer.parseInt(inputStr) + 10; // 문자열 "123" => 정수형 123 으로 형변환

			System.out.println("입력한 정수 " + inputStr + "에 10을 더한 값 : " + n);

		} catch (NumberFormatException e) {
			System.out.println("[경고] >> " + inputStr + "는 정수가 아닙니다. 정수만 입력하세요!! <<");
		}

		sc.close();
	}

}
