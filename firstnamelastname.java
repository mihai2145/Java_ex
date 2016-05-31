import java.util.Scanner;
public class firstnamelast {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String first, last,a;
	int age;
	
	
	System.out.print("Age=");
	age=sc.nextInt();
	
	System.out.print("First Name=");
	first=sc.next();
	
	System.out.print("Last Name=");
	last=sc.next();
	
	if(age<20){System.out.println("Hello "+first+" "+last);}
		else{
		if(age>=20){System.out.print("You married?");
			a=sc.next();
			{if(a.equals("yes")){System.out.print("Hello Mr. "+first+" "+last);}}
			if(a.equals("no")){System.out.print("Hello Mr. "+first+" "+last);}
			
		}
	}
	
sc.close();	
}
}
