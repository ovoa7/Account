import java.util.Scanner;
public class Accounttest {
	public static void main (String[] args){
		account account = new account();
		Scanner input=new Scanner(System.in);
		
		while(true){
			System.out.print("1.입금, 2.출금 3.조회");
			int i=input.nextInt();
			if (i==2){
				System.out.print("얼마?");
				double debit=input.nextDouble();
				if (debit>account.getmoney()){
					System.out.print("exceed");
				}
				else{
					account.subtract(debit);
					
				
				}
			
			}
			else if(i==1){
				System.out.print("얼마?");
				double mn=input.nextDouble();
				account.add(mn);
			
			
			}
			else{System.out.println(account.getmoney());}
	
			
		}
	}

}
