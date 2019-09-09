package InterPrograms;

public class Main {
public static void main(String[] args) {
	String[] arr=new String[] {"1","2","2","3","5"};
	for(int i=0;i<args.length;i++) {
		if(arr[i]==args[i]) {
			System.out.println(i);
		}
	}
}
}
