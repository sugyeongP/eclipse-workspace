package gameLevel;

public class MainBoard {

	public static void main(String[] args) {
		Player player = new Player();		// 기본 생성자 호출, BeginnerLevel()
		player.play(1);
		
		AdvanceLevel aLevel = new AdvanceLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}

}
