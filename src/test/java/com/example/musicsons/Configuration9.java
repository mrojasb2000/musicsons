package com.example.musicsons;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuration9 {
    @Bean
    Normalizer foo() {
        return new SimpleNormalizer();
    }

    @Bean(name="bar")
    Normalizer capNormalizer() {
        return new CapLeadingNormalizer();
    }

    @Bean
    MusicService musicService() {
        return new MusicService3();
    }
}
