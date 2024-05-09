package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Account account1 = new Account(-100);
            account1.addBalance(100);
            account1.delBalance(100);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }catch (InsufficientFundsException e){
            e.printStackTrace();
        }

        try {
            Account account2 = new Account(100);
            account2.addBalance(-100);
            account2.delBalance(100);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }catch (InsufficientFundsException e){
            e.printStackTrace();
        }

        try {
            Account account3 = new Account(100);
            account3.addBalance(100);
            account3.delBalance(1000);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }catch (InsufficientFundsException e){
            e.printStackTrace();
        }
    }
}