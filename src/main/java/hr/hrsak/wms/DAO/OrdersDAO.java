package hr.hrsak.wms.DAO;

import hr.hrsak.wms.entity.Orders;

import java.util.List;

public interface OrdersDAO {
    public List<Orders> getOrders();
    public Orders getOrder(int orderId);
    public Orders saveOrder(Orders order);
}
