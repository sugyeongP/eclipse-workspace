package reference;

public class Student1 {

	int studentID;
	String studentName;
	Subject korean;
	Subject math;
	
	public Student1(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		korean = new Subject();
		math = new Subject();
		
	}
	
	public void setKoreanSubject(String name, int score) {
		korean.subjectName = name;
		korean.scorePoint = score;
		
	}
	
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.scorePoint = score;
	}
	
	public void showStudentInfo() {
		int total = korean.scorePoint + math.scorePoint;
		System.out.println(studentID + "학번 " + studentName + "학생의 총점은 " + total + "점 입니다.");
	}
	
}
