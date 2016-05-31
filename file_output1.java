package twentyq;
import java.io.*;
import java.lang.*;
import java.util.*;
public class output_2files {

	public static void main(String args[]){
		
	openFile();
	addRecords();
	close();
	
		
	}
	
	private static Formatter x;
	
	public static void openFile()
	{
		try{
			x=new Formatter("New File.txt");
		}
		catch (Exception e){
			
			System.out.println("We found an error.");
		}
	
	}
	
	
	public static void addRecords(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please add records: ");
		String a=sc.nextLine();
		
       x.format(a);
	}
	
	public static void close(){
		x.close();
	}
	
	
	
	
}
