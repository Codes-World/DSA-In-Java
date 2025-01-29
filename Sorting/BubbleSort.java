/*
	Time Complexity = O(n^2) in worst case 
	Time Complexity = O(n) in best case
	Space Complexity = O(1)
*/


import java.util.*;
import java.io.*;

public class BubbleSort{
	public static void bubbleSort(int[] arr){
		int len = arr.length;

		//Sort the array in ascending order
		for(int i = 0; i < len; i++){
			boolean swap = false;
			for(int j = 0; j < len-1-i; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap = true;
				}
			}
			if(swap== false)break;
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
		bubbleSort(arr);
	}
}