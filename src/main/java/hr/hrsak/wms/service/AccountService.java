package hr.hrsak.wms.service;

import hr.hrsak.wms.entity.Account;

import java.util.List;

public interface AccountService {
    public List<Account> getAccounts();
    public Account getAccountById(int accountId);
    public Account saveAccount(Account account);
}
