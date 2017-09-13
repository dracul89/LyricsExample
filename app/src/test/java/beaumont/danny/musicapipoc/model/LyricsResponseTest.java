package beaumont.danny.musicapipoc.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dracul89 on 9/10/17.
 * Simple Model Tests
 * These make sure my getters and setters
 * are right.
 */
public class LyricsResponseTest {

    LyricsResponse subject;

    @Before
    public void setup() {
        subject = new LyricsResponse();
    }

    @Test
    public void setSong() throws Exception {
        String expected = "theString";
        subject.setSong(expected);
        Assert.assertEquals(expected,subject.getSong());
    }


    @Test
    public void setArtist() throws Exception {
        String expected = "theString";
        subject.setArtist(expected);
        Assert.assertEquals(expected,subject.getArtist());
    }

    @Test
    public void setLyrics() throws Exception {
        String expected = "theString";
        subject.setLyrics(expected);
        Assert.assertEquals(expected,subject.getLyrics());
    }

    @Test
    public void setUrl() throws Exception {
        String expected = "theString";
        subject.setUrl(expected);
        Assert.assertEquals(expected,subject.getUrl());
    }

    @Test
    public void subject_toString() throws Exception {
        String song = "Looking for Strange";
        String artist = "KMFDM";
        String lyrics = "Comatose from lack of sleep";
        String url = "http://127.0.0.23";
        String expected = getExpectedLyricsResponse(song,artist,lyrics,url);
        subject.setSong(song);
        subject.setArtist(artist);
        subject.setLyrics(lyrics);
        subject.setUrl(url);
        Assert.assertEquals(expected,subject.toString());
    }

    private String getExpectedLyricsResponse(String song, String artist,String lyrics, String url) {
        return "LyricsResponse{" +
                "song = '" + song + '\'' +
                ",artist = '" + artist+ '\'' +
                ",lyrics = '" + lyrics + '\'' +
                ",url = '" + url + '\'' +
                "}";
    }

}