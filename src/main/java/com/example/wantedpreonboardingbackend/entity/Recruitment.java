package com.example.wantedpreonboardingbackend.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Recruitment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Primary Key

    private Long companyId;
    private String position;
    private Integer reward;
    private String description;
    private String skills;

    // Optional: Constructor for easy instantiation
    public Recruitment(Long companyId, String position, Integer reward, String description, String skills) {
        this.companyId = companyId;
        this.position = position;
        this.reward = reward;
        this.description = description;
        this.skills = skills;
    }
}
