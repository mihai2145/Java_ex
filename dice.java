import java.util.Random;
public class dice {
public static void main(String args[]){
	
	Random r=new Random();
	
	int d1=1+r.nextInt(6);
	int d2=1+r.nextInt(6);
	
System.out.println(d1);
System.out.println(d2);
	
if(d1==d2){System.out.println("dubla! poarta-n casa");}
if(d1==6 && d2==6){System.out.println("Sase Sase! Ayee");}

	
	
	
}
}
