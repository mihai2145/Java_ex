package twentyq;
import java.io.*;
import java.lang.*;
import java.util.*;
public class file_outputLetter {

	public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
		Formatter x = null;
		
		int score;
		String name;
		
		
		
	
    try{
    	x=new Formatter("Score.txt");
 	
    }
	
	catch(Exception e){
		System.out.println("There is an error");
	}
    
    System.out.println("Please provide name: ");
    name=sc.next();
    
    System.out.println("Please provide score: ");
    score=sc.nextInt();
    
    

    x.format(name+" "+score);
    x.close();
	System.out.println("Data stored");
    
    
	
}
}