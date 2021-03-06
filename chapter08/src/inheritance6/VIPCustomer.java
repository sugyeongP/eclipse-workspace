package inheritance6;

public class VIPCustomer extends Customer {

	private int agentID; 			// VIP 고객 상담원 ID
	double saleRatio; 				// VIP 할인률

	public VIPCustomer() {
		//super();				// 상위 클래스의 생성자를 호출, super() : 상위 클래스의 기본 생성자 호출
		customerGrade = "VIP"; 	// 고객 등급 VIP
		bonusRatio = 0.05; 		// 보너스 적릷 5%
		saleRatio = 0.1; 		// 할인률 10%
	}
	
	public int getAgentID() {		// VIP 고객을 위한 담당상담원 아이디
		return agentID;
	}

}
