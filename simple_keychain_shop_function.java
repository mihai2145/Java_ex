import java.util.Scanner;

public class function_checkout {

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int choice;
		
		System.out.println("Ye olde keychain shop");
		
		System.out.println("1. Add keychains to order");
		System.out.println("2. Remove keychains from order");
		System.out.println("3. View current order");
		System.out.println("4. Checkout");
		
		System.out.print("Please enter your choice: ");
		choice=sc.nextInt();
		
	while(choice!=4){
		if(choice==1){add_keychain();}
		if(choice==2){remove_keychain();}
		if(choice==3){view_order();}

		
		System.out.print("Please enter your choice: ");
		choice=sc.nextInt();	}
	checkout();
		
		
	}
	
	public static void add_keychain(){
		
System.out.println("Canceled");	}
	

	public static void remove_keychain(){
		
System.out.println("Canceled");	}
	
	public static void view_order(){
		
System.out.println("Canceled");	}
	
	public static void checkout(){
		
System.out.println("Thank you.");	}
	
	
	
}
