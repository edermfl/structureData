package algo.sort.quicksort;

import java.util.Arrays;

public class QuickSort {
    static int qLoop = 0;

    public static void main(String[] args) {
	qLoop = 0;
	int[] a = { 9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 6, 4 };
	quickSort(a, 0, a.length - 1);
	System.out.println("Quantidades de loop: " + qLoop);
	System.out.println(Arrays.toString(a));

	System.out.println("-------------------");

	qLoop = 0;
	int[] b = { 12, 81, 74, 43, 1098, 0, 8, 92, 17, 754, 912, 0, 6, 4 };
	quickSort(b, 0, b.length - 1);
	System.out.println("Quantidades de loop: " + qLoop); 
	System.out.println(Arrays.toString(b));

    }

    public static void quickSort(int a[], int first, int last) {
	if (first < last) {
	    int middle = partitionArray(a, first, last);
	    quickSort(a, first, middle - 1); //LEFT
	    quickSort(a, middle + 1, last);  //RIGHT
	}
    }

    private static int partitionArray(final int[] a, final int first, final int last) {
	int pivot = a[last];
	int i = first - 1;
	for (int j = first; j < last; j++) {
	    qLoop++;
	    if (a[j] <= pivot) {
		i++;
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	    }
	}
	i++;
	int temp = a[i];
	a[i] = pivot;
	a[last] = temp;
	System.out.println("- " + first + " ... " + last + " => a[" + i + "] = " + pivot);
	return i;
    }
}
