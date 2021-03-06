package org.robotframework.remoteserver.keywords;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.robotframework.remoteserver.AbstractLibraryTest;
import org.robotframework.remoteserver.RemoteServer;

import static org.mockito.Mockito.mock;

public class OverloadedKeywordExtractorTest {

    private AbstractLibraryTest abstractLibrary;
    private OverloadedKeywordExtractor keywordExtractor;

    @Before public void setUp() throws Exception {
        abstractLibrary = new AbstractLibraryTest(mock(RemoteServer.class));
        keywordExtractor = OverloadedKeywordExtractor.createInstance();
    }

    @Test public void createInstance() throws Exception {
        Assert.assertNotNull(OverloadedKeywordExtractor.createInstance());
        Assert.assertEquals(keywordExtractor, OverloadedKeywordExtractor.createInstance());
    }

    @Test public void getMethods() throws Exception {
        Assert.assertArrayEquals(
                new String[] {"equals", "getClass", "hashCode", "notify", "notifyAll", "toString", "wait"},
                OverloadedKeywordExtractor.getMethods(Object.class)
                        .map(Method::getName)
                        .collect(Collectors.toSet())
                        .stream()
                        .sorted()
                        .toArray());
    }

    @Test public void extractKeywords() throws Exception {
        final Map<String, OverloadedKeyword> keywordMap = keywordExtractor.extractKeywords(abstractLibrary);
        Assert.assertEquals(4, keywordMap.size());
        Assert.assertEquals(4, keywordMap.values().stream().filter(Objects::nonNull).count());
        Assert.assertTrue(keywordMap.containsKey("plus"));
        Assert.assertTrue(keywordMap.containsKey("minus"));
        Assert.assertTrue(keywordMap.containsKey("defaultKeyword"));
        Assert.assertTrue(keywordMap.containsKey("libraryCleanup"));
    }

}
