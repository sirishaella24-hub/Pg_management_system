package com.example.demo.controller;

import com.example.demo.entity.Request;
import com.example.demo.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/request")
@CrossOrigin("*")
public class RequestController {

    @Autowired
    private RequestService service;

    // Add request
    @PostMapping("/add")
    public Request add(@RequestBody Request r) {
        return service.saveRequest(r);
    }

    // Get all requests
    @GetMapping("/all")
    public List<Request> getAll() {
        return service.getAllRequests();
    }
}