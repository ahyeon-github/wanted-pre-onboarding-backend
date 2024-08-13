package com.example.wantedpreonboardingbackend.controller;

import com.example.wantedpreonboardingbackend.entity.Recruitment;
import com.example.wantedpreonboardingbackend.service.RecruitmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/recruitments")
public class RecruitmentController {

    private final RecruitmentService recruitmentService;

    @Autowired
    public RecruitmentController(RecruitmentService recruitmentService) {
        this.recruitmentService = recruitmentService;
    }

    @PostMapping
    public ResponseEntity<Recruitment> createRecruitment(@RequestBody Recruitment recruitment) {
        Recruitment createdRecruitment = recruitmentService.createRecruitment(recruitment);
        return new ResponseEntity<>(createdRecruitment, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Recruitment> updateRecruitment(
            @PathVariable("id") Long id, @RequestBody Recruitment updatedRecruitment) {
        Recruitment recruitment = recruitmentService.updateRecruitment(id, updatedRecruitment);
        return new ResponseEntity<>(recruitment, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecruitment(@PathVariable("id") Long id) {
        recruitmentService.deleteRecruitment(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public ResponseEntity<List<Recruitment>> getAllRecruitments() {
        List<Recruitment> recruitments = recruitmentService.getAllRecruitments();
        return new ResponseEntity<>(recruitments, HttpStatus.OK);
    }

//    @GetMapping("/search")
//    public ResponseEntity<List<Recruitment>> searchRecruitments(@RequestParam("search") String searchTerm) {
//        List<Recruitment> recruitments = recruitmentService.searchRecruitments(searchTerm);
//        return ResponseEntity.ok(recruitments);
//    }
}
