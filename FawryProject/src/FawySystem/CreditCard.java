package FawySystem;

public class CreditCard extends Payment {
	
	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	
	public CreditCard(int am,String nm, String cN, String cv, String date) {
		super(am);
		// TODO Auto-generated constructor stub
		setName(nm);
		setCardNumber(cN);
		setCvv(cv);
		setDateOfExpiry(date);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	@Override
	public void Pay(int amount) {
		
		System.out.println(amount +" paid with Credit Card");
	}

		

	public void insertInWallet(int Wam) {
		int amount =0;
		Wallet wall = new Wallet(amount);
		wall.setWam(Wam);
		
		System.out.println(wall.getWam() +" Inserted In Wallet");
		
	}



}
