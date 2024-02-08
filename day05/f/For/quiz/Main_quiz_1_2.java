package my.day05.f.For.quiz;

/*
Abz3김a0#$T
대문자개수 : 2
소문자개수 : 3
숫자개수 : 2
한글개수 : 1
특수문자개수 : 2
 */

public class Main_quiz_1_2 {

	public static void main(String[] args) {

		String str = "Abz3김a0#$T";

		int upper_no = 0, low_no = 0, num_no = 0, kor_no = 0, special_no = 0;

		for (int i = 0; i < str.length(); i++) {

			if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
				upper_no++;
			}
			else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
				low_no++;
			} else if ('0' <= str.charAt(i) && str.charAt(i) <= '9') {
				num_no++;
			} else if ('가' <= str.charAt(i) && str.charAt(i) <= '힣') {
				kor_no++;
			} else {
				special_no++;
			}

		} // end of for
		
		System.out.println("\n===================================\n");
		System.out.println(str + 
				"\n대문자개수 : " + upper_no + 
				"\n소문자개수 : " + low_no + 
				"\n숫자개수 : " + num_no + 
				"\n한글개수 : " + kor_no + 
				"\n특수문자개수 : " + special_no);
		System.out.println("\n===================================\n");


	} // end of public static void main(String[] args) {}


}
