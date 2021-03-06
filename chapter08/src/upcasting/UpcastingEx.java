package upcasting;

public class UpcastingEx {

	public static void main(String[] args) {
		
		Person p;
		Student s = new Student("박수경");
		
		p = s;					// 업캐스팅 : 자식클래스에서 new로 객체를 만들고 부모클래스에서는 별도의 객체를 만들지 않고, 
								//         서브 클래스 객체를 슈퍼 클래스 타입으로 변환하는 것. 부모클래스에서도 객체 사용 가능.
								// p = (person)s; <== 업캐스팅 할때는 person 자료형을 명시하지 않아도 묵시적으로 적용
		// Person p = new Student("박수경"); // 위의 세줄을 한 라인으로 축약가능. 
		
		System.out.println(p.name);
		
		//p.grade = "A";		// 컴파일 오류
		//p.department = "HR"	// 컴파일 오류
		//p.name ="홍길동";
		//p.id ="ID";
		
		//s.grade = "A";
		//s.department = "HR";
		//s.id = "ID";
		//s.name = "김똘똘";
				
	}

}
