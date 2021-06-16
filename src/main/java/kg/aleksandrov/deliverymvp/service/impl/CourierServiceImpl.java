package kg.aleksandrov.deliverymvp.service.impl;

import kg.aleksandrov.deliverymvp.dao.CourierRepo;
import kg.aleksandrov.deliverymvp.models.entity.Courier;
import kg.aleksandrov.deliverymvp.service.CourierService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class CourierServiceImpl implements CourierService {

    @Autowired
    private CourierRepo courierRepo;

    @Override
    public void saveCourier(Courier courier) {
        courierRepo.save(courier);

    }

    @Override
    public List<Courier> findAll() {
        return courierRepo.findAll();
    }

    @Override
    public Courier editCourier(Long courierId) {
        return courierRepo.findById(courierId).get();
    }


    @Override
    public void deleteCourier(Long courierId) {
        courierRepo.deleteById(courierId);
    }

    @Override
    public void updateCourier(Courier courier, Long courierId) {
        Courier courier1 = courierRepo.findById(courierId).get();
        courier1.setFirstName(courier.getFirstName());
        courier1.setLastName(courier.getLastName());
        courier1.setCourierStatus(courier.getCourierStatus());
        courierRepo.save(courier1);
    }
}
