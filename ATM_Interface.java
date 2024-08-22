//CODSOFT task 1: ATM Interface

import java.util.Scanner;

class BankAccount {
    private long balance;

    public long getBalance()
    {
        return balance;
    }


    public BankAccount(long Balance)
    {
        if(Balance>=0)
         this.balance = Balance;
        else
         this.balance=0;
    }
    public void accountBalance(long bal)
    {
        System.out.println(bal);
    }
    public void deposit(long amt)
    {
        if(amt>0){
        balance+=amt;
        System.out.println("Amount "+ amt + " is deposited Successfully");
        }
      else
        System.out.println("Please Enter a Valid Amount");
    }
    public void withdraw(long amt)
    {
        if(amt>0 && amt<=balance)
        {
        balance-=amt;
        System.out.println("Amount " +amt + " is Withdrawed Successfully");
        }
        else if(amt>balance)
        {
            System.out.println("Insufficient Balance");
        }
        else
            System.out.println("Please Enter a valid Amount");

    }

    public void checkBalance()
    {
        System.out.println(("Current Balance is :" +balance));
    }


}

class ATM{
        private BankAccount account;
        private Scanner scan;

        public ATM(BankAccount account)
        {
            this.account=account;
            this.scan = new Scanner(System.in);
        
            
        }

        public void display()
        {
            while (true) 
            {
                System.out.println("\n--------------------MENU--------------------");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. EXIT");
                System.out.println("\n---------------------------------------------");
                System.out.println("Choose an Option  :");
                int choice=scan.nextInt();

        switch (choice) {
            case 1:
                performDeposit();
                break;
            case 2:
                performWithdraw();
                break;
            case 3:
                performCheckBalance();
                break;
            case  4:
                System.out.println("Thank You For Using ATM");
                break;
            default:
                System.out.println("Enter Valid Choice....Try Again");
                break;
        }
                
            }
        }
        private void performDeposit()
        {
            System.out.println("Enter Amount to Deposit:");
            long amount=scan.nextLong();
            account.deposit(amount);
        }

        private void performWithdraw()
        {
            System.out.println("Enter Amount to Withdraw:");
            long amount=scan.nextLong();
            account.withdraw(amount);
        }
        private void performCheckBalance()
        {
            account.checkBalance();
        }



}
class ATMInterface{
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000);
        ATM atm = new ATM(acc);
        atm.display();
    }

}
