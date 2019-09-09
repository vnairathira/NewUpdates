package InterPrograms;

public class FindDuplicates {
public static void main(String[] args) {
	String[] str= {"athira","papa","athira","papa","manju"};
	for(int i=0;i<str.length-1;i++) {
		for(int j=i+1;j<str.length;j++) {
			if(str[i].equals(str[j]) && (i!=j)) {
				System.out.println("duplicate elemnts are:"+str[j]);
			}
		}
	}
}
}
