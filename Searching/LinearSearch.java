import java.util.*;
import java.io.*;

public class LinearSearch{
	
	public static void linearSearch(int[] arr, int target){
		
		boolean flag = false;
		for(int i = 0; i < arr.length; i++){
			if(target == arr[i]){
				System.out.println(target+" is present at index "+i+" in an array");
				flag = true;
				break;
			}
			
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
		linearSearch(arr, target);
	}
}