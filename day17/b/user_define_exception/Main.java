package my.day17.b.user_define_exception;

public class Main {

	public static void main(String[] args) {

		Product_imple p1 = new Product_imple();
		p1.setProd_name("새우깡");	// 새우깡 제품을 구입하고
		p1.setJango(100);			// 잔고는 100이다.
		
/*		
		// == Product_imple 클래스에서 toString() 메소드를 오버라이딩(재정의) 하기 전 == //
		System.out.println(p1);
		// my.day17.b.user_define_exception.Product_imple@2353b3e6
		// my.day17.b.user_define_exception 패키지에 있는
		// Product_imple 클래스로 만든 객체의
		// @2353b3e6 메모리 주소
		System.out.println(p1.toString());
		// my.day17.b.user_define_exception.Product_imple@2353b3e6
		// p1 == p1.toString()
		
		// == Product_imple 클래스에서 toString() 메소드를 오버라이딩(재정의) 한 이후 == //
		System.out.println(p1);
		// 1.제품명 : 새우깡
		// 2.잔고량 : 100개
		System.out.println(p1.toString());
		// 1.제품명 : 새우깡
		// 2.잔고량 : 100개
*/
		
		Product_imple p2 = new Product_imple();
		p2.setProd_name("감자깡");	
		p2.setJango(50);			
		
		Product_imple p3 = new Product_imple();
		p3.setProd_name("양파링");	
		p3.setJango(150);			
		
		Product[] prod_arr = new Product[3]; 
		prod_arr[0] = p1;
		prod_arr[1] = p2;
		prod_arr[2] = p3;
		
/*		
		forEach 문
		for (type var : iterate) {	
		body-of-loop
		}
		향상된 for문은 보기에 매우 직관적이고, 구조를 살펴보자면 iterate는 Loop를 돌릴 객체입니다.
		iterate 객체에서 1개씩 순차적으로 var에 대입되어 for문이 수행되고, iterate로 사용할 수 있는 자료형(Type)은 Loop를
		돌릴 수 있는 자료형(배열, ArrayList 등)만 가능합니다.
*/		
		for(Product prod : prod_arr) {	
			System.out.println(prod);
		} // end of for--------------------
		/*
 		    1.제품명 : 새우깡
			2.잔고량 : 100개
			
			1.제품명 : 감자깡
			2.잔고량 : 50개
			
			1.제품명 : 양파링
			2.잔고량 : 150개
		 */
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

//		prod_arr[0].order(30);
		// Unhandled exception type Jango_lack_Exception
		// user(내가) 만든 Jango_lack_Exception 때문에 문제가 된다.
		
		try {
			prod_arr[0].order(30);
		} catch (Jango_lack_Exception e) {
			e.printStackTrace();
		}
		/*
   		    새우깡제품을30개를 주문하셨습니다.
			1.제품명 : 새우깡
			2.잔고량 : 70개
		 */

		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		try {
			prod_arr[0].order(80);
		} catch (Jango_lack_Exception e) {
//			e.printStackTrace();
			System.out.println("예외메시지 : " + e.getMessage());
		}		
		// 예외메시지 : >> 잔고량이 주문량보다 적으므로 주문이 불가합니다. <<
		// 현재 prod_arr[0] 에 남은 Jango 는 70 이므로 Jango_lack_Exception 가 작동한다.

		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		try {
			prod_arr[2].jumun(200);
		} catch (Jango_lack_Exception e) {
			System.out.println("예외메시지 : " + e.getMessage());
		}		
		// 예외메시지 : 양파링은 잔고가 150개 인데 주문량이 200 라서 잔고부족으로 주문이 불가합니다.

		
	} // end of main()------------------------------------------------

}
