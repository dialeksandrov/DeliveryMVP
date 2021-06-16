package kg.aleksandrov.deliverymvp.service.impl;

import kg.aleksandrov.deliverymvp.dao.OrderStatusRepo;
import kg.aleksandrov.deliverymvp.models.entity.OrderStatus;
import kg.aleksandrov.deliverymvp.service.OrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class OrderStatusServiceImpl implements OrderStatusService {

    @Autowired
    private OrderStatusRepo orderStatusRepo;

    @Override
    public List<OrderStatus> findAll() {
        return orderStatusRepo.findAll();
    }
}
