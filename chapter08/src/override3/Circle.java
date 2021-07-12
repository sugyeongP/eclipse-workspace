package override3;

class Shape{
	protected String name;
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println(name);
	}
}
public class Circle extends Shape {
	protected String name;
	
	@Override
	public void draw() {
		name = "Circle";
		super.name = "Shape";		// super = super Class(부모 클래스)
		super.draw();
		System.out.println(name);
	}

	public static void main(String[] args) {

		Shape b = new Circle();		// 업캐스팅, 서브클래스에서 부모클래스의 영역만 사용
		b.paint();
		
	}

}
