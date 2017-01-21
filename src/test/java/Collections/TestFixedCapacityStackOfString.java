package Collections;

import Collctions.FixedCapacityStackOfString;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by catalystx on 2016/11/6.
 */
public class TestFixedCapacityStackOfString {
    @Test
    public void constructor() {
        FixedCapacityStackOfString stack = new FixedCapacityStackOfString(1);
        String[] expected = new String[1];
        assertArrayEquals(stack.getA(), expected);
    }

    @Test
    public void isNotEmpty() {
        FixedCapacityStackOfString stack = new FixedCapacityStackOfString(2);
        stack.push("test");
        assertFalse(stack.isEmpty());
    }

    @Test
    public void isEmpty() {
        FixedCapacityStackOfString stack = new FixedCapacityStackOfString(2);
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushItem() {
        FixedCapacityStackOfString stack = new FixedCapacityStackOfString(1);
        String s = "test string";
        stack.push(s);
        String[] expected = new String[1];
        expected[0] = s;
        assertArrayEquals(stack.getA(), expected);
    }

    @Test
    public void popItem() {
        FixedCapacityStackOfString stack = new FixedCapacityStackOfString(1);
        String s = "test string";
        stack.push(s);
        String item = stack.pop();
        assertSame(item, s);
    }

    @Test
    public void sizeFull() {
        FixedCapacityStackOfString stack = new FixedCapacityStackOfString(2);
        stack.push("test string 1");
        stack.push("test string 2");
        assertEquals(stack.size(), 2);
    }

    @Test
    public void sizeNotFull() {
        FixedCapacityStackOfString stack = new FixedCapacityStackOfString(2);
        stack.push("only one string item");
        assertEquals(stack.size(), 1);
    }

}
