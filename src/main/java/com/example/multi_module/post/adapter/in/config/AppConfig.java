package com.example.multi_module.post.adapter.in.config;

import com.example.multi_module.post.appilcation.port.in.PostUseCase;
import com.example.multi_module.post.appilcation.port.out.PostOutPort;
import com.example.multi_module.post.appilcation.service.PostService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public PostUseCase postUseCase (PostOutPort postOutPort) {
        return new PostService(postOutPort);
    }
}
