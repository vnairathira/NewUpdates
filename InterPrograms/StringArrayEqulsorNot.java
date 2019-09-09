package InterPrograms;

import java.util.Arrays;

public class StringArrayEqulsorNot {
public static void main(String[] args) {
	String[] s1= {"athira","anu","manu"};
	String[] s2= {"athira","anu","manu"};
	if(Arrays.deepEquals(s1, s2)) {
		System.out.println("equal");
	}else {
		System.out.println("unequal");
	}
	
	String[] a1= {"manu","sanu"};
	String[] a2= {"sanu","manu"};
	Arrays.sort(a1);
	Arrays.sort(a2);
	if(Arrays.equals(a1,a2)) {
		System.out.println("equL");
	}else {
		System.out.println("notEqual");
	}
}
}
