package reference;

public class StudentTest {

	public static void main(String[] args) {

		Student1 studentLee = new Student1(2001, "��**");
		
		studentLee.setKoreanSubject("����", 98);
		studentLee.setMathSubject("����", 76);
		
		Student1 studentKim = new Student1(2031, "��**");
		
		studentKim.setKoreanSubject("����", 69);
		studentKim.setMathSubject("����", 84);
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
	}

}
