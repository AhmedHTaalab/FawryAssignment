package FawySystem;

public class LandLineFactory extends HandlerFactory {
		private Form createdForm;
		private String homeNumber;
		private int amount;
		
		public LandLineFactory(String hNumber, int am) {
			this.sethomeNumber(hNumber);
			this.setAmount(am);
		}
		public String gethomeNumber() {
			return homeNumber;
		}
		public void sethomeNumber(String homeNumber) {
			this.homeNumber = homeNumber;
		}
		public int getAmount() {
			return amount;
		}
		public void setAmount(int amount) {
			this.amount = amount;
		}

		@Override
		public Form create_Form() {
		Form createdForm = new LandlineForm(homeNumber,amount);
			return createdForm;
	}

	}


