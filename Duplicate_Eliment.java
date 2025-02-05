package com.aimerz;

public class Duplicate_Eliment {
	public static void main(String[]args) {
		int arr[]= {1,3,3,4,5,6,6};
		 int n=arr.length;
		 // to used the for loop 
		 for(int i=0; i<n; i++) {
			 // to use inner loop 
			 for(int j=i+1;j<n; j++) {
				 if(arr[i]==arr[j]) {
				 System.out.println("the duplicate eliment in the array:"+arr[i]);
				 }
			 }
		 }
	} 
}
