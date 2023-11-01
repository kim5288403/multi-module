package org.example.config;

import org.example.port.in.PostUseCase;
import org.example.port.out.PostOutPort;
import org.example.service.PostService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public PostUseCase postUseCase (PostOutPort postOutPort) {
        return new PostService(postOutPort);
    }
}
