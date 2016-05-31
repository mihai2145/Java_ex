import java.util.Scanner;
public class switch1 {

	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		int x;
		
		System.out.println("Gimme the number: ");
		x=sc.nextInt();
		
	switch(x){
	
	case 1:
		System.out.println("You choose 1");
		break;
	case 2:
		System.out.println("You choose 2");
		break;
	case 3:
		System.out.println("You choose 3");
		break;
	case 4:
		System.out.println("You choose 4");
		break;
	case 5:
		System.out.println("You choose 5");
		break;
	case 6:
		System.out.println("You choose 6");
		break;
	}
	
	sc.close();
		
	}
		
	}