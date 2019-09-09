package Oracle;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class RandomPasswordGen {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String pass=sc.next();
		String special ="_@#$";
		int len=pass.length();
		//char[] special=special1.toCharArray();
		int upper=0,lower=0,spcl=0,num=0;
		for(int i=0;i<pass.length();i++) {
			char ch=pass.charAt(i);
			if(ch>='A' && ch<='Z')upper++;
			else if(ch>='0' && ch<='9')num++;
			else if(ch>='a' && ch<='z')lower++;
			else {
				for(int j=0;j<special.length();j++) {
					if(pass.charAt(i)==special.charAt(j)) 
						spcl++;	
				}
			}
		}
		if(len>=8 && len<= 12 && upper>=1 && spcl >=1 && num>=2) {
			System.out.println("password approved");
		}else {
			System.out.println("check ur password");
		}
		
	}
}
