package com.example.musicsons;

public interface Normalizer {
    default String transform(String input) {
        return input.trim();
    }
}
