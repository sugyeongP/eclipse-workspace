package polymorphism2;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
}

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}

public class AnimalTest1 {

	public static void main(String[] args) {
		AnimalTest1 aTest = new AnimalTest1();
		aTest.moveAnimal1(new Human());
		aTest.moveAnimal2(new Tiger());
		aTest.moveAnimal3(new Eagle());
	}

	public void moveAnimal1(Human h) {		// Human h = new Human();
		h.move();

	}
	public void moveAnimal2(Tiger t) {		// Tiger t = new Tiger();
		t.move();

	}
	public void moveAnimal3(Eagle e) {		// Eagle e = new Eagle();
		e.move();

	}

}
