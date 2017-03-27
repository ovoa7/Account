import java.util.Scanner;
public class checkingAccount extends account {
	private static double credit_limit;
	private static double loan_interest;
	private static double interest;
	checkingAccount(double balance, double credit_limit,double loan_interest,double interest){
		super(balance);
		SetBalance(balance);
		this.credit_limit=credit_limit;
		this.loan_interest=loan_interest;
		this.interest=interest;
		
	}
	
	public  void subtract(double debit){
		if (getBalance()+credit_limit<debit){
			System.out.print("exceed");
		}else{
			SetBalance(getBalance()-debit);
			if (getBalance()<0){
				System.out.print("balance <0");
			}
		}
	}
	public static double nextMonth(){
		if(getBalance()>0){
			return getBalance()*interest+getBalance();
		}else{
			return getBalance()*loan_interest+getBalance();
		}
	}	
		
}
	
