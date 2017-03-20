import java.util.Scanner;
public class Accounttest {
	public static void main (String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("계좌에 얼마있어요?");
		double balance=input.nextDouble();
		account account = new account(balance);
		while(true){
			System.out.print("1.입금, 2.출금  3.조회  4.잔액수정");
			int i=input.nextInt();
			if (i==2){
				System.out.print("얼마?");
				double debit=input.nextDouble();
				if (debit>account.getBalance()){
					System.out.print("exceed");
				}
				else{
					account.subtract(debit);
					
				
				}
			
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
			else{System.out.println(account.getBalance());}
	
			
		}
	}

}
