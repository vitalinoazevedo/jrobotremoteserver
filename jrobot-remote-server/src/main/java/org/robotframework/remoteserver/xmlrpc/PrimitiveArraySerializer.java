/* Copyright 2014 Kevin Ormbrek
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robotframework.remoteserver.xmlrpc;

import static org.robotframework.remoteserver.xmlrpc.TypeFactory.toObject;

import org.apache.xmlrpc.common.XmlRpcStreamConfig;
import org.apache.xmlrpc.serializer.ObjectArraySerializer;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/**
 * A {@link org.apache.xmlrpc.serializer.TypeSerializer} for primitive array elements.
 */
public class PrimitiveArraySerializer extends ObjectArraySerializer {

    /**
     * Creates a new instance.
     *
     * @param pTypeFactory The factory being used for creating serializers.
     * @param pConfig      The configuration being used for creating serializers.
     */
    public PrimitiveArraySerializer(org.apache.xmlrpc.common.TypeFactory pTypeFactory, XmlRpcStreamConfig pConfig) {
        super(pTypeFactory, pConfig);
    }

    @Override
    protected void writeData(ContentHandler pHandler, Object pObject1) throws SAXException {
        Object[] array = new Object[0];
        if (pObject1 instanceof byte[])
            array = toObject((byte[]) pObject1);
        else if (pObject1 instanceof short[])
            array = toObject((short[]) pObject1);
        else if (pObject1 instanceof int[])
            array = toObject((int[]) pObject1);
        else if (pObject1 instanceof long[])
            array = toObject((long[]) pObject1);
        else if (pObject1 instanceof float[])
            array = toObject((float[]) pObject1);
        else if (pObject1 instanceof double[])
            array = toObject((double[]) pObject1);
        else if (pObject1 instanceof boolean[])
            array = toObject((boolean[]) pObject1);
        super.writeData(pHandler, array);
    }
}
