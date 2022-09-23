package bankaccount;

import java.util.Scanner;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	        BankAccount b = new BankAccount();
	          int a;
	        do{
	          
	        System.out.println("------------------------------------------------------------------------BANK MENU--------------------------------------------------------------------------");
	        System.out.println(" 1. Deposit");
	        System.out.println("2. Withdraw");
	        System.out.println("3. Show Balance");
	        System.out.println("4. Exit");
	        System.out.print("Select an option : ");
	        a = input.nextInt();
	        
	        switch (a)
	        {
	            case 1:
	                System.out.print("Enter deposit amount : ");
	                double c = b.deposit(input.nextDouble());
	                System.out.println("The current balance is : " + b.getBalance());
	                break;
	            case 2:
	                System.out.println("The current balance is : " + b.getBalance());
	                System.out.print("Enter the withdraw amount : ");
	        {
	            try {
	                double d = b.withdraw(input.nextDouble());
	            } catch (Exception ex) {
	                System.out.println(ex.toString());
	            }
	        }
	        break;
	            case 3:
	                System.out.println("The current balance is : "  + b.getBalance());
	               break;       
	        }        
	        }while (a !=4);
	        System.out.println("Thanks for using our services");


	}

}
