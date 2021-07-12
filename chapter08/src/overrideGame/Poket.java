package overrideGame;

public class Poket {

	public String race; //종족
	public String name; //이름
	public int age;
	public int power;
	public int energy;
	int cnt;
	
	public Poket() {
		System.out.println("시작");
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
	
	public void attack() {
		energy -= 15;
		power += 20;
	}
	
	public void print() {
		System.out.println("나이 : " + age);
		System.out.println("파워 : " + power);
		System.out.println("에너지 : " + energy);
	}
}
