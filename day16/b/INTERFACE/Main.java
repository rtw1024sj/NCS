package my.day16.b.INTERFACE;

public class Main {

	public static void main(String[] args) {
		// == 다형성(Polymorphism) == //
	    // ==> 자식클래스로 생성되어진 객체를 부모클래스의 타입으로 받을 수 가 있다.
	    // ==> 특정한 인터페이스로 구현된 클래스의 객체는 특정한 인터페이스의 타입으로 받을 수 가 있다.

		Figure fg1 = new Rectangle();
		Figure fg2 = new Triangle();
		Figure fg3 = new Circle();
		Figure fg4 = new Ellipse();
		
		System.out.println("가로 4, 세로 5인 사각형의 넓이 => " + fg1.area(4, 5));
		System.out.println("밑변 4, 높이 5인 삼각형의 넓이 => " + fg2.area(4, 5));
		System.out.println("반지름이 4인 원의 넓이 => " + fg3.sircle_area(4));
		System.out.println("장축 8, 단축 4인 타원의 넓이 => " + fg4.sircle_area(8, 4));
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
//		Figure fg = new Figure();	// Figure 는 interface 이기 때문에 객체가 될 수 없다.
		// 대신
		Figure[] fg_arr = new Figure[4];
		// Figure 라는 interface 의 저장소는 가능하다.
		fg_arr[0] = new Rectangle();
		fg_arr[1] = new Triangle();
		fg_arr[2] = new Circle();
		fg_arr[3] = new Ellipse();
		
		// fg_arr[] 는 interface type 이다.
		
		for (Figure fg : fg_arr) {
			if( fg instanceof Circle) {	// Circle
				System.out.println(fg.sircle_area(4));
			}
			else if (fg instanceof Ellipse) { // Ellipse
				System.out.println(fg.sircle_area(8, 4));
			}
			else { // Rectangle , Triangle
				System.out.println(fg.area(4, 5));
			}
			
		} // end of for----------------------
		
		
	} // end of public static void main(String[] args) ---------------

}
