package Collections;

import Collctions.LinkedListBag;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by catalystx on 2016/11/22.
 */
public class TestLinkedListBag {
    @Test
    public void size() {
        LinkedListBag<Integer> bag = new LinkedListBag<>();
        bag.add(1);
        assertEquals(bag.size(), 1);
    }

    // TODO: 2016/11/22
    // add test for iterator
}
