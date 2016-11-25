package org.robotframework.remoteserver.library;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.robotframework.remoteserver.RemoteServer;

import static org.mockito.Mockito.mock;

public class AbstractClassLibraryTest {

    private AbstractClassLibrary library;

    @Before public void setUp() throws Exception {
        library = new AbstractClassLibrary(mock(RemoteServer.class)) {

            @Override public String getURI() {
                return "TESTING";
            }

            @Override public void close() {
            }
        };
    }

    @Test public void createKeywordFactory() throws Exception {
        //TODO
        Assert.fail("Not tested");
    }

    @Test public void runKeyword() throws Exception {
        //TODO
        Assert.fail("Not tested");
    }

    @Test public void getKeywordArguments() throws Exception {
        //TODO
        Assert.fail("Not tested");
    }

    @Test public void getKeywordDocumentation() throws Exception {
        //TODO
        Assert.fail("Not tested");
    }

    @Test public void getURI() throws Exception {
        //TODO
        Assert.fail("Not tested");
    }

    @Test public void libraryCleanup() throws Exception {
        //TODO
        Assert.fail("Not tested");
    }

}
