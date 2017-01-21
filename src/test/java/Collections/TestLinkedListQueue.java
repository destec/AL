package Collections;

import Collctions.LinkedListQueue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by catalystx on 2016/11/22.
 */
public class TestLinkedListQueue {
    @Test
    public void constructor() {
        LinkedListQueue<String> queue = new LinkedListQueue<>();
        assertTrue(queue instanceof LinkedListQueue);
    }

    @Test
    public void size() {
        LinkedListQueue<String> queue = new LinkedListQueue<>();
        assertEquals(queue.size(), 0);
    }

    @Test
    public void enqueueBasic() {
        LinkedListQueue<String> queue = new LinkedListQueue<>();
        queue.enqueue("test1");
        queue.enqueue("test2");
        assertEquals(queue.size(), 2);
    }

    @Test
    public void enqueueWithOnlyOneItem() {
        LinkedListQueue<String> queue = new LinkedListQueue<>();
        queue.enqueue("test1");
        assertEquals(queue.getFirst(), queue.getLast());
    }

    @Test
    public void dequeue() {
        LinkedListQueue<String> queue = new LinkedListQueue<>();
        queue.enqueue("test1");
        queue.enqueue("test2");
        assertEquals(queue.dequeue(), "test1");
    }

    @Test
    public void dequeueWhenOnlyOneItem() {
        LinkedListQueue<String> queue = new LinkedListQueue<>();
        queue.enqueue("test");
        queue.dequeue();
        assertEquals(queue.getFirst(), null);
        assertEquals(queue.getLast(), null);
    }

    @Test
    public void dequeueWhenNothingInQueue() {
        LinkedListQueue<String> queue = new LinkedListQueue<>();
        String item = queue.dequeue();
        assertEquals(item, null);
    }
}
