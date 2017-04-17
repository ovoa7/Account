import java.util.Scanner;

public abstract class Account implements Valuable{
	protected double balance;
	private double time;
	public Account(double balance){
		this.balance=balance;
	}
	
	
	public void credit(double credit){
		balance=balance+credit;
	}
	public void debit(double amount) throws Exception{
		balance=balance-amount;
	}
	public double getBalance(){
		return balance;
	}
	protected  void SetBalance(double balance){
		this.balance=balance;
		
	}
	public abstract double getWithdrawableAccount();
	public abstract void passTime(int time);
	public abstract void passTime();
}


