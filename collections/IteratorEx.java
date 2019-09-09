package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<Integer>();
	for(int i=0;i<10;i++)
	list.add(i);
	
	Iterator itr=list.iterator();
	while(itr.hasNext()) {
		int a=(int) itr.next();
		System.out.print(a+" ");
	if(a%2!=0)itr.remove();
	}
	System.out.println();
	System.out.print(list+" ");
}
}
