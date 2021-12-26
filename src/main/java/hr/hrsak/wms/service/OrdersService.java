package hr.hrsak.wms.service;

import hr.hrsak.wms.entity.Orders;

import java.util.List;

public interface OrdersService {
    public List<Orders> getOrders();
    public Orders getOrder(int orderId);
    public Orders saveOrder(Orders order);
}
