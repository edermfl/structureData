package algo.search.binarysearch;

public class BinarySearch {
    /**
     * 
     * @param a
     * @param x
     * @return
     */
    public static int binarySearch(int a[], int x) {
	int front = 0;
	int back = a.length - 1;

	while (front <= back) {
	    int middle = (front + back) / 2;
	    if (a[middle] > x) {
		back = middle - 1;
	    } else if (a[middle] < x) {
		front = middle + 1;
	    } else {
		return middle;
	    }
	}
	return -1;
    }

    public static void main(String[] args) {
	System.out.println(binarySearch(new int[]{1,2,3,4,7,9,12,18},12));
	System.out.println(binarySearch(new int[]{1,2,3,4,7,9,12,18},2));
	System.out.println(binarySearch(new int[]{1,2,3,4,7,9,12,18},88));

    }
}

