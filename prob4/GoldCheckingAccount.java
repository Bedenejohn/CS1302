package prob1;

public class GoldCheckingAccount extends CheckingAccount {
	public GoldCheckingAccount(int id, double balance){
		super(id,balance);
		if(balance < 1000)
			isLowBalance = true;
	}
	//@Overide
	public void endOfMonth(){
		numChecks = 0;
		if(isLowBalance)
			balance -= 25;
		else
			balance += balance * .01;
		if(balance < 1000)
			isLowBalance = true;
		else
			isLowBalance = false;
	}
	//@Overide
	public void processCheck(double amt){
		numChecks++;
		balance -= amt;
		if(balance < 0)
			balance -= 20;
		if(balance < 1000)
			isLowBalance = true;
	}
	//@Overide
	public String toString(){
		String result = String.format("GCA : id=%d balance=$%,.2f isLowBalance=%b numChecks=%d",id,balance,isLowBalance,numChecks);
		return result;
	}
}
