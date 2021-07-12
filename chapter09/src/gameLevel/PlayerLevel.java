package gameLevel;

public abstract class PlayerLevel {
	
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count)			// 템플릿 메서드 (작업의 순서를 정의)
	{
		run();								// 1. run()
		for(int i = 0; i < count; i++) {	// 2. jump() 를 몇 번 출력할지.
			jump();
		}
		turn();								// 3. turn()
	}
}
