package com.example.demoweek1.repositories;

import com.example.demoweek1.entities.Account;
import com.example.demoweek1.enums.AccountStatus;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

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
        return em.createNativeQuery("SELECT * FROM account", Account.class).getResultList();
    }

    public Optional<Account> isLogin(String email, String password) {
        try {
            Query nativeQuery = em.createNativeQuery(
                    "SELECT * FROM Account a WHERE password = ?1 AND (email = ?2 OR phone = ?2) AND status = ?3", Account.class);

            nativeQuery.setParameter(1, password);
            nativeQuery.setParameter(2, email);
            nativeQuery.setParameter(3, 0);

            Account account = (Account) nativeQuery.getSingleResult();

            return Optional.of(account);
        } catch (Exception e) {
            return Optional.empty();
        }

    }

    public void updateStatus(String id, AccountStatus status) {
        Account account = em.find(Account.class, id);
        account.setStatus(status);
        try {
            et.begin();
            em.merge(account);
            et.commit();
        } catch (Exception e) {
            et.rollback();
            e.printStackTrace();
        }
    }

}
