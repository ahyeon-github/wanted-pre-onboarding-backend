package com.example.wantedpreonboardingbackend.repository;

import com.example.wantedpreonboardingbackend.entity.JobPosting;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobPostingRepository extends JpaRepository<JobPosting, Long> {
    List<JobPosting> findByCompanyNameContainingOrTechStackContaining(String companyName, String techStack);
}