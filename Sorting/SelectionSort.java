/*
	Time Complexity = O(n^2)
	Space Complexity = O(1)
*/


import java.util.*;
import java.io.*;

public class SelectionSort{
	public static void selectionSort(int[] arr){
		int len = arr.length;

		//Sort the array in ascending order
		for(int i = 0; i < len; i++){
			int min = i;
			for(int j = i+1; j < len; j++){
				if(arr[min] > arr[j]){
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		System.out.println("After Sorting :: "+Arrays.toString(arr));
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
		selectionSort(arr);
	}
}