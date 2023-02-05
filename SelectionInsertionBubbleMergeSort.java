package sort;

public class SelectionInsertionBubbleMergeSort extends SelectionInsertionBubbleSort {

	public static void mergeSort(double[] list) {

		if (list.length > 1) {
			// merge sort the first half
			double[] firstHalf = new double[list.length / 2];
			System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
			mergeSort(firstHalf);

			// merge sort the second half

			int secondHalfLength = list.length - list.length / 2;
			double[] secondHalf = new double[secondHalfLength];
			System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
			mergeSort(secondHalf);

			merge(firstHalf, secondHalf, list);

		}

	}

	public static void merge(double[] list1, double[] list2, double[] temp) {

		int current1 = 0; // current index in list1
		int current2 = 0; // current index in list2
		int current3 = 0; // current index in list3

		while (current1 < list1.length && current2 < list2.length) {
			if (list1[current1] < list2[current2])
				temp[current3++] = list1[current1++];
			else
				temp[current3++] = list2[current2++];
		}

		while (current1 < list1.length)
			temp[current3++] = list1[current1++];
		
		
		while (current2 < list2.length)
			temp[current3++] = list2[current2++];

	}

	
	
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
double[] listExample = { 3 , 2 , -5 , 6.9 , -7.8 , 200 , 69.77 , 25 , 99.999 , 11.1 };
		
		SelectionInsertionBubbleMergeSort.mergeSort(listExample);
		SelectionInsertionBubbleMergeSort.printList(listExample);
	}

*/
}
