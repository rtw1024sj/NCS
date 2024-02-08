package my.day15.b.overloading;

public class Child extends Parent{	// 자식클래스

	// field
	String name;
	
	//== 오버라이딩(overriding) == //
	// 오버라이딩(overriding) 은 부모클래스로부터 상속받은 메소드의 내용물을 바꾸는데
	// 그 메소드의 return 타입과 메소드의 이름과 파라미터는 같아야한다.
	// 접근제한자는 부모의 것과 같거나 허용범위가 더 큰 것을 사용해야한다.
	//== 오버라이딩(overriding) == //

	
	
	// 메소드의 오버라이딩 (리모델링) == 메소드의 재정의
	// 메소드의 오버라이딩(overriding) 시 접근제한자는 부모클래스에서 정의해둔 메소드의 접근제한자와 같거나 또는 허용이 더 큰 것을 해야 한다.
	// 또한 메소드의 오버라이딩(overriding) 시 접근제한자 껍데기() { 알맹이 } 중 껍데기(리턴타입 메소드명 파라미터)는 똑같아야 한다.
	// 알맹이(내용물)는 새롭게 정의해서 만들면 된다.
	@Override	// @ 를 애노테이션(어노테이션) 이라고 부른다.
	public String info() {
		return "아이디 : " + super.id + "\n" 
			+  "비밀번호 : " + super.passwd;
	}


	// === 메소드의 오버로딩(overloading) === // 
	// 상속과는 관계없이 어떤 메소드를 만들 때 중복을 피하고자 할 때 사용된다.
	// 메소드의 이름은 같지만 파라미터의 종류, 갯수, 순서 만 다르면 중복이 아니라고 본다.
	// 단 파라미터는 같더라도 접근제한자 return 타입은 관여하지 않는다.
	// 접근제한자[public] return 타입[void] 메소드이름[info] (int n [파라미터] ) { 내용물 }
	// ==> 메소드의 이름은 같지만 파라미터가 다르면 동일한 메소드로 취급하지 않는다.
	// ==> 접근제한자 및 리턴타입은 메소드의 오버로딩에 관여하지 않는다.
	// === 메소드의 오버로딩(overloading) === // 
	
	// 오버로딩과 오버라이딩은 이름만 비슷하지 전혀 다른것들이다!!

	
	
	// 메소드의 overloading 은 파라미터만 보기 때문에 파라미터를 변경시켜주면 된다( 변수명 x) (타입이나 , 갯수가 다르면 된다.)
	public void info(int n) {
		System.out.println();
	}
	
	public void info(short m) {
		System.out.println();
	}
	
	public void info(int a, String str) {
		System.out.println();
	}

	// 파라미터의 위치만 바뀌어도 중복이 아니라고 본다.
	public void info(String str, int a) {
		System.out.println();
	}

	// 메소드의 return 타입을 보지 않는다. 오로지 메소드의 이름과 파라미터가 같으면 중복되었다고 본다.
/*	주석 지우면 에러뜬다.
	public String info(String str, int a) {
		return "";
	}
*/	
	
	// 접근제한자와 return 타입이 다르더라도 중복이라 여긴다.
/*	주석 지우면 에러뜬다.	
	protected void info(String str, int a) {
		System.out.println("");
	}
*/
	
	// === 생성자의 오버로딩(overloading) === //
	public Child() {
		
	}

	public Child(String id, String passwd) {
		this.id = id;
		this.passwd = passwd;
		
	}

	public Child(String id, String passwd, String name) {
		this(id, passwd);
		this.name = name;
		// 생성자 내에서 다른 생성자를 불러올 수 있지만
		// 다른 것이 먼저 나오면 안된다. this.name = name; 밑에 생성자가 나오면 안된다.
		// this(id, passwd);	이건 안된다. 무조건 다른 생성자가 나온 후에 쓸 수 있다.
		
	}

/*
	public Child(String id, String passwd, String name) {
		this.name = name;
		this(id, passwd);	// 오류발생
		// 항상 생성자가 먼저 나와야한다.
		// 생성자 내에서 다른 생성자를 불러올 수 있지만
		// 다른 것이 먼저 나오면 안된다. this.name = name; 밑에 생성자가 나오면 안된다.
		// this(id, passwd);	이건 안된다. 무조건 다른 생성자가 나온 후에 쓸 수 있다.
	}
*/	
	
}
