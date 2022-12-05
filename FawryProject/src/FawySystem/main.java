package FawySystem;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
	
/*		
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
		int amount = input.nextInt();
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
    */
		Scanner cin = new Scanner(System.in);
		System.out.println("Welcome To Fawry \n");
		System.out.println("1)user..\n"
				+ "2)Admin..\n");
		int x = cin.nextInt();
		if(x == 1)
		{
			System.out.println("Enter Email");
			String Email = cin.next();
			System.out.println("Enter Password");
			String Password = cin.next();
			System.out.println("Enter UserName");
			String UserName = cin.next();
			System.out.println("Enter Wallet Amount\n");
			int Wm = cin.nextInt(); 
			
			System.out.println("1)Search and Payment\n "
		    		+ "2)Refund\n ");
			int y = cin.nextInt();
			if(y == 1)
			{
				Wallet wx = new Wallet();
			User username = new User(Email,Password,UserName,wx,Wm);
			Search sc=new Search();
			username.UserSearch(sc);
		    int a=0;
		    a=cin.nextInt();
		    sc.create_object(a);
		    a=cin.nextInt();
		    System.out.println(sc.choose_services_type(a));

		    System.out.println("Choose the Payment Method\n"
		    		+ "1)Credit Card\n "
		    		+ "2)Wallett\n "
		    		+ "3)Cash\n");
		    int q = cin.nextInt();
		    System.out.println("Enter Amount should be Paid");
			int amount = cin.nextInt() ;
		    if(q == 1)
		    {
		    	System.out.println("EnterCardNumber");
				String CardNumber = cin.next();
				System.out.println("Enter CVV");
				String CVV = cin.next();
				System.out.println("Enter Expiray Date");
				String Date = cin.next();
				
		    	CreditCard cc = new CreditCard(CardNumber, CVV, Date);
		    	username.PayAmount(cc);
		    }
		    else if(q ==2)
		    {
		    	Wallet wallet = new Wallet(Wm);
		    	if(Wm>=amount)
		    	{
		    		username.PayAmount(wallet);
		    		username.check_wallet_money();
		    	}
		    	else 
		    	{
					
		    		System.out.println("not enough\n");
					System.out.println("Enter CreditCard to add Amount in Wallet");
					System.out.println("EnterCardNumber");
					String CardNumber = cin.next();
					System.out.println("Enter CVV");
					String CVV = cin.next();
					System.out.println("Enter Expiray Date");
					String Date = cin.next();
					

					CreditCard cc = new CreditCard(CardNumber, CVV, Date);
					System.out.println("Enter Amount you want to insert in Wallet\n");
					int Wamount = cin.nextInt();
					username.InsertInWallet(cc,Wamount);
					
					
					
		    	}
		    	
		    }
		    else if(q == 3)
		    {
		    	CashOnDelivery cash = new CashOnDelivery();
		    	username.PayAmount(cash);
		    }
			else if(y == 2)
			{
				System.out.println("Enter phone number\n");
				String phonenumber = cin.next();
				//System.out.println("Enter Your Service to Refund\n");
				//String Service = cin.next();
				Services ser = new Landline();
				Refund refund = new Refund(amount, phonenumber, ser);
				refund.requestRefund(amount, phonenumber, ser);
			}
		}
		else if(x == 2)
		{
			System.out.println("Enter Name \n");
			String name = cin.next();
			System.out.println("Enter ID \n");
			int id = cin.nextInt();
			System.out.println("Enter Email \n");
			String email = cin.next();
		
			Admin admin = new Admin(name, id, email);
			
			System.out.println("1)Add Discount\n"
					+ "2)Show Refund List \n"
					+"3)Add Service Provider\n");
			int i = cin.nextInt();
			if(i == 1)
			{
				System.out.println("Enter 1) Overall Discount\n"
		                + "2) Specific Discount\n");
				int l = cin.nextInt();
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
			else if( i == 2)
			{
			    System.out.println("Refund admin\n");
			}
			else if(i == 3)
			{
				System.out.println("Add Service Provider\n");
			}
			else
				System.out.println("Invalid selection \n");
		}
		else
			System.out.println("Invalid selection \n");
    }

		}
		
	}
}
	

