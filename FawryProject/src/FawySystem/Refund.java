package FawySystem;

import java.util.ArrayList;
import java.util.List;


public class Refund {
	
	private int amount; 
	private String phoneNum;
	private String service;
	
	public Refund(int amount, String phoneNum, String service) {
		
		this.amount = amount;
		this.phoneNum = phoneNum;
		this.service = service;

	}
	
	String getNum() {
		return phoneNum;
	}
	
	String getService() {
		return service;
	}
	
	int getAmount() {
		return amount;
	}
	
	private List<Refund> refund = new ArrayList<Refund>();
	
	List<Admin> admin = new ArrayList<Admin>();
	
	void addAdmin(String name, int Id, String email) {
		
		admin.add(new Admin(name, Id, email));
		
	}
	
	void requestRefund(int amount, String phoneNum, String service) {
		
		refund.add(new Refund(amount, phoneNum, service));
		notifyAdmins(new Refund(amount, phoneNum, service));
	}
	
	void refundConfirmation(String confirmation) {
	
		if(confirmation =="Yes") {
			System.out.print("Refunded");
		} else {
			System.out.print("Not Refunded");
		}
		
	}
	
	List<Refund> getRefunds(){
		return refund;
	} 
	
	void notifyAdmins(Refund refund) {
		for(Admin admin: admin) {
			admin.updateRefund(refund);
		}
		
	}
}