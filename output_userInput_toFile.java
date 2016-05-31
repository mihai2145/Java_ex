package twentyq;
import java.io.*;
import java.lang.*;
import java.util.*;
public class output_2files {

	public static void main(String args[]){
		
		openFile();
		addRecords();
		closeFile();
		
		
	}
	
		
private static Formatter y ;
	
	public static void openFile(){
	
	try{
		y=new Formatter("chinese2.txt");
				System.out.println("Hello there.");	
				}

	catch(Exception e){
		
		System.out.println("You got an error");
	}
	}
	
	
	
	public static void addRecords(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter records: ");
    String a=sc.nextLine();
		y.format(a);}
	
	public static void closeFile(){
	y.close();
			
	}
	

	
}
