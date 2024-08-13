package com.example.wantedpreonboardingbackend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String country;
    private String region;

    @OneToMany(mappedBy = "company")
    private List<JobPosting> jobPostings;
}