package InterPrograms;

import java.util.Arrays;

public class ArrayEqlsOrNot {
	public static void main(String[] args) {
		int[] a1= {1,2,3,5};
		int[] a2= {1,3,5,2};
		Arrays.sort(a1);
		Arrays.sort(a2);
		if(Arrays.equals(a1,a2)) {
			System.out.println("equal");
		}
		boolean val=true;
		if(a1.length==a2.length) {
		for(int i=0;i<a1.length;i++){
				if(a1[i]!=a2[i]) {
					val=false;
				}
			}
		}else {
			val=false;
		}
		if(val) {
			System.out.println("equal");
		}else {
			System.out.println("notequal");
		}
		
	}
}
