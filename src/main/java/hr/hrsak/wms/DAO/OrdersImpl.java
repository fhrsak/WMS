package hr.hrsak.wms.DAO;

import hr.hrsak.wms.entity.Orders;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class OrdersImpl implements OrdersDAO{

    private Session session;

    @Autowired
    public OrdersImpl(EntityManager entityManager) {
        this.session = entityManager.unwrap(Session.class);
    }

    @Override
    public List<Orders> getOrders() {
        Query<Orders> theQuery = session.createQuery("from Orders ", Orders.class);
        return theQuery.getResultList();
    }

    @Override
    public Orders getOrder(int orderId) {
        Query<Orders> theQuery = session.createQuery("from Orders where id=:orderId ", Orders.class);
        theQuery.setParameter("orderId", orderId);
        return theQuery.getSingleResult();
    }

    @Override
    public Orders saveOrder(Orders order) {
        session.saveOrUpdate(order);
        return order;
    }
}
