package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer c1 = new Computer();		// 추상 클래스는 객체(인스턴스)를 생성 할 수 없다.
		Computer c2 = new DeskTop();		// 두개의 추상 메소드 모두 구현되어 인스턴스 생성 가능.
		Computer c3 = new NoteBook();		// NoteBook클래스는 두개의 추상 메소드 중에 하나만 구현하여 하나의 추상 메소드가 남아 추상 클래스가 된다.
		Computer c4 = new MyNoteBook();		// MyNoteBook에서는 상위 NoteBook에 하나 자신이 하나 총 두개의 추상 메소드가 모두 구현되어 인스턴스 생성 가능
	}

}
