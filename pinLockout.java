import java.util.Scanner;
public class pin_while {
public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
	int pin=1234;
	int entry;
	int counter=0;
	
	System.out.println("Welcome to your account");
	System.out.println("Please enter your PIN");
	System.out.println("you have 3 tries");
	System.out.print("PIN= ");
	entry=sc.nextInt();
	counter++;
	
	
	
	while (entry!=pin && counter<3){
		System.out.println("PIN incorrect");	
		System.out.println("Please enter the correct PIN");	
		System.out.println("You have" + (3-counter) +" tries left.");	
		System.out.print("PIN= ");
		entry=sc.nextInt();
		System.out.println("     ");	
		counter++;
		
	}
		
	if (entry==pin) {System.out.println("Welcome to your account, buddy!");}
	else if (entry!=pin && counter>=3){System.out.println("Account LOCKED! I'm calling the police, buddy.");	}
			
		
		sc.close();
	}
	
		
}
