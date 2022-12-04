package FawySystem;

public class CashOnDelivery extends Payment {

	public CashOnDelivery(int am) {
		super(am);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void Pay(int amount) {
		
		System.out.println(amount +" paid with Cash");
	}

}
