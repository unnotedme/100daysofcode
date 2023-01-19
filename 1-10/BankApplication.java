import java.util.Scanner;

// Bank System

public class BankApplication {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please enter your Bank Account details: customerId and customer name.");
            String customerId=sc.nextLine(); //I don't understand why this is wrong
            String customerName=sc.nextLine();
            BankAccount bankAccount = new BankAccount(customerId, customerName);
            bankAccount.menu();
        }
    }    
}

class BankAccount {
    String customerId;
    String customerName;
    double balance;
    int creditCard;
    double previousTransaction;

    BankAccount(String customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    void deposit(double amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(double amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction occurred");
        }
    }

    void menu(){
        char option;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Welcome " + customerName);
            System.out.println("Your ID:" + customerId);
            System.out.println("\n");
            System.out.println("a) Check Balance");
            System.out.println("b) Deposit Amount");
            System.out.println("c) Withdraw Amount");
            System.out.println("d) Previous Transaction");
            System.out.println("e) Exit");

            do {
                System.out.println("Choose an option:");
                option=sc.next().charAt(0);
                System.out.println("\n");
                switch (option){
                    case 'a':
                        System.out.println("Balance = "+balance);
                        System.out.println("\n");
                        break;
                    case 'b':
                        System.out.println("Enter an amount to deposit: ");
                        double amt=sc.nextDouble();
                        deposit(amt);
                        System.out.println("\n");
                        break;
                    case 'c':
                        System.out.println("Enter an amount to Withdraw: ");
                        double amtW=sc.nextDouble();
                        withdraw(amtW);
                        System.out.println("\n");
                        break;
                    case 'd':
                        System.out.println("Previous Transaction: ");
                        getPreviousTransaction();
                        System.out.println("\n");
                        break;

                    case 'e':
                        break;
                    default:
                        System.out.println("Choose an option to proceed:");
                        break;
                }
            } while(option!='e');
        }
        System.out.println("Thank you for using our banking services.");
    }
}