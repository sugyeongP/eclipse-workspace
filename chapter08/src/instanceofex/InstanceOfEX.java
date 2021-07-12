package instanceofex;

class Person {}
class Student extends Person {}
class Resercher extends Person {}
class Professor extends Resercher {}

public class InstanceOfEX {

	static void print(Person p) {		// �� print(new Student()); ���� ��ĳ���õǾ� Person P = new Student�� �� 
		if (p instanceof Person) {
			System.out.print("Person ");
		}
		if (p instanceof Student) {
			System.out.print("Student ");
		}
		if (p instanceof Resercher) {
			System.out.print("Resercher ");
		}
		if (p instanceof Professor) {
			System.out.print("Professor ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.print("new Student() -> \t"); print(new Student());		// �ش��ϴ� ��ü�� ��� �����.
		System.out.print("new Resercher() -> \t"); print(new Resercher());
		System.out.print("new Professor() -> \t"); print(new Professor());

	}

}