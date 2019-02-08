package algo.sort.mergesort;

public class App {
    public static void main(String[] args) {

        int [] array = {9,7,3,1,6,3,2,6,8,9,2,3,0};
	MergeSort sorter = new MergeSort();
	sorter.sort(array);

	for (int i = 0; i < array.length; i++) {
	    System.out.println(array[i]);
	}
    }
}
