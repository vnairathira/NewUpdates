package InterPrograms;

public class Funct{
public static void main(String[] args) {

	IFunct fun= (a)->{
		String evenOdd= (a%2==0) ?"even":"odd";
		System.out.println(evenOdd);
	};
	fun.newmethod(9);
}
}