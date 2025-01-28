import java.util.*;
import java.io.*;

public class RotateImage{
	
	public static void rotate(int[][] matrix){
		System.out.print("*******Before Rotation******** \n");
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

		for(int i = 0; i < n; i++){
			int start = 0;
			int end = n-1;

			while(start<end){
				int temp = matrix[i][start];
				matrix[i][start] = matrix[i][end];
				matrix[i][end] = temp;
				
				start++;
				end--;
			}
		}

		System.out.print("*******After Rotation******* \n");
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
		rotate(matrix);
	}
}