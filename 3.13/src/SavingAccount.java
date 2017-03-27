
public class SavingAccount extends Account {
	private static double interest;
	private int month=0;
	SavingAccount(double balance, double interest){
		super(balance);
		SetBalance(balance);
		this.interest=interest;
	}
	@Override
	public void debit(double amount){
		if (month<11){
			System.out.println("아직 출금할 수 없습니다.");
		}else{
			SetBalance(getBalance()-amount);
		}
		
	}
	@Override
	public double passTime(int time){
		month= month+time;
		if (month>=12){
			return getBalance()*Math.pow(1+interest,12);
		}
		return 0;
	}
	@Override
	public double getWithrawableAccount(){
		if (month>=12){
			return SetBalance(balance);
		}
		
		
	}
	

	

}
