package com.example.wantedpreonboardingbackend.repository;

import com.example.wantedpreonboardingbackend.entity.Recruitment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface RecruitmentRepository extends JpaRepository<Recruitment, Long> {

    // 회사명, 채용포지션, 사용기술 필드에서 검색어를 찾는 메서드
//    @Query("SELECT r FROM Recruitment r WHERE " +
//            "LOWER(r.position) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR " +
//            "LOWER(r.skills) LIKE LOWER(CONCAT('%', :searchTerm, '%')) OR " +
//            "LOWER(r.company.name) LIKE LOWER(CONCAT('%', :searchTerm, '%'))")
//    List<Recruitment> searchRecruitments(@Param("searchTerm") String searchTerm);
}