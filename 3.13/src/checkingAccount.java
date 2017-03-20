import java.util.Scanner;
public class checkingAccount extends account {
	private double credit_limit;
	private double loan_interest;
	private double interest;
	checkingAccount(double balance, double credit_limit,double loan_interest,double interest){
		super(balance);
		SetBalance(balance);
		this.credit_limit=credit_limit;
		this.loan_interest=loan_interest;
		this.interest=interest;
		
	}
	@Override
	public void subtract(double debit){
		if (getBalance()+credit_limit<debit){
			System.out.print("exceed");
		}else{
			SetBalance(getBalance()+credit_limit-debit);
			if (getBalance()<0){
				System.out.print("balance <0");
			}
		}
	}
	public double nextMonth(double loan_interest,double interest){
		
		
	}
	
}
