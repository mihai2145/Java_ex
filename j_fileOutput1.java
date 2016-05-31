package twentyq;                                    //package
import java.util.*;                                  //import

public class j_output1 {

	public static void main(String args[]){
		

	createFile();
	addRecords();
	closeFile();
	
	}
	
	//////end of main
	
	private static Formatter x;	
	
	public static void createFile(){                    //create file with try & catch

		
		try{
			x=new Formatter("J_Letter.txt");
		}
		catch(Exception e){
			System.out.println("Error");
		}	}
		
	public static void addRecords(){                    //using a format to add data
		String a;
		a="Letter";
		x.format(a);
		
	}
	public static void closeFile(){
		x.close();
	}
	
	
	
}
