package com.example.wantedpreonboardingbackend.repository;


import com.example.wantedpreonboardingbackend.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
    Optional<Application> findByJobPostingIdAndUserId(Long jobPostingId, Long userId);
}