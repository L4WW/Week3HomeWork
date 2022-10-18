package homeWork1;

public class MilitaryCreditManager extends BaseCreditManager implements CreditManager {
	public void calculate() {
		System.out.println("Asker kredisi hesaplandı");
	}
	public void save() {
		System.out.println("Asker kredisi verildi");
	}

}
