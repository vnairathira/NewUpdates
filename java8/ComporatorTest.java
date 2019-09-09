package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComporatorTest {
public static void main(String[] args) {
	
	ArrayList<ComporatorEx> list=new ArrayList<ComporatorEx>();
	list.add(new ComporatorEx("athira", 40000, 24));
	list.add(new ComporatorEx("manu", 4000, 25));
	list.add(new ComporatorEx("sanu", 20000, 54));
	list.add(new ComporatorEx("sachin", 350000, 64));
	
		/*
		 * Comparator<ComporatorEx> com=new Comparator<ComporatorEx>() {
		 * 
		 * @Override public int compare(ComporatorEx o1, ComporatorEx o2) {
		 * 
		 * return o1.getAge()-o2.getAge(); } }; Collections.sort(list, com);
		 * list.forEach(System.out::println);
		 */
	
	Collections.sort(list,(o1,o2)-> {
		
		return o1.getAge()-o2.getAge();
	}	);
	list.forEach(System.out::println);
	
}
}
