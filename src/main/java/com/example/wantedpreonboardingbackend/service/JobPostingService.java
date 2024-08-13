package com.example.wantedpreonboardingbackend.service;


import com.example.wantedpreonboardingbackend.entity.JobPosting;
import com.example.wantedpreonboardingbackend.repository.JobPostingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobPostingService {

    private final JobPostingRepository jobPostingRepository;

    public JobPostingService(JobPostingRepository jobPostingRepository) {
        this.jobPostingRepository = jobPostingRepository;
    }

    public JobPosting createJobPosting(JobPosting jobPosting) {
        return jobPostingRepository.save(jobPosting);
    }

    public JobPosting updateJobPosting(Long id, JobPosting jobPostingDetails) {
        JobPosting jobPosting = jobPostingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("JobPosting not found"));

        jobPosting.setPosition(jobPostingDetails.getPosition());
        jobPosting.setReward(jobPostingDetails.getReward());
        jobPosting.setDescription(jobPostingDetails.getDescription());
        jobPosting.setTechStack(jobPostingDetails.getTechStack());

        return jobPostingRepository.save(jobPosting);
    }

    public void deleteJobPosting(Long id) {
        jobPostingRepository.deleteById(id);
    }

    public List<JobPosting> getAllJobPostings(String search) {
        if (search == null || search.isEmpty()) {
            return jobPostingRepository.findAll();
        }
        return jobPostingRepository.findByCompanyNameContainingOrTechStackContaining(search, search);
    }

    public Optional<JobPosting> getJobPostingById(Long id) {
        return jobPostingRepository.findById(id);
    }
}