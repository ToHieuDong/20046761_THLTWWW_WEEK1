package com.example.demoweek1.services;

import com.example.demoweek1.entities.Account;
import com.example.demoweek1.enums.AccountStatus;
import com.example.demoweek1.repositories.AccountRepository;
import jakarta.inject.Inject;

import java.util.List;
import java.util.Optional;

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

    public Optional<Account> isLogin(String email, String password) {
        if (email == null || password == null || email.isEmpty() || password.isEmpty())
            return Optional.empty();

        return accountRepository.isLogin(email, password);
    }

    public void updateStatus(String id, AccountStatus status) {
        accountRepository.updateStatus(id,status);
    }
}
