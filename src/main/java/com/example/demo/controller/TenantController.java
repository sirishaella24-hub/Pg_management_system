package com.example.demo.controller;

import com.example.demo.entity.Tenant;
import com.example.demo.service.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tenant")
@CrossOrigin("*")
public class TenantController {

    @Autowired
    private TenantService service;

    @PostMapping("/add")
    public Tenant add(@RequestBody Tenant t) {
        return service.saveTenant(t);
    }

    @GetMapping("/all")
    public List<Tenant> getAll() {
        return service.getAllTenants();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteTenant(id);
    }
}