package com.example.demoweek1.repositories;

import com.example.demoweek1.entities.Account;
import com.example.demoweek1.enums.AccountStatus;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;
import java.util.Optional;

public class AccountRepository {
    private EntityManager em;
    private EntityTransaction et;

    public AccountRepository() {
        em= Persistence.createEntityManagerFactory("lab_week_1").createEntityManager();
        et=em.getTransaction();
    }

    public void createAccount(Account account) {
        try {
            et.begin();
            em.persist(account);
            et.commit();
        } catch (Exception e) {
            et.rollback();
            e.printStackTrace();
        }
    }

    public void updateAccount(Account account) {
        try {
            et.begin();
            em.merge(account);
            et.commit();
        } catch (Exception e) {
            et.rollback();
            e.printStackTrace();
        }
    }

    public void setStatusAccount(Account account, AccountStatus accountStatus) {
        account.setStatus(accountStatus);
    }

    public Account getAccountById(long id) {
        return em.find(Account.class, id);
    }
    public List<Account> getAllAccounts() {
        return em.createNamedQuery("Account.findAll", Account.class).getResultList();
    }

}
