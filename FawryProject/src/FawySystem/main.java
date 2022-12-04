package FawySystem;

public class main {
	public static void main(String[] args) {
		int amount = 100;
		int WalletAmount = 300;
		CreditCard cc = new CreditCard(amount, "XX", "XX", "XX", "XX");
        Wallet wx = new Wallet(80);
        User ahmed = new User("Taalab@gm","xxx","HTaalab",wx,amount);
        Payment py = new Wallet(100);
  
        ahmed.setWalletAmount(WalletAmount);
        ahmed.InsertInWallet(cc);
        ahmed.PayAmount(py);
        ahmed.check_wallet_money();
        
        
    }

}
