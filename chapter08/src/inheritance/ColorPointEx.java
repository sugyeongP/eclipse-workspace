package inheritance;

public class ColorPointEx {

	public static void main(String[] args) {

		Point p = new Point(); 				// Point 클래스의 객체 생성
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();	// ColorPoint 객체
		cp.set(3, 4);						// cp.set은 상위 클래스의 메소드 (부모 클래스(Point)의 것을 자식 클래스(ColorPoint(가 받아와서 사용)
		cp.setColor("red");
		cp.showColorPoint();
		
		
	}

}
