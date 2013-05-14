package lib.cat.chapter2;

public class InsertSort extends Template {
	public static Comparable[] sort(Comparable[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			
			//this way is easy to understand 
			/*
			 * for(int j=i; j>0; j--) { if(less(a[j], a[j-1])) { exch(a, j,
			 * j-1); } }
			 */
			
			//but this one is more efficiency
			for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
				exch(a, j, j - 1);
			}
		}
		return a;
	}
}
