package abstractex;

public abstract class Computer {	// �߻� Ŭ������ �߻� �޼ҵ带 ����, ���� �س��� ���� Ŭ�������� �����Ѵ�.
									// ���ø�, �����ӿ�ũ ����, �������̽� ����,

	public abstract void display();		// �߻� �޼ҵ� : ����θ� ���� �ϰ� �����{}�� ���� �޼ҵ�
	abstract public void typing();		// �߻� �޼ҵ�

	//public void add(int a, int b) {	}		// �Ϲ� �޼ҵ�
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}