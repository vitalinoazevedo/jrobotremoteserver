package org.robotframework.remoteserver.xmlrpc;

import org.apache.ws.commons.util.NamespaceContextImpl;
import org.apache.xmlrpc.common.XmlRpcController;
import org.apache.xmlrpc.common.XmlRpcStreamConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class TypeFactoryTest {

    private XmlRpcStreamConfig pConfig;
    private NamespaceContextImpl pContext;
    private TypeFactory typeFactory;

    @Before public void setUp() throws Exception {
        pConfig = mock(XmlRpcStreamConfig.class);
        pContext = mock(NamespaceContextImpl.class);
        typeFactory = new TypeFactory(mock(XmlRpcController.class));
    }

    @Test public void toObject() throws Exception {
        Assert.assertArrayEquals(new Boolean[] {true, true, false, false},
                TypeFactory.toObject(new boolean[] {true, true, false, false}));
    }

    @Test public void toObject1() throws Exception {
        Assert.assertArrayEquals(new Double[] {1.5, 2.0, 8.99, 5.0},
                TypeFactory.toObject(new double[] {1.5, 2.0, 8.99, 5.0}));
    }

    @Test public void toObject2() throws Exception {
        Assert.assertArrayEquals(new Float[] {1.5f, 2.0f, 8.99f, 5.0f},
                TypeFactory.toObject(new float[] {1.5f, 2.0f, 8.99f, 5.0f}));
    }

    @Test public void toObject3() throws Exception {
        Assert.assertArrayEquals(new Long[] {4984849884L, 32189879L, -6542154L, 0L},
                TypeFactory.toObject(new long[] {4984849884L, 32189879L, -6542154L, 0L}));
    }

    @Test public void toObject4() throws Exception {
        Assert.assertArrayEquals(new Long[] {4984849884L, 32189879L, -6542154L, 0L},
                TypeFactory.toObject(new long[] {4984849884L, 32189879L, -6542154L, 0L}));
    }

    @Test public void toObject5() throws Exception {
        Assert.assertArrayEquals(new Integer[] {498484, 43218, -2154, 0},
                TypeFactory.toObject(new int[] {498484, 43218, -2154, 0}));
    }

    @Test public void toObject6() throws Exception {
        Assert.assertArrayEquals(new Short[] {4984, 43, -2154, 0},
                TypeFactory.toObject(new short[] {4984, 43, -2154, 0}));
    }

    @Test public void getSerializer() throws Exception {
        //TODO
        typeFactory.getSerializer(pConfig, "");
        Assert.fail("Not tested");
    }

    @Test public void getParser() throws Exception {
        //TODO
        typeFactory.getParser(pConfig, pContext, "", "");
        Assert.fail("Not tested");
    }

}
