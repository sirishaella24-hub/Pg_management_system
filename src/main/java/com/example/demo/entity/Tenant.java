package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Tenant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phone;
    private String email;
    private String pgName;
    private String joiningDate;
    private String roomNumber;
    private String sharingType;
    private int rentPaid;

    // Getters & Setters
    public Long getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPgName() { return pgName; }
    public void setPgName(String pgName) { this.pgName = pgName; }

    public String getJoiningDate() { return joiningDate; }
    public void setJoiningDate(String joiningDate) { this.joiningDate = joiningDate; }

    public String getRoomNumber() { return roomNumber; }
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }

    public String getSharingType() { return sharingType; }
    public void setSharingType(String sharingType) { this.sharingType = sharingType; }

    public int getRentPaid() { return rentPaid; }
    public void setRentPaid(int rentPaid) { this.rentPaid = rentPaid; }
}