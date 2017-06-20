package com.amplify.practise;

public class LocalGlobalVariablex {
	public static String name="Bhaskar"; // Static global variable
	public String EmpID="200987"; // Non static global variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Global Variable:"+name);
		setValue();
		//runTest();  Non static function cannot directly enter into static functions. so create objects as below
		
		//Creating an object using class name with objRef.
		LocalGlobalVariablex  objRef= new LocalGlobalVariablex();
		objRef.runTest();
		System.out.println(objRef.EmpID="1234"); // instance variable

	}
	
	public static void setValue(){ //Static function
		String name="Kush";   // Local variable
		System.out.println("Local Variable:"+name);
		LocalGlobalVariablex  objRef= new LocalGlobalVariablex();
		System.out.println(objRef.EmpID);
		
	}
	
	public void runTest(){  // Non static function
		System.out.println("Run the program");
		setValue();
	}

}
