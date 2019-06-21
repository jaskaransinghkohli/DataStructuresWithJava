package com.udemy.DS;

public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray= {20,35,-15,7,55,1,-22};
		//Loop for initializing the Gap value
		//gap/=2 beacuse everytime we have to reduce the gap by half
		for(int gap=intArray.length/2;gap>0;gap/=2) {
			
			for(int i=gap;i<intArray.length;i++) {
				//Applying insertion sort
				
				int newElement=intArray[i];
				int j=i;
				while(j>=gap && intArray[j-gap]>newElement){
					//We have to shift element at intArray[j-gap]at gap position
				intArray[j]=intArray[j-gap];
				//Subtracting gap from j
				j-=gap;
			
				}
			intArray[j]=newElement;
			}
			
		}
		
		for(int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
	}

}
