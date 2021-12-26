package hr.hrsak.wms.service;

import hr.hrsak.wms.DAO.AccountDAO;
import hr.hrsak.wms.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountDAO accountDAO;

    @Transactional
    @Override
    public List<Account> getAccounts() {
        return accountDAO.getAccounts();
    }

    @Transactional
    @Override
    public Account getAccountById(int accountId) {
        return accountDAO.getAccountById(accountId);
    }

    @Transactional
    @Override
    public Account saveAccount(Account account) {
        return accountDAO.saveAccount(account);
    }
}
