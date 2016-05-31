package twentyq;

import java.util.*;
import java.io.*;


public class j_input4 {
public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
    int sum=0;
		
	Scanner x=null;
	String FileName;
	System.out.println("\n Please enter file name: ");	
	FileName=sc.next();
	
	
	try{
	
	while(!FileName.equals("zero"))	{
	
		 x = new Scanner(new File(FileName+".txt")); 
		 
		while(x.hasNextInt()) {

		int a=x.nextInt();
		int b=x.nextInt();
		int c=x.nextInt();
	
		sum=sum+a+b+c;
		System.out.printf("Reading from "+ FileName+". The numbers are: "+a+" "+b+" "+c+" .The total is "+sum);
	}
		
		System.out.println("\n Please enter file name: ");	
		FileName=sc.next();
		}
	
	
	}	
	
	 catch (FileNotFoundException fnf)
    {
       System.out.println(fnf.getMessage());
    }
	


	sc.close();
	x.close();
}}
