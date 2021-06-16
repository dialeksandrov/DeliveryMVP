package kg.aleksandrov.deliverymvp.dao;

import kg.aleksandrov.deliverymvp.models.entity.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderStatusRepo extends JpaRepository<OrderStatus, Long> {
}
