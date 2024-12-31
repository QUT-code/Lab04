package exercise;

class BankAccount {
    private String accountName;
    private int accountNumber;
    double accountBalance;

    public BankAccount(String accountName, int accountNumber, int accountBalance) {
        this.accountName = accountName;
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double money) {
        if (money > 0) {
            accountBalance += money;
            System.out.println("Deposited money to account: " + money);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdrawal(double money) {
        if (money > 0 && money <= accountBalance) {
            accountBalance -= money;
            System.out.println("Withdrew money from account: " + money);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    public void checkingBalance() {
        System.out.println("Current balance: " + accountBalance);
    }

    public void displayAccount() {
        System.out.println("Account Holder: " + accountName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + accountBalance);
    }
}

public class exercise4 {
    public static void main(String[] args) {
        BankAccount object = new BankAccount("Rayuth", 20230001, 2500);
        object.displayAccount();
        object.deposit(500);
        object.withdrawal(300);
        object.checkingBalance();
    }
}
