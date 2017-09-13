package beaumont.danny.musicapipoc.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by dracul89 on 9/10/17.
 */
public class ItunesResponseTest {

    ItunesResponse subject;

    @Before
    public void setUp() throws Exception {
        subject = new ItunesResponse();
    }

    @Test
    public void setResultCount() throws Exception {
        int expected = 10;
        subject.setResultCount(expected);
        Assert.assertEquals(expected,subject.getResultCount());
    }

    @Test
    public void setResults() throws Exception {
        List<ResultsItem> resultsItemList = new ArrayList<>();
        ResultsItem item = new ResultsItem();
        resultsItemList.add(item);
        subject.setResults(resultsItemList);
        Assert.assertArrayEquals(resultsItemList.toArray(),subject.getResults().toArray());
    }

    @Test
    public void ItunesResponse_toString() throws Exception {
        List<ResultsItem> results = new ArrayList<>();
        results.add(new ResultsItem());
        String expected = getExpectedSting(10, results);
        subject.setResults(results);
        subject.setResultCount(10);
        Assert.assertEquals(expected,subject.toString());
    }

    private String getExpectedSting(int resultCount, List<ResultsItem> results) {
        return
                "ItunesResponse{" +
                        "resultCount = '" + resultCount + '\'' +
                        ",results = '" + results + '\'' +
                        "}";
    }

}