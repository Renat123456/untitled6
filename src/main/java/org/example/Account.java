package org.example;

public class Account {
    private double balance;

    public Account(double balance) throws IllegalArgumentException {
        if(balance < 0){
            throw new IllegalArgumentException("Баланс не может быть меньше 0");
        }
        this.balance = balance;
    }

    public void addBalance(double add) throws IllegalArgumentException {
        if(add < 0){
            throw new IllegalArgumentException("Вносимый депозит не может быть меньше 0");
        }
        balance = balance + add;
    }

    public void delBalance(double del) throws InsufficientFundsException {
        double check = balance - del;
        if(check < 0){
            throw new InsufficientFundsException("Остаточный баланс не может быть меньше 0");
        }
        balance = balance - del;
    }
}
