package my.day01;

public class Member_main {

	// 콘솔 프로그램의 실행은 main() 메소드에서 실행한다.
	public static void main(String[] args) {
		
		System.out.println("1. : " + new Member());
		System.out.println("2. : " + new Member());

		//new Member(); // Member 클래스 (bin 폴더에 있는 Member.class 파일을 읽는다.)
					  // Member 클래스 파일을 읽어다가 메모리에 로딩시킨다.
					  // my.day01이란 같은 패키지에 있을 경우 import 할 필요가 없지만
					  // abc 라는 다른 패키지에 있는 Member 클래스의 경우 import abc.Member; 을 해야한다.
					  // new Member(); 을 할 때마다 Disk 에 있는 Member.class를 메모리(RAM)에 할당한다.
					  // Member 클래스를 인스턴스(== 객체)화 했다라고 부른다.
		
		/* Member_main 클래스와 Member 클래스는 동일한 패키지에 저장된 클래스이므로 
		   import 를 안 하더라도 사용 가능함! */
		
		// 1명의 새로운 회원이 필요하다.
		Member lssMbr = new Member(); // Member 클래스 파일을 읽어다가 메모리에 로딩시킨다.

		// 단어와 단어사이를 연결을 지을 때 대소문자로 구분짓는 것을 "카멜기법"이라 부른다. 
		// 예) lssmbr 라고 사용하지 않고 lssMbr 와 같이 쓰는 것.
		
		System.out.println(lssMbr);
		// my.day01.Member@307f6b8c
		// 패키지명.클래스명@메모리(RAM)상에 올라온 주소값
		// lssMbr 를 사용하여 my.day01.Member@307f6b8c 을 제어할 수 있다.
		// 그래서 lssMbr 은 메모리 참조변수라고 부른다. 
		
		// 1명의 새로운 회원이 필요하다.
		Member eom_mbr = new Member(); // Member 클래스 파일을 읽어다가 메모리에 로딩시킨다.
		
		// 단어와 단어사이를 연결을 지을 때 언더바(_)로 구분짓는 것을 "스네이크기법"이라 부른다. 
		// 예) eommbr 라고 사용하지 않고 eom_mbr 와 같이 쓰는 것.
		
		System.out.println(eom_mbr);
		// my.day01.Member@7a187f14
		// 패키지명.클래스명@메모리(RAM)상에 올라온 주소값
		// eom_mbr 를 사용하여 my.day01.Member@7a187f14 을 제어할 수 있다.
		// 그래서 eom_mbr 은 메모리 참조변수라고 부른다. 

		System.out.println("\n-------------------------\n");
		
		lssMbr.id = "leess"; // = 은 같다가 아니라 대입해준다. (우측에 있는 값을 좌측의 변수에 대입)
		lssMbr.pwd = "abcd";
		lssMbr.name = "이순신";
		lssMbr.email = "leess@naver.com";
		//lssMbr.school = "대졸"; -- school 은 Member 클래스에서 존재하지 않는 필드이므로 불가함.
		
		//lssMbr.address = "서울시 강남구"; 
		//위와 같이 사용해도 되지만 static 변수는 아래와 같이 클래스명.변수명으로 사용할 것을 권장한다.
		Member.address = "서울시 강남구";

		System.out.println("== lssMbr 이라는 인스턴스(객체)에 저장된 필드 값 출력하기 1번째 ==" );
		System.out.println("1. 아이디 : " + lssMbr.id + "\n" + 
						   "2. 비밀번호 : " + lssMbr.pwd + "\n" +
						   "3. 이름 : " + lssMbr.name + "\n" + 
						   "4. 이메일 : " + lssMbr.email + "\n" +
					//	   "5. 주소(비추) : " + lssMbr.address + "\n" +
						   "6. 주소(권장) : " + Member.address + "\n");
		
		
System.out.println("\n-------------------------\n");
		
		eom_mbr.id = "eomjh"; // = 은 같다가 아니라 대입해준다. (우측에 있는 값을 좌측의 변수에 대입)
		eom_mbr.pwd = "qwer1234";
		eom_mbr.name = "엄정화";
		eom_mbr.email = "eomjh@gmail.com";
		//eom_mbr.school = "대학원졸"; -- school 은 Member 클래스에서 존재하지 않는 필드이므로 불가함.
		
		//eom_mbr.address = "경기도 일산동구"; 
		// 위에 주석처리를 하지 않을 경우 이 밑으로는 address 값에 "경기도 일산동구" 값이 출력된다.
		
		System.out.println("== eom_mbr 이라는 인스턴스(객체)에 저장된 필드 값 출력하기 2번째 ==" );
		System.out.println("1. 아이디 : " + eom_mbr.id + "\n" + 
						   "2. 비밀번호 : " + eom_mbr.pwd + "\n" +
						   "3. 이름 : " + eom_mbr.name + "\n" + 
						   "4. 이메일 : " + eom_mbr.email + "\n" +
					//	   "5. 주소(비추) : " + eom_mbr.address + "\n" +
						   "6. 주소(권장) : " + Member.address + "\n");
		
		System.out.println("\n====================================\n");
		
		System.out.println(">> lssMbr 이라는 인스턴스(객체)에 저장된 필드 값 출력하기 3번째 << ");
		lssMbr.print_info();
		
		System.out.println(">> eom_mbr 이라는 인스턴스(객체)에 저장된 필드 값 출력하기 4번째 << ");
		eom_mbr.print_info();
		
	}
	
}
