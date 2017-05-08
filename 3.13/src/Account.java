import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public abstract class Account implements Valuable{
	protected double balance;
	private double time;
	public Account(double balance){
		this.balance=balance;
	}
	public static double sumForAccount(ArrayList<Account> list){
		double sum=0;
		for(Account account:list){
			sum+=account.getBalance();
		}
		return sum;
	}
	public static void passTimeForList(ArrayList<Account> list,int month){
		for(Account account: list){
			account.passTime(month);
		}
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


