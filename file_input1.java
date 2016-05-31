package twentyq;

import java.io.File;
import java.util.Scanner;

public class readFile2 {

	private Scanner x;
	
	public void openfile(){               //open file method
		
		try{
			x=new Scanner(new File("File1.txt"));            //try catch where x=new Scanner(new File-*io)
					}
		
		catch(Exception e){
			System.out.println("Errors found");
		}}
		
public void readfile(){
	
	while(x.hasNext()){
		
		String a=x.next();
		String b=x.next();
		String c=x.next();
		
		System.out.printf("%s %s %s \n", a,b,c);
	}
	
}
public void closefile(){
	
	x.close();
}
		
	
		
}
