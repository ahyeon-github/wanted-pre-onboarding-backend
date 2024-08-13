package com.example.wantedpreonboardingbackend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class JobPosting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String position;
    private int reward;
    private String description;
    private String techStack;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
}