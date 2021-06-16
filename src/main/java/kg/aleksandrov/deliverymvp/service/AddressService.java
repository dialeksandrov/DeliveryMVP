package kg.aleksandrov.deliverymvp.service;

import kg.aleksandrov.deliverymvp.dao.AddressRepo;
import kg.aleksandrov.deliverymvp.models.entity.Address;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface AddressService {

    List<Address> findAll();
}
