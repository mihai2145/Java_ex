import java.util.Scanner;
public class countToRevisited {

	public static void main(String args[]){
		
		int i,x,y,z;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Count from: ");
		x=sc.nextInt();
		System.out.println("Count to: ");
		y=sc.nextInt();
		System.out.println("Count by: ");
		z=sc.nextInt();
		
		for(i=x; i<=y; i+=z)
			System.out.println(i);
	}
	
}
