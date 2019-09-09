package java8;

interface Parser{
	String parse(String str);
}

class StringParser{
	public static String convert(String s) {
		if(s.length()<=3)s=s.toUpperCase();
		else s=s.toLowerCase();
		
		return s;
	}
}

class MyPrinter{
	public void print(String str,Parser p) {
		str=p.parse(str);
		System.out.println(str);
	}
}

public class Tester8 {
	public static void main(String[] args) {
		
		MyPrinter mp=new MyPrinter();
		mp.print("Athira",StringParser::convert);
		
	}

}
