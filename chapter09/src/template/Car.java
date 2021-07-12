package template;

public abstract class Car {

	public abstract void drive();	// �߻� �޼���, ���� Ŭ�������� ������ �ؼ� ���
	public abstract void stop();	// �߻� �޼��夤
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	final public void run() {					// ���ø� �޼���
		startCar();								// 1. �õ��� �մϴ�.
		drive(); 	// ���� Ŭ�������� �������̵�		// 2. ������ ���ϴ�. (�ڵ�, ����)
		stop();		// ���� Ŭ�������� �������̵�		// 3. ���� ���� (�ڵ�, ����)
		turnOff();								// 4. �õ��� ���ϴ�.
	}
}
