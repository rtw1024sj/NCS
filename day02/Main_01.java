package my.day02;

// === 멤버 변수와 local(지역) 변수의 차이점에 대해서 알아본다. === //
// 멤버 변수 ==> instance 변수와 static 변수를 합친 것을 멤버변수라고 부른다. //


public class Main_01 {

	// instance 변수
	String id; // 문자열 타입
	String pwd;
	String name;
	String email;
	int age; // int 는 정수형 타입 
	double height; // double 은 실수형 타입
	char grade; // char 는 문자형 타입
	
	// 멤버(필드) 변수 파란색
	// 지역 변수 갈색
	
	/*
	   멤버 변수(instance 변수와 static 변수를 합친 것) 는 
	   즉. instance 변수와 static 변수는 초기화(처음부터 어떤 변수를 넣어주는 것) 를 하지 않더라도
	   자동적으로 초기화가 되어진다.
	   정수형인 데이터타입(byte, short, int, long)은 자동적으로 0 으로 초기화가 되고, 
	   실수형인 데이터타입(float, double)은 자동적으로 0.0 으로 초기화가 된다.
	   문자형인 데이터타입(char)는 자동적으로 ' ' 공백 한 개로 초기화 되고,
	   (문자열은 단어 1개 이상, 문자형은 단어 1개)
	   String 을 포함한 클래스 타입은 자동적으로 null 로 초기화가 된다.
	   
	   ※ 초기화란? 변수에 어떤 값을 부여하는 것을 초기화라고 부른다.
	 */
	
	void info_print() { // 인스턴스 method(메소드)이다.
		//  void 는 return 값이 없다라는 타입이다.
		
		// 지역 변수(local variable) 는 반드시 초기화(== 변수에 어떤 값을 부여하는 것)를 꼭 해주어야 한다!!!
		// 멤버 변수는 자동적으로 초기화 된다.
		/* 지역 변수는 void info_print(){ 괄호 안에서만 사용되는 것으로 } 괄호를 벗어나는 순간 지역변수는
		   자동적으로 메모리(RAM)에서 삭제된다!!! */
		
		int hope_money = 5000;
		// 지역 변수 갈색
		String address = "서울시 마포구";
		
//		String address = null; 
//		String address;  
		// 위의 2가지는 다른 것으로 첫 번째 것은 null 값을 부여한 것이다.
		
		System.out.println("=== 회원 정보 1 ===\n" + 
						   "1.아이다 : " + id + "\n" +
						   "2.비밀번호 : " + pwd + "\n" +
						   "3.이름 : " + name + "\n" +
						   "4.이메일 : " + email + "\n" +
						   "5.나이 : " + age + "\n" +
						   "6.신장 : " + height + "\n" +
						   "7.등급 : " + grade + "\n" +
						   "8.희망급여 : " + hope_money + "\n" +
						   "9.주소 : " + address + "\n");
		
			/*
			   문자열과 문자열 사이의 + 는 문자열 결합을 뜻하는 것이고,
			   숫자와 숫자 사이의 + 는 더하기(plus)를 뜻하는 것이고,
			   문자열과 숫자 사이의 + 는 문자열 결합을 뜻하는 것이다.
			 */
		
		}
	
	void info_view() { // 인스턴스 method(메소드)이다.
		//  void 는 return 값이 없다라는 타입이다.
		
		// 지역 변수(local variable) 는 반드시 초기화(== 변수에 어떤 값을 부여하는 것)를 꼭 해주어야 한다!!!
		// 멤버 변수는 자동적으로 초기화 된다.
		/* 지역 변수는 { } 내에서만 사용되는 것으로 괄호를 벗어나는 순간 지역변수는
		   자동적으로 메모리(RAM)에서 삭제된다!!! */
		
		int hope_money = 8000;
		// 지역 변수 갈색
		String address = "경기도 군포시";
		
		
		System.out.println("=== 회원 정보 2 ===\n" + 
						   "1.아이다 : " + id + "\n" +
						   "2.비밀번호 : " + pwd + "\n" +
						   "3.이름 : " + name + "\n" +
						   "4.이메일 : " + email + "\n" +
						   "5.나이 : " + age + "\n" +
						   "6.신장 : " + height + "\n" +
						   "7.등급 : " + grade + "\n" +
						   "8.희망급여 : " + hope_money + "\n" +
						   "9.주소 : " + address + "\n");
		
			/*
			   문자열과 문자열 사이의 + 는 문자열 결합을 뜻하는 것이고,
			   숫자와 숫자 사이의 + 는 더하기(plus)를 뜻하는 것이고,
			   문자열과 숫자 사이의 + 는 문자열 결합을 뜻하는 것이다.
			 */
		
		}
	
	
	public static void main(String[] args) {
		
		Main_01 ma1 = new Main_01(); // 인스턴스화(== 객체생성)
		
		ma1.id = "leess";
		ma1.pwd = "qwer1234";
		ma1.name = "이순신";
		
		/*
 			=== 회원 정보 ===
 			1.아이디 : leess
 			2.비밀번호 : qwer1234
 			3.이람 : 이순신
		 */
		
		ma1.info_print();
		ma1.info_view();
		
	}

}
