import java.util.Scanner;
public class sqrt {
public static void main (String args[]){
	
	Scanner sc=new Scanner(System.in);
	double n;
	
	System.out.println("Number = ");
	n=sc.nextDouble();
	

	while(n<0){
		System.out.println("Number is negative. Try again");
		System.out.println("Number = ");
		n=sc.nextDouble();
	}
	
	System.out.println("Square root of " + n+ " is " + Math.sqrt(n));

	
	
	
	
		
	
	
	sc.close();	
	
}
		
}
