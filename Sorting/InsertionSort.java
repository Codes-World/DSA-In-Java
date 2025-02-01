/*
	Time Complexity = O(n^2);
	Space Complexity = O(1);
*/

import java.util.*;
import java.io.*;

public class InsertionSort{
	
	public static void insertionSort(int[] arr){
		for(int i = 0; i < arr.length; i++){
			int j = i;
			while(j > 0 && arr[j] < arr[j-1]){
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of the array:: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.print("Enter elements of the array:: ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		insertionSort(arr);
	}
}