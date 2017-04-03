import java.util.Scanner;
public class checkingAccount extends Account {
	private static double credit_limit;
	private static double loan_interest;
	private static double interest;
	checkingAccount(double balance, double credit_limit,double interest,double loan_interest){
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

	@Override
	public double EstimateValue(int month) {
		
		return getBalance() * (1+interest*month);
		}

	@Override
	public double getWithrawableAccount() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public double passTime(int time) {
		// TODO Auto-generated method stub
		return 0;
	}	
	public String toString(){
		return String.format("CheckingAccount_Balance: %f",this.getBalance());
	}
		
}
	
