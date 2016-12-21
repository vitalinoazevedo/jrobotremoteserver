package org.robotframework.remoteserver.keywords;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.robotframework.remoteserver.library.RemoteLibrary;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;

public class OverloadedKeywordFactoryTest {

    private final String keywordName = "keyword";
    private OverloadedKeywordFactory keywordFactory;
    private RemoteLibrary remoteLibrary;
    private KeywordExtractor extractor;
    private Map<String, OverloadedKeyword> keywordMap;
    private OverloadedKeyword keyword;

    @Before public void setUp() throws Exception {
        keyword = mock(OverloadedKeyword.class);
        keywordMap = Collections.singletonMap(keywordName, keyword);
        remoteLibrary = mock(RemoteLibrary.class);
        extractor = mock(KeywordExtractor.class);
        Mockito.when(extractor.extractKeywords(any(RemoteLibrary.class))).thenReturn(keywordMap);
        keywordFactory = new OverloadedKeywordFactory(remoteLibrary, extractor);
    }

    @Test public void createKeyword() throws Exception {
        Assert.assertNotNull(keywordFactory.createKeyword(keywordName));
        Assert.assertNull(keywordFactory.createKeyword("notKnownKeyword"));
    }

    @Test public void getKeywordNames() throws Exception {
        Assert.assertArrayEquals(new String[] {keywordName},
                Arrays.stream(keywordFactory.getKeywordNames()).sorted().toArray());
    }

}
