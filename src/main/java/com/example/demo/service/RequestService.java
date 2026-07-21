package com.example.demo.service;

import com.example.demo.entity.Request;
import com.example.demo.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestService {

    @Autowired
    private RequestRepository repo;

    public Request saveRequest(Request r) {
        r.setStatus("Pending"); // default status
        return repo.save(r);
    }

    public List<Request> getAllRequests() {
        return repo.findAll();
    }
}