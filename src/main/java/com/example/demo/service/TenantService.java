package com.example.demo.service;

import com.example.demo.entity.Tenant;
import com.example.demo.repository.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TenantService {

    @Autowired
    private TenantRepository repo;

    public Tenant saveTenant(Tenant t) {
        return repo.save(t);
    }

    public List<Tenant> getAllTenants() {
        return repo.findAll();
    }

    public void deleteTenant(Long id) {
        repo.deleteById(id);
    }
}