package inheritance;

public class Point extends Object{			// ��� Ŭ������ extends Object Ŭ������ �����Ǿ��ִ�.

	protected int x, y;	// ��ǥ�� ��Ÿ���� ����,
						// protected : default ���� �����ڿ� ����
						//			   �ٸ� ��Ű���� ��ӵ� Ŭ������ ������ ���
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("("+ x + ", " + y + ")");
	}
}
