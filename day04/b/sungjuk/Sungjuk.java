package my.day04.b.sungjuk;

public class Sungjuk {

	// === field ===
	String hakbun; // 091234 처럼 글자에 0 이 올 수 있는데 저장되면 91234 로 저장될 수 있다. 그렇기 때문에
	// int 형이 아닌 String 타입으로 선언했다.
	String name;
	byte kor;	// byte 는 범위가 -128 ~ 127 이므로 0 ~ 100 로 제한
	byte eng;	// byte 는 범위가 -128 ~ 127 이므로 0 ~ 100 로 제한
	byte math;	// byte 는 범위가 -128 ~ 127 이므로 0 ~ 100 로 제한
	short age;	// short 는 -32,768 ~ 32,767     20 ~ 50 로 제한
	
	
	


	// === method ===
	boolean check_jumsu(byte jumsu) {

		if (0 <= jumsu && jumsu <= 100) {
			return true; // return(리턴)을 만나면 해당 메소드가 종료가 된다.
		} else {
			System.out.println("[경고] 입력하시는 점수는 0 이상 100 이하 이어야만 합니다.\n");
			return false;
		}
	} // end of boolean check_jumsu(byte jumsu)------------(꼭 써줘야 코드가 길어졌을 때 가독성이 좋다)

	// === method ===
	boolean check_age(short jumsu) {

		if (20 <= jumsu && jumsu <= 50) {
			return true; // return(리턴)을 만나면 해당 메소드가 종료가 된다.
		} else {
			System.out.println("[경고] 입력하시는 나이는 20 이상 50 이하 이어야만 합니다.\n");
			return false;
		}
	} // end of boolean check_jumsu(byte jumsu)
	

	public void sungjuk_print() {
	
		float avg = (kor+eng+math)/3.0F;
		char hakjum = ' '; // ' ' 학점 'A' 'B' 'C' 'D' 'F'
		
		if(avg >= 90) {
			hakjum = 'A';
		}
		else if(avg >= 80) {
			hakjum = 'B';
		}
		else if(avg >= 70) {
			hakjum = 'C';
		}
		else if(avg >= 60) {
			hakjum = 'D';
		}
		
		System.out.println("\n=== "+name+"님의 성적결과 ===\n"
		         + "1. 학번 : "+hakbun+"\n"
		         + "2. 성명 : "+name+"\n"
		         + "3. 국어 : "+kor+"\n"
		         + "4. 영어 : "+eng+"\n"
		         + "5. 수학 : "+math+"\n"
		         + "6. 총점 : "+(kor+eng+math)+"\n"
		         + "7. 평균 : "+ Math.round(avg*10)/10.0 +"\n"
		         + "8. 학점 : "+ hakjum +"\n"
					+ "9. 나이 :" + age + "\n");
	}
}

