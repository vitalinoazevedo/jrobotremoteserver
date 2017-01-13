package org.robotframework.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;
import org.robotframework.remoteserver.RemoteServer;

@RobotKeywords public class ExtendedLibrary extends BaseLibrary {

    public ExtendedLibrary(RemoteServer server) {
        super(server);
    }

    @Override public String getURI() {
        return getClass().getSimpleName();
    }

    @Override public String getName() {
        return "Extended Library";
    }

    @RobotKeyword public double getPi() {
        return 3.14;
    }

    @RobotKeyword
    public TestObject getObject() {
        return new TestObject(10, 50);
    }

    @RobotKeyword
    public Map<Integer, Object> getMap() {
        Map<Integer, Object> map = new HashMap<>();
        map.put(5, "awdawd");
        map.put(6, "a9d");
        map.put(50, "a9875wd");
        map.put(66, new TestObject(89, 64));
        return map;
    }

    @RobotKeyword
    public int[] getArrayInts() {
        return new int[] {41, 42, 43, 44, 45};
    }

    @RobotKeyword
    public char[] getArrayChars() {
        return new char[] {'a', 'b', 'c', 'd'};
    }

    @RobotKeyword
    public List<Integer> getListIntegers() {
        return IntStream.range(1, 5).boxed().collect(Collectors.toList());
    }

    @RobotKeyword
    public List<String> getListStrings() {
        return IntStream.range(1, 5).mapToObj(Integer::toString).collect(Collectors.toList());
    }

    @RobotKeyword
    public Set<Integer> getSetIntegers() {
        return IntStream.range(1, 5).boxed().collect(Collectors.toSet());
    }

    @RobotKeyword
    public Set<String> getSetStrings() {
        return IntStream.range(1, 5).mapToObj(Integer::toString).collect(Collectors.toSet());
    }

    private class TestObject {

        private final int x;
        private final int y;

        TestObject(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

    }
}
