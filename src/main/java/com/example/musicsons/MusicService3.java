package com.example.musicsons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MusicService3 extends AbstractMusicService {
    @Autowired
    @Qualifier("bar")
    Normalizer artistNormalizer;

    @Autowired
    @Qualifier
    Normalizer songNormalizer;

    public Normalizer getArtistNormalizer() {
        return artistNormalizer;
    }

    public void setArtistNormalizer(Normalizer artistNormalizer) {
        this.artistNormalizer = artistNormalizer;
    }

    public Normalizer getSongNormalizer() {
        return songNormalizer;
    }

    public void setSongNormalizer(Normalizer songNormalizer) {
        this.songNormalizer = songNormalizer;
    }

    @Override
    protected String transformArtist(String input) {
        return artistNormalizer.transform(input);
    }

    @Override
    protected String transformSong(String input) {
        return songNormalizer.transform(input);
    }
}
