package inheritance5;
class A {
	public A() {
		System.out.println("������A");		// �⺻������
	}
	public A(int x) {
		System.out.println("�Űܺ���������A");	// �Ű����� ������
	}
	public A(int x, int y) {
		System.out.println("�Ű����������� 2���� A"); // �Ű����� ������2 , �޼ҵ� �����ε�(�޼ҵ� �̸��� ����. ��ǲ �Ű��� �̿��� ���� �ٸ����๮)
	}
}
class B extends A {
	public B() {
		System.out.println("������B");
	}
	public B(int x) {
		//super();			// A�� �⺻ ������ ȣ��
		//super(10);		// A�� �Ű����� ������ ȣ��
		super(10, 20);	// A�� �Ű����� ������2 ȣ��
		System.out.println("�Ű�����������B");
	}
}

public class ConstructorEX03 {

	public static void main(String[] args) {

		B b;
		b = new B(5);
	}

}
// ���迡 ���� 