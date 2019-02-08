package algo.search.recursive;

public class RecursiveLinearSearch {
    public static void main(String[] args) {
	System.out.println(recursiveLinearSearch(new int[]{1,2,3,4,7,9,12,18},0,12));
	System.out.println(recursiveLinearSearch(new int[]{1,2,3,4,7,9,12,18},0,2));
	System.out.println(recursiveLinearSearch(new int[]{1,2,3,4,7,9,12,18},0,88));

    }

    public static int recursiveLinearSearch(int[] a, int i, int x) {
	if (i > a.length-1) {
	    return -1;
	} else if (a[i] == x) {
	    return i;
	} else {
	    return recursiveLinearSearch(a, ++i, x);
	}
    }
}
