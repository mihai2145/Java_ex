import java.util.Random;
public class array5 {

	public static void main(String args[]){
		
		Random r=new Random();
		
	int array[]=new int[100];	
		
	for(int i=0; i<array.length; i++){
		
		array[i]=1+r.nextInt(100);		
	}
	
for(int i=0; i<array.length; i++){
		
		System.out.println(i);		
	}
		
	}
}
