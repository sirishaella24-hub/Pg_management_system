package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String roomNumber;
    private String fileName;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getFileName() {
        return fileName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}