package Collections;

import Collctions.FixedCapacityStack;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by catalystx on 2016/11/6.
 */
public class TestFixedCapacityStack {
    private class TestClass {
        private int id;
        TestClass(int _id) {
            this.id = _id;
        }
    }

    @Test
    public void constructorOfString() {
        FixedCapacityStack<String> stack = new FixedCapacityStack(1);
        String[] expected = new String[1];
        assertArrayEquals(stack.getA(), expected);
    }

    @Test
    public void constructorOfInt() {
        FixedCapacityStack<Double> stack = new FixedCapacityStack(1);
        Double[] expected = new Double[1];
        assertArrayEquals(stack.getA(), expected);
    }

    @Test
    public void contructorOfClass() {
        FixedCapacityStack<TestClass> stack = new FixedCapacityStack(1);
        TestClass[] expected = new TestClass[1];
        assertArrayEquals(stack.getA(), expected);
    }

    @Test
    public void isNotEmpty() {
        FixedCapacityStack stack = new FixedCapacityStack(2);
        stack.push("test");
        assertFalse(stack.isEmpty());
    }

    @Test
    public void isEmpty() {
        FixedCapacityStack stack = new FixedCapacityStack(2);
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushItem() {
        FixedCapacityStack stack = new FixedCapacityStack(1);
        String s = "test string";
        stack.push(s);
        String[] expected = new String[1];
        expected[0] = s;
        assertArrayEquals(stack.getA(), expected);
    }

    @Test
    public void popItem() {
        FixedCapacityStack stack = new FixedCapacityStack(1);
        String s = "test string";
        stack.push(s);
        Object item = stack.pop();
        assertSame(item, s);
    }

    @Test
    public void sizeFull() {
        FixedCapacityStack stack = new FixedCapacityStack(2);
        stack.push("test string 1");
        stack.push("test string 2");
        assertEquals(stack.size(), 2);
    }

    @Test
    public void sizeNotFull() {
        FixedCapacityStack stack = new FixedCapacityStack(2);
        stack.push("only one string item");
        assertEquals(stack.size(), 1);
    }
}


