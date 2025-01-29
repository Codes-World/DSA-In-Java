//Time complexity: O(log n)
//Space complexity: O(1)

import java.util.*;
import java.io.*;

public class BinarySearch{
	
	public static void binarySearch(int[] arr, int target){
		int start = 0;
		int end = arr.length;
		
		boolean flag = false;
		while(start<end){
			int mid = start+(end-start)/2;
			if(arr[mid] == target){
				System.out.println(target+" is present at index "+mid+" in an array");
				flag = true;
				return;
			}
			else if(target > arr[mid])
				start = mid+1;
			else
				end = mid-1;
		}

		if(flag == false)
			System.out.println(target+" is not present in this array");
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array:: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];

		System.out.print("Enter elements in a Matrix:: \n");
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter a target element:: ");
		int target = sc.nextInt();

		//Calling method
		binarySearch(arr, target);
	}
}