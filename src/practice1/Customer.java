package practice1;

public class Customer {
	//필드
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	//메소드
	public Customer() {
		
	}
	public Customer(int customerID, String customerName) {
		this.customerID=customerID;
		this.customerName=customerName;
		initCustomer();
	}
	private void initCustomer() {
		this.customerGrade="SILVER";
		this.bonusRatio=0.01;
	}
	public int calcPrice(int price) {
		
	}
	public String showCustomerInfo() {
		
	}
}	
