package my.day02.a.dataType;

/*
   === *** 자료형(Data Type) *** ===
   
   ※ 자료형의 종류
   
   1. 원시형 타입(Primitive Type)
   1.1  정수형(byte, short, int, long)
     -- 자바에서 정수형의 기본타입은 int 이다.
     -- 그러므로 정수형의 값이 -2,147,483,648 ~ 2,147,483,647 범위를 벗어난 것이라면 반드시 숫자뒤에 소문자 l 또는 대문자  L 을 붙여야 한다.  
            
      byte (1byte == 8bit)  : -2^7  ~ 2^7-1  ==> -128 ~ 127 
      short(2byte == 16bit) : -2^15 ~ 2^15-1 ==> -32,768 ~ 32,767
      int  (4byte == 32bit) : -2^31 ~ 2^31-1 ==> -2,147,483,648 ~ 2,147,483,647  
      long (8byte == 64bit) : -2^63 ~ 2^63-1 ==> -9,223,372,036,854,775,808 ~  9,223,372,036,854,775,807
   
   2. 참조형 타입(Reference Type)
   --> 메모리상에 저장되어진 객체(인스턴스)의 메모리 주소를 참조하는 것이다.
        예:  Member mbr = new Member();
        --> 참조형 타입(Reference Type)은 메모리상에 크기는 4byte 를 차지한다.  
   
 */

/*
=== 변수의 명명규칙 ===
1. 변수명의 길이에는 제한이 없다.
2. 대,소문자 구분이 있다.
3. 첫글자는 숫자는 안된다. 
4. 특수문자는 '_' 와 '$' 만 사용이 가능하다.
5. 예약어(예 package, import, public, class, String, int, float ...)는 변수명으로 사용불가하다. 
6. <권장사항이지 규칙은 아니다> 첫글자는 소문자로 시작하고, 단어와 단어가 결합된 경우이라면 두번째 단어부터 대문자로 시작하는 카멜기법을 사용하든지 또는 단어와 단어 사이에 _ 를 넣어주는 스네이크법을 사용한다.      
*/

/*	1.2 실수형(float, double) 
float(4byte)  : 단정밀도   소수점이하 7자리까지 표현됨.   135.3246235
double(8byte) : 배정밀도   소수점이하 15~16자리까지 표현됨. 135.3246234502345642
-- 자바에서 실수형의 기본타입은 double 이다. 
그러므로 실수값을 float 형태로 나타내기 위해서는 실수뒤에 반드시 소문자 f 또는 대문자 F를 붙여야 한다.
*/

/*	1.3 문자형(char)
char : 자바는 유니코드 체계를 사용하므로
       문자형 타입인 char 는 2byte 이며, 범위는 0 ~ 65535 이다.
       그래서 char 타입에는 문자 1개 또는 숫자(0~65535)도 올 수 있다.              
                         
UNICODE 표 참조 
http://www.tamasoft.co.jp/en/general-info/unicode.html                     
  
  === !!! 꼭 기억합시다 !!! ===
  int(4byte) 아래의 크기인  byte(1byte), short(2byte), char(2byte) 타입이 
       사칙연산(+ - * /)을 만나면 자동적으로 int 타입으로 자동 형변환이 발생된다.
  
  'A' => 65     'a' => 97
  'B' => 66     'b' => 98
  'C' => 67     'c' => 99
  
  '대문자' + 32 => 소문자에 해당하는 숫자
  '소문자' - 32 => 대문자에 해당하는 숫자
  
  '0' => 48
  '1' => 49
  '2' => 50
  '9' => 57
  ' ' => 32
*/
/*
1.4 참(true) 또는 거짓(false)을 담아주는 boolean 타입 
-- 크기가 1byte 이다.
*/

public class Sungjuk {

	String hakbun; // null 학번
	// 주의사항 ==> 모두 숫자로 입력한다고 해서 정수형 타입은 byte, short, int, long 을 사용하면 안되는 경우도 있다.
	// 예를 들어, 학번에 091234 을 입력하는 경우 정수형 타입을 사용하면 맨 앞의 0 은 없어지고 91234 되어지므로
	// 비록 모두 숫자이지만 맨 앞에 0 이 들어올수 있는 경우라면 반드시 String 타입으로 해야 한다.
	String name; // null 학생명
	byte kor; // 국어(0~100) 숫자(정수) byte 범위 == -128 ~ 127
	byte eng; // 영어(0~100) 숫자(정수) byte 범위 == -128 ~ 127
	byte math; // 수학(0~100) 숫자(정수) byte 범위 == -128 ~ 127

	char hakjum; // ' ' 학점 'A' 'B' 'C' 'D' 'F'

	// === 기능, 행위, behavior, method === //
	void sungjuk_print() {

		// int total = kor + eng + math;

		/*
		 * 자바에서 그 데이터 타입이 byte 또는 short 또는 char 인 변수가 사칙연산(+ - * /)을 만나면 자동적으로 그 변수의 데이터
		 * 타입은 int 로 변하게 되어있다.!!!! 즉, short total = kor + eng + math; 은 int total =
		 * (int)kor + (int)eng + (int)math; 으로 되어진다. 그래서 short 타입인 total 변수에는 int 타입의 값을
		 * 담을 수가 없다.
		 * 
		 * (int)kor 의 뜻은 byte 타입이 kor 을 int 타입으로 형변환(casting) 해라는 말이다.
		 */
		short total = (short) (kor + eng + math); // 0 ~ 300

		int avg1 = total / 3; // 10/4 => 2
								// 정수/정수 => 몫(정수)

		// 10.0/4 => 2.5
		// 10/4.0 => 2.5
		// 10.0/4.0 => 2.5
		// (float)10/4 => 2.5 //강제 형 변환
		// 10/(float)4 => 2.5 //강제 형 변환
		// (float)10/(float)4 => 2.5 //강제 형 변환

		// (double)10/4 => 2.5 //강제 형 변환
		// 10/(double)4 => 2.5 //강제 형 변환
		// (double)10/(double)4 => 2.5 //강제 형 변환

		double avg2 = total / 3.0;
		float avg3 = total / 3F;

		double avg4 = (double) total / 3; // 정수형 타입인 total 을 강제로 double 타입으로 형변환 시키는 것이다.(casting)
		float avg5 = (float) total / 3; // 정수형 타입인 total 을 강제로 float 타입으로 형변환 시키는 것이다.(casting)
		
		String money = "3000000000";
//		long money = 3000000000L;
		//	자바에서 정수는 기본적으로 int 타입을 취하므로 long 타입으로 나타내려면 
		//	숫자 뒤에 L 또는 l(소문자) 을 쓰면 된다.
		
		
		if(avg3 >= 90) {
			hakjum = 'A';	//char type은 오로지 글자 한 개만 사용 가능. ' ' 만 사용 가능 " " 사용불가)
		}
		
		else if(avg3 >= 80) {
			hakjum = 'B';	//char type은 오로지 글자 한 개만 사용 가능. ' ' 만 사용 가능 " " 사용불가)
		}
		
		else if(avg3 >= 70) {
			hakjum = 'C';	//char type은 오로지 글자 한 개만 사용 가능. ' ' 만 사용 가능 " " 사용불가)
		}
		
		else if(avg3 >= 60) {
			hakjum = 'D';	//char type은 오로지 글자 한 개만 사용 가능. ' ' 만 사용 가능 " " 사용불가)
		}
		
		else {
			hakjum = 'F';	//char type은 오로지 글자 한 개만 사용 가능. ' ' 만 사용 가능 " " 사용불가)
		} 
		
		
		 if (hakjum != 'A') {
			 money = "장학금 못받음";
//			 money = 0;
		 }

		 
		System.out.println("=== " + name + " 님의 성적 결과 ===\n" + 
							"1.학번 : " + hakbun + "\n" + 
							"2.성명 : " + name + "\n" + 
							"3.국어 : " + kor + "\n" + 
							"4.영어 : " + eng + "\n" + 
							"5.수학 : " + math + "\n" + 
							"6.총점 : " + total + "\n" + 
							"7.평균1 : " + avg1 + "\n" + 
							"8.평균2 : " + avg2 + "\n" + 
							"9.평균3 : " + avg3 + "\n" + 
							"10.평균4 : " + avg4 + "\n" + 
							"11.평균5 : " + avg5 + "\n" +
							"12.장학금 : " + money + "\n" +
							"13.학점 : " + hakjum + "\n");
		
		

	}
	
	// ==== boolean 타입 알아보기 ==== //
	static void boolean_print() {
		
		boolean bool_1 = true;
		System.out.println(bool_1);	// true
		
		bool_1 = false;
		System.out.println(bool_1);	// false
		
		bool_1 = (10 == 10);
		System.out.println(bool_1);	// true
		
		bool_1 = (10 == 20);
		System.out.println(bool_1);	// false
		
		bool_1 = (10 != 20);		//!= 는 같지 않다면
		System.out.println(bool_1);	// true 
		
		bool_1 = (10 != 10);		//!= 는 같지 않다면
		System.out.println(bool_1); //false
		
	}
	
	// ==== 문자형인 char 타입 알아보기 ==== //
	static void char_print() {
		// 자바는 char 타입을 표현할 때 unicode 를 사용한다.
		
		// 아스키(ASCII :  American Standard Code for Information Interchange)
		// 2진수(0,2), 8진수(0-7), 10진수(0-9), 16진수(00-FF)
		// digital 신호 --> 2진수(0,1) == Binary == Bit(비트는 0과 1로만 구성되어있다)
		// A B ... Z a b c ... z 0 1 2 ... 9 ! @ # ....
		// A 는 10진수로 65 로 보자. a 는 10진수로 97 로 보자
		// B 는 10진수로 66 로 보자. b 는 10진수로 98 로 보자
		// C 는 10진수로 67 로 보자. c 는 10진수로 99 로 보자
		// ....
		// Z 는 10진수로 90 로 보자. z 는 10진수로 122 로 보자
		// 대문자와 소문자의 간격 차이는 32 이다.
		// 0 은 10진수로 48 로 보자.
		// 1 은 10진수로 49 로 보자.
		// 2 은 10진수로 50 로 보자.
		// 3 은 10진수로 51 로 보자.
		// ....
		// 9 은 10진수로 57 로 보자.
		// ! 은 10진수로 33 로 보자.
		// @ 은 10진수로 64 로 보자.
		
		System.out.println(">>> unicode 에 대해서 알아보기 <<< \n");
		
		char ch1 = 'A';
		System.out.println(ch1);				// A
		System.out.println(ch1 + 0);			// 65 (UNICODE 값으로 나옴) (+ 0 을 해줘서 int 값으로 바뀌기 때문에)
		
		int n1 = 65;
		System.out.println(n1);					// 65
		System.out.println((char)65);			// A (형 변환을 통해 UNICODE 값 65인 대문자 A 로 출력)
		
		System.out.println(ch1 + 32);			// 65 + 32 ==> 97
		System.out.println((char)(ch1 + 32));	// 65 + 32 ==> 97 (UNICODE로 97은 소문자 a)
		
		char ch2 = 'a';
		System.out.println((char)(ch2 - 32));	// 형 변환을 통해 a 의 UNICODE 값 97 - 32 ==> 65 (65의 UNICODE 값 대문자 A로 출력)
		
		char ch3 = 9748;
		System.out.println(ch3);
		
		char ch4 = 44608;	// 김
		char ch5 = 49849;	// 승
		char ch6 = 51652;	// 진
		System.out.println(ch4+ch5+ch6);
		System.out.println("" + ch4+ch5+ch6);
		
	}

}
