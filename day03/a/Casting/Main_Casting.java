package my.day03.a.Casting;

//=== casting 연산자에 대해서 알아본다. === 

/*
=== 데이터형 변환하기 ===
1. 자동 형변환(묵시적 형변환)
--> 데이터타입의 크기가 작은 것에서 크기가 큰쪽으로는 자동적으로 형변환이 발생된다. 

 byte(1byte) --> short(2byte) --> int(4byte) --> long(8byte)
    개미             병아리            강아지           사람   
   개미집            병아리집           강아지집          안방
 
 float(4byte) --> double(8byte) 
 
 --> 정수타입은 실수타입으로 자동형변환이 발생한다.
 
 char(2byte)
 --> char타입은 int형으로 자동형변환이 발생한다.


2. 강제 형변환(casting)
--> 데이터타입의 크기가 큰것을 작은것으로 강제적으로 형변환 시키는 것을 말한다.
         크기가작은타입 = (크기가작은타입)크기가큰타입
             
         실수를 정수로 강제적으로 형변환하는 것을 말한다.
         소수부는 무조건 절삭을 해버리고 정수만 나온다.
         정수 = (정수)실수         
*/

public class Main_Casting {

	public static void main(String[] args) {

		byte no1 = 100;	//byte => 메모리에서 1byte == -128 ~ 127
		
		short sh = no1;	//short => 메모리에서 2byte == -32768 ~ 32767
		//	위의 것은 short sh = (short) no1; 와 같은 것이다. (즉, 자동 형변환이다.)	
		System.out.println("sh =>" + sh);
		//	sh =>100
		
		int in = sh;	//	int => 메모리에서 4byte == -2,147,483,648 ~ 2,147,483,647
		//	위의 것은 int in = (int)sh; 와 같은 것이다. (즉, 자동 형변환이다.)	
		System.out.println("in =>" + in);
		//	in =>100
		
		long ln = in;	//	long => 메모리에서 8byte == -9,223,372,036,854,775,808 ~  9,223,372,036,854,775,807
		//	위의 것은 int in = (int)sh; 와 같은 것이다. (즉, 자동 형변환이다.)	
		System.out.println("ln =>" + ln);
		//	ln =>100

		float ft =1.234F;
		System.out.println("ft =>" + ft);	// float(4byte) 은 단정밀도 소수점이하 7자리까지 표현된다.
		//	ft =>1.234
		
		double db = ft;	//	double(8byte) : 배정밀도 소수점이하 15~16자리까지 표현된다.
		//	위의 것은 double db = (double)ft; 와 같은 것이다. (즉, 자동 형변환이다.)	
		System.out.println("db =>" + db);
		//	db =>1.2339999675750732
		
		System.out.println("\n~~~~~~~~~~~강제형변환~~~~~~~~~~~\n");
		
		double db2 = 1.23456789;
		System.out.println("db2 =>" + db2);
		//	db2 =>1.23456789

		float ft2 = (float)db2;
		System.out.println("ft2 =>" +ft2);
		//	ft2 =>1.2345679

		int in2 = 30000;
		System.out.println("in2 =>"+ in2);
		//	in2 =>30000

		short sh2 = (short) in2;
		System.out.println("sh2 =>" + sh2);
		//	sh2 =>30000

		in2 = 50000;
		sh2 = (short)in2;
		System.out.println("sh2 =>" + sh2);
		//	sh2 =>-15536	[강제 형 변환은 할 수 있지만 범위를 벗어나면 엉뚱한 값이 나온다.]
		
		long ln2 = 3000000000L;	//	long 8byte
		float ft3 = ln2;
		//	위의 것은 float ft3 = (float)ln2; 와 같은 것이다.
		System.out.println("ln2 =>" + ln2);
		//	ln2 =>3000000000
		System.out.println("ft3 =>" + ft3);
		//	ft3 =>3.0E9 3.0 * E(10의)9승 이다.

		double db3 = 123.98765;
		int in3 = (int)db3;	//	실수를 정수로 강제형변환 하면 소수부를 잘라버리는 절삭의 효과를 가진다.
		System.out.println("db3 =>" + db3);
		//	db3 =>123.98765
		System.out.println("in3 =>" + in3);
		//	in3 =>123
	}

}
