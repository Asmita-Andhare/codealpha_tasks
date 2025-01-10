import java.util.Scanner; 
import java.util.ArrayList;

public class simplebankapp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount ("Asmita" , 1001);

        while(true) {
            System.out.println("\n ---Bank perform following operations ---");
            System.out.println("1. Deposit ");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Transaction History ");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");


            // to take operation choise
            int choice = sc.nextInt();

            switch (choice){
                case 1 : 
                System.out.println("Enter amount to deposit : ");
                double depositAmount = sc.nextDouble();
                account.deposit(depositAmount);
                break;

                case 2 : 
                System.out.println("Enter amount to withdraw : ");
                double withdrawAmount = sc.nextDouble();
                account.withdraw(withdrawAmount);
                break;

                case 3 : 
                account.checkBalance();
                break;

                case 4 : 
                account.displayTransactionHistory();
                break;

                case 5 :
                System.out.println("Exiting ... Thank you! ");
                sc.close();
                return;

                default :
                System.out.println("Invalid choise! Please try again.");



            }

        }
    }
}


// class for bank account
class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private double balance;
    private ArrayList<String> transactionHistory;

    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName; 
        this.accountNumber = accountNumber;         
        this.balance = 0.0;                         
        this.transactionHistory = new ArrayList<>();

    }
    // function for deposit money
    public void deposit(double amount) {
        if(amount > 0){
            balance += amount;
            System.out.println("Successfully Deposited: $ "+ amount);
            transactionHistory.add("Deposited: $" + amount);
        }else{
            System.out.println("Invalid amount. Please enter correct value.");

        }
    }


    //  function for withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Successfully withdrawn : $" + amount);
            transactionHistory.add("withdraw : $ "+ amount);

        }else if (amount>balance){
            System.out.println("Insufficient balance!");

        }else{
            System.out.println("Invalid amount. Please enter a correct value. ");
        }
    }

    //  function to check the balance 
    public void checkBalance() {
        System.out.println(" Current balance : $ "+ balance);
    }

    //  function to display the transaction history

    public void displayTransactionHistory(){
        System.out.println("\n--- Transaction History ---");
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");

        }else{
            for (String transaction : transactionHistory){
                System.out.println(transaction);
            }
        }
    }
}