import java.util.Scanner;
public class compare2 {

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String name;
		int i;
	
		System.out.print("Name=");
		name = sc.next();
		
		
		if(("Carswell".compareTo(name))>=0){System.out.println("Go ahead");}
	
		else if	(("Jones".compareTo(name))>=0){System.out.println("not that bad");}
		
		   else if	(("Smith".compareTo(name))>=0){System.out.println("bit of a wait");}
		
		       else if	(("Young".compareTo(name))>=0){System.out.println("gonna be a while young");}
		
		          else if (("Young".compareTo(name))<0&&("Young".compareTo(name))>=-5){System.out.println("not going anywhere");}
		          
		            else if (("Carswell".compareTo(name))<=-20) {System.out.println("bummer");}
		sc.close();
		          }
		         
				
	}

