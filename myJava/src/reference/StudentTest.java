package reference;

public class StudentTest {

	public static void main(String[] args) {

		Student1 studentLee = new Student1(2001, "이**");
		
		studentLee.setKoreanSubject("국어", 98);
		studentLee.setMathSubject("수학", 76);
		
		Student1 studentKim = new Student1(2031, "김**");
		
		studentKim.setKoreanSubject("국어", 69);
		studentKim.setMathSubject("수학", 84);
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
	}

}
