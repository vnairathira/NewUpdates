package InterPrograms;

import java.util.Arrays;

public class RotateRight {
	//1 2 3 4 5 6 7 8
	//8 1 2 3 4 5 6 7
	public static void method(int[] arr,int n) {
		for(int i=0;i<n;i++) {
			int temp=arr[arr.length-1];
			for(int j=arr.length-1;j>0;j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=temp;
			}
		System.out.println("After rotation");
		System.out.println(Arrays.toString(arr));
		}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8};
		method(arr,1);
	}
	}
