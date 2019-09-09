package Oracle;

import java.util.Arrays;

public class Gratitude {
	static int add(double a,int b) {
		System.out.println("double");
		return b;
	}
	static int add(float a,int b) {
		System.out.println("float");
		return b;
	}
	public static void main(String[] args) {
		add(1.,2);
	}
}
