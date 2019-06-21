package com.udemy.DS;

public class InsertionSort {

	public static void main(String[] args) {
		int[]intArray= {20,35,-15,7,55,1,-22};
		//We don't need swap method in this as we are shifting values rather than swapping them
		//We'll start our Unsorted Index from 1 because we consider that 0th element is already sorted
		for(int firstUnsortedIndex=1;firstUnsortedIndex<intArray.length;firstUnsortedIndex++) {
			int newElement=intArray[firstUnsortedIndex];
			int i;
			for(i=firstUnsortedIndex;i>0 && intArray[i-1]>newElement;i--) {
				//Shifting left to right
				intArray[i]=intArray[i-1];
			}
			intArray[i]=newElement;
		}
		for(int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
	}

}






