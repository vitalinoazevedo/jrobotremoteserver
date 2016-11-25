package org.robotframework.remoteserver.xmlrpc;

import org.apache.xmlrpc.common.XmlRpcController;
import org.apache.xmlrpc.common.XmlRpcStreamConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class MapSerializerTest {

    private XmlRpcStreamConfig pConfig;
    private TypeFactory typeFactory;
    private MapSerializer mapSerializer;

    @Before public void setUp() throws Exception {
        pConfig = mock(XmlRpcStreamConfig.class);
        typeFactory = new TypeFactory(mock(XmlRpcController.class));
        mapSerializer = new MapSerializer(typeFactory, pConfig);
    }

    @Test public void writeEntry() throws Exception {
        //TODO
        Assert.fail("Not tested");
    }

    @Test public void writeData() throws Exception {
        //TODO
        Assert.fail("Not tested");
    }

    @Test public void write() throws Exception {
        //TODO
        Assert.fail("Not tested");
    }

}
