import java.util.Scanner;
public class right_triangle {
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Side 1= ");
		System.out.println("> ");
		a=sc.nextInt();
		
		
		System.out.println("Side 2= ");
		System.out.println("> ");
		b=sc.nextInt();
		
		while(a>b){
			System.out.println("Side 2 is smaller than 1. Try again. Think bigger");
			System.out.println("Side 2 =  ");
			b=sc.nextInt();	
		}
		
		System.out.println("Side 3= ");
		System.out.println("> ");
		c=sc.nextInt();
		
		while(b>c){
			System.out.println("Side 3 is smaller than 2. Try again. Think bigger");
			System.out.println("Side 3 =  ");
			c=sc.nextInt();	
		}
		
		System.out.println(a+" "+b+" "+c);
		System.out.println(" ");
		if ((a*a+b*b)==c*c) {
			System.out.println("We have a RIGHT ANGLE TRIANGLE!");
		}
		
		
		sc.close();
	}
}
