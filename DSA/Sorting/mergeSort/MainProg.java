package mergeSort;

public class MainProg {
	
	//mergeSort and merge methods
	
	public static void mergeSort(int[] input,int start,int end) {
		if(end-start < 2)
			return;
		
		int mid=(start+end)/2;
		
		mergeSort(input,start,mid);//passing elements from start to mid-1
		mergeSort(input,mid,end);//mid to end-1
		merge(input,start,mid,end);
	}
	
	public static void merge(int[] input,int start,int mid,int end) {
		
	if(input[mid-1]<input[mid])
		return;
	int i=start;
	int j=mid;
	int tmpIndex=0;
	int[] tmp=new int[end-start];
	
	while(i<mid && j<end) {
		if(input[i] <= input[j])
			tmp[tmpIndex++] = input[i++];
		else
			tmp[tmpIndex++] = input[j++];
	}
	//check if any elements are left in the left/right sub-parts of the arrays,
	//and copy them to our main array, directly.
	System.arraycopy(input, i, input, start+tmpIndex, mid-i);
	System.arraycopy(tmp, 0, input, start, tmpIndex);
	}
	
	public static void main(String[] args) {
	int[] arr={20,35,-15,-22,7,55,1};
	mergeSort(arr,0,arr.length);
	for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}
}
