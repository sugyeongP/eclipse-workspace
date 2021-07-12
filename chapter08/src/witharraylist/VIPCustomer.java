package witharraylist;

public class VIPCustomer extends Customer {

	private int agentID; 			// VIP ���� ���� ID
	double saleRatio; 				// VIP ���η�

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);	// ���� Ŭ������ �����ڸ� ȣ��
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);	// VIP ������ �� ���� ���� (10%)
	}
	
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " ��� ���� ��ȣ�� " + agentID + "�Դϴ�.";
  	}
	
	public int getAentID() {
		return agentID;
	}
	
}