package FawySystem;

public class MobileRechargeFactory extends HandlerFactory {
private Form createdForm;
private String mobileNumber;
private int amount;
public MobileRechargeFactory(Form f, String mobile, int am) {
	
	this.mobileNumber = mobile;
	this.amount = am;
	setCreatedForm(f);
	
}


public Form getCreatedForm() {
	return createdForm;
}



public void setCreatedForm(Form createdForm) {
	this.createdForm = createdForm;
}

	
public Form create_Form() {
	
	Form createdForm = new MobileRechForm(mobileNumber,amount);
	
	return createdForm;
		
	}


}
