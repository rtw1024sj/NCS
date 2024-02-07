package my.day16.b.INTERFACE;

// Rectangle 이라는 클래스는 Figure 라는 인터페이스를 implements(구현)한다는 말이다. 
public class Rectangle implements Figure{
	// INTERFACE 는 implements 를 이용해서 상속한다.
	// INTERFACE 에는 미완성메소드만 있기 때문에 무조건 재정의 해야한다.

	@Override
	public double area(double x, double y) {
		return x * y;
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
