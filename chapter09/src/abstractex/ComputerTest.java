package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer c1 = new Computer();		// �߻� Ŭ������ ��ü(�ν��Ͻ�)�� ���� �� �� ����.
		Computer c2 = new DeskTop();		// �ΰ��� �߻� �޼ҵ� ��� �����Ǿ� �ν��Ͻ� ���� ����.
		Computer c3 = new NoteBook();		// NoteBookŬ������ �ΰ��� �߻� �޼ҵ� �߿� �ϳ��� �����Ͽ� �ϳ��� �߻� �޼ҵ尡 ���� �߻� Ŭ������ �ȴ�.
		Computer c4 = new MyNoteBook();		// MyNoteBook������ ���� NoteBook�� �ϳ� �ڽ��� �ϳ� �� �ΰ��� �߻� �޼ҵ尡 ��� �����Ǿ� �ν��Ͻ� ���� ����
	}

}
