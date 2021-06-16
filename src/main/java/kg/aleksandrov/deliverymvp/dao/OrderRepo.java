package kg.aleksandrov.deliverymvp.dao;

import kg.aleksandrov.deliverymvp.models.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {
}
