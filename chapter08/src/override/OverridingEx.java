package override;

class Shape {
	public Shape next;
	public Shape () { next = null; }
	
	public void draw() {				// 상위 클래스 메소드
		System.out.println("Shape");
	}
}
class Line extends Shape {
	public void draw() {				// 메소드 재정의 (메소드 오버 라이딩) : 상위 클래스에서 한번 설정된 값을 그대로 받아와 새로운 값을 넣음.
		System.out.println("Line");		// 메소드 재정의 : 객체의 다형성
	}
}
class Rect extends Shape {
	public void draw() {				// 메소드 오버라이딩
		System.out.println("Rect");
	}
}
class Circle extends Shape {
	public void draw() {				// 메소드 오버라이딩
		System.out.println("Circle");
	}
}

public class OverridingEx {
	static void paint(Shape p) {
		p.draw();
	}
	public static void main(String[] args) {
		Line line = new Line();		// 
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}

}
