package InterPrograms;

public class Revers {
	public static void main(String[] args) {
		String str="athiravnair";
		StringBuilder sb=new StringBuilder();
		sb.reverse();
		System.out.println(sb);
		String rev="";
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			rev+=ch[i];
		}
		System.out.println(rev);
		System.out.println(recursiveMethod("hi"));
	}
	
	public static String recursiveMethod(String str) {
		if((str.length()<=1)||str==null){
			return str;
		}
		return  recursiveMethod(str.substring(1))+str.charAt(0);
	}
}
