package InterPrograms;

public class SumOfArray {
public static void main(String[] args) {
	int[] arr= {1,2,3,7,6,9,4};
	int input=10;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]+arr[j]==input) {
				System.out.println(arr[i]+" + "+arr[j]+" = "+input);
			}
		}
	}
}
}
