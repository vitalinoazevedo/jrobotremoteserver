package org.robotframework.remoteserver.servlet;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class RemoteServerRequestProcessorFactoryFactoryTest {

    private RemoteServerRequestProcessorFactoryFactory factory;
    private RemoteServerServlet servlet;

    @Before public void setUp() throws Exception {
        servlet = mock(RemoteServerServlet.class);
        factory = new RemoteServerRequestProcessorFactoryFactory(servlet);
    }

    @Test public void getRequestProcessorFactory() throws Exception {
        //TODO
        Assert.fail("Not tested");
    }

}
