package witharraylist;

public class VIPCustomer extends Customer {

	private int agentID; 			// VIP 고객 상담원 ID
	double saleRatio; 				// VIP 할인률

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);	// 상위 클래스의 생성자를 호출
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);	// VIP 고객일 떄 가격 할인 (10%)
	}
	
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 담당 삼당원 번호는 " + agentID + "입니다.";
  	}
	
	public int getAentID() {
		return agentID;
	}
	
}
