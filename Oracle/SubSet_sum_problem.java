package Oracle;

import java.util.ArrayList;

public class SubSet_sum_problem
{
	static void sum(int[] arr, int i, int val, int target, String s)
	{   
	    for(int j = i+1; j<arr.length; j++){
	        if(val+arr[j] == target){
	            System.out.println(s+" "+String.valueOf(arr[j]));
	        }else{
	            sum(arr, j, val+arr[j], target, s+" "+String.valueOf(arr[j]));
	        }
	    }
	}
	public static void main(String[] args)
	{   
	    int[] numbers = {6,3,8,10,1};
	    for(int i =0; i<numbers.length; i++){
	        sum(numbers, i, numbers[i], 9, String.valueOf(numbers[i])); 
	    }
	}
}
