package sort;

public class SelectionInsertionSort extends SelectionSort{
	
	public static void insertionSort(double[] list) {
		
		for(int i = 1 ; i < list.length ; i++) {
			
			double currentElement = list[i];
			int k;
			
			for(k = i -1 ; k >= 0 && list[k] > currentElement ; k--) {
				list[k + 1] = list[k];
			}
			
			list[k + 1] = currentElement;
		}
	}
	
	
	/*

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
double[] listExample = { 3 , 2 , -5 , 6.9 , -7.8 , 200};
		
		SelectionInsertionSort.insertionSort(listExample);
		SelectionInsertionSort.printList(listExample);
	}
	
	*/
	
	

}
