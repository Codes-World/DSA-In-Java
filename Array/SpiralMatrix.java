/*
	Approach - Simulation approach
	Time Complexity - O(n*m);
	Space Complexity - O(n*m);
*/



import java.util.*;
import java.io.*;

public class SpiralMatrix{
	public static List<Integer> spiralMatrix(int[][] matrix){
		List<Integer> list = new ArrayList<>();

		if (matrix == null || matrix.length == 0) {
			return list;
        	}

		int n = matrix.length;
		int m = matrix[0].length;
		
		int firstRow = 0;
		int lastRow = n-1;

		int firstCol = 0;
		int lastCol = m-1;
		int count = 0;
		
		while(count < n*m){
			for(int i = firstRow; i <= lastCol; i++){
				list.add(matrix[firstRow][i]);
				count++;
			}
			firstRow++;
			if(count==n*m)break;

			for(int i = firstRow; i <= lastRow; i++){
				list.add(matrix[i][lastCol]);
				count++;
			}
			lastCol--;
			if(count==n*m)break;
			
			for(int i = lastCol; i >= firstCol; i--){
				list.add(matrix[lastRow][i]);
				count++;
			}
			lastRow--;
			if(count==n*m)break;
			
			for(int i = lastRow; i >= firstRow; i--){
				list.add(matrix[i][firstCol]);
				count++;
			}
			firstCol++;
			if(count==n*m)break;
		}
		return list;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//Rows
		System.out.print("Enter the number of rows in a 2D Matrix:: ");
		int n = sc.nextInt();
		
		//Columns
		System.out.print("\nEnter the number of columns in a 2D Matrix:: ");
		int m = sc.nextInt();
		
		int[][] matrix = new int[n][m];

		System.out.print("Enter elements in a 2D Matrix:: \n");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				matrix[i][j] = sc.nextInt();
			}
		}

		//Calling method
		System.out.println(spiralMatrix(matrix));
	}
}