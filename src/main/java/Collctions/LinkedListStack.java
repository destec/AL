package Collctions;

import java.util.Iterator;

/**
 * Created by catalystx on 2016/11/18.
 */
public class LinkedListStack<Item> implements Iterable<Item>{
    private Node first;
    private int N;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(Item item) {
        Node node = new Node();
        node.item = item;
        node.next = first;
        first = node;
        N++;
    }

    public Item pop() {
        Node node = first;
        first = first.next;
        N--;
        return node.item;
    }

    public Iterator<Item> iterator() {
        return null;
    }
}
