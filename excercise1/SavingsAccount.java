public class SavingsAccount{
    int balance;

    //constructor
    public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }

    //check Balance
    public void checkBalance(){
        System.out.println("Hello");
        System.out.println("Your Balance is " + balance);
    }

    // deposit
    public void deposit(int amountToDeposit){
        balance = balance + amountToDeposit;
        System.out.println("You just deposited " + amountToDeposit + " and your balance is now " + balance);
    }

    // withdraw

    public int withdraw(int amountToWithdraw){
        balance = balance - amountToWithdraw;
        System.out.println("You just withdrew " + amountToWithdraw + " and your balance is now "+ balance);
        return amountToWithdraw;
    }

    public static void main(String[] args){
        SavingsAccount savings = new SavingsAccount(2000);

        savings.checkBalance();
        savings.deposit(500);
        savings.withdraw(200);
    }
}