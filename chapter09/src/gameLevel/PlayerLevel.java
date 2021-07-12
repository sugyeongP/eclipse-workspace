package gameLevel;

public abstract class PlayerLevel {
	
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count)			// ���ø� �޼��� (�۾��� ������ ����)
	{
		run();								// 1. run()
		for(int i = 0; i < count; i++) {	// 2. jump() �� �� �� �������.
			jump();
		}
		turn();								// 3. turn()
	}
}
