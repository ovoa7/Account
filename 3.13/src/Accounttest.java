import java.util.Scanner;
public class Accounttest {
	public static void main (String[] args){
		account account = new account();
		Scanner input=new Scanner(System.in);
		
		while(true){
			System.out.print("1.�Ա�, 2.��� 3.��ȸ");
			int i=input.nextInt();
			if (i==2){
				System.out.print("��?");
				double debit=input.nextDouble();
				if (debit>account.getmoney()){
					System.out.print("exceed");
				}
				else{
					account.subtract(debit);
					
				
				}
			
			}
			else if(i==1){
				System.out.print("��?");
				double mn=input.nextDouble();
				account.add(mn);
			
			
			}
			else{System.out.println(account.getmoney());}
	
			
		}
	}

}
