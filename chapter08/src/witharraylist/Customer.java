package witharraylist;

public class Customer {

	protected int customerID;	// 고객 아이디
	protected String customerName;	// 고객 이름
	protected String customerGrade;	// 고객 등급
	int bonusPoint;		// 보너스 포인트
	double bonusRatio;	// 적립 비율
	
	public Customer() {
		initCustomer();
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	private void initCustomer() {		// 처음 회원 가입을 했을때 기본 등급 설정
		customerGrade = "SILVER";		// 기본 등급
		bonusRatio = 0.01;				// 보너스 포인트 기본 적립 비율(1%)
	}
	
	public int calcPrice(int price) {		// 포인트 적립, 가격 할인 ( VIP(10%), Gold(10%) )
		bonusPoint += price * bonusRatio;	// 보너스 포인트 계산(적립)
		return price;
	}
	
	public String showCustomerInfo() {		// 고객 정보 출력
		
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
}
