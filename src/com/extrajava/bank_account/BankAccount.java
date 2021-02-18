package com.extrajava.bank_account;

import com.extrajava.thread_tester.RunThreads;

/**
 * Bank Account
 * @autor EvgeniiTiurin
 * @version 1.1
 * Доступ к одному банковскому счёту двух лиц.
 */

public class BankAccount {
    private int balance = 100;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }
}
