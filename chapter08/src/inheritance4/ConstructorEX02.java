package inheritance4;

class A {
	public A() {
		System.out.println("생성자A");
	}
}
class B extends A {
	public B() {
		super();
		System.out.println("생성자B");
	}
}
class C extends B {
	public C() {
		super();		// 상위 클래스(super class : 부모 클래스)의 생성자를 호출, 반드시 첫번째 라인.
		System.out.println("생성자C");
	}
}
public class ConstructorEX02 {						// 여러 개의 클래스 중에 퍼블릭 클래스는 하나만 와야한다.

	public static void main(String[] args) {
		C c;
		c = new C();
	}
}
