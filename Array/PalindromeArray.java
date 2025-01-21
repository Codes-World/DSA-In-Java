import java.util.*;
import java.io.*;

public class PalindromeArray{
/*
	//Method-1:
	//Time complexity - O(n)
	//Space Complexity - O(n)

	public static void checkPalindrome(int[] arr){
		int[] temp = new int[arr.length];
		
		//Store the element of arr in temporary arr(temp) in reverse order
		for(int i = 0; i < arr.length; i++){
			temp[i] = arr[arr.length-1-i];
		}
		
		boolean flag = true;
		//Comparision
		for(int i = 0; i < arr.length; i++){
			if(temp[i] != arr[i]){
				System.out.println(Arrays.toString(arr)+" is not palindrome");
				flag = false;
				break;
			}
		}
		
		if(flag == true){
			System.out.println(Arrays.toString(arr)+" is a palindrome");
		}
	}
*/
	//Method-2:
	//Time complexity - O(n)
	//Space Complexity - O(1)

	public static void checkPalindrome(int[] arr){
		int len = arr.length;
		boolean flag = true;
		//Comparision
		for(int i = 0; i < len/2; i++){
			if(arr[i] != arr[len-1-i]){
				System.out.println(Arrays.toString(arr)+" is not palindrome");
				flag = false;
				break;
			}
		}
		
		if(flag == true){
			System.out.println(Arrays.toString(arr)+" is a palindrome");
		}
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
		PalindromeArray.checkPalindrome(arr);
	}
}