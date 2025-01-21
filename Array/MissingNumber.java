import java.util.*;
import java.io.*;

public class MissingNumber{
/*
	//Method-1: For finding missing number from 1 to n
	//Time complexity - O(n)
	//Space Complexity - O(1)

	public static void missingElement(int[] arr){
		int n = arr.length;
		int totalSum = ((n+1)*(n+2))/2;
		int elementSum = 0;
		for(int i = 0; i < n; i++){
			elementSum += arr[i];
		}

		int missingNumber = totalSum - elementSum;
	
		System.out.println("Missing number is "+missingNumber);
		
	}
*/
	//Method-2: For finding missing number from 0 to n
	//Time complexity - O(n)
	//Space Complexity - O(1)

	public static void missingElement(int[] arr){
		int n = arr.length;
		int totalSum = (n*(n+1))/2;
		int elementSum = 0;
		for(int i = 0; i < n; i++){
			elementSum += arr[i];
		}

		int missingNumber = totalSum - elementSum;
	
		System.out.println("Missing number is "+missingNumber);
		
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//Getting the size of array from user
		System.out.print("Enter the size of the array: ");
		int len = sc.nextInt();

		//Declaration
		int[] arr = new int[len];
		System.out.print("\nEnter "+len+" element of an array: ");
		for(int i = 0; i < len; i++){
			arr[i] = sc.nextInt();
		}

		//Method call		
		MissingNumber.missingElement(arr);
	}
}