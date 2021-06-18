package kg.aleksandrov.deliverymvp.service.impl;

import kg.aleksandrov.deliverymvp.dao.AdminRepo;
import kg.aleksandrov.deliverymvp.dao.CourierRepo;
import kg.aleksandrov.deliverymvp.dao.OrderRepo;
import kg.aleksandrov.deliverymvp.models.entity.Admin;
import kg.aleksandrov.deliverymvp.models.entity.Order;
import kg.aleksandrov.deliverymvp.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepo orderRepo;



    @Override
    public List<Order> findAll() {
        return orderRepo.findAll();
    }

    @Override
    public Order editOrder(Long orderId) {
        return orderRepo.findById(orderId).get();
    }

    @Override
    public void deleteOrder(Long orderId) {
        orderRepo.deleteById(orderId);
    }

    @Override
    public void updateOrder(Order order, Long orderId) {
        Order order1 = orderRepo.findById(orderId).get();
        order1.setOrderInfo(order.getOrderInfo());
        order1.setAdmin(order.getAdmin());
        order1.setRansomSum(order.getRansomSum());
        order1.setDeliveryPrice(order.getDeliveryPrice());
        order1.setAddressFrom(order.getAddressFrom());
        order1.setAddressTo(order.getAddressTo());
        order1.setCourier(order.getCourier());
        order1.setComments(order.getComments());
        orderRepo.save(order1);
    }

    @Override
    public void saveOrder(Order order) {
        orderRepo.save(order);
    }
}
