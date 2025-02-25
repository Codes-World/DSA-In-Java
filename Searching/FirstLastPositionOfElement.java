/*
34. Find First and Last Position of Element in Sorted Array

Given an array of integers nums sorted in non-decreasing order, 
find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 

Constraints:

-> 0 <= nums.length <= 105
-> -109 <= nums[i] <= 109
-> nums is a non-decreasing array.
-> -109 <= target <= 109

*/

import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class FirstLastPositionOfElement{
	//Find first and last position of target element
	public static int[] searchRange(int[] nums, int target){
		int[] arr = new int[] {-1, -1};
		int startIndex = 0;
		int lastIndex = nums.length-1;
		
		//Find First Occurance in left subarray.
		while(startIndex <= lastIndex){
			int mid = startIndex + (lastIndex-startIndex)/2;
			if(nums[mid] == target){
				arr[0] = mid;
				lastIndex = mid - 1;
			}
			else if(nums[mid] > target)
				lastIndex = mid - 1;
			else
				startIndex = mid + 1;
		}
		
		startIndex = 0;
		lastIndex = nums.length-1;
		
		//Find last occurance of rigth subarray.
		while(startIndex <= lastIndex){
			int mid = startIndex + (lastIndex-startIndex)/2;
			if(nums[mid] == target){
				arr[1] = mid;
				startIndex = mid + 1;
			}
			else if(nums[mid] > target)
				lastIndex = mid - 1;
			else
				startIndex = mid + 1;
		}
		return arr;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//Getting size of an array.
		System.out.print("\nEnter the size of the array: ");
		int size = sc.nextInt();
		
		//Create array's object.
		int[] arr = new int[size];

		//Getting array's element.
		System.out.print("\nEnter array's elements: ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		//Sort an array.
		Arrays.sort(arr);
		System.out.print("\nEnter target element: ");
		int target = sc.nextInt();

		System.out.print("\n"+Arrays.toString(searchRange(arr, target)));
		sc.close();
	}
}
		