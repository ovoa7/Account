import java.util.Scanner;
public class Accounttest {
	public static void main (String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("���¿� ���־��?");
		
		double balance=input.nextDouble();
		System.out.print("�������� �Է����ּ���");
		double interest=input.nextDouble();
		System.out.print("�����ѵ� �Է����ּ���");
		double credit_limit=input.nextDouble();
		System.out.print("���������� �Է����ּ���");
		double loan_interest=input.nextDouble();
		account account = new account(balance);
		checkingAccount ckAccount= new checkingAccount(balance,credit_limit,loan_interest,interest);
		while(true){
			System.out.print("1.�Ա�, 2.���  3.��ȸ  4.�ܾ׼��� 5.������ �ܾ׺���");
			int i=input.nextInt();
			if (i==2){
				System.out.print("��?");
				double debit=input.nextDouble();
				account.subtract(debit);
			}
			else if(i==1){
				System.out.print("��?");
				double credit=input.nextDouble();
				account.add(credit);
			}
			else if(i==4){
				System.out.print("������ �ܾ��Է�");
				balance=input.nextDouble();
				account.SetBalance(balance);
				
			}
			else if(i==5){
				System.out.print("next month");
				System.out.println(checkingAccount.nextMonth());
			}
			else{
				System.out.println(account.getBalance());
			}
	
			
		}
	}

}
