package lib.cat.chapter3;

public class ST<Key extends Comparable<Key>, Value> {
	public ST() {
	}

	public Value get(Key key) {
		return null;
	}

	public void put(Key key, Value val) {
	}

	public void delete(Key key) {
	}

	public boolean contains(Key key) {
		return false;
	}

	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int size() {
		return -1;
	}

	public Key min() {
		return keys[0];
	}

	public Key max() {
		return keys[N-1];
	}

	public Key floor(Key key) {
		return key;
	}

	public Key ceilling(Key key) {
		return key;
	}

	public int rank(Key key) {
		return -1;
	}

	public Key select(int k) {
		return key;
	}

	public void deleteMin() {
		delete(min());
	}

	public void deleteMax() {
		delete(max());
	}

	public int size(Key lo, Key hi) {
		if (hi.compareTo(lo) < 0) {
			return -1;
		} else if (contains(hi)) {
			return rank(hi) - rank(lo) + 1;
		} else {
			return rank(hi) - rank(lo);
		}
	}

	public Iterable<Key> keys(Key lo, Key hi) {
		return (Iterable<Key>)keys[];
	}

	public Iterable<Key> keys() {
		return keys(min(), max());
	}
}
