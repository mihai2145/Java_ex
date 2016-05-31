package twentyq;

import java.util.*;
import java.io.*;

public class j_input1 {

	public static void main(String args[]){
		
//scanner declaration
		
Scanner x=null;

//try and catch
		
		try {
			x=new Scanner(new File("j_output2.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Error");
		}
		
//while loop that reads data
		
		while(x.hasNext()){
			
			String a=x.next();
			String b=x.next();
			String c=x.next();
			
			System.out.printf("%s %s %s \n", a,b,c);
		}
		
//closing the app
		
		x.close();
		
		
	}
}
