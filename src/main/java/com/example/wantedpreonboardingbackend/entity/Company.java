//package com.example.wantedpreonboardingbackend.entity;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//
//import java.util.List;
//
//@Entity
//public class Company {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String name;
//    private String country;
//    private String location;
//
//    @OneToMany(mappedBy = "company")
//    private List<Recruitment> recruitments;
//
//    // getters and setters
//}