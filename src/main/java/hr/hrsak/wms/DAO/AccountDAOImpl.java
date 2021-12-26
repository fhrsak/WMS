package hr.hrsak.wms.DAO;

import hr.hrsak.wms.entity.Account;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class AccountDAOImpl implements AccountDAO{

    private Session session;

    @Autowired
    public AccountDAOImpl(EntityManager entityManager) {
        this.session = entityManager.unwrap(Session.class);
    }
    @Override
    public List<Account> getAccounts() {
        Query<Account> theQuery = session.createQuery("from Account", Account.class);
        return theQuery.getResultList();
    }

    @Override
    public Account getAccountById(int accountId) {
        Query<Account> theQuery = session.createQuery("from Account where id=:accountId", Account.class);
        theQuery.setParameter("accountId", accountId);
        return theQuery.getSingleResult();
    }

    @Override
    public Account saveAccount(Account account) {
        session.saveOrUpdate(account);
        return account;
    }
}
