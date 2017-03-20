import java.util.Scanner;

public class account {
	private double balance;
	public account(double balance){
		this.balance=balance;
	}
	
	public void add(double credit){
		balance=balance+credit;
	}
	public void subtract(double debit){
		balance=balance-debit;
	}
	public double getBalance(){
		return balance;
	}
	protected void SetBalance(double balance){
		this.balance=balance;
		
	}

}


