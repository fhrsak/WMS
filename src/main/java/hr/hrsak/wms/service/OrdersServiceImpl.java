package hr.hrsak.wms.service;

import hr.hrsak.wms.DAO.OrdersDAO;
import hr.hrsak.wms.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class OrdersServiceImpl implements OrdersService{

    @Autowired
    private OrdersDAO ordersDAO;

    @Transactional
    @Override
    public List<Orders> getOrders() {
        return ordersDAO.getOrders();
    }

    @Transactional
    @Override
    public Orders getOrder(int orderId) {
        return ordersDAO.getOrder(orderId);
    }

    @Transactional
    @Override
    public Orders saveOrder(Orders order) {
        return ordersDAO.saveOrder(order);
    }
}
