package prob1;

public class AccountTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Checking Account");
		CheckingAccount ca = new CheckingAccount(123, 50.0);
		System.out.println("created: " + ca);
		ca.deposit(560.0);
		System.out.println("deposit: " + ca);
		ca.endOfMonth();
		System.out.println("end mon: " + ca);
		ca.processCheck(100.0);
		System.out.println("check  : " + ca);
		ca.processCheck(100.0);
		System.out.println("check  : " + ca);
		ca.processCheck(100.0);
		System.out.println("check  : " + ca);
		ca.processCheck(100.0);
		System.out.println("check  : " + ca);
		ca.endOfMonth();
		System.out.println("end mon: " + ca);
		ca.deposit(202.0);
		System.out.println("deposit: " + ca);
		ca.processCheck(500.0);
		System.out.println("check  : " + ca);
		ca.endOfMonth();
		System.out.println("end mon: " + ca);

		System.out.println("\n***Gold Checking Account");
		ca = new GoldCheckingAccount(456, 50.0);
		System.out.println("created: " + ca);
		ca.deposit(575.0);
		System.out.println("deposit: " + ca);
		ca.endOfMonth();
		System.out.println("end mon: " + ca);
		ca.deposit(1425.0);
		System.out.println("deposit: " + ca);
		ca.endOfMonth();
		System.out.println("end mon: " + ca);
		ca.processCheck(100.0);
		System.out.println("check  : " + ca);
		ca.processCheck(100.0);
		System.out.println("check  : " + ca);
		ca.processCheck(100.0);
		System.out.println("check  : " + ca);
		ca.processCheck(100.0);
		System.out.println("check  : " + ca);
		ca.endOfMonth();
		System.out.println("end mon: " + ca);


	}

}
