package com.example.wantedpreonboardingbackend;

import com.example.wantedpreonboardingbackend.entity.Recruitment;
import com.example.wantedpreonboardingbackend.service.RecruitmentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
@WebMvcTest
public class RecruitmentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private RecruitmentService recruitmentService;

    @Test
    public void updateRecruitment_ReturnsOkStatus() throws Exception {
        Recruitment updatedRecruitment = new Recruitment(1L, "백엔드 주니어 개발자", 1500000, "적극 채용합니다.", "Python");

        given(recruitmentService.updateRecruitment(1L, updatedRecruitment)).willReturn(updatedRecruitment);

        mockMvc.perform(put("/api/recruitments/1")
                        .contentType("application/json")
                        .content("{\"position\":\"백엔드 주니어 개발자\",\"reward\":1500000,\"description\":\"적극 채용합니다.\",\"skills\":\"Python\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.reward").value(1500000));
    }

    @Test
    public void deleteRecruitment_ReturnsNoContentStatus() throws Exception {
        mockMvc.perform(delete("/api/recruitments/1"))
                .andExpect(status().isNoContent());
    }

    @Test
    public void getAllRecruitments_ReturnsOkStatus() throws Exception {
        Recruitment recruitment1 = new Recruitment(1L, "백엔드 주니어 개발자", 1500000, "적극 채용합니다.", "Python");
        Recruitment recruitment2 = new Recruitment(2L, "Django 백엔드 개발자", 1000000, "채용합니다.", "Django");

        List<Recruitment> recruitments = Arrays.asList(recruitment1, recruitment2);

        given(recruitmentService.getAllRecruitments()).willReturn(recruitments);

        mockMvc.perform(get("/api/recruitments"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].position").value("백엔드 주니어 개발자"))
                .andExpect(jsonPath("$[1].skills").value("Django"));
    }
}