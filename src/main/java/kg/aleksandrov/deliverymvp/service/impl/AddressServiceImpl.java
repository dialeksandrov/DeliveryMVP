package kg.aleksandrov.deliverymvp.service.impl;

import kg.aleksandrov.deliverymvp.dao.AddressRepo;
import kg.aleksandrov.deliverymvp.models.entity.Address;
import kg.aleksandrov.deliverymvp.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepo addressRepo;

    @Override
    public List<Address> findAll() {
        return addressRepo.findAll();
    }
}
