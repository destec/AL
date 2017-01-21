package Collections;

import Collctions.ArrayStack;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

/**
 * Created by catalystx on 2016/11/17.
 */
public class TestArrayStack {
    @Test
    public void constructor() {
        ArrayStack<Integer> stack = new ArrayStack<>();
        assertTrue(stack instanceof ArrayStack);
    }

    @Test
    public void size() {
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(1);
        stack.push(2);
        assertEquals(stack.size(), 2);
    }

    @Test
    public void pushAndPop() {
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(1);
        stack.push(2);
        stack.pop();
        assertEquals(stack.pop(), new Integer(1));
    }

    @Test
    public void resizing() {
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(stack.size(), 3);
    }

    @Test
    public void iterator() {
        ArrayStack<Integer> stack = new ArrayStack<>();
        stack.push(1);
        stack.push(3);
        int[] arr = new int[stack.size()];
        Iterator<Integer> iterator = stack.iterator();
        int idx = 0;
        while (iterator.hasNext()) {
            arr[idx++] = iterator.next();
        }
        int[] testArr = {3, 1};
        assertArrayEquals(arr, testArr);
    }
}
