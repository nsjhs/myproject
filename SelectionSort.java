package sort;

public class SelectionSort {
	
	public static void  selectionSort(double[] list) {
		
		for(int i = 0; i < list.length -1 ; i++) {
			
			// find the minimum value in the list
			
			double currentMin = list[i];
			
			int currentMinIndex = i;
			
			for(int j = i + 1 ; j < list.length ; j++) {
				
				if(currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			
			
			// swap list[i] with list[currentMinIndex] if necessary
			
			if(currentMinIndex != i) {
				
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
			
			
			
			
		}
	}
	
	
	public static void printList(double[] list) {
		
		System.out.print("[");
		for(int i = 0; i < list.length ; i++) {
			
			System.out.print(list[i] + "   ");
		}
			
		System.out.print("]");
	}
	
	/*
	public static void main(String[] args) {
		
		double[] listExample = { 3 , 2 , -5 , 6.9 , -7.8};
		
		SelectionSort.selectionSort(listExample);
		SelectionSort.printList(listExample);
		
		
	}
	
	*/
	

}
