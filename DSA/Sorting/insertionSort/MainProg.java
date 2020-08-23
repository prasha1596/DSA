package insertionSort;

//INSERTION SORT IMPLEMENTATION

public class MainProg {
	public static void main(String[] args) {
		
		int[] arr={22,33,-15,27,1,-3};
		
		for(int firstUnsortedIndex=1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
			
			int newElement = arr[firstUnsortedIndex];
			int i;
			
			for(i=firstUnsortedIndex; i>0 && arr[i-1]>newElement; i--) {
				arr[i]=arr[i-1];
			}
			
			arr[i]=newElement;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
