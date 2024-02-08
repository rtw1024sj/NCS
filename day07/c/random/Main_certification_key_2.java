package my.day07.c.random;

import java.util.Random;

import my.util.MyUtil;

public class Main_certification_key_2 {

	public static void main(String[] args) {

		// === 소문자3개와 숫자4개로 이루어진 랜덤한 인증키 === //
		// 예> asa9040
		
		String certification_key = "";
		Random rnd = new Random();
		
		for(int i = 0; i < 7; i++) {
			
			if(i < 3) { // 랜덤한 소문자를 발생시킨다.
				char ch = (char)(rnd.nextInt('z' - 'a' + 1) + 'a');
				certification_key += ch;
			}
			
			else { // 랜덤한 숫자 0 부터 9 까지 발생시킨다.
				int n = rnd.nextInt(9 - 0 + 1) + 0;
				certification_key += n;
			}
		} // end of for -----------------
		
		System.out.println("인증키 : " + certification_key);
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		System.out.println("인증키 : " + MyUtil.certification_key());
		
	} // end of main() ------------------------

}
