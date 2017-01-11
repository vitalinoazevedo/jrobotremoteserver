package org.robotframework.remoteserver.xmlrpc;

import org.apache.xmlrpc.serializer.TypeSerializerImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;

/**
 * Tests for {@link NullSerializer}
 */
public class NullSerializerTest {

    private NullSerializer serializer;
    private ContentHandler handler;

    @Before public void setUp() throws Exception {
        serializer = new NullSerializer();
        handler = Mockito.mock(ContentHandler.class);
    }

    @Test public void write() throws Exception {
        serializer.write(handler, null);
        Mockito.verify(handler)
                .startElement(Mockito.anyString(), Mockito.eq(TypeSerializerImpl.VALUE_TAG),
                        Mockito.eq(TypeSerializerImpl.VALUE_TAG), Mockito.any(Attributes.class));
        Mockito.verify(handler).characters(Mockito.eq("".toCharArray()), Mockito.eq(0), Mockito.eq(0));
        Mockito.verify(handler)
                .endElement(Mockito.anyString(), Mockito.eq(TypeSerializerImpl.VALUE_TAG),
                        Mockito.eq(TypeSerializerImpl.VALUE_TAG));
    }

}
