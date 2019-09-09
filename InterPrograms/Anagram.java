package InterPrograms;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String a1="keep";
	String a2="peek";
	a1=a1.replaceAll(" ","");
	a2=a2.replaceAll(" ","");
	if(a1.length()==a2.length()) {
		char[] c1=a1.toLowerCase().toCharArray();
		char[] c2=a2.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1,c2)) {
			System.out.println("equal");
		}else {System.out.println("notequal");}
	}else {System.out.println("notequal");}
}
}
