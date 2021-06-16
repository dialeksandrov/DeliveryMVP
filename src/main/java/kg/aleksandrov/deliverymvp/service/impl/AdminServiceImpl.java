package kg.aleksandrov.deliverymvp.service.impl;

import kg.aleksandrov.deliverymvp.dao.AdminRepo;
import kg.aleksandrov.deliverymvp.models.entity.Admin;
import kg.aleksandrov.deliverymvp.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepo adminRepo;
    @Override
    public List<Admin> findAll() {
        return adminRepo.findAll();
    }
}
