package InterPrograms;

public class StrongNo {
public static void main(String[] args) {
	int n=145;
	int a=n,r=0,sum=0,i,f;
	while(n>0) {
		r=n%10;
		f=1;i=1;
		while(i<=r) {
			f=f*i;
			i++;
		}
		sum=sum+f;
		n=n/10;
	}
	if(a==sum) {
		System.out.println("strong no");
	}else {
		System.out.println("not strong no");
	}
}
}
