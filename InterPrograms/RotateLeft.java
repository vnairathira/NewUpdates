package InterPrograms;

import java.util.Arrays;

public class RotateLeft
{ //1 2 3 4 5 6 7
  //2 3 4 5 6 7 1
	public static void method(int[] arr, int n) {
		System.out.println("before flipping " + Arrays.toString(arr));
		for (int i = 0; i < n; i++) {
			int temp = arr[0];
			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];	
			}
			arr[arr.length - 1] = temp;
		}
		System.out.println("after rotation");
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 8, 6, 4 };
		method(arr, 1);
	}
}
