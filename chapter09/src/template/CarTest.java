package template;

public class CarTest {
	public static void main(String[] args) {
		System.out.println("=== ���� �����ϴ� �ڵ��� ===");
		Car myCar = new AICar();		//Car �������� ��ĳ����
		myCar.run();
		
		System.out.println("=== ����� �����ϴ� �ڵ��� ===");
		Car hisCar = new ManualCar();	//Car ���̱׷� ��ĳ����
		hisCar.run();
	}
}
