import java.util.Scanner;
import java.util.Random;
public class function4 {
	
		public static void main( String[] args )
		{

			System.out.println("Return value from A-Z to form a word: "+randomchar()+randomchar()+randomchar()
			+randomchar()+randomchar()+randomchar()+randomchar());
	
	System.out.println(	"I can count, too.");	
	System.out.println(	counter());	
			
				
System.out.println(	"I can calculate the absolute value of a number");	
		System.out.println(	absolute());		
		
	System.out.println("That is all");	
		}	
		
		
	//random char	
	public static char randomchar()	{
		
		Random r=new Random();
		char charval;
		charval=(char)(r.nextInt(26) + 'a');
		return charval;
			}	

		
//count from -10 to 10

       public static int counter (){
    	int min,max;
    	  Scanner sc=new Scanner(System.in);
    	System.out.println("Where to start from: ");
    	min=sc.nextInt();
       	System.out.println("Where to end counting: ");
    	max=sc.nextInt();
    	while(min!=max){
    		System.out.print(min+" ");
    	min++;    	 }
    	
    	return min;           //notice I return the minimum, which in our case is the counter.
    	
       }
       
       //absolute value
       
       public static int absolute(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Which number do you want to be absolute? ");
       int ab=sc.nextInt();
       if(ab<0){ab=-ab;}
       return ab;
       
      
       }


}
			