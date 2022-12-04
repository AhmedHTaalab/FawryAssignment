package FawySystem;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		/*
		Scanner cin = new Scanner(System.in);
		int LogginCheck;
		User ahmed = new User();
		System.out.println("Do you want to login (1) or Register user(2)");
		LogginCheck = cin.nextInt();
		if(LogginCheck== 2) {
		
		
			System.out.println("User number"+(i+1));
			System.out.println("Enter Email");
			String Email;
			Email = cin.next();
			ahmed.setEmail(Email); 
			System.out.println("Enter Password");
			String Password;
			Password = cin.next();
			ahmed.setPassword(Password);
			System.out.println("Enter UserName");
			String UserName = cin.next();
			UserName = cin.next();
			ahmed.setUsername(UserName);
			Wallet wx = new Wallet();
			
		
		} else if(LogginCheck==1) {
			System.out.println("Logged In" );
		}
		*/
		
		Scanner input = new Scanner(System.in); 
		
		
		System.out.println("Enter Email");
		String Email = input.next();
		System.out.println("Enter Password");
		String Password = input.next();
		System.out.println("Enter UserName");
		String UserName = input.next();
		
		System.out.println("EnterCardNumber");
		String CardNumber = input.next();
		System.out.println("Enter CVV");
		String CVV = input.next();
		System.out.println("Enter Expiray Date");
		String Date = input.next();
		
		System.out.println("Enter Amount should be Paid");
		int amount = input.nextInt() ;
		System.out.println("Wallet Avaliable Money is:");
		int WalletAmount = input.nextInt();
		
		CreditCard cc = new CreditCard(CardNumber, CVV, Date);
        Wallet wx = new Wallet();
        User ahmed = new User(Email,Password,UserName,wx,amount);
        Payment py = new Wallet();
  
        
        ahmed.InsertInWallet(cc,WalletAmount);
        ahmed.PayAmount(py);
        ahmed.check_wallet_money();
        
        
        Search sc=new Search();
	    ahmed.UserSearch(sc);
	    int x=0;
	    x=input.nextInt();
	    sc.create_object(x);
	    x=input.nextInt();
	    System.out.println(sc.choose_services_type(x));
	    
	   /* obj.show_services_type();
	    x=input.nextInt();
	    obj.create_object(x);
	    x=input.nextInt();
	    System.out.println(obj.choose_services_type(x));
	    */
	    
		int l;
		System.out.println("Enter 1) Overall Discount\n"
                + "2) Specific Discount\n");
		l = input.nextInt();
		if(l == 1)
		{
			Discount discount = new Overall_discount();
			discount.Add_Discount();
		}
		else if(l == 2)
		{
			Discount discount = new Specific_discount();
			discount.Add_Discount();
		}
    }

}
