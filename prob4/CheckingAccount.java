package prob1;
import java.util.*;
public class CheckingAccount {
	protected double balance;
	protected int id;
	protected int numChecks;
	protected boolean isLowBalance;
	public CheckingAccount(int id, double balance){
		this.id = id;
		this.balance = balance;
		if(balance < 100)
			isLowBalance = true;
	}
	public void deposit(double amt){
		balance += amt;
	}
	public void endOfMonth(){
		if(numChecks > 3)
			balance -= (numChecks - 3) * 2;
		numChecks = 0;
		if(isLowBalance)
			balance -= 10;
		if(balance < 100)
			isLowBalance = true;
		else 
			isLowBalance = false;
	}
	public void processCheck(double amt){
		numChecks++;
		balance -= amt;
		if(balance < 0)
			balance -= 20;
		if(balance < 100)
			isLowBalance = true;
	}
	public int getId() {
		return id;
	}
	public double getBalance(){
		return balance;
	}
	public String toString(){
		String result = String.format("CA : id=%d balance=$%,.2f isLowBalance=%b numChecks=%d",id,balance,isLowBalance,numChecks);
		return result;
	}
}
