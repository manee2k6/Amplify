package com.amplify.practise;

public class FunctionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();
		sum(125,225);
		double value=sum(2.5,3.5);
		System.out.println(value);
	}
	
	public static void sum(){  // Dumb function
		int a=20;
		int b=30;
		int sum =a+b;
		System.out.println("Sum of two number:"+sum);
	}
	
	public static void sum(int a, int b){ // Clever Function
		int sum = a+b;
		System.out.println("Sum of two number:"+sum);
	}
	
	public static double sum(double a, double b){
		double sum=a+b;
		return sum;
		
	}

}
