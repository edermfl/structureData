package algo.sort.mergesort;

public class MergeSort {

    public void sort(final int[] array) {
	sort(array, 0, array.length - 1);
    }

    public void sort(final int[] array, final int start, final int end) {
	int middle = (start + end) / 2;
	if (start < end) {
	    sort(array, start, middle);
	    sort(array, middle + 1, end);
	    merge(array, start, middle, end);
	}

    }

    private void merge(final int[] array, final int start, final int middle, final int end) {
	int[] tempArray = new int[end - start + 1];
	int k = 0;
	int left = start;
	int right = middle + 1;
	while (left <= middle && right <= end) {
	    if (array[left] < array[right]) {
		tempArray[k] = array[left];
		left++;
	    } else {
		tempArray[k] = array[right];
		right++;
	    }
	    k++;
	}

	if (left <= middle) {
	    while (left <= middle) {
		tempArray[k] = array[left];
		left++;
		k++;
	    }
	} else if (right <= end) {
	    while (right <= end) {
		tempArray[k] = array[right];
		right++;
		k++;
	    }
	}
	for (int i = 0; i < tempArray.length; i++) {
	    array[start + i] = tempArray[i];
	}
    }
}
