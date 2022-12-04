package FawySystem;

import java.lang.String;
public class User {
    private String email;
    private String password;
    private String username;
    private Wallet wallets;
 
public User(String em,String pass, String user, Wallet wall){
        setEmail(em);
        setPassword(pass);
        setUsername(user);
        setWallets(wall);

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


}
