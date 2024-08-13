package com.example.wantedpreonboardingbackend.controller;


import com.example.wantedpreonboardingbackend.entity.JobPosting;
import com.example.wantedpreonboardingbackend.service.JobPostingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/job-postings")
public class JobPostingController {

    private final JobPostingService jobPostingService;

    public JobPostingController(JobPostingService jobPostingService) {
        this.jobPostingService = jobPostingService;
    }

    @PostMapping
    public ResponseEntity<JobPosting> createJobPosting(@RequestBody JobPosting jobPosting) {
        JobPosting newJobPosting = jobPostingService.createJobPosting(jobPosting);
        return ResponseEntity.ok(newJobPosting);
    }

    @PutMapping("/{id}")
    public ResponseEntity<JobPosting> updateJobPosting(@PathVariable Long id, @RequestBody JobPosting jobPosting) {
        JobPosting updatedJobPosting = jobPostingService.updateJobPosting(id, jobPosting);
        return ResponseEntity.ok(updatedJobPosting);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteJobPosting(@PathVariable Long id) {
        jobPostingService.deleteJobPosting(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<JobPosting>> getAllJobPostings(@RequestParam(required = false) String search) {
        List<JobPosting> jobPostings = jobPostingService.getAllJobPostings(search);
        return ResponseEntity.ok(jobPostings);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobPosting> getJobPostingById(@PathVariable Long id) {
        Optional<JobPosting> jobPosting = jobPostingService.getJobPostingById(id);
        return jobPosting.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}