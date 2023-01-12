package quickSort;

public class MainProg {
	public static void main(String[] args) {
		int[] arr={20,35,-15,7,55,1,-22};
		
		quicksort(arr,0,arr.length);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}	
	public static void quicksort(int[] input,int start,int end) {		
		if (end-start<2)
			return;
		int pivotIndex=partition(input,start,end);
		quicksort(input,start,pivotIndex);
		quicksort(input,pivotIndex+1,end);
	}
	
	public static int partition(int[] input,int start,int end) {
		int pivot=input[start];
		int i=start;
		int j=end;
		
		while(i<j) {
			//Empty loop: To skip past the array members which are already greater 
			//than pivot element from right side of array.
			while(i<j && pivot<=input[--j]);
			if(i<j) {
				input[i++]=input[j];
			}
			//Empty loop to skip elements until we find the element smaller than pivot
			while(i<j && pivot>=input[++i]);
			if(i<j) {
				input[j++]=input[i];
			}
			
		}
		input[j]=pivot;
		return j;
	}
}
