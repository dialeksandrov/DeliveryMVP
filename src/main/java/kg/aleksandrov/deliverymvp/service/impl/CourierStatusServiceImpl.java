package kg.aleksandrov.deliverymvp.service.impl;

import kg.aleksandrov.deliverymvp.dao.CourierStatusRepo;
import kg.aleksandrov.deliverymvp.models.entity.CourierStatus;
import kg.aleksandrov.deliverymvp.service.CourierStatusService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
@Service
@AllArgsConstructor
public class CourierStatusServiceImpl implements CourierStatusService {

    @Autowired
    CourierStatusRepo courierStatusRepo;

}
