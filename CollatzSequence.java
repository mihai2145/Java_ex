import java.util.Scanner;
public class Collatz {

	public static void main(String args[])
	{
	
		int n,counter,max;
		counter=0;
		max=0;
		Scanner sc=new Scanner(System.in);
		
	System.out.println("Give starting number");
	n=sc.nextInt();
	
	while(n!=1)		{
		if(n%2==0){	n=n/2;
		System.out.println(n);
		counter++;
		if (n>max) {max=n;}
		}
		else if(n%2==1){	
		n=3*n+1;
		System.out.println(n);
		counter++;
		if (n>max) {max=n;}
		}
		
		}
			
	System.out.println("Operation was repeated " +counter+" times");
	System.out.println("Highest value was " +max);
		sc.close();
	}
}
