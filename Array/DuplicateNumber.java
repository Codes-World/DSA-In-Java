import java.util.*;
import java.io.*;

public class DuplicateNumber{
/*
	//Method-1: For finding duplicate element in an array
	//Time complexity - O(n^2)
	//Space Complexity - O(1)

	public static int checkElement(int[] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = i+1; j < arr.length; j++){
				if(arr[i] == arr[j]){
					return arr[i];
				}
			}
		}
		return -1;
		
	}
*/
	//Method-1: For finding duplicate element in an array
	//Time complexity - O(n)
	//Space Complexity - O(n)

	public static int checkElement(int[] arr){
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++){
			if(map.containsKey(arr[i])){
				return arr[i];
			}
			else{
				map.put(arr[i], i);
			}
		}
		return -1;
		
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
		int result = DuplicateNumber.checkElement(arr);
		if(result == -1){
			System.out.print("\nThere is no any duplicate element present in the array");
		}
		else{
			System.out.print("Duplicate element is "+result);
		}
	}
}