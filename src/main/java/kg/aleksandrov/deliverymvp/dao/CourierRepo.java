package kg.aleksandrov.deliverymvp.dao;

import kg.aleksandrov.deliverymvp.models.entity.Courier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourierRepo extends JpaRepository<Courier, Long> {

}
