package kg.aleksandrov.deliverymvp.service;

import kg.aleksandrov.deliverymvp.models.entity.Courier;

import java.util.List;


public interface CourierService {
      void saveCourier(Courier courier);
      List<Courier> findAll();
      Courier editCourier(Long courierId);
      void deleteCourier(Long courierId);
      void updateCourier(Courier courier, Long id);
}
