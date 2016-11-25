package org.robotframework.remoteserver.xmlrpc;

import org.apache.xmlrpc.common.XmlRpcController;
import org.apache.xmlrpc.common.XmlRpcStreamConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class IterableSerializerTest {

    private IterableSerializer serializer;
    private XmlRpcStreamConfig pConfig;
    private TypeFactory typeFactory;

    @Before public void setUp() throws Exception {
        pConfig = mock(XmlRpcStreamConfig.class);
        typeFactory = new TypeFactory(mock(XmlRpcController.class));
        serializer = new IterableSerializer(typeFactory, pConfig);
    }

    @Test public void writeData() throws Exception {
        //TODO
        Assert.fail("Not tested");
    }

}
