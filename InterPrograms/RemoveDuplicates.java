package InterPrograms;

import java.util.Arrays;

public class RemoveDuplicates {
	static void removeDuplicates(int[] arr) {
		System.out.println(Arrays.toString(arr));
		int noOfUniqueElmnts=arr.length;
		for(int i=0;i<noOfUniqueElmnts;i++) {
			for(int j=i+1;j<noOfUniqueElmnts;j++) {
				if(arr[i]==arr[j]) {
					arr[j]=arr[noOfUniqueElmnts-1];
					noOfUniqueElmnts--;
					j--;
				}
			}
		}
		int newArr[]=Arrays.copyOf(arr, noOfUniqueElmnts);
		System.out.println(Arrays.toString(newArr));
	}
public static void main(String[] args) {
	int[]arr= {1,1,1,2,2,5,4,6,4,0,1};
	removeDuplicates(arr);
}
}
