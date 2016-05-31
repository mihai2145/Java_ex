package twentyq;
import java.util.*;
import java.io.*;


public class j_input_UpperCase  {
public static void main(String args[])throws Exception {
	
Scanner x=null;

try{
for(int i=0;i<126;i++){
	x=new Scanner(new File("characters.txt"));
	
	while(x.hasNextLine()){
	
	String str=x.nextLine();


	char a=str.charAt(i);
	
	if(a=='a' || a=='e' || a=='i' ||a=='o' ||a=='u'){
	System.out.print(Character.toUpperCase(a));
	}
	else{System.out.print(a);}
		}

}
}

catch(Exception e){System.out.println(e);}
	
x.close();

}	
}
