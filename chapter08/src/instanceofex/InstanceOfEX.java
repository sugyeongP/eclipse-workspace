package instanceofex;

class Person {}
class Student extends Person {}
class Resercher extends Person {}
class Professor extends Resercher {}

public class InstanceOfEX {

	static void print(Person p) {		// 밑 print(new Student()); 에서 업캐스팅되어 Person P = new Student가 됨 
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
		System.out.print("new Student() -> \t"); print(new Student());		// 해당하는 객체를 모두 출력함.
		System.out.print("new Resercher() -> \t"); print(new Resercher());
		System.out.print("new Professor() -> \t"); print(new Professor());

	}

}
