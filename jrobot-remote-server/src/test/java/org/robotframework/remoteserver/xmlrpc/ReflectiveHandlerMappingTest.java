package org.robotframework.remoteserver.xmlrpc;

import java.util.Arrays;
import java.util.concurrent.Future;
import java.util.stream.Stream;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for {@link ReflectiveHandlerMapping}
 */
public class ReflectiveHandlerMappingTest {

    private ReflectiveHandlerMapping handlerMapping;

    @Before public void setUp() throws Exception {
        handlerMapping = new ReflectiveHandlerMapping();
    }

    @Test public void removePrefixes() throws Exception {
        handlerMapping.addHandler("future", Future.class);
        Assert.assertArrayEquals(
                Stream.of("future.get", "future.isDone", "future.isCancelled", "future.cancel").sorted().toArray(),
                Arrays.stream(handlerMapping.getListMethods()).sorted().toArray());
        handlerMapping.removePrefixes();
        Assert.assertArrayEquals(Stream.of("get", "isDone", "isCancelled", "cancel").sorted().toArray(),
                Arrays.stream(handlerMapping.getListMethods()).sorted().toArray());
    }

}
