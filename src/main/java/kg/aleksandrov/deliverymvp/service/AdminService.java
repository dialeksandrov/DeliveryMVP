package kg.aleksandrov.deliverymvp.service;

import kg.aleksandrov.deliverymvp.models.entity.Admin;
import org.apache.catalina.LifecycleState;

import java.util.List;

public interface AdminService {
    List<Admin> findAll();
}
