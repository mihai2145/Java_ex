import java.util.Scanner;
public class baby_calc {

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int x,y;
		String c;
		int sum,dif,multi;
		double div;
		
		System.out.print("> ");
		x=sc.nextInt();
		c=sc.next();
		y=sc.nextInt();

		
while(x!=0 && y!=0){
	
	if(c.equals("+"))
	{System.out.println(add(x,y));
	System.out.print("First number: ");
	x=sc.nextInt();
	System.out.print("Operation: ");
	c=sc.next();
	System.out.print("Second number: ");
	y=sc.nextInt();	}
	
	else if(c.equals("-"))
	{System.out.println(sub(x,y));
	System.out.print("First number: ");
	x=sc.nextInt();
	System.out.print("Operation: ");
	c=sc.next();
	System.out.print("Second number: ");
	y=sc.nextInt();	}
	
	else if(c.equals("*"))
	{System.out.println(multiply(x,y));
	System.out.print("First number: ");
	x=sc.nextInt();
	System.out.print("Operation: ");
	c=sc.next();
	System.out.print("Second number: ");
	y=sc.nextInt();	}
	
	else if(c.equals("/"))
	{System.out.println(divide(x,y));
	System.out.print("First number: ");
	x=sc.nextInt();
	System.out.print("Operation: ");
	c=sc.next();
	System.out.print("Second number: ");
	y=sc.nextInt();	}	
	
}

System.out.println("Bye now");}

	
	public static int add(int x,int y){
		return(x+y);		
	}
	public static int sub(int x,int y){
		return(x-y);		
	}
	public static int multiply(int x,int y){
		return(x*y);		
	}
	public static double divide(int x,int y){
		return(x/y);		
	}
	
	
}
