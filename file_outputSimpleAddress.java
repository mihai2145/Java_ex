package twentyq;
import java.io.*;
import java.lang.*;
import java.util.*;
public class file_outputLetter {

	public static void main(String args[]){
	Formatter x = null;
	
    try{
    	x=new Formatter("Lettter.txt");
    	
    }
	
	catch(Exception e){
		System.out.println("There is an error");
	}
    
    String message="\n*                                         *"
    		+"\n*                                         *"
    		+ "\n*                                         *"
    		+ "\n*                                         *"
    		+ "\n*                                         *"
    		+ "\n*                                 Address"
    		+ "\n*                                         *";
    System.out.println(message);
    x.format(message);
    x.close();
    
    
	
}
}