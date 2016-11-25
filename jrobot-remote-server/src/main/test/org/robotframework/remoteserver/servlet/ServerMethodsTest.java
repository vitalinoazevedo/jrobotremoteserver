package org.robotframework.remoteserver.servlet;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class ServerMethodsTest {

    private RemoteServerServlet servlet;
    private ServerMethods serverMethods;

    @Before public void setUp() throws Exception {
        servlet = mock(RemoteServerServlet.class);
        serverMethods = new ServerMethods(servlet);
    }

    @Test public void get_keyword_names() throws Exception {
        //TODO
        Assert.fail("Not tested");
    }

    @Test public void run_keyword() throws Exception {
        //TODO
        Assert.fail("Not tested");
    }

    @Test public void run_keyword1() throws Exception {
        //TODO
        Assert.fail("Not tested");
    }

    @Test public void get_keyword_arguments() throws Exception {
        //TODO
        Assert.fail("Not tested");
    }

    @Test public void get_keyword_documentation() throws Exception {
        //TODO
        Assert.fail("Not tested");
    }

    @Test public void arraysToLists() throws Exception {
        //TODO
        Assert.fail("Not tested");
    }

}
