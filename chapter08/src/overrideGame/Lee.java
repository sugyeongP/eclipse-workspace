package overrideGame;

public class Lee extends Poket {
	public int cnt;
	public Lee(String name) {
		this.name = name;
		race = "Leesanghee";
		age = 0;
		power = 150;
		energy = 200;
		cnt = 0;
		System.out.println("�̻��ؾ��� ����������ϴ�.");
	}
	public void eat() {
		energy += 15;
		cnt++;
		aging();
	}
	public void sleep() {
		energy += 5;
		cnt++;
		aging();
	}
	public void exercise() {
		energy -= 10;
		power += 10;
	}
	public void aging() {
		if(cnt > 3) {
			age++;
			cnt = 0;
		}
	}
	
	public void attcck() {
		energy -= 15;
		power += 20;
	}
	
	public void print() {
		System.out.println("���� : " + age);
		System.out.println("�Ŀ� : " + power);
		System.out.println("������ : " + energy);
	}


}
