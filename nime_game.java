import java.util.Scanner;
public class GameNim {

	public static void main(String args[]){
	
		Scanner sc=new Scanner(System.in);
		
		int a,b,c,z;
		String x;
		String p1, p2;
		boolean turn;
		turn=true;
		
		a=7;
		b=7;
		c=7;
		
		
	
		System.out.println("Behold the 3 piles");
		System.out.println("Remove from them so that they are all empty");
		System.out.println("Enter Player 1 name: ");
		p1=sc.next();
		System.out.println("Enter Player 2 name: ");
		p2=sc.next();
			
		
		while(a>0 || b>0 || c>0){
		
			
			if (turn==true)
			{			
				System.out.println("A:"+a+" B:"+b+" C:"+c);
				System.out.println(p1+ " picks a pile: ");
				x=sc.next();
				if(x.equals("a"))
				{
					System.out.println(p1+" How many to remove from pile "+x+" ?");
					z=sc.nextInt();
				a=a-z;		
				}
				
				
				if(x.equals("b")){
					System.out.println(p1+" How many to remove from pile "+x+" ?");
					z=sc.nextInt();
				b=b-z;		}
				
				if(x.equals("c")){
					System.out.println(p1+ "How many to remove from pile "+x+" ?");
					z=sc.nextInt();
				c=c-z;		}
				
		
				/* end if */ 
			}		turn=false;

			if (turn==false){			
			System.out.println("A:"+a+" B:"+b+" C:"+c);
			System.out.println(p2+ " picks a pile: ");
			x=sc.next();
			if(x.equals("a")){
				System.out.println(p2+" How many to remove from pile "+x+" ?");
				z=sc.nextInt();
			a=a-z;		}
			
			if(x.equals("b")){
				System.out.println(p2+" How many to remove from pile "+x+" ?");
				z=sc.nextInt();
			b=b-z;		}
			
			if(x.equals("c")){
				System.out.println(p2+ "How many to remove from pile "+x+" ?");
				z=sc.nextInt();
			c=c-z;		}
			
		
			/* end if */ 	 }	turn=true;
			
			}
		
		
		System.out.println("They all empty");
		if(turn==false){System.out.println(p2+" WINS!");}
		else if (turn==true) {System.out.println(p1+" WINS!");}
	
		sc.close();
	}
}
