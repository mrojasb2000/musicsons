package com.example.musicsons;

import com.example.musicsons.model.Song;

import java.util.List;

public interface MusicService {
    List<Song> getSongsForArtist(String artist);
    List<String> getMatchingSongNamesForArtist(String artist, String prefix);
    List<String> getMatchingArtistNames(String prefix);
    Song getSong(String artist, String name);
    Song voteForSong(String artist, String name);
}
