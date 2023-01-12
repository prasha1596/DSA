package bubbleSort;

import java.util.Scanner;

//BUBBLE SORT IMPLEMENTATION

public class MainProg {

	public static void swap(int[] intArr,int i,int j) {
		if(intArr[i]==intArr[j]) 
			return;
		if(intArr[i]>intArr[j]) {
			
			int c=intArr[i];
			intArr[i]=intArr[j];
			intArr[j]=c;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Please enter the no of digits you want to sort");
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		int[] intArr=new int[n];
		System.out.println("Enter the digits");
		int k=0;
		while(n>0) {
			intArr[k++]=scan.nextInt();
			n--;
		}
		scan.close();
		
		//int[] intArr={20,30,-9,34,1};
		for(int lastSortedIndex=(intArr.length - 1) ; lastSortedIndex > 0; lastSortedIndex-- ) {
			
			for(int i=0; i<lastSortedIndex ; i++) {
				if(intArr[i]>intArr[i+1]) {
					swap(intArr,i,i+1);
					
				}
			}
		}
		//Print the elements
		for(int i=0;i<intArr.length;i++) {
			System.out.println(intArr[i]);
		}
	}
}
