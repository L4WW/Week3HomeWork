package homeWork1;

public class CustomerManager {
	private Customer _customer;
	public CreditManager _creditManager;
	
	public CustomerManager(Customer customer, CreditManager creditManager) {
		_customer = customer;
		_creditManager = creditManager;
	}
	
	public void save() {
		System.out.println("Müşteri Kaydedildi :" );
	}
	
	public void delete() {
		System.out.println("Müşteri Silindi :");
	}
	public void giveCredit() {
		_creditManager.calculate();
		_creditManager.save();
		System.out.println("Kredi verildi");
	}

}
