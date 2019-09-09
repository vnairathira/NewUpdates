package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListItrEx {
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<Integer>();
	for(int i=1;i<10;i++) {
		list.add(i);
	}
	ListIterator<Integer> itr=list.listIterator();
	while(itr.hasNext()) {
		int a=(int)itr.next();
		System.out.print(a+" ");
		if(a%2==0) {
			a++;
			itr.set(a);
			itr.add(a);
		}
	}
	System.out.println();
	System.out.println(list);
	
}
}
