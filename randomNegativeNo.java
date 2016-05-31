import java.util.Random;
public class randomNegativeNo {
public static void main(String args[]){
		

	    Random r=new Random();
	    int d1,d2;
	    d1=1+r.nextInt(50);
		d2=1+r.nextInt(50);	
		
		int x1=d1-d1*2;
		int x2=d2-d2*2;
		
			
		while(x1<0 && x2<0){
		    d1=1+r.nextInt(50);
			d2=1+r.nextInt(50);	
			x1=d1-d1*2;
			x2=d2-d2*2;
			
		System.out.println(x1);
		System.out.println(x2);
		
		System.out.println("   ");				}
		
		
	}
	
		
}
