package inheritance2;

public class InheritanceEx {

	public static void main(String[] args) {

		Student s = new Student();
		s.set();
		
		System.out.println(s.age);
		System.out.println(s.name);
		System.out.println(s.height);
		System.out.println(s.getWeight());		// private , getter를 통해서 변수의 값 출력
		
	}

}
