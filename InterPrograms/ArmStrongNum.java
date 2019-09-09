package InterPrograms;

public class ArmStrongNum {
public static void main(String[] args) {
	System.out.println(153%10);
	int n=153;
	int a=n;
	int cube=0;
	while(n>0) {
		int r=n%10;
		cube = cube + (r*r*r);
		n=n/10;
	}
	if(a==cube) {
		System.out.println("armstrom");
	}else {
		System.out.println("not Armstrom");
	}
	}
}

