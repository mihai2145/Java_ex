import java.util.Random;
public class lotonr {

	public static void main(String args[]){
		
		Random x= new Random();
		
		System.out.println("Numerele sunt");
		System.out.println(1+x.nextInt(49)+" "+(1+x.nextInt(49))+" "+(1+x.nextInt(49))+" "
		+(1+x.nextInt(49))+" "+(1+x.nextInt(49))+" "+(1+x.nextInt(49))+" ");
		
		System.out.print( 1 + x.nextInt(100) + "\t" );
		System.out.print( 1 + x.nextInt(100) + "\t" );
		System.out.print( 1 + x.nextInt(100) + "\t" );
		System.out.print( 1 + x.nextInt(100) + "\t" );
		System.out.print( 1 + x.nextInt(100) + "\t" );
		System.out.print( 1 + x.nextInt(100) + "\t" );
		
				
	}
}
