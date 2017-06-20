package com.amplify.practise;

public class OneDimArray {
	
	public static void main(String[] args) {
		
		// One dimensional array
		
		String str[] =  new String[3];
		
		str[0]="Kush";
		str[1]="Prasanna";
		str[2]="Bhaskar";
		
		int count = str.length;
		System.out.println("Array Size:"+count);
		for(int i=0;i<count;i++){
			System.out.print(str[i]+" ");
		}
			
		
	}

}
