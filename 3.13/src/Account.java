import java.util.Scanner;

public abstract class Account {
	private static double balance;
	private static double time;
	public Account(double balance){
		this.balance=balance;
	}
	
	public void add(double credit){
		balance=balance+credit;
	}
	public void debit(double amount){
		if (amount>getBalance()){
			System.out.print("exceed");
		}else{
		balance=balance-amount;
		}
	}
	public static double getBalance(){
		return balance;
	}
	protected  void SetBalance(double balance){
		this.balance=balance;
		
	}
	public abstract double getWithrawableAccount();
	public abstract double passTime(int time);
}


