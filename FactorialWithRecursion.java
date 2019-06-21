package com.udemy.DS;

public class FactorialWithRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(recursiveFactorial(3));
	}
	//  1!=1*0!
		//	2!=2*1!
		//	3!=3*2!
		//	4!=4*3!
		//	n!=(n-1)!*n;
public static int recursiveFactorial(int num) {
	if(num==0) {
		return 1;
	}
	return num*recursiveFactorial(num-1);
}
	

}

















