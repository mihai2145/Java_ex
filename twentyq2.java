import java.util.Scanner;
class moreq{
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		double bmi,mass;
		double height;
		
		
		
		System.out.print("What is your mass?");
		mass= sc.nextDouble();
		System.out.print("What is your height?");
		height= sc.nextDouble();
		
		bmi=(mass/(height*height));
		System.out.printf("%.3f",bmi);
		
		if (bmi<18.5){
		System.out.println("You are very severely underweight");  } 
		
		if (bmi>=18.5 && bmi<=24.9){
		System.out.println("You have normal weight");}
		
		if (bmi>=25 && bmi<=29.9){
		System.out.println("You are overweight");}
		
		if (bmi>=30){
		System.out.println("You are very overweight ");}
							
			sc.close();

		
	}
}