/*
	However, if the input matrix is very large and you are allowed to transpose the matrix in place (i.e., if it’s a square matrix), 
	you could potentially optimize the space usage by transposing the matrix in place, which would save space. 
	But for non-square matrices, you still need extra space to hold the result.

*/

import java.util.*;
import java.io.*;

public class Transposed{
/*
	//Time Complexity : O(n*m)
	//Space Complexity: O(n*m)
	//For non-square matrix
	public static void transposeMatrix(int[][] matrix){

		System.out.print("*******Before Transpose******** \n");
		for(int[] a : matrix){
			System.out.println(Arrays.toString(a));
		}
		
		int n = matrix.length;
		int m = matrix[0].length;
		
		int[][] transpose = new int[m][n]
		for(int i = 0; i < n; i++){
			for(int j = i; j < m; j++){
				transpose[j][i] = matrix[i][j];
			}
		}
		
		System.out.print("*******After Transpose******** \n");
		for(int[] a : transpose){
			System.out.println(Arrays.toString(a));
		}
	}
*/
	//Time Complexity : O(n*m)
	//Space Complexity: O(1)
	//For Square matrix
	public static void transposeMatrix(int[][] matrix){
		System.out.print("*******Before Transpose******** \n");
		for(int[] a : matrix){
			System.out.println(Arrays.toString(a));
		}
		
		int n = matrix.length;
		int m = matrix[0].length;

		for(int i = 0; i < n; i++){
			for(int j = i; j < m; j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		System.out.print("*******After Transpose******* \n");
		for(int[] a : matrix){
			System.out.println(Arrays.toString(a));
		}
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
		transposeMatrix(matrix);
	}
}