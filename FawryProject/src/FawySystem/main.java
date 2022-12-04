package FawySystem;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		
		
		Scanner cin = new Scanner(System.in); 
		
		
		System.out.println("Enter Email");
		String Email = cin.next();
		System.out.println("Enter Password");
		String Password = cin.next();
		System.out.println("Enter UserName");
		String UserName = cin.next();
		
		System.out.println("EnterCardNumber");
		String CardNumber = cin.next();
		System.out.println("Enter CVV");
		String CVV = cin.next();
		System.out.println("Enter Expiray Date");
		String Date = cin.next();
		
		System.out.println("Enter Amount should be Paid");
		int amount = cin.nextInt() ;
		System.out.println("Enter Amount you want to add to wallet");
		int WalletAmount = cin.nextInt();
		
		CreditCard cc = new CreditCard(CardNumber, CVV, Date);
        Wallet wx = new Wallet();
        User ahmed = new User(Email,Password,UserName,wx,amount);
        Payment py = new Wallet();
  
        
        ahmed.InsertInWallet(cc,WalletAmount);
        ahmed.PayAmount(py);
        ahmed.check_wallet_money();
        
        
    }

}
