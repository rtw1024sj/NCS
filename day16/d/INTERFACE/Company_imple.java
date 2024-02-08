package my.day16.d.INTERFACE;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Company_imple extends CommonMember {
// Company 클래스는 CommonMember 클래스에 생성되어진 field 및 method 및 생성자를 상속받아온다.
// CommonMember 클래스는 Company  클래스의 부모클래스가 되어지고,
// Company 클래스는 CommonMember  클래스의 자식클래스가 되어진다.
	

	// field 생성
	// field 의 캡슐화(EnCapsulation == 은닉화)
	private String business_number;	  // 사업자등록번호 
	private String job_type;          // 회사직종타입(제조업, 서비스업, IT, ...)
	private long seed_money;          // 자본금 



	// 기본생성자
	public Company_imple() {
		super();
		super.setType(2);	
		// type 값이 2 이라면 Company 
	}
	
	
	// == 메소드의 오버라이딩(overriding) , 메소드의 재정의
	@Override
	public void setName(String name) {
		// 회사명은 공백이 없는 영문 또는 한글로만 이루어져야 하며 최소 2글자 이상 최대 10글자로만 되어져야 한다.

		// == 1. 정규표현식(Regular Expression) 패턴을 작성한다. == //
		Pattern p = Pattern.compile("^[가-힣A-Za-z]{2,10}$");

		// == 2. 문자열이 주어진 정규식 패턴과 일치하는지 판별하는 객체를 생성한다. == //
		Matcher m = p.matcher(name); // name 를 p 패턴에 맞춰준 값을 m 값에 맞춰준다/

		// == 3. 판별하도록 한다. == //
		if (m.matches()) { // matches 는 boolean 타입이다. 일치하면 true, 일치하지 않으면 false
			super.setName(name); // true 일 경우 ( id 가 p 팬턴에 맞을경우)
		} else {
			System.out.println("[경고] 회사명은 공백이 없는 영문 또는 한글로만 이루어져야 하며 최소 2글자 이상 최대 10글자로만 되어져야 합니다.\n");

		} // end of if~else( m.matches() )---------
	}
	

	
	
	// 캡슐화(EnCapsulation == 은닉화) 되어진 field 를 메소드를 통해 접근하도록 만들기 //
	// == getter, setter 하기 == //
	public void setBusiness_number(String business_number) {
		
		// 사업자등록번호는 오로지 숫자로만 들어와야 하며
		// 첫글자는 0 이 들어올 수 없다.
		// 또한 사업자 등록번호의 길이는 10글자가 되어야 한다.
		
		// == 1. 정규표현식(Regular Expression) 패턴을 작성한다. == //
		Pattern p = Pattern.compile("^[1-9][0-9]{9}$");	// ^ 시작 첫글자 1~9 까지
														// 0-9 까지의 숫자로 두번째부터 {9} 번 작성하고 . $ 끝

		// == 2. 문자열이 주어진 정규식 패턴과 일치하는지 판별하는 객체를 생성한다. == //
		Matcher m = p.matcher(business_number); // name 를 p 패턴에 맞춰준 값을 m 값에 맞춰준다/

		// == 3. 판별하도록 한다. == //
		if (m.matches()) { // matches 는 boolean 타입이다. 일치하면 true, 일치하지 않으면 false
			this.business_number = business_number; // true 일 경우 ( id 가 p 팬턴에 맞을경우)
		} else {
			System.out.println("[경고] 사업자등록번호는 숫자로 10자리만 가능합니다. 첫글자는 0 이 들어올 수 없습니다!!\n");

		} // end of if~else( m.matches() )--------------------------
		
	}// end of public void setBusiness_number(String business_number) -----------------------------------------
	
	public String getBusiness_number() {
		return business_number;
	} // end of	public String getBusiness_number() ------------------------------------------ 

	


	public void setJob_type(String job_type) {
		if (job_type == null || job_type.isBlank()) {
			System.out.println("[경고] 회사직종군은 공백이 아닌 글자로 입력하셔야 합니다.\n");
		} else {
			this.job_type = job_type;
		}

	} // end of public void setJob_type(String job_type) ----------------------------------

	public String getJob_type() {
		return job_type;
	} // end of public String getJob_type() ---------------------------------
	

	
	public void setSeed_money(long seed_money) {
		
		if (seed_money <= 0) {
			System.out.println("[경고] 자본금은 0 보다 커야 합니다.\n");
		} else {
			this.seed_money = seed_money;
		}
		
	} // end of public void setSeed_money(long seed_money) ----------------------------------------
	
	public long getSeed_money() {
		return seed_money;
	} // end of public long getSeed_money() ----------------------------------
	// == getter, setter 하기 끝 == //	

	
	
	// >> 미완성 메소드(abstract)의 오버라이딩 << //
	// == 회사 정보를 한줄로 출력해주는 메소드 == //
	@Override
	public String getInfo() {

		// super == 부모클래스 , this == 내 클래스, 그냥. 도 할 수 있지만 이게 누구것인지 알 수 없기 때문에 super 을 써줘서 부모클래스의 것임을 알 수 있게한다.
		
		DecimalFormat df = new DecimalFormat("#,###");
		
		return super.getName() + "\t" + job_type + "\t" + business_number + "\t" + df.format(seed_money);

	}
	
	
	
	public String getSearchInfo() {
		
		StringBuilder sb = new StringBuilder();
		// super == 부모클래스 , this == 내 클래스, 그냥. 도 할 수 있지만 이게 누구것인지 알 수 없기 때문에 super 을 써줘서 부모클래스의 것임을 알 수 있게한다.
		
		DecimalFormat df = new DecimalFormat("#,###");
		
		sb.append(super.getName() + "\t");
		
		sb.append(getJob_type() + "\t");
		
		sb.append(getBusiness_number() + "\t");

		sb.append(df.format(seed_money) + "\t");

		return sb.toString();
		
	}

	
}
