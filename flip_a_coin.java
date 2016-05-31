import java.util.Random;
import java.util.Scanner;

public class dowhile_1
{
public static void main( String[] args ){
	
	Random r=new Random();
	Scanner sc=new Scanner(System.in);
	String answer;
	
	System.out.print("Would you like to flip a coin? ");
	answer=sc.next();
	
	while(answer.equals("yes"))
	{int x=1+r.nextInt(2);
	if (x==1){System.out.print("\n HEADS");}
	else if (x==2){System.out.print("\n TAILS");}
	System.out.print("\n Would you like to flip a coin? ");
	System.out.print("\n  ");
	answer=sc.next();
			
		
	}
	
	
	sc.close();
	
	
	
}}