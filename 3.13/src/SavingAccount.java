
public class SavingAccount extends Account {
	private double interest;
	private int month=0;
	SavingAccount(double balance, double interest){
		super(balance);
		SetBalance(balance);
		this.interest=interest;
	}
	@Override
	public void debit(double amount) throws Exception{
		if (month<11)throw new Exception("���� ����� �� �����ϴ�.");
		if (amount<0) throw new Exception("�����Է�!");
		if (balance<amount) throw new Exception("�ѵ��ʰ�!");
		balance=balance-amount;
			
		
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
			SetBalance(balance);
		}
		return 0;
		
		
	}
	@Override
	public double EstimateValue(int month) {
		
		
		return getBalance()*Math.pow(1+interest,month);
	}
	public String toString(){
		return String.format("SavingAccount_Balance: %f",this.getBalance());
	}

	

}
