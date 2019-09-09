package InterPrograms;

public class SumOfDigit {
public static void main(String[] args) {
	int n=1111,sum=0;
	int a=n;
	while(n>0) {
		int r=n%10;
		sum=sum+r;
		n=n/10;
	}
	System.out.println(sum);
}
}
