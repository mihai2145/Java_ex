import java.util.Scanner;
public class untilZero_while {
public static void main(String args[]){
		

			   int i=0;
			   int x;
			   
			   Scanner sc=new Scanner(System.in);
				System.out.println("Gimme number to add");	
				x =sc.nextInt();
				i=i+x;

			    
				while(x!=0){
					System.out.println("Total is "+i);	
					System.out.println("Gimme number to add");	
					x =sc.nextInt();
					i=i+x;		

				
				}
				

				
			}
					
		}

