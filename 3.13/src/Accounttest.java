import java.util.Scanner;
public class Accounttest {
	public static void main (String[] args){
		
<<<<<<< HEAD
		Account account1 = new CheckingAccount(100,50,0.01,0.07);
		Account account2 = new SavingAccount(100,0.05);
		
		Scanner scan=new Scanner(System.in);
		
		double amount;
		System.out.printf("Account1 balance: ",account1.getBalance(),"��� ���ɾ�: ",account1.getWithdrawableAccount());
		System.out.println("Enter withdrawal amount for Account1: ");
		amount=scan.nextDouble();
		account1.debit(amount);
		System.out.printf("Account1 balance: ",account1.getBalance(),"��� ���ɾ�: ",account1.getWithdrawableAccount());
		account1.passTime(1);
		System.out.printf("Account1 balance: ",account1.getBalance(),"��� ���ɾ�: ",account1.getWithdrawableAccount());
		account1.passTime(5);
		System.out.printf("Account1 balance: ",account1.getBalance(),"��� ���ɾ�: ",account1.getWithdrawableAccount());
		
		
		System.out.println();
		System.out.printf("Account2 balance: ",account2.getBalance(),"��� ���ɾ�: ",account2.getWithdrawableAccount());
		System.out.println("6 Month later!");
		account2.passTime(6);
		System.out.printf("Account1 balance: ",account2.getBalance(),"��� ���ɾ�: ",account2.getWithdrawableAccount());
		account2.debit(50);
		System.out.println("next 6 Month later!");
		account2.passTime(6);
		System.out.printf("Account1 balance: ",account2.getBalance(),"��� ���ɾ�: ",account2.getWithdrawableAccount());
		System.out.println("next 1 Month later!");
		account2.passTime(1);
		System.out.printf("Account1 balance: ",account2.getBalance(),"��� ���ɾ�: ",account2.getWithdrawableAccount());
		account2.debit(50);
		System.out.printf("Account1 balance: ",account2.getBalance(),"��� ���ɾ�: ",account2.getWithdrawableAccount());
=======
		double balance=input.nextDouble();
		System.out.print("�������� �Է����ּ���");
		double interest=input.nextDouble();
		System.out.print("�����ѵ� �Է����ּ���");
		double credit_limit=input.nextDouble();
		System.out.print("���������� �Է����ּ���");
		double loan_interest=input.nextDouble();
		//account account = new account(balance);
		checkingAccount ckAccount= new checkingAccount(balance,credit_limit,loan_interest,interest);
		while(true){
			System.out.print("1.�Ա�, 2.���  3.��ȸ  4.�ܾ׼��� 5.������ �ܾ׺���");
			int i=input.nextInt();
			if (i==2){
				System.out.print("��?");
				double debit=input.nextDouble();
				ckAccount.subtract(debit);
			}
			else if(i==1){
				System.out.print("��?");
				double credit=input.nextDouble();
				ckAccount.add(credit);
			}
			else if(i==4){
				System.out.print("������ �ܾ��Է�");
				balance=input.nextDouble();
				ckAccount.SetBalance(balance);
				
			}
			else if(i==5){
				System.out.print("next month");
				System.out.println(ckAccount.nextMonth());
			}
			else{
				System.out.println(ckAccount.getBalance());
			}
	
			
		}
>>>>>>> branch 'master' of https://github.com/ovoa7/Account.git
	}


}
