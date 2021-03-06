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
package org.robotframework.remoteserver.servlet;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.XmlRpcRequest;
import org.apache.xmlrpc.server.RequestProcessorFactoryFactory;

/**
 * Class providing implementation of {@link RequestProcessorFactoryFactory}
 */
public class RemoteServerRequestProcessorFactoryFactory implements RequestProcessorFactoryFactory {

    private final RequestProcessorFactory factory = new RemoteServerRequestProcessorFactory();
    private final JRobotServlet serverMethods;

    /**
     * Constructor creating {@link RequestProcessorFactoryFactory}
     *
     * @param servlet {@link RemoteServerServlet} used for handling requests
     */
    public RemoteServerRequestProcessorFactoryFactory(RemoteServerServlet servlet) {
        this.serverMethods = new ServerMethods(servlet);
    }

    @Override @SuppressWarnings("rawtypes") public RequestProcessorFactory getRequestProcessorFactory(Class aClass)
            throws XmlRpcException {
        //FIXME parameter is unused
        return factory;
    }

    /**
     * Class providing implementation of {@link org.apache.xmlrpc.server.RequestProcessorFactoryFactory.RequestProcessorFactory}
     */
    private class RemoteServerRequestProcessorFactory implements RequestProcessorFactory {

        @Override public JRobotServlet getRequestProcessor(XmlRpcRequest xmlRpcRequest) throws XmlRpcException {
            return serverMethods;
        }
    }
}
