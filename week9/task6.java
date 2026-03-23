import java.util.*;

class Account {
    int accountNumber;
    String name;
    double balance;

    Account(int accNo, String name, double balance) {
        this.accountNumber = accNo;
        this.name = name;
        this.balance = balance;
    }
}

class Bank {
    Map<Integer, Account> accounts = new HashMap<>();

    void addAccount(Account acc) {
        accounts.put(acc.accountNumber, acc);
    }

    void deposit(int accNo, double amount) {
        if (accounts.containsKey(accNo)) {
            Account acc = accounts.get(accNo);
            acc.balance += amount;
            System.out.println("Deposited " + (int)amount + " to " + acc.name);
        } else {
            System.out.println("Account not found");
        }
    }

    void withdraw(int accNo, double amount) {
        if (!accounts.containsKey(accNo)) {
            System.out.println("Account not found");
            return;
        }

        Account acc = accounts.get(accNo);
        if (acc.balance >= amount) {
            acc.balance -= amount;
            System.out.println("Withdrawn " + (int)amount + " from " + acc.name);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void transfer(int from, int to, double amount) {
        if (!accounts.containsKey(from) || !accounts.containsKey(to)) {
            System.out.println("Account not found");
            return;
        }

        Account sender = accounts.get(from);
        Account receiver = accounts.get(to);

        if (sender.balance >= amount) {
            sender.balance -= amount;
            receiver.balance += amount;
            System.out.println("Transferred " + (int)amount + " from " + sender.name + " to " + receiver.name);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Bank bank = new Bank();

        for (int i = 0; i < n; i++) {
            int accNo = sc.nextInt();
            String name = sc.next();
            double balance = sc.nextDouble();
            bank.addAccount(new Account(accNo, name, balance));
        }

        int ops = sc.nextInt();

        for (int i = 0; i < ops; i++) {
            String op = sc.next();

            if (op.equals("DEPOSIT")) {
                int acc = sc.nextInt();
                double amt = sc.nextDouble();
                bank.deposit(acc, amt);
            } else if (op.equals("WITHDRAW")) {
                int acc = sc.nextInt();
                double amt = sc.nextDouble();
                bank.withdraw(acc, amt);
            } else if (op.equals("TRANSFER")) {
                int from = sc.nextInt();
                int to = sc.nextInt();
                double amt = sc.nextDouble();
                bank.transfer(from, to, amt);
            }
        }
    }
}