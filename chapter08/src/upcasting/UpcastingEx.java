package upcasting;

public class UpcastingEx {

	public static void main(String[] args) {
		
		Person p;
		Student s = new Student("�ڼ���");
		
		p = s;					// ��ĳ���� : �ڽ�Ŭ�������� new�� ��ü�� ����� �θ�Ŭ���������� ������ ��ü�� ������ �ʰ�, 
								//         ���� Ŭ���� ��ü�� ���� Ŭ���� Ÿ������ ��ȯ�ϴ� ��. �θ�Ŭ���������� ��ü ��� ����.
								// p = (person)s; <== ��ĳ���� �Ҷ��� person �ڷ����� �������� �ʾƵ� ���������� ����
		// Person p = new Student("�ڼ���"); // ���� ������ �� �������� ��డ��. 
		
		System.out.println(p.name);
		
		//p.grade = "A";		// ������ ����
		//p.department = "HR"	// ������ ����
		//p.name ="ȫ�浿";
		//p.id ="ID";
		
		//s.grade = "A";
		//s.department = "HR";
		//s.id = "ID";
		//s.name = "��ʶ�";
				
	}

}