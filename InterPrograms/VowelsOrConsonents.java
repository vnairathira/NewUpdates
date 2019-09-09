package InterPrograms;

import java.util.regex.Pattern;

public class VowelsOrConsonents {
public static void main(String[] args) {
	String str="Athirai";
	int v=0,co=0;
	char[] ch=str.toCharArray();
	for(char c:ch) {
		if(Pattern.matches("[aeiouAEIOU]",Character.toString(c))) {
			v++;
		}else {
			co++;
		}
	}
	System.out.println("vowel "+v+" consonents "+co);

/*	String str="Aathira";
	int count=0;
	char ch[]=str.toCharArray();
	for(char c:ch) {
		switch(c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			count++;
			break;
			default:
		}
	}
	System.out.println("vowvels "+count);*/
}
}
