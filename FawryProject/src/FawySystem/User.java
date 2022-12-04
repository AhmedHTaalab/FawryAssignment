package FawySystem;

import java.lang.String;
public class User {
	private int WalletAmount;
	private int ItemPrice;
    private String email;
    private String password;
    private String username;
    private Wallet wallets;
 
public User(String em,String pass, String user, Wallet wall, int Item){
        setEmail(em);
        setPassword(pass);
        setUsername(user);
        setWallets(wall);
        setItemPrice(Item);

}
public Wallet getWallets() {
	return wallets;
}
public void setWallets(Wallet wallets) {
	this.wallets = wallets;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}

public int getItemPrice() {
	return ItemPrice;
}
public void setItemPrice(int itemPrice) {
	ItemPrice = itemPrice;
}

public int getWalletAmount() {
	return WalletAmount;
}
public void setWalletAmount(int walletAmount) {
	WalletAmount = walletAmount;
}



public void PayAmount(Payment py) {
	py.Pay(ItemPrice);
}

public void InsertInWallet(CreditCard cc) {
	
	cc.insertInWallet(WalletAmount);
}
public void check_wallet_money() {
	
	wallets.check_wallet_money();
}


}
