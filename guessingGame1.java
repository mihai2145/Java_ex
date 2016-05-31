import java.util.Random;
import java.util.Scanner;
public class numberGuess {
public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
	    Random r=new Random();
	    
	    int x=1+r.nextInt(10);
	
		System.out.println("We have a number between 1 and 10. GO!");
		System.out.println(">");
		int answer=sc.nextInt();
		
		while(answer!=x){
		System.out.println("Your guess was "+answer);
		System.out.println("I was thinking of "+x + " actually.");
		
		System.out.println("   ");
		
		System.out.println("Pick again");
		System.out.print("> ");
		answer=sc.nextInt();
		x=1+r.nextInt(10);
		}
		System.out.println("You got it! It was "+x+".");
		
		sc.close();
	}
	
		
}
