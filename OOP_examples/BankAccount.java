package OOP_examples;

// 🔹 1. Encapsulation – Keep things in one box (data + methods)

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

// 🧠 Analogy: You don’t access the money directly inside the vault—you go through the teller (methods).

