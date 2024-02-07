package my.day16.b.INTERFACE;

public class Triangle implements Figure{
	// Triangle 이라는 클래스는 Figure 라는 인터페이스를 implements(구현)한다는 말이다.	

	@Override
	public double area(double x, double y) {
		return x*y*0.5;
	}

	@Override
	public double sircle_area(double r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double sircle_area(double x, double y) {
		// TODO Auto-generated method stub
		return 0;
	}

}
