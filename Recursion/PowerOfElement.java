import java.util.*;
import java.io.*;

public class PowerOfElement{
/*	//Brute force approach
	//Time Complexity = O(n)
	//Space Complexity = O(n) using stack to store each values
	public static int calculatePowerElement(int num, int power){
		int result = 0;
		if(power == 1)
			return num;
		else
			result = num * calculatePowerElement(num, power-1);
		return result;
	}
*/
	//Optimized Approach
	//Time Complexity = O(log n)
	//Space Complexity = O(log n) using stack to store each values
	public static int calculatePowerElement(int num, int power){
		int finalResult = 0;
		if(power == 1)
			return num;
		else{
			int result = calculatePowerElement(num, power/2);
			finalResult = result * result;
			if(power%2 != 0){
				finalResult = num * finalResult;
			}
		}	
		return finalResult;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a base number:: ");
		int num = sc.nextInt();

		System.out.println("Enter a power number:: ");
		int power = sc.nextInt();
		System.out.println("The power "+power+" of number "+num+" is "+calculatePowerElement(num, power));
	}
}