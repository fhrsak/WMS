package hr.hrsak.wms.DAO;

import hr.hrsak.wms.entity.Address;
import hr.hrsak.wms.exception.AddressNotValidException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class AddressDaoImpl implements AddressDAO {

    private Session session;

    @Autowired
    public AddressDaoImpl(EntityManager entityManager) {
        this.session = entityManager.unwrap(Session.class);
    }

    @Override
    public Address saveAddress(Address address) {
        session.saveOrUpdate(address);
        return address;
    }

    @Override
    public Address getAddressById(int addressId) {
        Query<Address> theQuery= session.createQuery("from Address where id=:addressId", Address.class);
        theQuery.setParameter("addressId", addressId);
        return theQuery.getSingleResult();

    }
}
