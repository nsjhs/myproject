package sort;

public class SelectionInsertionBubbleSort extends SelectionInsertionSort {
	
	
	public static void bubbleSort(double[] list) {
		
		boolean needNextPass = true;
		for(int k = 1 ; k < list.length  && needNextPass ; k++) {
			
			needNextPass = false;
			
			for(int i = 0 ; i < list.length - k ; i++) {
				if(list[i] > list[i + 1]) {
					double temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					
					needNextPass = true;
				}
			}
		}
		
		
	}
	
	

	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
double[] listExample = { 3 , 2 , -5 , 6.9 , -7.8 , 200 };
		
		SelectionInsertionBubbleSort.bubbleSort(listExample);
		SelectionInsertionBubbleSort.printList(listExample);

	}
	
	*/

}
