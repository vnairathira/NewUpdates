package InterPrograms;

import java.util.Arrays;
import java.util.Collections;

public class IntegrArrayReverse {
public static void main(String[] args) {
	Integer[] arr= {1,5,6,8,40};
	
	//Collections.reverse(Arrays.asList(arr));
	//System.out.println(Arrays.asList(arr));
	
	for(int i=0;i<=arr.length/2;i++) {
		int temp=arr[i];
		arr[i]=arr[arr.length-i-1];
		arr[arr.length-i-1]=temp;
	}
	System.out.println(Arrays.toString(arr));
	}
	
}

