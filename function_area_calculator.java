import java.util.Scanner;
public class function_area_calculator {

	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		int shape,base,height,radius,side,lenght,width,length;
		System.out.println("1.Triangle");
		System.out.println("1.Rectangle");
		System.out.println("3.Square");
		System.out.println("4.Circle");
		System.out.println("5.Quit");
		System.out.println(" ");
		System.out.print("Pick a shape: ");
	    shape=sc.nextInt();
	    if(shape==1){
	    	System.out.print("Base: ");	
	    	base=sc.nextInt();
	    	System.out.print("Height: ");	
	    	height=sc.nextInt();
	    System.out.println(area_triangle(base,height));    	 }
	    
	    if(shape==2){
	    	System.out.print("L: ");	
	    	length=sc.nextInt();
	    	System.out.print("W: ");	
	    	width=sc.nextInt();
	    	System.out.println(area_rectangle(length,width));    	 }
	    
	    if(shape==3){
	    	System.out.print("Side ");	
	    	side=sc.nextInt();
	    	System.out.println(area_square(side));    	 }
	    
	    if(shape==4){
	    	System.out.print("Radius ");	
	    	radius=sc.nextInt();
	    	System.out.println(area_circle(radius));    	 }
	    

	
    if(shape==5){
    	System.out.print("Ok bye ");	
    }
    
}
///////
	
	
	public static double area_circle( int radius )  {
		
	return radius*radius;
	}
	
		
	
	public static int area_rectangle( int length, int width )   {
	
	return length*width;}
	
	
	
	public static int area_square( int side )  {
		
		return 2*side;
	}
	
	
	
	public static double area_triangle( int base, int height )  // returns the area of a triangle
	
{
		
		return 1/(2*base*height);
	}
	
	
	
	
}
