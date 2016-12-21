package org.robotframework.remoteserver.xmlrpc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ByteArrayToStringParserTest {

    private ByteArrayToStringParser parser;

    @Before public void setUp() throws Exception {
        parser = new ByteArrayToStringParser();
    }

    @Test public void setResult() throws Exception {
        parser.setResult(new byte[] {'a', 'b', 'c', 'd'});
        Assert.assertEquals("abcd", parser.getResult());

        parser.setResult(new int[] {'a', 'b', 'c', 'd'});
        Assert.assertArrayEquals(new int[] {'a', 'b', 'c', 'd'}, (int[]) parser.getResult());
    }

}
