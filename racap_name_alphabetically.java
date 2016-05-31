import java.util.Scanner;
public class recap1 {
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		String a,b,c;
		
		System.out.println("Name1= ");
		a=sc.next();
		
		System.out.println("Name2= ");
		b=sc.next();
		
	
		while(b.compareTo(a)<0){
			System.out.println("Please go alphabetically. Name=  ");
			b=sc.next();
					}
		
		System.out.println("Good. "+a+ " and " + b+ ". Table for two.");
		
		sc.close();
	}
}
