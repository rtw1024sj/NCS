package my.day17.b.user_define_exception;

public class Product_imple implements Product {
	
// public class Product_imple extends Object implements Product {	// extends Object 가 생략되어있는 것이다 즉, 위와 같은 것이다.	
// 모든 클래스의 최상위 부모 클래스는 Object 이며, 클래스 생성시 extends 를 하지 않으면 자동적으로 extends Object 가 생략된 것이다.
	
	// field
	private String prod_name;		// 제품명	("새우깡", "감자깡", "양파링")
	private int jango;				// 잔고 	(100   ,  50   .  150
	
	// method
	public String getProd_name() {
		return prod_name;
	}


	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}


	public int getJango() {
		return jango;
	}


	public void setJango(int jango) {
		this.jango = jango;
	}

	// 제품의 정보를 보여주기
	@Override
	public String toString() {
		return "1.제품명 : " + prod_name + "\n"
			+  "2.잔고량 : " + jango 	   + "개\n";
		
	}
	
	
	// 주문받기1
	@Override
	public void order(int jumun_su) throws Jango_lack_Exception {
		// order(int jumun_su) 메소드는 파라미터로 들어오는 jumun_su 의 값에 따라서 
		// 사용자(개발자)가 만든 Jango_lack_Exception 익셉션을 유발 할 수 있다는 말이다.

		if (jango < jumun_su) {
			throw new Jango_lack_Exception();	// throw 를 사용해서 Jango_lack_Exception 를 실행시켜 메시지를 출력시킨다. 
		}
		else {
			System.out.println(prod_name + "제품을" + jumun_su + "개를 주문하셨습니다.");
			jango -= jumun_su;	// 주문수 만큼 잔고를 빼준다. 
			System.out.println(toString());
		}
		
	}

	// 주문받기2
	@Override
	public void jumun(int jumun_su) throws Jango_lack_Exception {
		// order(int jumun_su) 메소드는 파라미터로 들어오는 jumun_su 의 값에 따라서 
		// 사용자(개발자)가 만든 Jango_lack_Exception 익셉션을 유발 할 수 있다는 말이다.
		
		if (jango < jumun_su) {
			throw new Jango_lack_Exception(prod_name + "은 " + "잔고가 " + jango + "개 인데 주문량이 " + jumun_su + " 라서 잔고부족으로 주문이 불가합니다."); 
		}
		else {
			System.out.println(prod_name + "제품을" + jumun_su + "개를 주문하셨습니다.");
			jango -= jumun_su;	// 주문수 만큼 잔고를 빼준다. 
			System.out.println(toString());
		}
		
	}

}

















