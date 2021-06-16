package kg.aleksandrov.deliverymvp.service;

import kg.aleksandrov.deliverymvp.models.entity.OrderStatus;


import java.util.List;

public interface OrderStatusService {
    List<OrderStatus> findAll();
}
