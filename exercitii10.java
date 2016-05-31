import java.util.Scanner;
public class exercitii8 {

	public static void main(String args[]){
		String n;
		Scanner sc=new Scanner(System.in);
		System.out.println("What is your name: ");
		n=sc.next();
		
//Write a program that prompts the user for a name. Then display that name ten times using a loop. However, if the name given is "Mitchell", display it only five times.

//So here's the challenge: write the program using only one if statement (no else) and one for loop.
		
	for(int i=0;i<10;i++){	
		
		if(n.equals("Radu")){
			System.out.println(n);
			System.out.println(n);
			System.out.println(n);
			System.out.println(n);
			System.out.println(n);
			i=10;
			}
		
		
		
		System.out.println(n);	}
}	
		
	}
