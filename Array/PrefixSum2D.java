import java.util.*;
import java.io.*;

public class PrefixSum2D{
	
	/*
		Approach - Brute Force
		Time Complexity = O(n*m) for each range of sum
		Space Complexity = O(1)
	
	public static void prefixSum2DMatrix(long[][] matrix, int r1, int c1, int r2, int c2){
		int sum = 0;
		for(int i = r1; i <= r2; i++){
			for(int j = c1; j <= c2; j++){
				sum += matrix[i][j];
			}
		}
		System.out.println("Sum of the element between ("+r1+","+c1+")"+" & ("+r2+","+c2+") is "+sum);
	}
*/
	static long[][] sum;
	
	public static void prefixSumMatrix(long[][] matrix){
		int n = matrix.length;
		int m = matrix.length;

		sum = new long[n+1][m+1];
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= m; j++){
				sum[i][j] = sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1] + matrix[i-1][j-1];
			}
		}
	}

	//O(1) for each range of sum
	public static void sumRegion(int r1, int c1, int r2, int c2){
		System.out.print("Sum of the element between ("+r1+","+c1+")"+" & ("+r2+","+c2+") is ");
		r1++; c1++; r2++; c2++;
		
		long result = sum[r2][c2] - sum[r2][c1-1] - sum[r1-1][c2] + sum[r1-1][c1-1];
		System.out.print(result);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows in a 2D Matrix:: ");
		int n = sc.nextInt();
		
		System.out.print("Enter the number of columns in a 2D Matrix:: ");
		int m = sc.nextInt();
		
		long[][] matrix = new long[n][m];

		System.out.print("Enter elements in a Matrix:: \n");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				matrix[i][j] = sc.nextLong();
			}
		}

		System.out.print("\nEnter the range of first rows and columns for addition of elements between range:: ");
		int row1 = sc.nextInt();
		int column1 = sc.nextInt();

		System.out.print("\nEnter the range of second rows and columns for addition of elements between range:: ");
		int row2 = sc.nextInt();
		int column2 = sc.nextInt();

		//Calling method
		prefixSumMatrix(matrix);
		sumRegion(row1, column1, row2, column2);
		
	}
}