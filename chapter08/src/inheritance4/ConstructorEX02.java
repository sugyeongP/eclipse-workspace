package inheritance4;

class A {
	public A() {
		System.out.println("������A");
	}
}
class B extends A {
	public B() {
		super();
		System.out.println("������B");
	}
}
class C extends B {
	public C() {
		super();		// ���� Ŭ����(super class : �θ� Ŭ����)�� �����ڸ� ȣ��, �ݵ�� ù��° ����.
		System.out.println("������C");
	}
}
public class ConstructorEX02 {						// ���� ���� Ŭ���� �߿� �ۺ� Ŭ������ �ϳ��� �;��Ѵ�.

	public static void main(String[] args) {
		C c;
		c = new C();
	}
}
