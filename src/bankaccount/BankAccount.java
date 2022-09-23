package bankaccount;

import java.util.Scanner;

public class BankAccount {
    
    Scanner input = new Scanner(System.in);
    double balance;
    
    public BankAccount()
    {
        balance = 0.0;
    }
    
    public BankAccount(double balance)
    {
        this.balance = balance;
    }
    
    //getters
    public double getBalance()
    {
        return balance;
    }
    
    //deposit method
    public double deposit(double amount)
    {
        //double amount = 0.0;
        balance = balance + amount;        
        return balance;
    }
    
    //withdraw method
    public double withdraw(double amount) throws Exception
    {       
        if (amount > balance)
        {
            throw new ThrowException ("Insufficient funds " + " Please check your balance ");
        }
        else {
            balance = balance - amount;
        }
        return balance;
    }


}
