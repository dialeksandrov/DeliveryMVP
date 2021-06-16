package kg.aleksandrov.deliverymvp.dao;

import kg.aleksandrov.deliverymvp.models.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address, Long> {
}
