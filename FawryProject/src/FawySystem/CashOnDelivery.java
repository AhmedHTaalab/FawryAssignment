package FawySystem;

public class CashOnDelivery implements Payment{

	
	
	@Override
	public void Pay(int amount) {
		System.out.println(amount +" paid with Cash");
	}

}
