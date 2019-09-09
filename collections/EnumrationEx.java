package collections;

import java.util.Enumeration;
import java.util.Vector;
//Enumeration is only for legacy classes(Vector and Hashtable)
//It is not universal Interator,Remove operation cant be performed,,Only
//only forward direction iterating is possible.
public class EnumrationEx {
	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<Integer>();
		vector.addElement(1);
		vector.addElement(2);
		Enumeration<Integer> e=vector.elements();
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement()+" ");
		}
	}
}
