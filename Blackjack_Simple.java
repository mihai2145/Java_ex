import java.util.Random;
public class Blackjack_Simple {

	public static void main(String args[]){
	Random r=new Random();
    int x,y,z,t;
    
    x=1+r.nextInt(10);
    y=1+r.nextInt(10);
	
    System.out.println("Your numbers are "+x+" "+" "+y);

    z=1+r.nextInt(10);
    t=1+r.nextInt(10);
	
    System.out.println("House numbers are "+z+" "+" "+t);
    
    if((x+y)>(z+t)){System.out.println("YOU WIN!");}
    else if((x+y)<(z+t)){System.out.println("House WINS. Sorry.");}
    if((x+y)==(z+t)){System.out.println("TIE!");}
}	
}
