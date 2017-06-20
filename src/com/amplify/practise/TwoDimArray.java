package com.amplify.practise;

import org.testng.annotations.Test;

public class TwoDimArray {
	public static void main(String[] args) {
		// Two dimensional array
		
				//	[row][col]    row--> no of times to execute   /  Col- no of values to supply
		int[][] arr = new int[3][4];
		
		//First row
		arr[0][0]=111;
		arr[0][1]=121;
		arr[0][2]=131;
		arr[0][3]=141;
		
		//Second row
		arr[1][0]=211;
		arr[1][1]=311;
		arr[1][2]=411;
		arr[1][3]=511;
		
		//Third row
		arr[2][0]=113;
		arr[2][1]=114;
		arr[2][2]=115;
		arr[2][3]=116;
		
		int row = arr.length;
		int col = arr[1].length;
		System.out.println("Two Dimensional Array:"+row+","+col);
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
		
		
}
