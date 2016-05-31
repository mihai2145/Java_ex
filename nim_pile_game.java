import java.util.Scanner;
public class EmptyPiles {

	public static void main(String args[]){
	
		Scanner sc=new Scanner(System.in);
		
		int a,b,c,z;
		String x;
		
		a=7;
		b=7;
		c=7;
		
		
	
		System.out.println("Behold the 3 piles");
		System.out.println("Remove from them so that they are all empty");
		
	
		
		
		while(a>=0 && b>=0 && c>=0){
			System.out.println("A:"+a+" B:"+b+" C:"+c);
			System.out.println("Pick a pile: ");
			x=sc.next();
			if(x.equals("a")){
				System.out.println("How many to remove from pile "+x+" ?");
				z=sc.nextInt();
			a=a-z;		}
			
			if(x.equals("b")){
				System.out.println("How many to remove from pile "+x+" ?");
				z=sc.nextInt();
			b=b-z;		}
			
			if(x.equals("c")){
				System.out.println("How many to remove from pile "+x+" ?");
				z=sc.nextInt();
			c=c-z;		}
			
					
			
		}
		System.out.println("They all empty.");
		
	}
}
