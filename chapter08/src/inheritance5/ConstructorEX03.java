package inheritance5;
class A {
	public A() {
		System.out.println("생성자A");		// 기본생성자
	}
	public A(int x) {
		System.out.println("매겨변수생성자A");	// 매개변수 생성자
	}
	public A(int x, int y) {
		System.out.println("매개변수생성자 2개인 A"); // 매개변수 생성자2 , 메소드 오버로딩(메소드 이름이 같다. 인풋 매개를 이용해 각기 다른실행문)
	}
}
class B extends A {
	public B() {
		System.out.println("생성자B");
	}
	public B(int x) {
		//super();			// A의 기본 생성자 호출
		//super(10);		// A의 매개변수 생성자 호출
		super(10, 20);	// A의 매개변수 생성자2 호출
		System.out.println("매개변수생성자B");
	}
}

public class ConstructorEX03 {

	public static void main(String[] args) {

		B b;
		b = new B(5);
	}

}
// 시험에 나옴 