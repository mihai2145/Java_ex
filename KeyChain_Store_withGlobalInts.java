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
		
	
	/////////////////////////////// the while loop of choice
		while(choice!=4){
		if(choice==1){add_keychain();}
		if(choice==2){remove_keychain();}
		if(choice==3){view_order();}
		System.out.print("Please enter your choice: ");
		choice=sc.nextInt();	}
	
		checkout();
	///////////////////////////////	 final checkout
		
	}
	
	public static int count=0;
	public static int price=10;
	
	public static int add_keychain(){

System.out.println("How many keys to add? You have "+count+" keys.");
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
count=count+x;
return count;}

	

	public static int remove_keychain(){
		
		System.out.println("How many keys to remove? You have "+count+" keys.");
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		count=count-y;
		return count;}
	
	public static void view_order(){
		
System.out.println("You have "+count +" keys.");
System.out.println("Price is "+price+" per key.");
System.out.println("Overall price is: "+count*price+" dollars");}
	
	public static void checkout(){
	Scanner sc=new Scanner(System.in);
	System.out.print("Checking out. Insert name: ");
	String x=sc.next();
	System.out.println(x);
	System.out.println("You have "+count +" keys.");
	System.out.println("Price is "+price+" dollars per key.");
	System.out.println("Overall price is: "+count*price+" dollars");
	System.out.println("Thank you.");	}
	
	
	
}
