package algo.search.recursive;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
	final int[] a = { 1, 2, 3, 4, 7, 9, 12, 18 };
	System.out.println(recursiveBinarySearch(a, 0, a.length - 1, 12));
	System.out.println(recursiveBinarySearch(a, 0, a.length - 1, 2));
	System.out.println(recursiveBinarySearch(a, 0, a.length - 1, 88));

    }

    public static int recursiveBinarySearch(int[] a, int p, int r, int x) {
	System.out.println("["+p+"..."+r+"]");
	if (p > r) {
	    return -1;
	}
	int q = (p + r) / 2;
	if (a[q] == x) {
	    return q;
	} else if (a[q] > x) {
	    return recursiveBinarySearch(a, p, --q, x);
	} else {
	    return recursiveBinarySearch(a, ++q, r, x);
	}

    }
}
