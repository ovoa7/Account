import java.util.Scanner;

public class account {
	private static double balance;
	public account(double balance){
		this.balance=balance;
	}
	
	public void add(double credit){
		balance=balance+credit;
	}
	public void subtract(double debit){
		if (debit>getBalance()){
			System.out.print("exceed");
		}else{
		balance=balance-debit;
		}
	}
	public static double getBalance(){
		return balance;
	}
	protected  void SetBalance(double balance){
		this.balance=balance;
		
	}

}


