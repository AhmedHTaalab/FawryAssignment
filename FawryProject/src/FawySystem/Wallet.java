package FawySystem;

public class Wallet extends Payment  {
	int Wam;
	int result;

	public Wallet(int am) {
		super(am);
		// TODO Auto-generated constructor stub
		
	}
	
	


	public void setWam(int Wamx) {
		this.Wam = Wamx;
	}
	public int getWam() {
		return Wam;
	}


	@Override
	public void Pay(int amount) {
		getWam();
		
		if(Wam >= amount) {
		System.out.println(amount +" paid with Wallet");
		Wam = Wam - amount;
		return ;
		
		}
		else {
			System.out.println("No enough money in the wallet");
		}
		
	}

	public void check_wallet_money() {
		
		System.out.println("Wallet Avaliable Money is:" + getWam());
	}
	


}
