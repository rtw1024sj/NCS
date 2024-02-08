package my.day05.f.For.quiz;

public class Main_quiz_1 {

	public static void main(String[] args) {

		String word = "Abz3김a0#$T";
		// index 번호	   0123456789	
		
		System.out.println(word + " 문자열의 길이(글자수) : " + word.length());
		// Abz3Sa0#$T 문자열의 길이(글자수) : 10
		
		System.out.println(word.charAt(0)); // 'A'
		System.out.println(word.charAt(2)); // 'z'
		System.out.println(word.charAt(3)); // '3'
		System.out.println(word.charAt(4)); // '김'
		System.out.println(word.charAt(7)); // '#'
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		int upper_cnt = 0, lower_cnt = 0, number_cnt = 0, hangul_cnt = 0, special_cnt = 0;
				
		
		/*
		 * for (int i = 0; i <= word.length(); i++) {
		 * 
		 * 		try { 
		 * 
				 * if ('A' <= word.charAt(i) && word.charAt(i) <= 'Z') { // 대문자 인지 알아본다.
					 * upper_cnt++; 
					 * }
				 * 
				 * else if ('a' <= word.charAt(i) && word.charAt(i) <= 'z') { // 소문자 인지 알아본다.
					 * lower_cnt++; 
					 * }
				 * 
				 * else if ('0' <= word.charAt(i) && word.charAt(i) <= '9') { // 숫자 인지 알아본다.
					 * number_cnt++; 
					 * }
				 * 
				 * else if ('가' <= word.charAt(i) && word.charAt(i) <= '힣') { // 한글 인지 알아본다.
					 * hangul_cnt++; 
					 * }
				 * 
				 * else { // 특수문자 인지 알아본다.
				 * 		special_cnt++; 
			} 
			 * 		} catch (StringIndexOutOfBoundsException e) {
			 * 
		 * 		}
		 * 
		 * 		continue; 
		 * }
		 */
		
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
		
			if(Character.isUpperCase(ch))
				upper_cnt++;
			else if (Character.isLowerCase(ch))
				lower_cnt++;
			else if (Character.isDigit(ch))
				number_cnt++;
			else if ('가' <= ch && ch <= '힣')
				hangul_cnt++;
			else
				special_cnt++;
		
		
		}
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		System.out.println(word + "\n" 
				+ "대문자개수 : " + upper_cnt + "\n"
				+ "소문자개수 : " + lower_cnt + "\n"
				+ "숫자개수 : " + number_cnt + "\n"
				+ "한글개수 : " + hangul_cnt + "\n"
				+ "특수문자개수 : " + special_cnt + "\n");

	}
}

