package my.day17.a.exception;

public class Exception_test {

	public static void main(String[] args) {

		System.out.println("\n== 1. \"ArrayIndexOutOfBoundsException\" ==");

		// ArrayIndexOutOfBoundsException
		// ==> 배열의 크기가 오버가 되어지면 발생하는 익셉션

		String[] subject_arr = { "자바", "오라클", "JSP" };

		try {
			for (int i = 0; i <= subject_arr.length; i++) {
				// subject_arr index = 0 1 2
				// <= 이기 때문에 0 1 2 3
				// 근데 index 3 이 없기 때문에 Exception 이 뜬다.
				System.out.println(subject_arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 범위가 초과하였습니다.");
			// e.printStackTrace(); // 어디가 오류인지를 추적해서 알려준다.
			// System.out.println(e.getMessage());
			// Index 3 out of bounds for length 3
			// e.getMessage() 는 오류메시지를 알려주는 것이다.
		}
		
		System.out.println("\n== 2. \"ArithmeticException\" ==");
	      
	      // ArithmeticException 
	      // ==> 분모에 0 이 들어가는 경우에 발생하는 익셉션
		
		int num = 10;
		try {
			for(int i = 2; i >= 0; i--) {
				System.out.println(num/i);
			}
		} catch (ArithmeticException e) {
			System.out.println("분모에는 0 이 올 수 없습니다.");
			// e.printStackTrace(); // 어디가 오류인지를 추적해서 알려준다.
			// System.out.println(e.getMessage());
			// by zero
			// e.getMessage() 는 오류메시지를 알려주는 것이다.
		}

		
		System.out.println("\n== 3. ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~==");
		
		int[] num_arr = {10,20,30};
		try {
			for(int i = 3; i >= 0; i--) {
				int val = num_arr[i]/i;
				System.out.println(val);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 범위가 초과하였습니다.");
			 e.printStackTrace(); // 어디가 오류인지를 추적해서 알려준다.
			// System.out.println(e.getMessage());
			// Index 3 out of bounds for length 3
			// e.getMessage() 는 오류메시지를 알려주는 것이다.
		}

		
		System.out.println("\n== 4. ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~==");
		
		for (int i = 3; i >= 0; i--) {
			try {
				int val = num_arr[i] / i;
				System.out.println(val);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 인덱스 범위가 초과하였습니다.");
				// e.printStackTrace(); // 어디가 오류인지를 추적해서 알려준다.
				System.out.println(e.getMessage());
				// Index 3 out of bounds for length 3
				// 15
				// 20
				// Exception in thread "main" java.lang.ArithmeticException: / by zero
				// e.getMessage() 는 오류메시지를 알려주는 것이다.
			} catch (ArithmeticException e) {
				System.out.println("분모에는 0 이 올 수 없습니다.");
				/*
				 * 배열의 인덱스 범위가 초과하였습니다. 
				 * Index 3 out of bounds for length 3 
				 * 15 
				 * 20 
				 * 분모에는 0 이 올 수 없습니다.
				 */
			}
		}

		
		System.out.println("\n== 5. ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~==");
		
		for (int i = 3; i >= 0; i--) {
			try {
				int val = num_arr[i] / i;
				System.out.println(val);
			} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
				System.out.println("에러메시지 : " + e.getMessage());
				// Index 3 out of bounds for length 3
				// 15
				// 20
				// 에러메시지 : / by zero
				// e.getMessage() 는 오류메시지를 알려주는 것이다.
			}
		}
		
		
		
		System.out.println("\n== 6. ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~==");
		
		for (int i = 3; i >= 0; i--) {
			try {
				int val = num_arr[i] / i;
				System.out.println(val);
			} catch (Exception e) {
				System.out.println("에러메시지 : " + e.getMessage());
				// Index 3 out of bounds for length 3
				// 15
				// 20
				// 에러메시지 : / by zero
				// e.getMessage() 는 오류메시지를 알려주는 것이다.
			}
		}
		
		
		System.out.println("\n== 7. ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~==");
		
		String[] str_arr = {"10", "스물", "30"};
		
		for (int i = 3; i >= 0; i--) {
			try {
				int val = Integer.parseInt(str_arr[i])/i;	// str_arr[3]/3
				System.out.println(val);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 인덱스 번호 : " + e.getMessage() + "이 존재하지 않습니다.");
				// Index 3 out of bounds for length 3
				// 15
				// 20
				// 에러메시지 : / by zero
				// e.getMessage() 는 오류메시지를 알려주는 것이다.
			} catch (ArithmeticException e) {
				System.out.println("분모에는 0 이 올 수 없습니다.");
			}	catch (Exception e) {
				System.out.println("에러메시지 : " + e.getMessage());
			}
		} // end of for----------------------------------------------------------

		
/*
 		아래의 것은 오류가 발생한다!!
 		
		System.out.println("\n== 8. ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~==");
		
		for (int i = 3; i >= 0; i--) {
			try {
				int val = Integer.parseInt(str_arr[i])/i;	// str_arr[3]/3
				System.out.println(val);
			} catch (Exception e) {
				System.out.println("에러메시지 : " + e.getMessage());
			}catch (ArrayIndexOutOfBoundsException e) { 
				// Unreachable catch block for ArrayIndexOutOfBoundsException. It is already handled by the catch block for Exception
				// Exception 이 전부 받기 때문에 Exception 및에 있는 것들은 작동을 하지 않는다.
				System.out.println("배열의 인덱스 번호 : " + e.getMessage() + "이 존재하지 않습니다.");
				// Index 3 out of bounds for length 3
				// 15
				// 20
				// 에러메시지 : / by zero
				// e.getMessage() 는 오류메시지를 알려주는 것이다.
			} catch (ArithmeticException e) {
				System.out.println("분모에는 0 이 올 수 없습니다.");
			}	
		} // end of for----------------------------------------------------------
		
		=== [!!! 중요 !!!] ===
      익셉션 처리시 부모클래스의 익셉션이 맨 아래에 나와야 한다.
      왜냐하면 익셉션 처리는 위에서 처리되면서 위의것이 처리가 안되면
      아래로 내려가라는 말인데 부모 클래스의 익셉션이 먼저 나오고 
      자식 클래스의 익셉션이 아래에 나오면 부모클래스 익셉션이 처리를 못한것을
      자식클래스 익셉션이 처리를 해라는 것은 모순이기 때문이다.
*/		
		
/*		
		System.out.println("\n== 8. ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~==");
		
		String[] str_arr2 = {"10", "스물", "30"};
		
		int cnt = 0;
		for(int i = 0; i < str_arr2.length; i++) {
			
			int val = Integer.parseInt(str_arr2[i]) + 1;
			System.out.println(val);
			
			System.out.println("[필수] >> " + ++cnt + "번 반복함 <<");
			
		} // end of for-------------------------------------
		
		
		//
		11
		[필수] >> 1번 반복함 <<
		Exception in thread "main" java.lang.NumberFormatException: For input string: "스물"
		//
		
*/


/*
		System.out.println("\n== 8. ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~==");
		
		String[] str_arr2 = {"10", "스물", "30"};
		
		int cnt = 0;
		for(int i = 0; i < str_arr2.length; i++) {
			
			try {
				int val = Integer.parseInt(str_arr2[i]) + 1;
				System.out.println(val);
				
			} finally {
				System.out.println("[필수] >> " + ++cnt + "번 반복함 <<");
			}
		} // end of for-------------------------------------

*/		
		
/*
			11
			[필수] >> 1번 반복함 <<
			[필수] >> 2번 반복함 <<
			Exception in thread "main" java.lang.NumberFormatException: For input string: "스물"
			
			// finally 은 try 블럭부분에 오류가 발생하지 않아도 finally 블럭부분을 실행하고,
            // try 블럭부분에 오류가 발생하면 finally 블럭부분을 실행한 후에 오류가 발생한다.
            // 즉, finally 부분은 오류가 발생하든지 또는 오류가 발생하지 않든지 관계없이 무조건 실행한다는 것이다. 
*/
			

			

		
		System.out.println("\n== 9. ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~==");
		
		String[] str_arr3 = {"10", "스물", "30"};
		int count = 0;
		for(int i = 3; i >= 0; i--) {
			
			try {
				int val = Integer.parseInt(str_arr3[i]) / i;
				System.out.println(val);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 인덱스 번호 " + e.getMessage() + "이 존재하지 않습니다.");
			} catch (Exception e) {
				System.out.println("에러메시지 : " + e.getMessage());
			} finally { // finally 은 오류가 발생하든지 또는 오류가 발생하지 않든지 관계없이 무조건 실행한다.
						// finally 부분에 기술해주면 된다.
				System.out.println("[필수] >> " + ++count + "번 반복함 <<");
			}
		} // end of for-------------------------------------
		
/*
			== 9. ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~==
			배열의 인덱스 번호 Index 3 out of bounds for length 3이 존재하지 않습니다.	// str_arr3[i] 가 3 일 때 null 값
			[필수] >> 1번 반복함 <<												// ++count
			15																// 30 / 2 = 15
			[필수] >> 2번 반복함 <<												// ++count
			에러메시지 : For input string: "스물"								// str_arr3[1] = "스물" String 이라서 에러
			[필수] >> 3번 반복함 <<												// ++count
			에러메시지 : / by zero												// i = 0; 10 / 0 = 0; 에러 by zero
			[필수] >> 4번 반복함 <<												// finally 때문에 ++count 
*/


		
		
		

	} // end of main()-----------------------------------------------------------------

}
