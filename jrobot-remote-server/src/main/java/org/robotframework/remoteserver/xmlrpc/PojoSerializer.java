package org.robotframework.remoteserver.xmlrpc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import java.util.Objects;
import org.apache.xmlrpc.serializer.TypeSerializerImpl;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

public class PojoSerializer extends TypeSerializerImpl {

    protected final ObjectMapper mapper = new ObjectMapper();

    @Override
    public void write(ContentHandler pHandler, Object pObject) throws SAXException {
        String value;
        synchronized (mapper) {
            try {
                value = mapper.writeValueAsString(pObject);
            } catch (JsonProcessingException e) {
                value = pObject.toString();
            }
        }
        write(pHandler, VALUE_TAG, value);
    }
}
