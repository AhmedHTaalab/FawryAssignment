package FawySystem;

public abstract class Payment {
	private int amount;

	public Payment(int am) {
		setAmount(am);
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public abstract void Pay(int amount);
	



}
