package org.robotframework.remoteserver.xmlrpc.serializers;

import java.util.Collections;
import org.apache.xmlrpc.common.XmlRpcStreamConfig;
import org.apache.xmlrpc.serializer.TypeSerializer;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.robotframework.remoteserver.xmlrpc.TypeFactory;
import org.xml.sax.ContentHandler;

import static org.mockito.Mockito.mock;

/**
 * Tests for {@link IterableSerializer}
 */
public class IterableSerializerTest {

    private IterableSerializer serializer;
    private XmlRpcStreamConfig pConfig;
    private TypeFactory typeFactory;
    private ContentHandler handler;
    private TypeSerializer typeSerializer;

    @Before public void setUp() throws Exception {
        handler = Mockito.mock(ContentHandler.class);
        pConfig = mock(XmlRpcStreamConfig.class);
        typeFactory = Mockito.mock(TypeFactory.class);
        typeSerializer = Mockito.mock(TypeSerializer.class);
        Mockito.when(typeFactory.getSerializer(Mockito.any(XmlRpcStreamConfig.class), Mockito.anyObject()))
                .thenReturn(typeSerializer);

        serializer = new IterableSerializer(typeFactory, pConfig);
    }

    @Test public void writeData() throws Exception {
        serializer.write(handler, Collections.singleton("ENTRY"));
        Mockito.verify(typeSerializer).write(Mockito.eq(handler), Mockito.eq("ENTRY"));
    }

}
