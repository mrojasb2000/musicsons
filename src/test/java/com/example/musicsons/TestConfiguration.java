package com.example.musicsons;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {
    @Bean
    public MusicServiceTests musicServiceTests() {
        return new MusicServiceTests();
    }
}
