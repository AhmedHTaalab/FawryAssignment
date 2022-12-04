package FawySystem;

public class Wallet implements Payment {
	public static int Wamount;
	

	public Wallet(int am) {
		Wamount = am;
	
	}
	

	public Wallet() {
	}

	@Override
	public void Pay(int amount) {
		
		if(Wamount >= amount) {
		System.out.println(amount +" Paid with Wallet");
		Wamount = Wamount - amount;
		return ;
		
		}
		else {
			System.out.println("No enough money in the wallet");
		}
		
	}

	public void check_wallet_money() {
		
		System.out.println("Wallet Avaliable Money is:" + Wamount);
	}
	


}


