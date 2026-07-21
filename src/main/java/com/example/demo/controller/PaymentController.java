package com.example.demo.controller;

import com.example.demo.entity.Payment;
import com.example.demo.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

@RestController
@RequestMapping("/payment")
@CrossOrigin("*")
public class PaymentController {

    @Autowired
    private PaymentRepository repo;

    @PostMapping("/upload")
    public String upload(
            @RequestParam("name") String name,
            @RequestParam("roomNumber") String roomNumber,
            @RequestParam("file") MultipartFile file) {

        try {
            // Use an absolute path you definitely have access to:
            String uploadDir = "C:\\Users\\HP\\Desktop\\payment_uploads";

            File folder = new File(uploadDir);
            if (!folder.exists()) {
                folder.mkdirs();
            }

            String fileName = System.currentTimeMillis() + "_" + file.getOriginalFilename();

            File destination = new File(folder, fileName);
            file.transferTo(destination);

            Payment payment = new Payment();
            payment.setName(name);
            payment.setRoomNumber(roomNumber);
            payment.setFileName(fileName);

            repo.save(payment);

            return "SUCCESS";

        } catch (Exception e) {
            e.printStackTrace();
            return "ERROR";
        }
    }

    @GetMapping("/all")
    public List<Payment> getAllPayments() {
        return repo.findAll();
    }
}