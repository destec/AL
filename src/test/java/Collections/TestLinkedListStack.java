package Collections;

import Collctions.LinkedListStack;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by catalystx on 2016/11/18.
 */
public class TestLinkedListStack {
    @Test
    public void constructor() {
        LinkedListStack<Double> stack = new LinkedListStack<>();
        assertTrue(stack instanceof LinkedListStack);
    }

    @Test
    public void size() {
        LinkedListStack<Double> stack = new LinkedListStack<>();
        stack.push(1.0);
        stack.push(2.0);
        stack.pop();
        assertEquals(stack.size(), 1);
    }

    @Test
    public void pushAndPop() {
        LinkedListStack<Double> stack = new LinkedListStack<>();
        stack.push(1.0);
        stack.push(2.0);
        assertEquals(stack.pop(), new Double(2));
    }
}
