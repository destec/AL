package lib.cat.chapter2;

import lib.cat.stdlib.In;

public class SelectionSort extends Template {

	public static Comparable[] sort(Comparable[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (less(a[j], a[min])) {
					min = j;
				}
				exch(a, i, min);
			}
		}
		return a;
	}
	
	/*public static void main(String[] args) {
		System.out.println("input: ");
		String[] a = In.readStrings();
		System.out.println("finished");
		sort(a);
		assert isSorted(a);
		show(a);
	}*/

}
