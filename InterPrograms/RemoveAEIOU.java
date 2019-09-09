package InterPrograms;

import java.util.Comparator;
import java.util.Scanner;

public class RemoveAEIOU {
	public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
      System.out.println("enter string");
      String abc=sc.nextLine();
    String newval=  abc.replaceAll("[AEIOUaeiou]","");
      System.out.println(newval);
	}
}
