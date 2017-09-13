package beaumont.danny.musicapipoc.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by dracul89 on 9/10/17.
 */
public class ResultsItemTest {

    ResultsItem subject;

    @Before
    public void setUp() throws Exception {
        subject = new ResultsItem();
    }

    @Test
    public void setArtworkUrl100() throws Exception {
        String expected = "theString";
        subject.setArtworkUrl100(expected);
        Assert.assertEquals(expected,subject.getArtworkUrl100());
    }

    @Test
    public void setTrackTimeMillis() throws Exception {
        int expected = 100;
        subject.setTrackTimeMillis(expected);
        Assert.assertEquals(expected,subject.getTrackTimeMillis());
    }

    @Test
    public void setCountry() throws Exception {
        String expected = "theString";
        subject.setCountry(expected);
        Assert.assertEquals(expected,subject.getCountry());
    }

    @Test
    public void setPreviewUrl() throws Exception {
        String expected = "theString";
        subject.setPreviewUrl(expected);
        Assert.assertEquals(expected,subject.getPreviewUrl());
    }

    @Test
    public void setArtistId() throws Exception {
        int expected = 10;
        subject.setArtistId(expected);
        Assert.assertEquals(expected,subject.getArtistId());
    }

    @Test
    public void setTrackName() throws Exception {
        String expected = "theString";
        subject.setTrackName(expected);
        Assert.assertEquals(expected,subject.getTrackName());
    }

    @Test
    public void setCollectionName() throws Exception {
        String expected = "theString";
        subject.setCollectionName(expected);
        Assert.assertEquals(expected,subject.getCollectionName());
    }

    @Test
    public void setArtistViewUrl() throws Exception {
        String expected = "theString";
        subject.setArtistViewUrl(expected);
        Assert.assertEquals(expected,subject.getArtistViewUrl());
    }

    @Test
    public void setDiscNumber() throws Exception {
        int expected = 100;
        subject.setDiscNumber(expected);
        Assert.assertEquals(expected,subject.getDiscNumber());
    }

    @Test
    public void setTrackCount() throws Exception {
        int expected = 10;
        subject.setTrackCount(expected);
        Assert.assertEquals(expected,subject.getTrackCount());
    }

    @Test
    public void setArtworkUrl30() throws Exception {
        String expected = "theString";
        subject.setArtworkUrl30(expected);
        Assert.assertEquals(expected,subject.getArtworkUrl30());
    }

    @Test
    public void setWrapperType() throws Exception {
        String expected = "theString";
        subject.setWrapperType(expected);
        Assert.assertEquals(expected,subject.getWrapperType());
    }

    @Test
    public void setCurrency() throws Exception {
        String expected = "theString";
        subject.setCurrency(expected);
        Assert.assertEquals(expected,subject.getCurrency());
    }

    @Test
    public void setCollectionId() throws Exception {
        int expected = 100;
        subject.setCollectionId(expected);
        Assert.assertEquals(expected,subject.getCollectionId());
    }

    @Test
    public void setIsStreamable() throws Exception {
        subject.setIsStreamable(true);
        Assert.assertTrue(subject.isIsStreamable());
    }

    @Test
    public void setTrackExplicitness() throws Exception {
        String expected = "theString";
        subject.setTrackExplicitness(expected);
        Assert.assertEquals(expected,subject.getTrackExplicitness());
    }

    @Test
    public void setCollectionViewUrl() throws Exception {
        String expected = "theString";
        subject.setCollectionViewUrl(expected);
        Assert.assertEquals(expected,subject.getCollectionViewUrl());
    }

    @Test
    public void setTrackNumber() throws Exception {
        int expected = 24;
        subject.setTrackNumber(expected);
        Assert.assertEquals(expected,subject.getTrackNumber());
    }

    @Test
    public void setReleaseDate() throws Exception {
        String expected = "theString";
        subject.setReleaseDate(expected);
        Assert.assertEquals(expected,subject.getReleaseDate());
    }

    @Test
    public void setKind() throws Exception {
        String expected = "theString";
        subject.setKind(expected);
        Assert.assertEquals(expected,subject.getKind());
    }

    @Test
    public void setTrackId() throws Exception {
        int expected = 345;
        subject.setTrackId(expected);
        Assert.assertEquals(expected,subject.getTrackId());
    }

    @Test
    public void setCollectionPrice() throws Exception {
        double expected = 1.11;
        subject.setCollectionPrice(expected);
        Assert.assertEquals(expected,subject.getCollectionPrice(),0);
    }

    @Test
    public void setDiscCount() throws Exception {
        int expected = 123;
        subject.setDiscCount(expected);
        Assert.assertEquals(expected,subject.getDiscCount());
    }

    @Test
    public void setPrimaryGenreName() throws Exception {
        String expected = "theString";
        subject.setPrimaryGenreName(expected);
        assertEquals(expected,subject.getPrimaryGenreName());
    }

    @Test
    public void setTrackPrice() throws Exception {
        double expected = 3.43;
        subject.setTrackPrice(expected);
        assertEquals(expected,subject.getTrackPrice(),0);
    }

    @Test
    public void setCollectionExplicitness() throws Exception {
        String expected = "theString";
        subject.setCollectionExplicitness(expected);
        assertEquals(expected,subject.getCollectionExplicitness());
    }

    @Test
    public void setTrackViewUrl() throws Exception {
        String expected = "theString";
        subject.setTrackViewUrl(expected);
        assertEquals(expected,subject.getTrackViewUrl());
    }

    @Test
    public void setArtworkUrl60() throws Exception {
        String expected = "theString";
        subject.setArtworkUrl60(expected);
        assertEquals(expected,subject.getArtworkUrl60());
    }

    @Test
    public void setTrackCensoredName() throws Exception {
        String expected = "theString";
        subject.setTrackCensoredName(expected);
        assertEquals(expected,subject.getTrackCensoredName());
    }

    @Test
    public void setArtistName() throws Exception {
        String expected = "theString";
        subject.setArtistName(expected);
        assertEquals(expected,subject.getArtistName());
    }

    @Test
    public void setCollectionCensoredName() throws Exception {
        String expected = "theString";
        subject.setCollectionCensoredName(expected);
        assertEquals(expected,subject.getCollectionCensoredName());
    }

}