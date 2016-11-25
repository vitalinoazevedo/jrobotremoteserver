package org.robotframework.remoteserver.keywords;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.robotframework.remoteserver.library.RemoteLibrary;

import static org.mockito.Mockito.mock;

public class OverloadedKeywordFactoryTest {

    private OverloadedKeywordFactory keywordFactory;
    private RemoteLibrary remoteLibrary;
    private KeywordExtractor extractor;

    @Before public void setUp() throws Exception {
        remoteLibrary = mock(RemoteLibrary.class);
        extractor = mock(KeywordExtractor.class);
        keywordFactory = new OverloadedKeywordFactory(remoteLibrary, extractor);
    }

    @Test public void createKeyword() throws Exception {
        //TODO
        Assert.fail("Not tested");
    }

    @Test public void getKeywordNames() throws Exception {
        //TODO
        Assert.fail("Not tested");
    }

    @Test public void extractKeywordsFromKeywordBean() throws Exception {
        //TODO
        Assert.fail("Not tested");
    }

}
