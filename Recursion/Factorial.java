import java.util.*;
import java.io.*;

public class Factorial{
	public static int calculateFactorial(int fact){
		if(fact == 0 || fact == 1)
			return 1;
		return fact * calculateFactorial(fact-1);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number and find factorial of that number:: ");
		int fact = sc.nextInt();

		System.out.println("Factorial of "+fact+" is "+calculateFactorial(fact));
	}
}