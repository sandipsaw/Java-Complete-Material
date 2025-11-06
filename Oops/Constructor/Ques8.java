//8. Constructor and Methods
// Create a class Account with attributes accountNumber and balance.
// Use a parameterized constructor to initialize data,
// and methods to deposit() and withdraw() money.

import java.util.*;

class Account {
    long accountNumber;
    int balance;
    int amount;

    Account(long accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    int deposit(int amount) {
        balance += amount;
        return balance;
    }

    int withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
        }
        return balance;
    }

    void display() {
        System.out.println("total amount : " + balance);
    }
}

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account ac1 = new Account(91424679, 1000);
        ac1.display();
        ac1.deposit(450);
        ac1.display();
        ac1.withdraw(200);
        ac1.display();
        sc.close();
    }
}