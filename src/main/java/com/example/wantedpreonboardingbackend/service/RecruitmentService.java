package com.example.wantedpreonboardingbackend.service;

import com.example.wantedpreonboardingbackend.entity.Recruitment;
import com.example.wantedpreonboardingbackend.repository.RecruitmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecruitmentService {
    private final RecruitmentRepository recruitmentRepository;

    @Autowired
    public RecruitmentService(RecruitmentRepository recruitmentRepository) {
        this.recruitmentRepository = recruitmentRepository;
    }

    public Recruitment createRecruitment(Recruitment recruitment) {
        return recruitmentRepository.save(recruitment);
    }

    public Recruitment updateRecruitment(Long id, Recruitment updatedRecruitment) {
        Optional<Recruitment> recruitmentOptional = recruitmentRepository.findById(id);
        if (recruitmentOptional.isPresent()) {
            Recruitment recruitment = recruitmentOptional.get();
            recruitment.setPosition(updatedRecruitment.getPosition());
            recruitment.setReward(updatedRecruitment.getReward());
            recruitment.setDescription(updatedRecruitment.getDescription());
            recruitment.setSkills(updatedRecruitment.getSkills());
            return recruitmentRepository.save(recruitment);
        } else {
            throw new RuntimeException("Recruitment not found with id " + id);
        }
    }

    public void deleteRecruitment(Long id) {
        recruitmentRepository.deleteById(id);
    }

    public List<Recruitment> getAllRecruitments() {
        return recruitmentRepository.findAll();
    }

//    public List<Recruitment> searchRecruitments(String searchTerm) {
//        return recruitmentRepository.searchRecruitments(searchTerm);
//    }

}
