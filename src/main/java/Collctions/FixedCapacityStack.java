package Collctions;

/**
 * Created by catalystx on 2016/11/6.
 */
public class FixedCapacityStack<Item> {
    private Object[] a;
    private int N;

    public FixedCapacityStack(int cap) {
        a = (Item[]) new Object[cap];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(String item) {
        a[N ++] = item;
    }

    public Item pop() {
        return (Item) a[--N];
    }

    public Item[] getA() {
        return (Item[]) a;
    }
}
