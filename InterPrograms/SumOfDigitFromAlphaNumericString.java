package InterPrograms;

public class SumOfDigitFromAlphaNumericString {
public static void getValues(String s) {
	int sum=0;
	for(int i=0;i<s.length();i++) {
		char a=s.charAt(i);
		if(Character.isDigit(a)) {
			int b=Integer.parseInt(String.valueOf(a));
			sum=sum+b;
		}
	}
	if(sum==0)System.out.println(-1);
	else System.out.println(sum);
}
public static void main(String[] args) {
	String s="adg1g3r4r55";
	getValues(s);
}
}
