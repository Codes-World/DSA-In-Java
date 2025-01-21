import java.util.*;
import java.io.*;

public class ArrayReverse{
/*
	//Method-1:
	//Time complexity - O(n)
	//Space Complexity - O(n)

	public static void reverse(int[] arr){
		int[] temp = new int[arr.length];
		
		System.out.println("Before Reversing : Array looks like "+Arrays.toString(arr));
		
		for(int i = 0; i < arr.length; i++){
			temp[i] = arr[arr.length-1-i];
		}
	
		System.out.println("After Reversing : Array looks like "+Arrays.toString(temp));
		
	}
*/
	//Method-2:
	//Time complexity - O(n)
	//Space Complexity - O(1)

	public static void reverse(int[] arr){
		
		int len = arr.length;
		System.out.println("Before Reversing : Array looks like "+Arrays.toString(arr));

		for(int i = 0; i < len/2; i++){
			int temp = arr[i];
			arr[i] = arr[len-1-i];
			arr[len-1-i] = temp;
		}

		System.out.println("After Reversing : Array looks like "+Arrays.toString(arr));
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
		ArrayReverse.reverse(arr);
	}
}