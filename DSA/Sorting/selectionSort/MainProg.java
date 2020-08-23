package selectionSort;

import java.util.Scanner;

//SELECTION SORT IMPLEMENTATION

public class MainProg {
	public static void main(String[] args) {
		System.out.println("Enter the number of elements you wish to sort");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the "+ n +" elements");
		int k=0;
		while(n>0) {
			arr[k++]=scan.nextInt();
			n--;
		}
		scan.close();
		for(int lastUnsortedIndex=arr.length-1; lastUnsortedIndex>0; lastUnsortedIndex--) {
			int largest=0;
			
			for(int i=1;i<lastUnsortedIndex;i++) {
				if (arr[i]>arr[largest]) {
					largest=i;
				}
			}
			swap(arr,largest,lastUnsortedIndex);
		}
		//print the sorted elements
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void swap (int[] arr, int i ,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
