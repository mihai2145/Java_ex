import java.util.Scanner;
import java.util.Random;
public class cups3 {

	public static void main(String args[]){
		
	int i,a,q;	
		Random r=new Random();
	Scanner sc=new Scanner(System.in);
	q=0;
	
	i=1+r.nextInt(3);
		
	System.out.print("Where's the ace card?");
	System.out.println("");
	System.out.println("##  ##  ##");
	System.out.println("##  ##  ##");	
	System.out.println("1  2  3");	
	a=sc.nextInt();
	
	if(i==1 && a==1){System.out.println("You got it! 10$ for you");
	System.out.println("");
	System.out.println("AA  ##  ##");
	System.out.println("AA  ##  ##");	
	System.out.println("1  ##  ##");	q++;	}
	
		
	else if(i!=a && i==1){System.out.println("Fast Eddie was too fast");
	System.out.println("");
	System.out.println("AA  ##  ##");
	System.out.println("AA  ##  ##");	
	System.out.println("1  ##  ##");		}
	
	
		
	else if(i==2 && a==2){System.out.println("You got it! 10$ for you");
	System.out.println("");
	System.out.println("##  AA  ##");
	System.out.println("##  AA  ##");	
	System.out.println("##  2  ##");	q++;}
	
	else if(i!=a && i==2){System.out.println("Fast Eddie was too fast");
	System.out.println("");
	System.out.println("##  AA  ##");
	System.out.println("##  AA  ##");	
	System.out.println("##  2  ##");	}
	
	else if (i==3 && a==3){System.out.println("You got it! 10$ for you");
	System.out.println("");
	System.out.println("##  ##  AA");
	System.out.println("##  ##  AA");	
	System.out.println("##  ##  3");	q++;}
	
	else if(i!=a && i==3){System.out.println("Fast Eddie was too fast");
	System.out.println("");
	System.out.println("##  ##  AA");
	System.out.println("##  ##  AA");	
	System.out.println("##  ##  3");	}
	
	
	System.out.println("You've won a total "+ q +" times.");
	
	
	
	}
}
