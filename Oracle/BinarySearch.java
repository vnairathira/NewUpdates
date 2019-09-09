package Oracle;

import java.util.Scanner;

public class BinarySearch {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the legngth of an array");
	int length=sc.nextInt();
	int input[]=new int[length];
	System.out.println("enter the "+length+"of elements");
	for(int i=0;i<length;i++) {
		input[i]=sc.nextInt();
	}
	System.out.println("enter the no to be searched");
	int search =sc.nextInt();
	int index=perfromBinarySearch(input,search);
	if(index==-1) {
		System.out.println("sorry no search found");
	}else {
		System.out.println(search+"found at"+index+" position");
	}
	sc.close();
}
public static int perfromBinarySearch(int[] input,int search) {
	int low =0;int high=input.length-1;
	while(high>=low) {
		int middle=(high+low)/2;
		if(input[middle]==search) 
		{
			return middle;
		}else if(input[middle]<search) 
		{
			low=middle+1;
		}else if(input[middle]>search) 
		{
			high=middle-1;
		}
	}
	return -1;
}
}
