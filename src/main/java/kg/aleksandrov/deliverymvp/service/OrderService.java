package kg.aleksandrov.deliverymvp.service;

import kg.aleksandrov.deliverymvp.models.entity.Courier;
import kg.aleksandrov.deliverymvp.models.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderService {

    List<Order> findAll();
    Order editOrder(Long orderId);
    void deleteOrder(Long orderId);
    void updateOrder(Order order, Long orderId);
    void saveOrder(Order order);

}
