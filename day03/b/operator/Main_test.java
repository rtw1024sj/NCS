package my.day03.b.operator;

public class Main_test {

	public static void main(String[] args) {
		int n1 = 10;

		if (n1 < 20) {
			System.out.println(">> n1은 20보다 작습니다.");
		}
		
		System.out.println("\n~~~~~~ 퀴즈 1 ~~~~~~\n");

		int i = 1;
		int j = i++;
/*
 * i = 1,	j = 1;
 * i = 2;
 * 
 * & 는 and 연산 (하나라도 거짓이면 결과도 거짓)
 * 
 * (i > j+1) == (2 > 1+1) == (2 > 2) == false
 * 
 * j = 2;
 * 
 * 현재 i = 2,	j = 2;
 * 
 * & 하나만 있을 경우에는 거짓이 나오더라도 모든 결과를 확인하고 마친다.
 * 
 * (i == j)	==	(2 == 2) == true
 * 
 * i++ == 2 + 1 = 3
 * 
 * i = 3;
 * 
 * if ( false & true) == false
 * 
 */
		if ((i > ++j) & (i++ == j)) {

			i = i + j;
		}

		System.out.println("i = " + i);

		i = 1;
		j = i++;
/*
 * i = 1;,	j = 1;
 * 
 * i++ == 1 + 1	== 2
 * 
 * i = 2;
 * 
 * (i > ++j) == (2 > 1+1) == (2 > 2) == false
 * 
 * &&는 하나라도 거짓이 나오면 결과도 거짓이기 때문에 연산을 종료한다.
 * 
 * 현재 i = 2,	j = 2;
 * 
 */
		if ((i > ++j) && (i++ == j)) {

			i = i + j;
		}

		System.out.println("i = " + i); // i = 2

		System.out.println("\n~~~~~ 퀴즈2 ~~~~~\n");

		int m1 = 0;
		n1 = 1;

		if ((m1++ == 0) | (n1++ == 2)) {
			m1 = 42;
		}

		System.out.println("m1 => " + m1 + ", n1 => " + n1);

		m1 = 0;
		n1 = 1;

		if ((m1++ == 0) || (n1++ == 2)) {
			m1 = 42;
		}

		System.out.println("m1 => " + m1 + ", n1 => " + n1);

	}

}
