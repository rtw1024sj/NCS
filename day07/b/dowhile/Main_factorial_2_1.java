package my.day07.b.dowhile;

import java.util.Scanner;

public class Main_factorial_2_1 {

	public static void main(String[] args) {

		// === 입사문제 === //
		/*
		   ▣ 알고 싶은 팩토리얼 수 입력 => 5엔터
		   >> 결과 : 5! = 120
		   >> 또 할래?
		   
		   5! ==> 5*4*3*2*1
		   7! ==> 7*6*5*4*3*2*1
		   
		   ▣ 알고 싶은 팩토리얼 수 입력 => 0엔터
		   >> [경고] 자연수만 입력하세요!!

		   ▣ 알고 싶은 팩토리얼 수 입력 => 1.25엔터
		   >> [경고] 정수만 입력하세요!!

		   ▣ 알고 싶은 팩토리얼 수 입력 => 똘똘이엔터
		   >> [경고] 정수만 입력하세요!!
		 */
		
		Scanner sc = new Scanner(System.in);
		
		outer:  // outer: 을 레이블 이라고 부르는데 그 레이블명이 지금은 outer 일 뿐이다. 
		for(;;) {
			try {
				System.out.print("▣ 알고 싶은 팩토리얼 수 입력 => ");
				int num = Integer.parseInt(sc.nextLine());

				if (num <= 0) {
					System.out.println(">> [경고] 자연수만 입력하세요!!");
					continue;
					// continue; 를 만나면 아래로 떨어지지 않고 do~while(조건식); 의 조건식으로 들어간다.
				}
				
				int factorial = 1;
				
				for (int i = num; i>0; i--) { // 5*4*3*2*1
					factorial  *= i; // factorial = factorial * i; 와 같다.
									 // factorial = 1 * 5
 									 // factorial = 5 * 4
 									 // factorial = 5 * 4 * 3
									 // factorial = 5 * 4 * 3 * 2
									 // factorial = 5 * 4 * 3 * 2 * 1
				} // end of for--------
				
				System.out.println(num + "! = " + factorial);
				// == 팩토리얼 구하기 끝 == //
				
				for(;;) {
					   System.out.print(">> 또 하시겠습니까?[Y/N] => ");
					   String yn = sc.nextLine(); 
					   
					// if("n".equals(yn) || "N".equals(yn)) {
					// 또는 
					   if("n".equalsIgnoreCase(yn)) {
						   // yn 값이 "n" 또는 "N" 이라면 
						   sc.close();
						   break outer; // 반복문중에 레이블명이 outer 라고 선언되어진 반복문을 빠져나가는 것이다.
		                                // 즉, 가장 바깥에서 선언되어진 for문을 빠져나가는 것이다. 
					   }
					   
					   else if("y".equalsIgnoreCase(yn)) {
						   // yn 값이 "y" 또는 "Y" 이라면
						   break;  // 그냥 break; 는 break; 와 가장 가까운 반복문을 빠져나가는 것이다. 
					   }
					   
					   else {
						   // yn 값이 "n" 또는 "N" 또는 "y" 또는 "Y" 를 제외한 다른 글자인 경우 
						   System.out.println(">>> Y 또는 N 만 입력하세요!!");
					   }

				   		} // end of for(;;)---------
					} catch (NumberFormatException e) {
						System.out.println(">> [경고] 정수만 입력하세요!!");
					}

			} //end of for(;;)--------------------------
			System.out.println(">>> 프로그램 종료 <<<");
		}// end of main()---------
}
