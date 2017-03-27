import java.util.Scanner;
public class Accounttest {
	public static void main (String[] args){
		
		Account account1 = new CheckingAccount(100,50,0.01,0.07);
		Account account2 = new SavingAccount(100,0.05);
		
		Scanner scan=new Scanner(System.in);
		double amount;
		System.out.printf("Account1 balance: ",account1.getBalance(),"출금 가능액: ",account1.getWithdrawableAccount());
		System.out.println("Enter withdrawal amount for Account1: ");
		amount=scan.nextDouble();
		account1.debit(amount);
		System.out.printf("Account1 balance: ",account1.getBalance(),"출금 가능액: ",account1.getWithdrawableAccount());
		account1.passTime(1);
		System.out.printf("Account1 balance: ",account1.getBalance(),"출금 가능액: ",account1.getWithdrawableAccount());
		account1.passTime(5);
		System.out.printf("Account1 balance: ",account1.getBalance(),"출금 가능액: ",account1.getWithdrawableAccount());
		
		
		System.out.println();
		System.out.printf("Account2 balance: ",account2.getBalance(),"출금 가능액: ",account2.getWithdrawableAccount());
		System.out.println("6 Month later!");
		account2.passTime(6);
		System.out.printf("Account1 balance: ",account2.getBalance(),"출금 가능액: ",account2.getWithdrawableAccount());
		account2.debit(50);
		System.out.println("next 6 Month later!");
		account2.passTime(6);
		System.out.printf("Account1 balance: ",account2.getBalance(),"출금 가능액: ",account2.getWithdrawableAccount());
		System.out.println("next 1 Month later!");
		account2.passTime(1);
		System.out.printf("Account1 balance: ",account2.getBalance(),"출금 가능액: ",account2.getWithdrawableAccount());
		account2.debit(50);
		System.out.printf("Account1 balance: ",account2.getBalance(),"출금 가능액: ",account2.getWithdrawableAccount());
	}


}
