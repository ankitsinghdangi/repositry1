package objectoriented.com;

public class Account3 {
	private int id;
	private CustomerOne customer;
	private double balance;

	public Account3(int id, CustomerOne customer,double balance) {
		this.id = id;
		this.customer = customer;
		this.balance = balance;
		
	}

	@Override
	public String toString() {
		return "Account3 [id=" + id + ", customer=" + customer + ", balance=" + balance + "]";
	}

	public int getId() {
		return id;
	}

	

	public CustomerOne getCustomer() {
		return customer;
	}

	

	

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
   public double deposit( double amount) {
   return amount+=balance;	
}
   public double withdraw( double amount) {
	   if(balance >= amount) {
		  System.out.println("Subtract amount to balance");
	   }
		   else
		   {
			   System.out.println("amount withdrawn");
		  
	   }
	   return balance;
   
}
}
