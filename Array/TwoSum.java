import java.util.*;
import java.io.*;
public class TwoSum
{

/*
	//Time Complexity : O(n^2) Space Complexity = O(1)
	public static int[] twoSum(int[] arr, int target){
        	int n = arr.length;
        	int k = 0;
        	int[] num1 = new int[2];
        	for(int i = 0; i < n-1; i++){
        	    for(int j = i+1; j < n; j++){
        	        int sum = arr[i] + arr[j];
        	        if(sum == target){
        	            num1[k] = i;
        	            num1[++k] = j;
        	            break;
        	        }
        	    }
        	}
	}
*/
	//Optimize Solution
        //Time Complexity : O(n) Space Complexity : O(n)
        //Create a hashmap to store element and element's index

	public static int[] twoSum(int[] arr, int target){
        	int n = arr.length;
        	HashMap<Integer, Integer> map = new HashMap<>();
        	for(int i = 0; i < n; i++){
            		map.put(arr[i], i);
        	}
        
        	//Temporary Array to store indices of element
        	int[] nums1 = new int[2];

        	for(int i = 0; i < n; i++){
            		if(arr[i] == target && map.containsKey(0)){
                		nums1[0] = i;
                		nums1[1] = map.get(0);
                		break;
            		}
            		else if(map.containsKey(target-arr[i])){
                		if(map.get(target-arr[i])>i){
                    			nums1[0] = i;
                    			nums1[1] = map.get(target-arr[i]);
                    			break;
                		}
            		}
        	}
        	return nums1;
    	}
    
    
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter the size of the array :: ");
        	int size = sc.nextInt();

        	int[] arr = new int[size];
        	System.out.println("Enter elements of an array :: ");

        	for(int i = 0; i < size; i++){
            		arr[i] = sc.nextInt();
        	}

        	System.out.println("Enter the target value::");
        	int target = sc.nextInt();

        
        	System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}
