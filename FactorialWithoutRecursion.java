package com.udemy.DS;

public class FactorialWithoutRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(iterativeFactorial(3));
	}
	//  1!=1*0!
	//	2!=2*1!
	//	3!=3*2!
	//	4!=4*3!
	//	n!=(n-1)!*n;
	public static int iterativeFactorial(int num) {
		if(num==0) {
			return 1;
			
		}
		int factorial=1;
		for(int i=1;i<=num;i++) {
			factorial*=i;
		}
		return factorial;
	}

}














