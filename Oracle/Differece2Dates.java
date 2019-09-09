package Oracle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Differece2Dates {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter start date:dd-mm-yy/hh-mm-ss");
	String s1=sc.next();
	System.out.println("enter end date:dd-mm-yy/hh-mm-ss");
	String s2=sc.next();
	SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy/HH:mm:ss");
	try {
		Date startDate=formatter.parse(s1);
		Date endDate=formatter.parse(s2);
		long diffInMilliSec=endDate.getTime()-startDate.getTime();
		long second=(diffInMilliSec/1000)%60;
		long minitues=(diffInMilliSec/(1000*60))%60;
		long hours=(diffInMilliSec/(1000*60*60))%24;
		long days=(diffInMilliSec/(1000*60*60*24))%365;
		long years=(diffInMilliSec/(1000l*60*60*24*365));
		System.out.println("difference in date is..");
		System.out.println(years+"years "+days+"days "+hours+"hours "+minitues+"minitues "+second+"second");
	}catch (ParseException e) 
	{
		e.printStackTrace();
	}
	

	
	
}
}
