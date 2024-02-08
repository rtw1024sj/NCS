package my.day04.a.wrapper;

import java.util.Scanner;

/*
=== *** wrapper 클래스 *** ===

------------------------------------------------
  기본자료형(원시형, primitive)     wrapper 클래스
------------------------------------------------
 byte                           Byte 
 short                          Short
 int                            Integer  
 long                           Long
 char                           Character
 float                          Float
 double                         Double
 boolean                        Boolean 
 ------------------------------------------------
 
  기본자료형(원시형)은 데이터 저장 및 4칙연산 에서만 사용하는 것이고, 
  wrapper 클래스는  데이터 저장 및 4칙연산 뿐만아니라 
  아주 다양한 기능의 메소드가 제공되므로 다방면으로 사용되어진다. 
*/

public class Main_wrapper {

	public static void main(String[] args) {

		char ch = 'a';
		System.out.println("ch => " + ch); // ch => a
		System.out.println(ch + 1); // (int)ch+1 97+1 결과 : 98
		System.out.println((char) (ch - 32)); // (int)ch-32 == 97-32 == 65 결과 : A

//		Character chr = new Character('a');	
		// 생성자 Character(char) 는 더 이상 사용되지 않으며 제거 대상으로 표시되었다.
		// java.1.8에서는 경고가 아니지만 11 이상부터는 몇 년 이내로 사용이 불가해진다.

		Character chr = Character.valueOf('a');
		System.out.println("chr => " + chr); // chr => a

		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		System.out.println((char) ('a' - 32)); // A
		System.out.println(Character.toUpperCase('a')); // A (대문자로 변경)
		System.out.println(Character.toLowerCase('A')); // a (소문자로 변경)
		System.out.println(Character.toUpperCase(97)); // 65 (대문자로 변경, 입력값이 int 이기에 리턴(결과) 또한 int)
		System.out.println(Character.toLowerCase(65)); // 97

		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		char ch2 = '5';

		// 대문자 'A' 는 65, 소문자 'a' 는 97, 숫자 0 은 48

		if ('A' <= ch2 && ch2 <= 'Z') { // 대문자 인지 알아본다.
			System.out.println(ch2 + " 는 대문자 입니다.");
		}

		else if ('a' <= ch2 && ch2 <= 'z') { // 소문자 인지 알아본다.
			System.out.println(ch2 + " 는 소문자 입니다.");
		}

		else if ('0' <= ch2 && ch2 <= '9') { // 숫자 인지 알아본다.
			System.out.println(ch2 + " 는 숫자 입니다.");
		}

		else {
			System.out.println(ch2);

		}

		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		// 대문자 'A' 는 65, 소문자 'a' 는 97, 숫자 0 은 48

		if (Character.isUpperCase(ch2)) { // 대문자 인지 알아본다.(대문자 이면 true, 아니면 false)
			System.out.println(ch2 + " 는 대문자 입니다.");
		}

		else if (Character.isLowerCase(ch2)) { // 소문자 인지 알아본다.(소문자 이면 true, 아니면 false)
			System.out.println(ch2 + " 는 소문자 입니다.");
		}

		else if (Character.isDigit(ch2)) { // 숫자 인지 알아본다.
			System.out.println(ch2 + " 는 숫자 입니다.");
		}

		else {
			System.out.println(ch2);

		}

		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		// 대문자 'A' 는 65, 소문자 'a' 는 97, 숫자 0 은 48

		if (Character.isUpperCase(ch2)) { // 대문자 인지 알아본다.(대문자 이면 true, 아니면 false)
			System.out.println(ch2 + " 는 대문자 입니다.");
		}

		else if (Character.isLowerCase(ch2)) { // 소문자 인지 알아본다.(소문자 이면 true, 아니면 false)
			System.out.println(ch2 + " 는 소문자 입니다.");
		}

		else if (Character.isDigit(ch2)) { // 숫자 인지 알아본다.
			System.out.println(ch2 + " 는 숫자 입니다.");
		}

		else {
			System.out.println(ch2);

		}

		System.out.println("\n=============================\n");
//	★==================================★	//			
		String str = "Baby";
		// index 0123
		// 인덱스 순서에 단어 저장 , 시작은 1이 아니라 0번째이다.

		char ch1 = str.charAt(0); // B (str == "B(0)a(1)b(2)y(3)" 에서 0번째인 B가 저장)
		System.out.println(ch1); // B

		ch1 = str.charAt(3); // Y
		System.out.println(ch1); // Y
//	★==================================★	//		

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println(">> 글자 1개만 입력하세요 => ");
		 * 
		 * String input_str = sc.nextLine(); // Java // I am a boy ==> 첫글자 I 은(는) 대문자
		 * 입니다. // superman ==> 첫글자 s 은(는) 소문자 입니다. // 8080 tomcat ==> 첫글자 8 은(는) 숫자
		 * 입니다. // @gmail.com ==> 첫글자 @ 은(는) 기타문자 입니다. // 안녕하세요 goodmoring ==> 첫글자 안
		 * 은(는) 한글 입니다. // 좋은하루 되세요 ==> 첫글자 은(는) 공백 입니다.
		 * 
		 * 
		 * char c = input_str.charAt(0);
		 * 
		 * if (Character.isUpperCase(c)) { // 대문자 인지 알아본다.(대문자 이면 true, 아니면 false)
		 * System.out.println(c + " 는 대문자 입니다."); }
		 * 
		 * else if (Character.isLowerCase(c)) { // 소문자 인지 알아본다.(소문자 이면 true, 아니면 false)
		 * System.out.println(c + " 는 소문자 입니다."); }
		 * 
		 * else if (Character.isDigit(c)) { // 숫자 인지 알아본다. System.out.println(c +
		 * " 는 숫자 입니다."); }
		 * 
		 * else { System.out.println(c + " 는 특수문자 입니다.");
		 * 
		 * }
		 */

		System.out.println("\n=============================\n");

		Scanner sc = new Scanner(System.in);

		System.out.print(">> 글자 1개만 입력하세요 => ");

		String input_str = sc.nextLine(); // Java
		// I am a boy ==> 첫글자 I 은(는) 대문자 입니다.
		// superman ==> 첫글자 s 은(는) 소문자 입니다.
		// 8080 tomcat ==> 첫글자 8 은(는) 숫자 입니다.
		// 안녕하세요 goodmoring ==> 첫글자 안 은(는) 한글 입니다.
		// 좋은하루 되세요 ==> 첫글자 은(는) 공백 입니다.
		// @gmail.com ==> 첫글자 @ 은(는) 기타문자 입니다.

		char c = input_str.charAt(0);

		if (Character.isUpperCase(c)) { // 대문자 인지 알아본다.(대문자 이면 true, 아니면 false)
			System.out.print("첫글자 " + c + " 는 대문자 입니다.");
		}

		else if (Character.isLowerCase(c)) { // 소문자 인지 알아본다.(소문자 이면 true, 아니면 false)
			System.out.print("첫글자 " + c + " 는 소문자 입니다.");
		}

		else if (Character.isDigit(c)) { // 숫자 인지 알아본다.
			System.out.print("첫글자 " + c + " 는 숫자 입니다.");
		}

		else if ('가' <= c && c <= '힣') { // 한글 인지 알아본다.
//		else if (44032 <= 'c' && 'c' <= 55203) { // 한글 인지 알아본다. (Unicode로 44032 = '가', 55203 = '힣')
			System.out.print("첫글자 " + c + " 는 한글 입니다.");
		}

		else if (c == ' ') { // 공백 인지 알아본다.
			System.out.print("첫글자 " + c + " 는 공백 입니다.");
		}

		else {
			System.out.print("첫글자 " + c + " 는 특수문자 입니다.");

		}

		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		System.out.println("== 오토박싱, 오토언박싱 에 대해서 알아봅니다.==");

// Boxing(박싱, 포장을 하는것) 이란 ?
		// ==> 기본자료형(boolean, byte, short, int, long, char, float, double)으로 되어진 변수를
		// 객체타입인 Wrapper 클래스(Boolean, Byte, Short, Integer, Long, Character, Float,
		// Double)
		// 타입의 객체로 만들어주는 것을 말한다.

		int a1 = 10;

//		Integer a2 = new Integer(a1);	  // jdk 1.8 방식의 Boxing 방법
		Integer a2 = Integer.valueOf(a1); // jdk 11 방식의 Boxing
		System.out.println("a2 => " + a2); // a2 => 10

		int b1 = 10;
		Integer b2 = b1;	//	Auto Boxing
		System.out.println("b2 = > " + b2);		//	b2 => 10

// UnBoxing(언박싱, 포장을 푸는것) 이란?   
		// ==> Wrapper 클래스(Boolean, Byte, Short, Integer, Long, Character, Float,
		// Double)로
		// 되어져 있는 객체를 기본자료형(boolean, byte, short, int, long, char, float, double)으로
		// 만들어주는 것을 말한다.
		Integer a3 = Integer.valueOf(20);
		int a4 = a3.intValue(); // UnBoxing
		System.out.println("a4 => " + a4); // a4 => 20

		int a5 = Integer.valueOf(20);			//	Auto UnBoxing
		System.out.println("a5 = > " + a5);		//	a5 = 20 

		sc.close();
	}

}
