package hr.hrsak.wms.DAO;

import hr.hrsak.wms.entity.Account;

import java.util.List;

public interface AccountDAO {
    public List<Account> getAccounts();
    public Account getAccountById(int accountId);
    public Account saveAccount(Account account);
}
