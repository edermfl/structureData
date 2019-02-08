package algo.search.linearsearch;

public class App {
    /**
     * O(n)
     * @param a
     * @param x
     * @return
     */
    public static int linearSearch(int[] a, int x) {
	for (int i = 0; i < a.length; i++) {
	    if (a[i] == x) {
		return a[i];
	    }
	}
	return -1;
    }

    public static void main(String[] args) {

    }
}
