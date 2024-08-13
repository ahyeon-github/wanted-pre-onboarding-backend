package com.example.wantedpreonboardingbackend.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/** Swagger 사용 환경을 위한 설정 파일 */
@OpenAPIDefinition(servers = {@Server(url = "/", description = "Default Server URL")})
@Configuration
public class SwaggerConfig {
    private final String TITLE = "원티드 프리온보딩 백엔드 과제";
    private final String DESCRIPTION = "원티드 프리온보딩 백엔드 과제 API 문서 입니다.";
    private final String VERSION = "V1.0.0";

    @Bean
    public OpenAPI api() {
        return new OpenAPI()
                .info(new Info()
                        .title(TITLE)
                        .description(DESCRIPTION)
                        .version(VERSION)
                );
    }

}