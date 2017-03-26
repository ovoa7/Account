import java.util.Scanner;
public class Accounttest {
	public static void main (String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("계좌에 얼마있어요?");
		
		double balance=input.nextDouble();
		System.out.print("예금이자 입력해주세요");
		double interest=input.nextDouble();
		System.out.print("대출한도 입력해주세요");
		double credit_limit=input.nextDouble();
		System.out.print("대출이자율 입력해주세요");
		double loan_interest=input.nextDouble();
		account account = new account(balance);
		checkingAccount ckAccount= new checkingAccount(balance,credit_limit,loan_interest,interest);
		while(true){
			System.out.print("1.입금, 2.출금  3.조회  4.잔액수정 5.다음달 잔액변동");
			int i=input.nextInt();
			if (i==2){
				System.out.print("얼마?");
				double debit=input.nextDouble();
				account.subtract(debit);
			}
			else if(i==1){
				System.out.print("얼마?");
				double credit=input.nextDouble();
				account.add(credit);
			}
			else if(i==4){
				System.out.print("수정할 잔액입력");
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
