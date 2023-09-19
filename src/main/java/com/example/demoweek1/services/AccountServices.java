package com.example.demoweek1.services;

import com.example.demoweek1.entities.Account;
import com.example.demoweek1.repositories.AccountRepository;
import jakarta.inject.Inject;

import java.util.List;

public class AccountServices {
    @Inject
    private AccountRepository accountRepository;

    public AccountServices() {
        this.accountRepository = new AccountRepository();
    }

    public void insertAccount(Account account) {
        accountRepository.createAccount(account);
    }

    public Account findById(long id) {
        return accountRepository.getAccountById(id);
    }

    public List<Account> getAll() {
        return accountRepository.getAllAccounts();
    }
}
