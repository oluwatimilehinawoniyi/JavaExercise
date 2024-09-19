package Exercise_6;

/*
    Implement a BankAccount class with attributes like accountNumber, balance, and methods like deposit, withdraw, and checkBalance
*/


class BankAccount {

    private long balance;

    BankAccount(long bal) {
        long accountNumber = (long) (Math.random() * (999999999 - 912345678 + 1) + 912345678);
        balance = bal;

        System.out.println("Welcome to Tusk Bank!\nYour account number " +
                "===> " +
                "is " + accountNumber + ".\nYour account balance is ===>" +
                " " +
                balance);
    }

    void deposit(long amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        } else {
            balance += amount;
            System.out.println("Deposit Successful! You deposited " + amount + ".\nYour new account balance is ===> " + balance);
        }
    }

    void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        } else if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal Successful! You withdrew " + amount + ".\nYour new account balance is ===> " + balance);
        } else {
            System.out.println("Insufficient funds! You tried to " +
                    "withdraw " + amount + ".\nYour account balance is " +
                    "===> " + balance);
        }
    }

    void checkBalance() {
        System.out.println("Your account balance is ===> " + balance);
    }
}

public class Bank {

    public static void main(String[] args) {

        BankAccount bank1 = new BankAccount(2905983);
        BankAccount bank2 = new BankAccount(344445233);

        bank1.checkBalance();
        bank2.deposit(10000934);
        bank2.withdraw(449765439);
        bank1.withdraw(765432);
    }
}
