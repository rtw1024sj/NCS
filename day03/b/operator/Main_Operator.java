package my.day03.b.operator;

public class Main_Operator {

	public static void main(String[] args) {

		//	#### 1.산술연산자 ####
		//		 + - * / %(나머지) 
		//	<< >> >>> 이건 안한다.(잘 안쓰임)
		
		System.out.println("==== 1.산술연산자 + = * / %(나머지) ==== ");
		
		int n = 10;
		System.out.println("n+3 = " + n+3);
		//	n+3 = 103	n+3 = 103(앞에 "n+3 = " + <= 이 +로 문자열결합을 했기 때문에 뒤에 문장도 문자열결합으로 인지하여 10 + 3 을 붙인 것이다.
		
		System.out.println("n+3 = " + (n+3));	//	n+3 = 13
		System.out.println("n-3 = " + (n-3));	//	n-3 = 7
		System.out.println("n*3 = " + (n*3));	//	n*3 = 30
		System.out.println("n/3 = " + (n/3));	//	n/3 = 3	정수/정수 = 정수
		System.out.println("(double)n/3 = " + ((double)n/3));	//	(double)n/3 = 3.3333333333333335
		System.out.println("n%3 = " + (n%3));	// n%3 = 1	10을 3으로 나누었을 때 나머지
		
		//	#### 2.증감연산자 ####
		//		 ++ -- 
	
		System.out.println("\n==== 2.증감연산자 ++ -- ==== ");
		
/*		
		int a = 7;
		int b = 3;
*/		
		//	또는
		int a = 7, b = 3;
		System.out.println("a => " + a);	//	a => 7
		
		//	a = a + 1
		//	또는
		a++;
		System.out.println("a => " + a);	//	a => 8
		
		++a;
		System.out.println("a => " + a);	//	a => 9
		
		///////////////////////////////////////////////////////
		
		System.out.println("b => " + b);	//	b => 3

		//	b = b - 1;
		//	또는
		b--;
		System.out.println("b => " + b);	//	b => 2
		
		--b;
		System.out.println("b => " + b);	//	b => 1
		
		// !!!! 꼭 암기하세요 !!!! //
	    // 후위증감연산자(a++; b--;)는 다른 연산을 다 마친 이후에 1씩 증감한다.
		// 전위증감연산자(++a; --b;)는 맨먼저 1씩 증감을 마친 이후에 다른 연산을 한다.\
		int x = 10, y = 10;
		int z = ++x;	//	x = x + 1;	int z = x; 와 같다.
		System.out.println("z => " + z);	//	z => 11
		System.out.println("x => " + x);	//	x => 11

		z = y++;	// z = y;	y = y + 1; 와 같다.		
		System.out.println("z => " + z);	//	z => 10
		System.out.println("y => " + y);	//	y => 11
		
		System.out.println("x => " + x++);	//	x => 11	(x값 출력 결과 : x => 11 그 후에 x 값에 +1을 해준다.
		System.out.println("x => " + x);	//	x => 12	

		System.out.println("x => " + ++y);	//	y => 12	(y값 출력하기 전에 y + 1 을 해준다. 그 후 y를 출력한다.
		System.out.println("x => " + y);	//	y => 12
		
		
		//	#### 3. 논리 부정 연산자 ####
		//			!
		System.out.println("\n==== 3. 논리 부정 연산자 ! ==== ");
		boolean bool = false;
		System.out.println("bool => " + bool);	//	bool => false
		System.out.println("bool => " + !bool);	//	!bool => true

		
		//	#### 4. 논리 연산자 ####
		//			&(and) |(or) && ||
		System.out.println("\n==== 3. 논리 연산자 &(and) |(or) && || ==== ");
		/*
		  	수학에서는 T ∧(그리고) T ∧ F == > F
		  	수학에서는 T ∧(and) T ∧ T == > T
//			명제가 하나라도 거짓이면 결과는 거짓
		  	명제가 모두 참이어야 결과가 참	  	

		  	수학에서는 T ∨(또는) T ∧ F == > T
		  	수학에서는 T ∨(or) T ∧ T == > T
		  	수학에서는 F ∨(or) F ∧ F == > F	  	
//		  	명제가 하나라도 참이면 결과는 참
		  	명제가 모두 참이어도 결과는 참
		  	명제가 모두 거짓이면 결과는 거짓
		 */
		int c = 50, d = 60, e = 70;
		
		bool = (c > d) && (d < e) && (c == e);
				//	false && 스킵 !!
				//(제일 앞에서 거짓이 나오면 어차피 결과물이 거짓이기 때문에 뒤에는 연산을 하지 않는다)
		System.out.println("bool => " + bool);	// bool => false
		
		bool = (c > d) & (d < e) & (c == e);
		//	false & true & false
		//(& 하나는 모든 결과를 확인한 후에 결과를 준다) 
		//(&& 두 개가 속도가 더 빠르다)
		System.out.println("bool => " + bool);	// bool => false
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		bool = (c > d) || (d < e) || (c == e);
		//	false || true
		//(true가 한 개만 있어도 결과는 참이기 때문에 뒤에 연산은 스킵한다.)
		System.out.println("bool => " + bool);	// bool => true

		bool = (c > d) | (d < e) | (c == e);
		//	false | true | false
		//(| 하나는 모든 결과를 확인한 후에 결과를 준다)
		//(|| 두 개가 속도가 더 빠르다)
		System.out.println("bool => " + bool);	// bool => true
		
		/*
        if(조건) {
                  실행해야할 명령;     
        }
        ==> 조건이 참일때만 실행해야할 명령; 을 구동한다.
        ==> 조건이 거짓이라면 실행해야할 명령; 을 구동안한다.
   */
   int n1=10;
   
   if(n1 < 20) {
    // true
      System.out.println(">> n1은 20보다 작습니다.");
   }
		
		System.out.println("\n~~~~~~ 퀴즈 1 ~~~~~~\n");
		int i = 1;
		int j = i++;
		//	int j = i;	i = i + 1
		//	j = 1;	i = 2;
		
		if( (i > ++j ) & ( i++ == j ) ) {
/*
 			j = j + 1;	j == 2
 			( i > j ) == ( 2 > 2 )
 			false & ( i == j ) == ( 2 == 2 ) i = i + 1
 			(& 하나는 모든 결과를 확인한 후에 결과를 준다) 
 			i = 3;	j = 2
 			false & true = false 로 if 문은 사용되지 않는다.
 			
 			 			
 */
			i = i + j;
		}
				
		System.out.println("i = " + i);	// i = 3
		
		i = 1;		// i == 1
		j = i++;	// j = i;	i = i + 1;
					// j == 1;	i == 2
		
		if( ( i > ++j ) && ( i++ == j )) {
/*
 			j = j + 1;	j == 2
 			( i > j ) == ( 2 > 2 )		
 			false && (&& 2개는 처음이 거짓이기 때문에 어차피 결과가 거짓이라 뒤에 식을 계산하지 않는다)
 			
*/
			i = i + j;
		}
				
		System.out.println("i = " + i);	// i = 2
		
		System.out.println("\n~~~~~ 퀴즈2 ~~~~~\n");
		
		int m1 = 0;
		n1 = 1;
		
/*
 * 		m1 = 0	,	n1 = 1
 * 		0 == 0 참  
 * 		m1 = 1	
 * 		|
 * 		or 연산자는 하나라도 참이면 결과가 참이지만 | 는 결과가 나오더라도 모두 계산한다.
 * 		n1 = 1
 * 		1 == 2 거짓
 * 		n1 = 2
 * 		or 연산자는 하나만 참이어도 참
 * 		if문 실행
 * 		m1 = 42	,	n1 = 2
 * 
 */
		
		if( ( m1++ == 0 ) | ( n1++ == 2)) {
			m1 = 42;
		}
		
		System.out.println("m1 => " + m1 + ", n1 => " + n1);
		//	m1 => 42	, n1 => 2
		
		
		m1 = 0;
		n1 = 1;
		
/*
 * 		m1 = 0	,	n1 = 1
 * 		0 == 0 참 
 * 		m1 = 1
 * 		||
 * 		or 연산자는 하나라도 참이면 참이기 때문에 ||는 결과가 나오면 바로 연산 종료
 * 		if문 실행
 * 		m1 = 42	,	n1 = 1
 * 		
 * 
 * 
 */
		
		if( ( m1++ == 0 ) || ( n1++ == 2)) {
			m1 = 42;
		}
		
		System.out.println("m1 => " + m1 + ", n1 => "  + n1);
		
		
		// #### 5. 비교 연산자 ####
		/*
		 	== 같다,	!= 같지 않다
		 	> 크다,	< 작다,	>= 같거나 크다,  <= 같거나 작다.
		 */

		// #### 6. 할당 연산자(연산후 대입 연산자) ####
		//			+=	-=	*=	/=	%=
		System.out.println("\n====6번 할당 연산자(연산후 대입 연산자) ====");
		
		int no = 1;
		no += 3;	// no = no + 3;	와 같은 것이다.
		System.out.println("no => " + no);	//	no => 4
		
		no -= 2;	// no = no - 2;	와 같은 것이다.
		System.out.println("no => " + no);	//	no => 2ㄹ
		
		no *= 5;	// no = no * 5;	와 같은 것이다.
		System.out.println("no => " + no);	//	no => 10
		
		no /= 4;	// no = no / 4;	와 같은 것이다.
		System.out.println("no => " + no);	//	no => 2
		
		no %= 3;	// no = no % 3;	와 같은 것이다.
		System.out.println("no => " + no);	//	no => 2
		
		
		// #### 7. 삼항 연산자 ####
		/*
		  	변수선언 = (조건식)?값1:값2	==	조건식이 참이면 값1을 거짓이면 값2를 대입해준다.
		  	
		  	변수를 선언하고 나서 값을 부여하고자 할 때 사용되어지는데,
		  	조건식이 참 이라면 변수에 ? 다음에 나오는 값1 을 대입해주고,
		  	만약에 조건식이 거짓 이라면 변수에 : 다음에 나오는 값2 를 대입해준다.
		 */
		
		System.out.println("\n==== 7. 삼항 연산자 ====");
		int num1 = 50, num2 = 60;
		int num3 = (num1 > num2)?num1:num2;
		/*
		 * (num1 > num2) == (50 > 60) == false
		 * num3 = num2
		 * num3 = 60
		 */
		
		System.out.println("num3 => " + num3);	//	num3 => 60
	}
}
