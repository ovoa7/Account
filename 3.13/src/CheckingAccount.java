import java.util.Scanner;
public class CheckingAccount extends Account {
	private static double credit_limit;
	private static double loan_interest;
	private static double interest;
	CheckingAccount(double balance, double credit_limit,double loan_interest,double interest){
		super(balance);
		SetBalance(balance);
		this.credit_limit=credit_limit;
		this.loan_interest=loan_interest;
		this.interest=interest;
		
	}
	
	public double getWithrawableAccount(){
		return getBalance()+credit_limit;
	}
	public double passTime(int time){
		
		return getBalance()+time*interest;
	}
	public boolean isBankrupted(){
		if(getBalance()<-credit_limit){
			return false;
		}
		else{return true;}
	}
	@Override
	public  void debit(double amount){
		if (getBalance()+credit_limit<amount){
			System.out.print("exceed");
		}else{
			SetBalance(getBalance()-amount);
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
	
