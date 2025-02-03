import java.util.*;
import java.io.*;

public class FibonacciSeries{
	public static int calculateSeries(int n){
		int result = 0;
		if(n<=1)
			return n;
		else
			result = calculateSeries(n-1) + calculateSeries(n-2);
		return result;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number and Print fabonacci series of that number:: ");
		int num = sc.nextInt();

		System.out.println("Fibonacci Series of "+num+" is "+calculateSeries(num));
	}
}