import java.util.*;
import java.io.*;

public class PalindromeString{
	public static boolean checkPalindrome(String str){
		int start = 0;
        	int last = str.length()-1;
        
        	while(start <= last){
            		if(str.charAt(start) != str.charAt(last)){
                		return false;
            		}
            		start++;
            		last--;
        	}
        	return true;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string :: ");
		String str = sc.nextLine();

		if(checkPalindrome(str))
			System.out.println(str+" is palindrome");
		else
			System.out.println(str+" is not palindrome");
	}
}
		