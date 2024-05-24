/*
2. Implement a bank account class showing method overloading with methods for deposit, withdrawal and balance inquiry.
Use method overloading to handle different types of withdrawals (eg, with or without fees).
*/
class BankAccount
{
	double balance;
	// Constructor
	BankAccount(double balance) 
	{
        balance = balance;
	}
	void deposit(double amount) // Method for deposit
	{
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }
	public void getBalance()  // Method for balance inquiry
	{
        System.out.println("Balance: $" + balance);
    }
	public void withdraw(double amount) // Overloaded method for withdrawal without fees
	{
        if (balance >= amount) 
		{
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else 
		{
            System.out.println("Insufficient funds!");
        }
	}
}
class FeeAccount extends BankAccount {
	double withdrawalFee;

    // creating parameterized constructor
    FeeAccount(double Balance, double fee) {
        super(Balance);
        withdrawalFee = fee;
    }

    // Overloaded method for withdrawal with fees
    public void withdraw(double amount) 
	{
        double totalAmount = amount + withdrawalFee;
        if (balance >= totalAmount) 
		{
            balance -= totalAmount;
            System.out.println("Withdrawn: $" + amount + " with fee: $" + withdrawalFee);
        } else 
		{
            System.out.println("Insufficient funds!");//printing
        }
    }
}

class BankAccountDemo
{
	public static void main(String args[])
	{
        BankAccount account1 = new BankAccount(5000);
		
		account1.deposit(1000);
        account1.withdraw(500);
        account1.getBalance();

        FeeAccount account2 = new FeeAccount(1000, 10);
        account2.deposit(450);
        account2.withdraw(200);
        account2.getBalance();
	}
}


/*

OUTPUT

D:\Anudip Capgemini>javac BankAccountDemo.java

D:\Anudip Capgemini>java BankAccountDemo
Deposited: $1000.0
Withdrawn: $500.0
Balance: $500.0
Deposited: $450.0
Withdrawn: $200.0 with fee: $10.0
Balance: $240.0

*/