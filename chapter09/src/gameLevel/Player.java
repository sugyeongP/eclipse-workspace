package gameLevel;

public class Player {
	private PlayerLevel level;				// PlayerLever<��ü���ڷ���>, level <�ν��Ͻ���>
											// level �ν��Ͻ������� ��ü�� ��� ��� ����ȯ (��ĳ����)
	
	public Player() {						// �⺻ ������
		level = new BeginnerLevel();		// PlayerLevel �ڷ������� ��ĳ����
											// PlayerLevel level = new BeginnerLevel();
		level.showLevelMessage();
	}
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {	// ��ü�� ��ǲ������ �ް� ����ȯ(��ĳ����)
		this.level = level;
		level.showLevelMessage();
	}
	public void play(int count) {
		level.go(count);
	}

}
