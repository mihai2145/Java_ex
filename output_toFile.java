package twentyq;
import java.io.*;
import java.lang.*;
import java.util.*;
class output_2files {

	public static void main(String args[]){
		
	Formatter y = null;
	
	try{
		y=new Formatter("chinese.txt");
				System.out.println("Hello there.");	
				}

	catch(Exception e){
		
		System.out.println("You got an error");
	}
	
    y.format("20");
	y.close();
	
	
		
	}
	

	
}
