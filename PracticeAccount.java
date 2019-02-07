package objectoriented.com;

public class PracticeAccount {

	public static void main(String[] args) {
		CustomerOne cone = new CustomerOne(1,"hello customer",'m');
		Account3 a3 = new Account3(33,cone,9999.77);
		System.out.println("Details are------");
		System.out.println(a3);
		a3.deposit(787878.67);
		a3.withdraw(565665.87);
	}

}
