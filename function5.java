import java.util.Scanner;
import java.util.Random;
public class function5 {
	
		public static void main( String[] args )
		{

			System.out.println("Return random number: "+randomchar());
	
	System.out.println(	"I can count, too.");	
	System.out.println(	counter());	
			
				
System.out.println(	"I can calculate the absolute value of a number");	

Hello();		
		
	System.out.println("That is all");	
		}	
		
		
	//random number
	public static int randomchar()	{
		
		Random r=new Random();
       int ran=1+r.nextInt(100);
		return ran;
			}	

		
//count 2 by 2

       public static int counter (){
    	int min,max;
    	  Scanner sc=new Scanner(System.in);
    	System.out.println("Where to start from: ");
    	min=sc.nextInt();
       	System.out.println("Where to end counting: ");
    	max=sc.nextInt();
    	while(min!=max){
    		System.out.print(min+" ");
    	min+=2;    	 }
    	
    	return min;           //notice I return the minimum, which in our case is the counter.
    	
       }
       
       //Saying hello to given name
       
       public static void Hello(){
      
    	   Scanner sc=new Scanner(System.in);
    	   System.out.print("Enter your name: ");
           String name = sc.next();
           System.out.println("Hello "+ name);

  
       }


}
			