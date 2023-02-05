package sort;

public class SelectionInsertionBubbleMergeQuickSort extends SelectionInsertionBubbleMergeSort {

	public static void quickSort(double[] list) {
		
		quickSort(list , 0 , list.length -1);
	}
	
	
	public static void quickSort(double[] list , int first , int last) {
		if(last > first) {
			int pivotIndex = partition(list , first , last);
			quickSort(list , first , pivotIndex -1);
			quickSort(list , pivotIndex + 1 , last);
		}
	}
	
	public static int partition(double[] list, int first , int last) {
		
		double pivot = list[first];
		int low = first + 1;
		int high = last;
		
		while(high > low) {
			
			// search forward from left
			while(low <= high && list[low] <= pivot)
				low++;
			
			// search backward from right
			
			while(low <= high && list[high] > pivot)
				high--;
			
			// swap two elements in the list
			
			if(high > low) {
				double temp = list[high];
				list[high] = list[low];
				list[low] = temp;
			}
		}
		
		
		
		while(high > first && list[high] >= pivot)
			high--;
		
		// swap pivot with list[high]
		
		if(pivot > list[high]) {
			list[first] = list[high];
			list[high] = pivot;
			return high;
		}
		
		else {
			return first;
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
double[] listExample = { 3 , 2 , -5 , 6.9 , -7.8 , 200 , 69.77 , 25 , 99.999 , 11.1 , -2000.99  , 99999};
		
		SelectionInsertionBubbleMergeQuickSort.quickSort(listExample);
		SelectionInsertionBubbleMergeQuickSort.printList(listExample);
	}
	
	

}
