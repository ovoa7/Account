import java.util.Scanner;
public class Accounttest {
	public static void main (String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("���¿� ���־��?");
		double balance=input.nextDouble();
		account account = new account(balance);
		while(true){
			System.out.print("1.�Ա�, 2.���  3.��ȸ  4.�ܾ׼���");
			int i=input.nextInt();
			if (i==2){
				System.out.print("��?");
				double debit=input.nextDouble();
				if (debit>account.getBalance()){
					System.out.print("exceed");
				}
				else{
					account.subtract(debit);
					
				
				}
			
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
			else{System.out.println(account.getBalance());}
	
			
		}
	}

}
