package edu.codegym.toam.service.account;

import edu.codegym.toam.model.Account;

public interface IAccountService {
    Iterable<Account> findAll();
    Account findById(Long id);
    Account findByUsername(String username);
}
