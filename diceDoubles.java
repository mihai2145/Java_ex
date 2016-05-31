import java.util.Random;
public class diceDoubles {
public static void main(String args[]){
		

	    Random r=new Random();
	    int counter=0;
	    int d1,d2;
	    d1=1+r.nextInt(6);
		d2=1+r.nextInt(6);	
		
		if(d1==d2){counter++;}
			
		while(d1!=d2){
		d1=1+r.nextInt(6);
		d2=1+r.nextInt(6);	
		System.out.println(d1);
		System.out.println(d2);
		
		System.out.println("   ");
		counter++;
				}
		
		System.out.println("Wohoo! Doubles. "+d1+"-"+d2);
		System.out.println(counter +" tries.");
		
	}
	
		
}
