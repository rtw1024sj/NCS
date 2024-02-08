package my.day16.d.INTERFACE;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import my.util.MyUtil;

// >> 미완성 클래스 (== 추상 클래스  == abstract)
public abstract class CommonMember implements Common {	
	// Common interface 에 있는 것을 구현해야 하지만
	// 어차피 자식클래스인 Gujikja.imple 과 Company.imple 에 getInfo() 가 override(재정의) 되어 있기 때문에
	// 부모인 CommonMember 에서는 getInfo() 를 사용할 필요가 없기 때문에
	// 미완성되어진 클래스인 abstract 클래스로 만들어준다.

	// Gujikja 클래스와 Company 클래스에서 공통으로 사용되어지는 field(속성) 생성하기
	private int type;				// Gujikja 와 Company 를 구분짓는 용도. type 값이 1 이라면 Gujikja 라 보고, type 값이 2 이라면 Company 라 본다
	private String id; 				// 아이디
	private String passwd; 			// 비밀번호
	private String name; 			// 성명
	private String register_day;	// 가입일자
	
	static int count;

	// Gujikja 및 Company 클래스의 부모클래스인 CommonMember 클래스의 기본생성자
	public CommonMember() {
//		System.out.println("== 부모클래스인 CommonMember 클래스의 기본생성자 호출 == ");

		Date now = new Date(); // 현재시각
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		register_day = df.format(now);
		// "2023-01-30 15:12:10"
	}

	
	
	public int getType() {
		return type;
	}


	public void setType(int type) {
		if(type == 1 || type == 2) {
			this.type = type;
			// type 값이 1 이라면 Gujikja 라 보고
			// type 값이 2 이라면 Company 라 본다
		}
		
	}



	// 캡슐화(EnCapsulation == 은닉화) 되어진 field 를 메소드를 통해 접근하도록 만들기 //
	// == getter, setter 하기 == //
	public void setId(String id) { // 값을 넣을 땐 set, 읽어올 때는 get

		if (id == null || id.isBlank()) {
			System.out.println("[경고] 아이디는 공백이 아닌 값을 넣어주십시오.");
		}

		else {

			// id 는 첫글자는 반드시 영문(대.소문자)자로 시작해야 하고 그나머지 글자는
			// 영문자 또는 숫자로만 이루어져야 한다.!!
			// 그리고 id 의 길이는 최소 3글자, 최대 10 글자로 제한한다.

			// >> 정규표현식(Regular Expression)이란? <<
			// ==> 특정한 규칙을 가진 문자열의 집합을 표현하기 위해 쓰이는 형식언어

			// == 1. 정규표현식(Regular Expression) 패턴을 작성한다. == //
			Pattern p = Pattern.compile("^[A-Za-z][A-Za-z0-9]{1,9}$");
			// 대문자 A~Z 소문자 a~z까지 + 숫자 0~9까지
			// 처음 [] 는 영문자만 가능(첫글자), 그 다음에 []영문자와 숫자
			// 첫글자[영문대소문자] 과 [영문대소문자,숫자] 를 {최소 2번 최대 9번} 반복해서 쓴다는 뜻이다.
			// ( ^시작 )( [A-Za-z]첫글자 )( [A-Za-z0-9]{2,9} )( $끝 )

			// id 의 패턴은 대소문자 a~z까지 그리고 0~9까지 가능하다.
			// ^ 은 시작을 의미한다.
			// & 는 끝을 의미한다.
			// [] 는 글자 1개가 들어오는 것을 의미한다.
			// [A-Za-z] 는 글자 1개가 들어오는데 영문자만 가능하다.
			// [A-Za-z] 는 글자 1개가 들어오는데 영문자만 가능하고 [A-Za-z0-9]{1,9}번

			// == 2. 문자열이 주어진 정규식 패턴과 일치하는지 판별하는 객체를 생성한다. == //
			Matcher m = p.matcher(id); // id 를 p 패턴에 맞춰준 값을 m 값에 맞춰준다/

			// == 3. 판별하도록 한다. == //
			if (m.matches()) { // matches 는 boolean 타입이다. 일치하면 true, 일치하지 않으면 false
				this.id = id;
				// 또는
				/*
				 * this.id = id; //true 일 경우 ( id 가 p 팬턴에 맞을경우) // 또는 id = id;
				 */
				// super == 부모클래스 , this == 내 클래스, 그냥. 도 할 수 있지만 이게 누구것인지 알 수 없기 때문에 super 을 써줘서 부모클래스의 것임을 알 수 있게한다.
				// 써준다.
			} else {
				System.out.println("[경고] 아이디는 첫글자는 영문이어야 하고 나머지는 " + "영문 또는 숫자로만 이루어진 글자길이는 3~10글자만 가능합니다.\n");

			} // end of if~else (m.matches() )-------------------------------------

		} // end of if~else------------------------------------------------------

	} // end of public void setid(String id)
		// ----------------------------------------

	// 캡슐화(EnCapsulation == 은닉화) 되어진 field 를 메소드를 통해 접근하도록 만들기 //
	// == getter, setter 하기 == //
	public String getId() {
		return this.id;
	}// end of public String getid() ---------------------------------------

	// 캡슐화(EnCapsulation == 은닉화) 되어진 field 를 메소드를 통해 접근하도록 만들기 //
	// == getter, setter 하기 == //
	public void setPasswd(String passwd) {

		if (MyUtil.isCheckPasswd(passwd)) {
			this.passwd = passwd;
		}

		else {
			System.out.println("[경고] 비밀번호는 영대문자, 영소문자, 숫자, 특수문자가 혼합된 최소 8글자 이상 최대 15글자 이하이어야 합니다.\n");

		}
	}// end of public void setPasswd(String passwd)
		// ---------------------------------------------------------------

	public String getPasswd() {
		return passwd;
	} // end fo public String getPasswd()------------------------------------------

	// 기본생성자 생략됨!!

	/*
	 * // 캡슐화(EnCapsulation == 은닉화) 되어진 field 를 메소드를 통해 접근하도록 만들기 // // // ==
	 * getter, setter 하기 == // public void setName(String name) { // 성명은 공백이 없는 한글로만
	 * 이루어져야 하며 최소 2글자 이상 최대 6글자로만 되어져야 한다.
	 * 
	 * if(name != null) { char [] ch_arr = name.toCharArray();
	 * 
	 * boolean isOnly_hangul = true; for (char ch : ch_arr) { if( !('가' <= ch && ch
	 * <= '힣') ) { isOnly_hangul = false; break; } } // end of
	 * for----------------------------
	 * 
	 * if (2 <= ch_arr.length && ch_arr.length <= 6 && isOnly_hangul){ this.name =
	 * name; } // end of if (isOnly_hangul)-------------------------- else {
	 * System.out.
	 * println("[경고] 성명은 공백이 없는 한글로만 이루어져야 하며 최소 2글자 이상 최대 6글자로만 되어져야 합니다."); } }//
	 * end of if(name != null) ------------------------------------------
	 * 
	 * } // end of public void setName(String name)
	 * ----------------------------------------
	 */

	// 또는 성명을 정규표현식으로 검사해보겠다.

	// 캡슐화(EnCapsulation == 은닉화) 되어진 field 를 메소드를 통해 접근하도록 만들기 //
	// == getter, setter 하기 == //
	public void setName(String name) {
		this.name = name;
	} // end of public void setName(String name)----------------------------------------

	public String getName() {
		return name;
	}// end of public String getName() ------------------------------------------
	
	
	// 캡슐화(EnCapsulation == 은닉화) 되어진 field 를 메소드를 통해 접근하도록 만들기 //
	// == getter, setter 하기 == //
	public String getRegister_day() {
		return register_day;
	}// end of 	public String getRegister_day() -------------------------
	// setRegister_day 는 필요 없어서 지웟음

	
	////////////////////////////////////////////////////////////////////////////

	
	
	

	////////////////////////////////////////////////////////////////////////////
	String parent_test() {
		return "부모클래스에서 만들었어요. 그냥 연습입니다.";
	}





}
