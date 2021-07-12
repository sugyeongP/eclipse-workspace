package inheritance;

public class Point extends Object{			// 모든 클래스는 extends Object 클래스가 생략되어있다.

	protected int x, y;	// 좌표를 나타내는 변수,
						// protected : default 접근 제한자와 동일
						//			   다른 패키지에 상속된 클래스의 접근을 허용
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("("+ x + ", " + y + ")");
	}
}
