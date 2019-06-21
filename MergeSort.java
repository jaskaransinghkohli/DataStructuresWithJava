package com.udemy.DS;

public class MergeSort {

	public static void main(String[] args) {
		int[] intArray= {20,35,-15,7,55,1,-22}; 
		
		for(int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
	}
	//{20,35,-15,7,55,1,-22}
public static void mergeSort(int[] input,int start,int end) {
	/*Break statement since we are using recurssion we should
	Know when  our Recursion should break*/
	if(end-start<2) {
		return;
	}
	//Partitioning the array

		int mid=(start+end)/2;
		//The last index  to the left partition will be mid
		mergeSort(input,start,mid);
		//Right Side of the Array
		mergeSort(input,mid,end);
		//After partitioning we will merge both left and right side
		merge(input,start,mid,end);

}
//{20,35,-15,7,55,1,-22}
public static void merge(int input[],int start,int mid,int end){
	//No merging
	//input[mid-1] is  the last element in the left partition
	//input[mid] is the first element in the right partition
	if(input[mid-1]<=input[mid]) {
		return;
	}
	int i=start;
	int j=mid;
	//Keeps the track where we are in the temporary array when we are doing the copy
	int tempIndex=0;
	
	
}
}

















