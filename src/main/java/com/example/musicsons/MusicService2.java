package com.example.musicsons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicService2 extends AbstractMusicService {

    @Autowired
    Normalizer normalizer;

    @Override
    public String transformArtist(String input) {
        return normalizer.transform(input);
    }

    @Override
    protected String transformSong(String input) {
        return normalizer.transform(input);
    }
}
