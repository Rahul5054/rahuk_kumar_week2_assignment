
//Implement a BankAccount class with methodsfor deposit, withdrawal, and displaying the account balance.
public class BankAccount {
    
    private int bal;


   

    public void deposit(int amount ){

        if(amount>0){
            bal=bal+amount;
            System.out.println("Deposited amount is:- "+amount);

        }else{
            System.out.println("Invalid amount!!");
        }
    }

    public void withdrawamount(int amount){
        if(amount>0  && amount<=bal){
            bal=bal-amount;
            System.out.println("Withdraw amount is:- "+amount);
        }
        else if(amount>bal){
            System.out.println("Insufficient funds!!");
        }
        else{
            System.out.println("Invalid Withdrawal amount!!");
        }
    }

    public void displayAccountBalance(){
        System.out.println("Your Current Balance is:- "+bal);
    }

    public static void main(String[] args) {
        
        BankAccount bankAccount=new BankAccount();

        bankAccount.displayAccountBalance();

        bankAccount.deposit(1500);
        bankAccount.displayAccountBalance();

        bankAccount.withdrawamount(1000);
        bankAccount.displayAccountBalance();
    }
}
