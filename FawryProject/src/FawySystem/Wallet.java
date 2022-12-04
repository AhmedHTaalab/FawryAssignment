package FawySystem;

public class Wallet implements Payment {
	public static int Wam;
	

	public Wallet(int am) {
		Wam = am;
	
	}
	

	public Wallet() {
	}

	@Override
	public void Pay(int amount) {
		
		if(Wam >= amount) {
		System.out.println(amount +" Paid with Wallet");
		Wam = Wam - amount;
		return ;
		
		}
		else {
			System.out.println("No enough money in the wallet");
		}
		
	}

	public void check_wallet_money() {
		
		System.out.println("Wallet Avaliable Money is:" + Wam);
	}
	


}


